package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class jl0<T> extends u54<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater z = AtomicIntegerFieldUpdater.newUpdater(jl0.class, "_decision");
    private volatile /* synthetic */ int _decision;

    public jl0(z80 z80Var, la0 la0Var) {
        super(z80Var, la0Var);
        this._decision = 0;
    }

    @Override // defpackage.u54, defpackage.ss1
    public final void S(Object obj) {
        T0(obj);
    }

    @Override // defpackage.u54, defpackage.EQ
    public final void T0(Object obj) {
        boolean z2;
        do {
            int i = this._decision;
            z2 = true;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                z2 = false;
                break;
            }
        } while (!z.compareAndSet(this, 0, 2));
        if (z2) {
            return;
        }
        kd.w(ps0.L(this.y), kd.u(obj), null);
    }

    public final Object X0() throws Throwable {
        boolean z2;
        while (true) {
            int i = this._decision;
            z2 = false;
            if (i != 0) {
                if (i == 2) {
                    break;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
            if (z.compareAndSet(this, 0, 1)) {
                z2 = true;
                break;
            }
        }
        if (z2) {
            return va0.COROUTINE_SUSPENDED;
        }
        Object objG = ym.g(B0());
        if (objG instanceof iy) {
            throw ((iy) objG).a;
        }
        return objG;
    }
}
