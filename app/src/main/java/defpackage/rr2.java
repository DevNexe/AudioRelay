package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class rr2<T> extends Z<T, T> {
    public final i91<? super T, ? extends tx> x;
    public final boolean y;

    public static final class QnHx<T> extends d9<T> implements ht2<T> {
        public vl0 B;
        public volatile boolean C;
        public final ht2<? super T> w;
        public final i91<? super T, ? extends tx> y;
        public final boolean z;
        public final s x = new s();
        public final h40 A = new h40();

        /* JADX INFO: renamed from: rr2$QnHx$QnHx, reason: collision with other inner class name */
        public final class C0188QnHx extends AtomicReference<vl0> implements nx, vl0 {
            public C0188QnHx() {
            }

            @Override // defpackage.vl0
            public final void a() {
                bm0.c(this);
            }

            @Override // defpackage.nx
            public final void b() {
                QnHx qnHx = QnHx.this;
                qnHx.A.d(this);
                qnHx.b();
            }

            @Override // defpackage.nx
            public final void c(vl0 vl0Var) {
                bm0.n(this, vl0Var);
            }

            @Override // defpackage.vl0
            public final boolean e() {
                return bm0.d(get());
            }

            @Override // defpackage.nx
            public final void onError(Throwable th) {
                QnHx qnHx = QnHx.this;
                qnHx.A.d(this);
                qnHx.onError(th);
            }
        }

        public QnHx(ht2<? super T> ht2Var, i91<? super T, ? extends tx> i91Var, boolean z) {
            this.w = ht2Var;
            this.y = i91Var;
            this.z = z;
            lazySet(1);
        }

        @Override // defpackage.vl0
        public final void a() {
            this.C = true;
            this.B.a();
            this.A.a();
        }

        @Override // defpackage.ht2
        public final void b() {
            if (decrementAndGet() == 0) {
                s sVar = this.x;
                sVar.getClass();
                Throwable thB = uu0.b(sVar);
                ht2<? super T> ht2Var = this.w;
                if (thB != null) {
                    ht2Var.onError(thB);
                } else {
                    ht2Var.b();
                }
            }
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            if (bm0.p(this.B, vl0Var)) {
                this.B = vl0Var;
                this.w.c(this);
            }
        }

        @Override // defpackage.uk4
        public final void clear() {
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.B.e();
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            try {
                tx txVarApply = this.y.apply(t);
                mq2.b(txVarApply, "The mapper returned a null CompletableSource");
                tx txVar = txVarApply;
                getAndIncrement();
                C0188QnHx c0188QnHx = new C0188QnHx();
                if (this.C || !this.A.b(c0188QnHx)) {
                    return;
                }
                txVar.b(c0188QnHx);
            } catch (Throwable th) {
                XTd3.w(th);
                this.B.a();
                onError(th);
            }
        }

        @Override // defpackage.uk4
        public final boolean isEmpty() {
            return true;
        }

        @Override // defpackage.nh3
        public final int l(int i) {
            return i & 2;
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            s sVar = this.x;
            sVar.getClass();
            if (!uu0.a(sVar, th)) {
                m14.b(th);
                return;
            }
            boolean z = this.z;
            ht2<? super T> ht2Var = this.w;
            if (z) {
                if (decrementAndGet() == 0) {
                    sVar.getClass();
                    ht2Var.onError(uu0.b(sVar));
                    return;
                }
                return;
            }
            a();
            if (getAndSet(0) > 0) {
                sVar.getClass();
                ht2Var.onError(uu0.b(sVar));
            }
        }

        @Override // defpackage.uk4
        public final T poll() {
            return null;
        }
    }

    public rr2(us2<T> us2Var, i91<? super T, ? extends tx> i91Var, boolean z) {
        super(us2Var);
        this.x = i91Var;
        this.y = z;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        this.w.a(new QnHx(ht2Var, this.x, this.y));
    }
}
