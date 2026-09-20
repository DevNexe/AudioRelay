package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kl4<T, R> extends vk4<R> {
    public final rl4<? extends T> w;
    public final i91<? super T, ? extends R> x;

    public static final class QnHx<T, R> implements ml4<T> {
        public final ml4<? super R> w;
        public final i91<? super T, ? extends R> x;

        public QnHx(ml4<? super R> ml4Var, i91<? super T, ? extends R> i91Var) {
            this.w = ml4Var;
            this.x = i91Var;
        }

        @Override // defpackage.ml4
        public final void c(vl0 vl0Var) {
            this.w.c(vl0Var);
        }

        @Override // defpackage.ml4
        public final void onError(Throwable th) {
            this.w.onError(th);
        }

        @Override // defpackage.ml4
        public final void onSuccess(T t) {
            try {
                R rApply = this.x.apply(t);
                mq2.b(rApply, "The mapper function returned a null value.");
                this.w.onSuccess(rApply);
            } catch (Throwable th) {
                XTd3.w(th);
                onError(th);
            }
        }
    }

    public kl4(rl4<? extends T> rl4Var, i91<? super T, ? extends R> i91Var) {
        this.w = rl4Var;
        this.x = i91Var;
    }

    @Override // defpackage.vk4
    public final void i(ml4<? super R> ml4Var) {
        this.w.b(new QnHx(ml4Var, this.x));
    }
}
