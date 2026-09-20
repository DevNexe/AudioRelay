package defpackage;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class vr0 extends AtomicReference<vl0> implements nx, vl0 {
    @Override // defpackage.vl0
    public final void a() {
        bm0.c(this);
    }

    @Override // defpackage.nx
    public final void b() {
        lazySet(bm0.DISPOSED);
    }

    @Override // defpackage.nx
    public final void c(vl0 vl0Var) {
        bm0.n(this, vl0Var);
    }

    @Override // defpackage.vl0
    public final boolean e() {
        return get() == bm0.DISPOSED;
    }

    @Override // defpackage.nx
    public final void onError(Throwable th) {
        lazySet(bm0.DISPOSED);
        m14.b(new OnErrorNotImplementedException(th));
    }
}
