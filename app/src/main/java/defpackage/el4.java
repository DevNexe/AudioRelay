package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class el4<T> extends vk4<T> {
    public final Callable<? extends Throwable> w;

    public el4(m91.PRnFixed pRn) {
        this.w = pRn;
    }

    @Override // defpackage.vk4
    public final void i(ml4<? super T> ml4Var) {
        try {
            Throwable thCall = this.w.call();
            mq2.b(thCall, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
            th = thCall;
        } catch (Throwable th) {
            th = th;
            XTd3.w(th);
        }
        ml4Var.c(yr0.INSTANCE);
        ml4Var.onError(th);
    }
}
