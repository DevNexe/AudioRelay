package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ul4<T> extends vk4<T> {
    public final rl4<? extends T> A = null;
    public final rl4<T> w;
    public final long x;
    public final TimeUnit y;
    public final c54 z;

    public static final class QnHx<T> extends AtomicReference<vl0> implements ml4<T>, Runnable, vl0 {
        public final long A;
        public final TimeUnit B;
        public final ml4<? super T> w;
        public final AtomicReference<vl0> x = new AtomicReference<>();
        public final C0212QnHx<T> y;
        public rl4<? extends T> z;

        /* JADX INFO: renamed from: ul4$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0212QnHx<T> extends AtomicReference<vl0> implements ml4<T> {
            public final ml4<? super T> w;

            public C0212QnHx(ml4<? super T> ml4Var) {
                this.w = ml4Var;
            }

            @Override // defpackage.ml4
            public final void c(vl0 vl0Var) {
                bm0.n(this, vl0Var);
            }

            @Override // defpackage.ml4
            public final void onError(Throwable th) {
                this.w.onError(th);
            }

            @Override // defpackage.ml4
            public final void onSuccess(T t) {
                this.w.onSuccess(t);
            }
        }

        public QnHx(ml4<? super T> ml4Var, rl4<? extends T> rl4Var, long j, TimeUnit timeUnit) {
            this.w = ml4Var;
            this.z = rl4Var;
            this.A = j;
            this.B = timeUnit;
            if (rl4Var != null) {
                this.y = new C0212QnHx<>(ml4Var);
            } else {
                this.y = null;
            }
        }

        @Override // defpackage.vl0
        public final void a() {
            bm0.c(this);
            bm0.c(this.x);
            C0212QnHx<T> c0212QnHx = this.y;
            if (c0212QnHx != null) {
                bm0.c(c0212QnHx);
            }
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
            vl0 vl0Var = get();
            bm0 bm0Var = bm0.DISPOSED;
            if (vl0Var == bm0Var || !compareAndSet(vl0Var, bm0Var)) {
                m14.b(th);
            } else {
                bm0.c(this.x);
                this.w.onError(th);
            }
        }

        @Override // defpackage.ml4
        public final void onSuccess(T t) {
            vl0 vl0Var = get();
            bm0 bm0Var = bm0.DISPOSED;
            if (vl0Var == bm0Var || !compareAndSet(vl0Var, bm0Var)) {
                return;
            }
            bm0.c(this.x);
            this.w.onSuccess(t);
        }

        @Override // java.lang.Runnable
        public final void run() {
            vl0 vl0Var = get();
            bm0 bm0Var = bm0.DISPOSED;
            if (vl0Var == bm0Var || !compareAndSet(vl0Var, bm0Var)) {
                return;
            }
            if (vl0Var != null) {
                vl0Var.a();
            }
            rl4<? extends T> rl4Var = this.z;
            if (rl4Var == null) {
                this.w.onError(new TimeoutException(uu0.c(this.A, this.B)));
            } else {
                this.z = null;
                rl4Var.b(this.y);
            }
        }
    }

    public ul4(fl4 fl4Var, long j, TimeUnit timeUnit, c54 c54Var) {
        this.w = fl4Var;
        this.x = j;
        this.y = timeUnit;
        this.z = c54Var;
    }

    @Override // defpackage.vk4
    public final void i(ml4<? super T> ml4Var) {
        QnHx qnHx = new QnHx(ml4Var, this.A, this.x, this.y);
        ml4Var.c(qnHx);
        bm0.g(qnHx.x, this.z.c(qnHx, this.x, this.y));
        this.w.b(qnHx);
    }
}
