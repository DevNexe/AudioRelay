package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class at2<T, U> extends Z<T, T> {
    public final us2<? extends U> x;

    public static final class QnHx<T, U> extends AtomicInteger implements ht2<T>, vl0 {
        public final ht2<? super T> w;
        public final AtomicReference<vl0> x = new AtomicReference<>();
        public final QnHx<T, U>.C0039QnHx y = new C0039QnHx();
        public final s z = new s();

        /* JADX INFO: renamed from: at2$QnHx$QnHx, reason: collision with other inner class name */
        public final class C0039QnHx extends AtomicReference<vl0> implements ht2<U> {
            public C0039QnHx() {
            }

            @Override // defpackage.ht2
            public final void b() {
                QnHx qnHx = QnHx.this;
                bm0.c(qnHx.x);
                C0239D.C(qnHx.w, qnHx, qnHx.z);
            }

            @Override // defpackage.ht2
            public final void c(vl0 vl0Var) {
                bm0.n(this, vl0Var);
            }

            @Override // defpackage.ht2
            public final void g(U u) {
                bm0.c(this);
                QnHx qnHx = QnHx.this;
                bm0.c(qnHx.x);
                C0239D.C(qnHx.w, qnHx, qnHx.z);
            }

            @Override // defpackage.ht2
            public final void onError(Throwable th) {
                QnHx qnHx = QnHx.this;
                bm0.c(qnHx.x);
                C0239D.D(qnHx.w, th, qnHx, qnHx.z);
            }
        }

        public QnHx(ht2<? super T> ht2Var) {
            this.w = ht2Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            bm0.c(this.x);
            bm0.c(this.y);
        }

        @Override // defpackage.ht2
        public final void b() {
            bm0.c(this.y);
            C0239D.C(this.w, this, this.z);
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            bm0.n(this.x, vl0Var);
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return bm0.d(this.x.get());
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            C0239D.E(this.w, t, this, this.z);
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            bm0.c(this.y);
            C0239D.D(this.w, th, this, this.z);
        }
    }

    public at2(cs2 cs2Var, vq2 vq2Var) {
        super(cs2Var);
        this.x = vq2Var;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        QnHx qnHx = new QnHx(ht2Var);
        ht2Var.c(qnHx);
        this.x.a(qnHx.y);
        this.w.a(qnHx);
    }
}
