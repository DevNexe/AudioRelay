package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bs2<T> extends vq2<T> implements s34<T> {
    public final T w;

    public bs2(T t) {
        this.w = t;
    }

    @Override // defpackage.s34, java.util.concurrent.Callable
    public final T call() {
        return this.w;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        ns2.QnHx qnHx = new ns2.QnHx(ht2Var, this.w);
        ht2Var.c(qnHx);
        qnHx.run();
    }
}
