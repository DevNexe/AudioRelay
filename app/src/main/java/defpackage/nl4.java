package defpackage;

import io.reactivex.exceptions.CompositeException;

/* JADX INFO: loaded from: classes3.dex */
public final class nl4<T> extends vk4<T> {
    public final rl4<? extends T> w;
    public final i91<? super Throwable, ? extends T> x = null;
    public final T y;

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
            T tApply;
            nl4 nl4Var = nl4.this;
            i91<? super Throwable, ? extends T> i91Var = nl4Var.x;
            ml4<? super T> ml4Var = this.w;
            if (i91Var != null) {
                try {
                    tApply = i91Var.apply(th);
                } catch (Throwable th2) {
                    XTd3.w(th2);
                    ml4Var.onError(new CompositeException(th, th2));
                    return;
                }
            } else {
                tApply = nl4Var.y;
            }
            if (tApply != null) {
                ml4Var.onSuccess(tApply);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
            nullPointerException.initCause(th);
            ml4Var.onError(nullPointerException);
        }

        @Override // defpackage.ml4
        public final void onSuccess(T t) {
            this.w.onSuccess(t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nl4(rl4 rl4Var, Object obj) {
        this.w = rl4Var;
        this.y = obj;
    }

    @Override // defpackage.vk4
    public final void i(ml4<? super T> ml4Var) {
        this.w.b(new QnHx(ml4Var));
    }
}
