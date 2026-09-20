package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class dr2<T> extends vq2<T> {
    public final fs2<T> w;

    public static final class QnHx<T> extends AtomicReference<vl0> implements nr2<T>, vl0 {
        public final ht2<? super T> w;

        public QnHx(ht2<? super T> ht2Var) {
            this.w = ht2Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            bm0.c(this);
        }

        public final void b(T t) {
            if (t != null) {
                if (e()) {
                    return;
                }
                this.w.g(t);
            } else {
                NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                if (c(nullPointerException)) {
                    return;
                }
                m14.b(nullPointerException);
            }
        }

        public final boolean c(Throwable th) {
            if (e()) {
                return false;
            }
            try {
                this.w.onError(th);
                return true;
            } finally {
                bm0.c(this);
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

    public dr2(fs2<T> fs2Var) {
        this.w = fs2Var;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        QnHx qnHx = new QnHx(ht2Var);
        ht2Var.c(qnHx);
        try {
            this.w.a(qnHx);
        } catch (Throwable th) {
            XTd3.w(th);
            if (qnHx.c(th)) {
                return;
            }
            m14.b(th);
        }
    }
}
