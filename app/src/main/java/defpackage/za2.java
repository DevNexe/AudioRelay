package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class za2<T> extends xa2<T> {
    public final Callable<? extends jb2<? extends T>> w;

    public za2(m60 m60Var) {
        this.w = m60Var;
    }

    @Override // defpackage.xa2
    public final void b(gb2<? super T> gb2Var) {
        try {
            jb2<? extends T> jb2VarCall = this.w.call();
            mq2.b(jb2VarCall, "The maybeSupplier returned a null MaybeSource");
            jb2VarCall.a(gb2Var);
        } catch (Throwable th) {
            XTd3.w(th);
            gb2Var.c(yr0.INSTANCE);
            gb2Var.onError(th);
        }
    }
}
