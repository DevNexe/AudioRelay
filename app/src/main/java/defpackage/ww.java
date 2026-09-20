package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class ww extends qw {
    public final Callable<? extends tx> w;

    public ww(Callable<? extends tx> callable) {
        this.w = callable;
    }

    @Override // defpackage.qw
    public final void h(nx nxVar) {
        try {
            tx txVarCall = this.w.call();
            mq2.b(txVarCall, "The completableSupplier returned a null CompletableSource");
            txVarCall.b(nxVar);
        } catch (Throwable th) {
            XTd3.w(th);
            nxVar.c(yr0.INSTANCE);
            nxVar.onError(th);
        }
    }
}
