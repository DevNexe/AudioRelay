package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class il4<T> extends vk4<T> {
    public final Callable<? extends T> w;

    public il4(Callable<? extends T> callable) {
        this.w = callable;
    }

    @Override // defpackage.vk4
    public final void i(ml4<? super T> ml4Var) {
        av3 av3Var = new av3(m91.b);
        ml4Var.c(av3Var);
        if (av3Var.e()) {
            return;
        }
        try {
            T tCall = this.w.call();
            mq2.b(tCall, "The callable returned a null value");
            if (av3Var.e()) {
                return;
            }
            ml4Var.onSuccess(tCall);
        } catch (Throwable th) {
            XTd3.w(th);
            if (av3Var.e()) {
                m14.b(th);
            } else {
                ml4Var.onError(th);
            }
        }
    }
}
