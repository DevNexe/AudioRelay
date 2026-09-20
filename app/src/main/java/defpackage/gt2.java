package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class gt2<T, U, R> extends Z<T, R> {
    public final ba<? super T, ? super U, ? extends R> x;
    public final us2<? extends U> y;

    public final class CQf implements ht2<U> {
        public final QnHx<T, U, R> w;

        public CQf(QnHx qnHx) {
            this.w = qnHx;
        }

        @Override // defpackage.ht2
        public final void b() {
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            bm0.n(this.w.z, vl0Var);
        }

        @Override // defpackage.ht2
        public final void g(U u) {
            this.w.lazySet(u);
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            QnHx<T, U, R> qnHx = this.w;
            bm0.c(qnHx.y);
            qnHx.w.onError(th);
        }
    }

    public static final class QnHx<T, U, R> extends AtomicReference<U> implements ht2<T>, vl0 {
        public final ht2<? super R> w;
        public final ba<? super T, ? super U, ? extends R> x;
        public final AtomicReference<vl0> y = new AtomicReference<>();
        public final AtomicReference<vl0> z = new AtomicReference<>();

        public QnHx(eb4 eb4Var, ba baVar) {
            this.w = eb4Var;
            this.x = baVar;
        }

        @Override // defpackage.vl0
        public final void a() {
            bm0.c(this.y);
            bm0.c(this.z);
        }

        @Override // defpackage.ht2
        public final void b() {
            bm0.c(this.z);
            this.w.b();
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            bm0.n(this.y, vl0Var);
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return bm0.d(this.y.get());
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            ht2<? super R> ht2Var = this.w;
            U u = get();
            if (u != null) {
                try {
                    R rApply = this.x.apply(t, u);
                    mq2.b(rApply, "The combiner returned a null value");
                    ht2Var.g(rApply);
                } catch (Throwable th) {
                    XTd3.w(th);
                    a();
                    ht2Var.onError(th);
                }
            }
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            bm0.c(this.z);
            this.w.onError(th);
        }
    }

    public gt2(vq2 vq2Var, vq2 vq2Var2, g7 g7Var) {
        super(vq2Var);
        this.x = g7Var;
        this.y = vq2Var2;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super R> ht2Var) {
        eb4 eb4Var = new eb4(ht2Var);
        QnHx qnHx = new QnHx(eb4Var, this.x);
        eb4Var.c(qnHx);
        this.y.a(new CQf(qnHx));
        this.w.a(qnHx);
    }
}
