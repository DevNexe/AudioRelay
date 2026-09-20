package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class ur2<T> extends vq2<T> implements Callable<T> {
    public final Callable<? extends T> w;

    public ur2(Callable<? extends T> callable) {
        this.w = callable;
    }

    @Override // java.util.concurrent.Callable
    public final T call() throws Exception {
        T tCall = this.w.call();
        mq2.b(tCall, "The callable returned a null value");
        return tCall;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        pi0 pi0Var = new pi0(ht2Var);
        ht2Var.c(pi0Var);
        if (pi0Var.e()) {
            return;
        }
        try {
            T tCall = this.w.call();
            mq2.b(tCall, "Callable returned null");
            pi0Var.d(tCall);
        } catch (Throwable th) {
            XTd3.w(th);
            if (pi0Var.e()) {
                m14.b(th);
            } else {
                ht2Var.onError(th);
            }
        }
    }
}
