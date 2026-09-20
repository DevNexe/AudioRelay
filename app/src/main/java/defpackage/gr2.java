package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class gr2<T> extends vq2<T> {
    public final Callable<? extends us2<? extends T>> w;

    public gr2(Callable<? extends us2<? extends T>> callable) {
        this.w = callable;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        try {
            us2<? extends T> us2VarCall = this.w.call();
            mq2.b(us2VarCall, "null ObservableSource supplied");
            us2VarCall.a(ht2Var);
        } catch (Throwable th) {
            XTd3.w(th);
            ht2Var.c(yr0.INSTANCE);
            ht2Var.onError(th);
        }
    }
}
