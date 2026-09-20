package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class er2<T, U> extends Z<T, T> {
    public final i91<? super T, ? extends us2<U>> x;

    public static final class QnHx<T, U> implements ht2<T>, vl0 {
        public volatile long A;
        public boolean B;
        public final ht2<? super T> w;
        public final i91<? super T, ? extends us2<U>> x;
        public vl0 y;
        public final AtomicReference<vl0> z = new AtomicReference<>();

        /* JADX INFO: renamed from: er2$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0123QnHx<T, U> extends dm0<U> {
            public boolean A;
            public final AtomicBoolean B = new AtomicBoolean();
            public final QnHx<T, U> x;
            public final long y;
            public final T z;

            public C0123QnHx(QnHx<T, U> qnHx, long j, T t) {
                this.x = qnHx;
                this.y = j;
                this.z = t;
            }

            @Override // defpackage.ht2
            public final void b() {
                if (this.A) {
                    return;
                }
                this.A = true;
                d();
            }

            public final void d() {
                if (this.B.compareAndSet(false, true)) {
                    QnHx<T, U> qnHx = this.x;
                    long j = this.y;
                    T t = this.z;
                    if (j == qnHx.A) {
                        qnHx.w.g(t);
                    }
                }
            }

            @Override // defpackage.ht2
            public final void g(U u) {
                if (this.A) {
                    return;
                }
                this.A = true;
                a();
                d();
            }

            @Override // defpackage.ht2
            public final void onError(Throwable th) {
                if (this.A) {
                    m14.b(th);
                } else {
                    this.A = true;
                    this.x.onError(th);
                }
            }
        }

        public QnHx(eb4 eb4Var, i91 i91Var) {
            this.w = eb4Var;
            this.x = i91Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.y.a();
            bm0.c(this.z);
        }

        @Override // defpackage.ht2
        public final void b() {
            if (this.B) {
                return;
            }
            this.B = true;
            AtomicReference<vl0> atomicReference = this.z;
            vl0 vl0Var = atomicReference.get();
            if (vl0Var != bm0.DISPOSED) {
                C0123QnHx c0123QnHx = (C0123QnHx) vl0Var;
                if (c0123QnHx != null) {
                    c0123QnHx.d();
                }
                bm0.c(atomicReference);
                this.w.b();
            }
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            if (bm0.p(this.y, vl0Var)) {
                this.y = vl0Var;
                this.w.c(this);
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.y.e();
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            boolean z;
            if (this.B) {
                return;
            }
            long j = this.A + 1;
            this.A = j;
            vl0 vl0Var = this.z.get();
            if (vl0Var != null) {
                vl0Var.a();
            }
            try {
                us2<U> us2VarApply = this.x.apply(t);
                mq2.b(us2VarApply, "The ObservableSource supplied is null");
                us2<U> us2Var = us2VarApply;
                C0123QnHx c0123QnHx = new C0123QnHx(this, j, t);
                AtomicReference<vl0> atomicReference = this.z;
                while (true) {
                    if (atomicReference.compareAndSet(vl0Var, c0123QnHx)) {
                        z = true;
                        break;
                    } else if (atomicReference.get() != vl0Var) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    us2Var.a(c0123QnHx);
                }
            } catch (Throwable th) {
                XTd3.w(th);
                a();
                this.w.onError(th);
            }
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            bm0.c(this.z);
            this.w.onError(th);
        }
    }

    public er2(hr2 hr2Var, e14 e14Var) {
        super(hr2Var);
        this.x = e14Var;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        this.w.a(new QnHx(new eb4(ht2Var), this.x));
    }
}
