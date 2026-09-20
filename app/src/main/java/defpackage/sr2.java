package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class sr2<T> extends qw implements p91<T> {
    public final us2<T> w;
    public final i91<? super T, ? extends tx> x;
    public final boolean y = false;

    public static final class QnHx<T> extends AtomicInteger implements vl0, ht2<T> {
        public vl0 B;
        public volatile boolean C;
        public final nx w;
        public final i91<? super T, ? extends tx> y;
        public final boolean z;
        public final s x = new s();
        public final h40 A = new h40();

        /* JADX INFO: renamed from: sr2$QnHx$QnHx, reason: collision with other inner class name */
        public final class C0199QnHx extends AtomicReference<vl0> implements nx, vl0 {
            public C0199QnHx() {
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

        public QnHx(nx nxVar, i91<? super T, ? extends tx> i91Var, boolean z) {
            this.w = nxVar;
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
                nx nxVar = this.w;
                if (thB != null) {
                    nxVar.onError(thB);
                } else {
                    nxVar.b();
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
                C0199QnHx c0199QnHx = new C0199QnHx();
                if (this.C || !this.A.b(c0199QnHx)) {
                    return;
                }
                txVar.b(c0199QnHx);
            } catch (Throwable th) {
                XTd3.w(th);
                this.B.a();
                onError(th);
            }
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
            nx nxVar = this.w;
            if (z) {
                if (decrementAndGet() == 0) {
                    sVar.getClass();
                    nxVar.onError(uu0.b(sVar));
                    return;
                }
                return;
            }
            a();
            if (getAndSet(0) > 0) {
                sVar.getClass();
                nxVar.onError(uu0.b(sVar));
            }
        }
    }

    public sr2(us2 us2Var, i91 i91Var) {
        this.w = us2Var;
        this.x = i91Var;
    }

    @Override // defpackage.p91
    public final vq2<T> a() {
        return new rr2(this.w, this.x, this.y);
    }

    @Override // defpackage.qw
    public final void h(nx nxVar) {
        this.w.a(new QnHx(nxVar, this.x, this.y));
    }
}
