package defpackage;

import io.reactivex.exceptions.CompositeException;

/* JADX INFO: loaded from: classes3.dex */
public final class al4<T> extends vk4<T> {
    public final rl4<T> w;
    public final m70<? super Throwable> x;

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
            try {
                al4.this.x.accept(th);
            } catch (Throwable th2) {
                XTd3.w(th2);
                th = new CompositeException(th, th2);
            }
            this.w.onError(th);
        }

        @Override // defpackage.ml4
        public final void onSuccess(T t) {
            this.w.onSuccess(t);
        }
    }

    public al4(rl4<T> rl4Var, m70<? super Throwable> m70Var) {
        this.w = rl4Var;
        this.x = m70Var;
    }

    @Override // defpackage.vk4
    public final void i(ml4<? super T> ml4Var) {
        this.w.b(new QnHx(ml4Var));
    }
}
