package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class ko<T> extends oo<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater B = AtomicIntegerFieldUpdater.newUpdater(ko.class, "consumed");
    public final boolean A;
    private volatile /* synthetic */ int consumed;
    public final nk3<T> z;

    public /* synthetic */ ko(nk3 nk3Var, boolean z) {
        this(nk3Var, z, xr0.w, -3, lg.SUSPEND);
    }

    @Override // defpackage.oo, defpackage.mz0
    public final Object a(nz0<? super T> nz0Var, z80<? super sd5> z80Var) {
        int i = this.x;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        if (i != -3) {
            Object objA = super.a(nz0Var, z80Var);
            return objA == va0Var ? objA : sd5.a;
        }
        l();
        Object objA2 = rz0.a(nz0Var, this.z, this.A, z80Var);
        return objA2 == va0Var ? objA2 : sd5.a;
    }

    @Override // defpackage.oo
    public final String f() {
        return "channel=" + this.z;
    }

    @Override // defpackage.oo
    public final Object h(te3<? super T> te3Var, z80<? super sd5> z80Var) {
        Object objA = rz0.a(new v94(te3Var), this.z, this.A, z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }

    @Override // defpackage.oo
    public final oo<T> i(la0 la0Var, int i, lg lgVar) {
        return new ko(this.z, this.A, la0Var, i, lgVar);
    }

    @Override // defpackage.oo
    public final mz0<T> j() {
        return new ko(this.z, this.A);
    }

    @Override // defpackage.oo
    public final nk3<T> k(ua0 ua0Var) {
        l();
        return this.x == -3 ? this.z : super.k(ua0Var);
    }

    public final void l() {
        if (this.A) {
            if (!(B.getAndSet(this, 1) == 0)) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ko(nk3<? extends T> nk3Var, boolean z, la0 la0Var, int i, lg lgVar) {
        super(la0Var, i, lgVar);
        this.z = nk3Var;
        this.A = z;
        this.consumed = 0;
    }
}
