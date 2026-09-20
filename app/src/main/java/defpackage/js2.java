package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class js2<T> extends vq2<T> {
    public final c54 A;
    public QnHx B;
    public final r50<T> w;
    public final int x = 1;
    public final long y = 0;
    public final TimeUnit z;

    public static final class CQf<T> extends AtomicBoolean implements ht2<T>, vl0 {
        public final ht2<? super T> w;
        public final js2<T> x;
        public final QnHx y;
        public vl0 z;

        public CQf(ht2<? super T> ht2Var, js2<T> js2Var, QnHx qnHx) {
            this.w = ht2Var;
            this.x = js2Var;
            this.y = qnHx;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.z.a();
            if (compareAndSet(false, true)) {
                js2<T> js2Var = this.x;
                QnHx qnHx = this.y;
                synchronized (js2Var) {
                    QnHx qnHx2 = js2Var.B;
                    if (qnHx2 != null && qnHx2 == qnHx) {
                        long j = qnHx.y - 1;
                        qnHx.y = j;
                        if (j == 0 && qnHx.z) {
                            if (js2Var.y == 0) {
                                js2Var.H(qnHx);
                            } else {
                                av3 av3Var = new av3();
                                qnHx.x = av3Var;
                                bm0.g(av3Var, js2Var.A.c(qnHx, js2Var.y, js2Var.z));
                            }
                        }
                    }
                }
            }
        }

        @Override // defpackage.ht2
        public final void b() {
            if (compareAndSet(false, true)) {
                this.x.G(this.y);
                this.w.b();
            }
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            if (bm0.p(this.z, vl0Var)) {
                this.z = vl0Var;
                this.w.c(this);
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.z.e();
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            this.w.g(t);
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            if (!compareAndSet(false, true)) {
                m14.b(th);
            } else {
                this.x.G(this.y);
                this.w.onError(th);
            }
        }
    }

    public static final class QnHx extends AtomicReference<vl0> implements Runnable, m70<vl0> {
        public boolean A;
        public final js2<?> w;
        public av3 x;
        public long y;
        public boolean z;

        public QnHx(js2<?> js2Var) {
            this.w = js2Var;
        }

        @Override // defpackage.m70
        public final void accept(vl0 vl0Var) {
            vl0 vl0Var2 = vl0Var;
            bm0.g(this, vl0Var2);
            synchronized (this.w) {
                if (this.A) {
                    ((kp3) this.w.w).d(vl0Var2);
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.w.H(this);
        }
    }

    public js2(r50 r50Var, TimeUnit timeUnit, k95 k95Var) {
        this.w = r50Var;
        this.z = timeUnit;
        this.A = k95Var;
    }

    public final void G(QnHx qnHx) {
        synchronized (this) {
            if (this.w instanceof is2) {
                QnHx qnHx2 = this.B;
                if (qnHx2 != null && qnHx2 == qnHx) {
                    this.B = null;
                    av3 av3Var = qnHx.x;
                    if (av3Var != null) {
                        av3Var.a();
                        qnHx.x = null;
                    }
                }
                long j = qnHx.y - 1;
                qnHx.y = j;
                if (j == 0) {
                    r50<T> r50Var = this.w;
                    if (r50Var instanceof vl0) {
                        ((vl0) r50Var).a();
                    } else if (r50Var instanceof kp3) {
                        ((kp3) r50Var).d(qnHx.get());
                    }
                }
            } else {
                QnHx qnHx3 = this.B;
                if (qnHx3 != null && qnHx3 == qnHx) {
                    av3 av3Var2 = qnHx.x;
                    if (av3Var2 != null) {
                        av3Var2.a();
                        qnHx.x = null;
                    }
                    long j2 = qnHx.y - 1;
                    qnHx.y = j2;
                    if (j2 == 0) {
                        this.B = null;
                        r50<T> r50Var2 = this.w;
                        if (r50Var2 instanceof vl0) {
                            ((vl0) r50Var2).a();
                        } else if (r50Var2 instanceof kp3) {
                            ((kp3) r50Var2).d(qnHx.get());
                        }
                    }
                }
            }
        }
    }

    public final void H(QnHx qnHx) {
        synchronized (this) {
            if (qnHx.y == 0 && qnHx == this.B) {
                this.B = null;
                vl0 vl0Var = qnHx.get();
                bm0.c(qnHx);
                r50<T> r50Var = this.w;
                if (r50Var instanceof vl0) {
                    ((vl0) r50Var).a();
                } else if (r50Var instanceof kp3) {
                    if (vl0Var == null) {
                        qnHx.A = true;
                    } else {
                        ((kp3) r50Var).d(vl0Var);
                    }
                }
            }
        }
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        QnHx qnHx;
        boolean z;
        av3 av3Var;
        synchronized (this) {
            qnHx = this.B;
            if (qnHx == null) {
                qnHx = new QnHx(this);
                this.B = qnHx;
            }
            long j = qnHx.y;
            if (j == 0 && (av3Var = qnHx.x) != null) {
                av3Var.a();
            }
            long j2 = j + 1;
            qnHx.y = j2;
            if (qnHx.z || j2 != this.x) {
                z = false;
            } else {
                z = true;
                qnHx.z = true;
            }
        }
        this.w.a(new CQf(ht2Var, this, qnHx));
        if (z) {
            this.w.G(qnHx);
        }
    }
}
