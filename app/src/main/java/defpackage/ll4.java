package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ll4<T> extends vk4<T> {
    public final rl4<T> w;
    public final c54 x;

    public static final class QnHx<T> extends AtomicReference<vl0> implements ml4<T>, vl0, Runnable {
        public final ml4<? super T> w;
        public final c54 x;
        public T y;
        public Throwable z;

        public QnHx(ml4<? super T> ml4Var, c54 c54Var) {
            this.w = ml4Var;
            this.x = c54Var;
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
            this.z = th;
            bm0.g(this, this.x.b(this));
        }

        @Override // defpackage.ml4
        public final void onSuccess(T t) {
            this.y = t;
            bm0.g(this, this.x.b(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.z;
            ml4<? super T> ml4Var = this.w;
            if (th != null) {
                ml4Var.onError(th);
            } else {
                ml4Var.onSuccess(this.y);
            }
        }
    }

    public ll4(rl4<T> rl4Var, c54 c54Var) {
        this.w = rl4Var;
        this.x = c54Var;
    }

    @Override // defpackage.vk4
    public final void i(ml4<? super T> ml4Var) {
        this.w.b(new QnHx(ml4Var, this.x));
    }
}
