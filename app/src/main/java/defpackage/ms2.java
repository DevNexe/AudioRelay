package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ms2<T> extends Z<T, T> {
    public final i91<? super vq2<Throwable>, ? extends us2<?>> x;

    public static final class QnHx<T> extends AtomicInteger implements ht2<T>, vl0 {
        public final us2<T> C;
        public volatile boolean D;
        public final ht2<? super T> w;
        public final dw4<Throwable> z;
        public final AtomicInteger x = new AtomicInteger();
        public final s y = new s();
        public final QnHx<T>.C0170QnHx A = new C0170QnHx();
        public final AtomicReference<vl0> B = new AtomicReference<>();

        /* JADX INFO: renamed from: ms2$QnHx$QnHx, reason: collision with other inner class name */
        public final class C0170QnHx extends AtomicReference<vl0> implements ht2<Object> {
            public C0170QnHx() {
            }

            @Override // defpackage.ht2
            public final void b() {
                QnHx qnHx = QnHx.this;
                bm0.c(qnHx.B);
                C0239D.C(qnHx.w, qnHx, qnHx.y);
            }

            @Override // defpackage.ht2
            public final void c(vl0 vl0Var) {
                bm0.n(this, vl0Var);
            }

            @Override // defpackage.ht2
            public final void g(Object obj) {
                QnHx.this.d();
            }

            @Override // defpackage.ht2
            public final void onError(Throwable th) {
                QnHx qnHx = QnHx.this;
                bm0.c(qnHx.B);
                C0239D.D(qnHx.w, th, qnHx, qnHx.y);
            }
        }

        public QnHx(ht2<? super T> ht2Var, dw4<Throwable> dw4Var, us2<T> us2Var) {
            this.w = ht2Var;
            this.z = dw4Var;
            this.C = us2Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            bm0.c(this.B);
            bm0.c(this.A);
        }

        @Override // defpackage.ht2
        public final void b() {
            bm0.c(this.A);
            C0239D.C(this.w, this, this.y);
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            bm0.g(this.B, vl0Var);
        }

        public final void d() {
            if (this.x.getAndIncrement() == 0) {
                while (!e()) {
                    if (!this.D) {
                        this.D = true;
                        this.C.a(this);
                    }
                    if (this.x.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return bm0.d(this.B.get());
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            C0239D.E(this.w, t, this, this.y);
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            bm0.g(this.B, null);
            this.D = false;
            this.z.g(th);
        }
    }

    public ms2(jr2 jr2Var, a14 a14Var) {
        super(jr2Var);
        this.x = a14Var;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        dw4<T> dw4VarG = new rg3().G();
        try {
            us2<?> us2VarApply = this.x.apply(dw4VarG);
            mq2.b(us2VarApply, "The handler returned a null ObservableSource");
            us2<?> us2Var = us2VarApply;
            QnHx qnHx = new QnHx(ht2Var, dw4VarG, this.w);
            ht2Var.c(qnHx);
            us2Var.a(qnHx.A);
            qnHx.d();
        } catch (Throwable th) {
            XTd3.w(th);
            ht2Var.c(yr0.INSTANCE);
            ht2Var.onError(th);
        }
    }
}
