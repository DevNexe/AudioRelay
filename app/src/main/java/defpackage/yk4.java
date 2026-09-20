package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class yk4<T> extends vk4<T> {
    public final ol4<T> w;

    public static final class QnHx<T> extends AtomicReference<vl0> implements dl4<T>, vl0 {
        public final ml4<? super T> w;

        public QnHx(ml4<? super T> ml4Var) {
            this.w = ml4Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            bm0.c(this);
        }

        public final void b(T t) {
            vl0 andSet;
            vl0 vl0Var = get();
            bm0 bm0Var = bm0.DISPOSED;
            if (vl0Var == bm0Var || (andSet = getAndSet(bm0Var)) == bm0Var) {
                return;
            }
            ml4<? super T> ml4Var = this.w;
            try {
                if (t == null) {
                    ml4Var.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    ml4Var.onSuccess(t);
                }
                if (andSet != null) {
                    andSet.a();
                }
            } catch (Throwable th) {
                if (andSet != null) {
                    andSet.a();
                }
                throw th;
            }
        }

        public final boolean c(Throwable th) {
            vl0 andSet;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            vl0 vl0Var = get();
            bm0 bm0Var = bm0.DISPOSED;
            if (vl0Var == bm0Var || (andSet = getAndSet(bm0Var)) == bm0Var) {
                return false;
            }
            try {
                this.w.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.a();
                }
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return bm0.d(get());
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return String.format("%s{%s}", QnHx.class.getSimpleName(), super.toString());
        }
    }

    public yk4(ol4<T> ol4Var) {
        this.w = ol4Var;
    }

    @Override // defpackage.vk4
    public final void i(ml4<? super T> ml4Var) {
        QnHx qnHx = new QnHx(ml4Var);
        ml4Var.c(qnHx);
        try {
            this.w.c(qnHx);
        } catch (Throwable th) {
            XTd3.w(th);
            if (qnHx.c(th)) {
                return;
            }
            m14.b(th);
        }
    }
}
