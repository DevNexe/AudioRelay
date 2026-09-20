package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class ow4<T> extends w32<T> implements ht2<T>, gb2<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater z = AtomicReferenceFieldUpdater.newUpdater(ow4.class, Object.class, "_subscription");
    private volatile /* synthetic */ Object _subscription;

    public ow4() {
        super(null);
        this._subscription = null;
    }

    @Override // defpackage.ht2
    public final void b() {
        a(null);
    }

    @Override // defpackage.ht2
    public final void c(vl0 vl0Var) {
        this._subscription = vl0Var;
    }

    @Override // defpackage.ht2
    public final void g(T t) {
        H(t);
    }

    @Override // defpackage.ht2
    public final void onError(Throwable th) {
        a(th);
    }

    @Override // defpackage.gb2
    public final void onSuccess(T t) {
        H(t);
        a(null);
    }

    @Override // defpackage.mw0t
    public final void q() {
        vl0 vl0Var = (vl0) z.getAndSet(this, null);
        if (vl0Var != null) {
            vl0Var.a();
        }
    }
}
