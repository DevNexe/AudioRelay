package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bl4<T> extends vk4<T> {
    public final rl4<T> w;
    public final m70<? super T> x;

    public final class QnHx implements ml4<T> {
        public final ml4<? super T> w;

        public QnHx(ml4<? super T> ml4Var) {
            this.w = ml4Var;
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
            ml4<? super T> ml4Var = this.w;
            try {
                bl4.this.x.accept(t);
                ml4Var.onSuccess(t);
            } catch (Throwable th) {
                XTd3.w(th);
                ml4Var.onError(th);
            }
        }
    }

    public bl4(rl4<T> rl4Var, m70<? super T> m70Var) {
        this.w = rl4Var;
        this.x = m70Var;
    }

    @Override // defpackage.vk4
    public final void i(ml4<? super T> ml4Var) {
        this.w.b(new QnHx(ml4Var));
    }
}
