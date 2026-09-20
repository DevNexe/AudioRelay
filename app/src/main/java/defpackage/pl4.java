package defpackage;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class pl4<T> extends vk4<T> {
    public final rl4<? extends T> w;
    public final i91<? super Throwable, ? extends rl4<? extends T>> x;

    public static final class QnHx<T> extends AtomicReference<vl0> implements ml4<T>, vl0 {
        public final ml4<? super T> w;
        public final i91<? super Throwable, ? extends rl4<? extends T>> x;

        public QnHx(ml4<? super T> ml4Var, i91<? super Throwable, ? extends rl4<? extends T>> i91Var) {
            this.w = ml4Var;
            this.x = i91Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            bm0.c(this);
        }

        @Override // defpackage.ml4
        public final void c(vl0 vl0Var) {
            if (bm0.n(this, vl0Var)) {
                this.w.c(this);
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return bm0.d(get());
        }

        @Override // defpackage.ml4
        public final void onError(Throwable th) {
            ml4<? super T> ml4Var = this.w;
            try {
                rl4<? extends T> rl4VarApply = this.x.apply(th);
                mq2.b(rl4VarApply, "The nextFunction returned a null SingleSource.");
                rl4VarApply.b(new jq3(this, ml4Var));
            } catch (Throwable th2) {
                XTd3.w(th2);
                ml4Var.onError(new CompositeException(th, th2));
            }
        }

        @Override // defpackage.ml4
        public final void onSuccess(T t) {
            this.w.onSuccess(t);
        }
    }

    public pl4(rl4<? extends T> rl4Var, i91<? super Throwable, ? extends rl4<? extends T>> i91Var) {
        this.w = rl4Var;
        this.x = i91Var;
    }

    @Override // defpackage.vk4
    public final void i(ml4<? super T> ml4Var) {
        this.w.b(new QnHx(ml4Var, this.x));
    }
}
