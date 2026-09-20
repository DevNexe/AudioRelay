package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class ns2 {

    public static final class CQf<T, R> extends vq2<R> {
        public final T w;
        public final i91<? super T, ? extends us2<? extends R>> x;

        /* JADX WARN: Multi-variable type inference failed */
        public CQf(i91 i91Var, Object obj) {
            this.w = obj;
            this.x = i91Var;
        }

        @Override // defpackage.vq2
        public final void z(ht2<? super R> ht2Var) {
            yr0 yr0Var = yr0.INSTANCE;
            try {
                us2<? extends R> us2VarApply = this.x.apply(this.w);
                mq2.b(us2VarApply, "The mapper returned a null ObservableSource");
                us2<? extends R> us2Var = us2VarApply;
                if (!(us2Var instanceof Callable)) {
                    us2Var.a(ht2Var);
                    return;
                }
                try {
                    Object objCall = ((Callable) us2Var).call();
                    if (objCall == null) {
                        ht2Var.c(yr0Var);
                        ht2Var.b();
                    } else {
                        QnHx qnHx = new QnHx(ht2Var, objCall);
                        ht2Var.c(qnHx);
                        qnHx.run();
                    }
                } catch (Throwable th) {
                    XTd3.w(th);
                    ht2Var.c(yr0Var);
                    ht2Var.onError(th);
                }
            } catch (Throwable th2) {
                ht2Var.c(yr0Var);
                ht2Var.onError(th2);
            }
        }
    }

    public static final class QnHx<T> extends AtomicInteger implements kh3<T>, Runnable {
        public final ht2<? super T> w;
        public final T x;

        public QnHx(ht2<? super T> ht2Var, T t) {
            this.w = ht2Var;
            this.x = t;
        }

        @Override // defpackage.vl0
        public final void a() {
            set(3);
        }

        @Override // defpackage.uk4
        public final void clear() {
            lazySet(3);
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return get() == 3;
        }

        @Override // defpackage.uk4
        public final boolean isEmpty() {
            return get() != 1;
        }

        @Override // defpackage.nh3
        public final int l(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // defpackage.uk4
        public final boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // defpackage.uk4
        public final T poll() {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.x;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                T t = this.x;
                ht2<? super T> ht2Var = this.w;
                ht2Var.g(t);
                if (get() == 2) {
                    lazySet(3);
                    ht2Var.b();
                }
            }
        }
    }

    public static <T, R> boolean a(us2<T> us2Var, ht2<? super R> ht2Var, i91<? super T, ? extends us2<? extends R>> i91Var) {
        yr0 yr0Var = yr0.INSTANCE;
        if (!(us2Var instanceof Callable)) {
            return false;
        }
        try {
            A$Y4 a$y4 = (Object) ((Callable) us2Var).call();
            if (a$y4 == null) {
                ht2Var.c(yr0Var);
                ht2Var.b();
                return true;
            }
            try {
                us2<? extends R> us2VarApply = i91Var.apply(a$y4);
                mq2.b(us2VarApply, "The mapper returned a null ObservableSource");
                us2<? extends R> us2Var2 = us2VarApply;
                if (us2Var2 instanceof Callable) {
                    try {
                        Object objCall = ((Callable) us2Var2).call();
                        if (objCall == null) {
                            ht2Var.c(yr0Var);
                            ht2Var.b();
                            return true;
                        }
                        QnHx qnHx = new QnHx(ht2Var, objCall);
                        ht2Var.c(qnHx);
                        qnHx.run();
                    } catch (Throwable th) {
                        XTd3.w(th);
                        ht2Var.c(yr0Var);
                        ht2Var.onError(th);
                        return true;
                    }
                } else {
                    us2Var2.a(ht2Var);
                }
                return true;
            } catch (Throwable th2) {
                XTd3.w(th2);
                ht2Var.c(yr0Var);
                ht2Var.onError(th2);
                return true;
            }
        } catch (Throwable th3) {
            XTd3.w(th3);
            ht2Var.c(yr0Var);
            ht2Var.onError(th3);
            return true;
        }
    }
}
