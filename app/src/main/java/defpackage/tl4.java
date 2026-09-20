package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class tl4<T> extends vk4<T> {
    public final rl4<? extends T> w;
    public final c54 x;

    public static final class QnHx<T> extends AtomicReference<vl0> implements ml4<T>, vl0, Runnable {
        public final ml4<? super T> w;
        public final av3 x = new av3();
        public final rl4<? extends T> y;

        public QnHx(ml4<? super T> ml4Var, rl4<? extends T> rl4Var) {
            this.w = ml4Var;
            this.y = rl4Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            bm0.c(this);
            this.x.a();
        }

        @Override // defpackage.ml4
        public final void c(vl0 vl0Var) {
            bm0.n(this, vl0Var);
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return bm0.d(get());
        }

        @Override // defpackage.ml4
        public final void onError(Throwable th) {
            this.w.onError(th);
        }

        @Override // defpackage.ml4
        public final void onSuccess(T t) {
            this.w.onSuccess(t);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.y.b(this);
        }
    }

    public tl4(rl4<? extends T> rl4Var, c54 c54Var) {
        this.w = rl4Var;
        this.x = c54Var;
    }

    @Override // defpackage.vk4
    public final void i(ml4<? super T> ml4Var) {
        QnHx qnHx = new QnHx(ml4Var, this.w);
        ml4Var.c(qnHx);
        vl0 vl0VarB = this.x.b(qnHx);
        av3 av3Var = qnHx.x;
        av3Var.getClass();
        bm0.g(av3Var, vl0VarB);
    }
}
