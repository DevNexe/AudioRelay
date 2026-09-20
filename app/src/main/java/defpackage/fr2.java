package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class fr2<T> extends Z<T, T> {
    public final long x;
    public final TimeUnit y;
    public final c54 z;

    public static final class CQf<T> implements ht2<T>, vl0 {
        public vl0 A;
        public QnHx B;
        public volatile long C;
        public boolean D;
        public final ht2<? super T> w;
        public final long x;
        public final TimeUnit y;
        public final c54.F1 z;

        public CQf(eb4 eb4Var, long j, TimeUnit timeUnit, c54.F1 f1) {
            this.w = eb4Var;
            this.x = j;
            this.y = timeUnit;
            this.z = f1;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.A.a();
            this.z.a();
        }

        @Override // defpackage.ht2
        public final void b() {
            if (this.D) {
                return;
            }
            this.D = true;
            QnHx qnHx = this.B;
            if (qnHx != null) {
                bm0.c(qnHx);
            }
            if (qnHx != null) {
                qnHx.run();
            }
            this.w.b();
            this.z.a();
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            if (bm0.p(this.A, vl0Var)) {
                this.A = vl0Var;
                this.w.c(this);
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.z.e();
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            if (this.D) {
                return;
            }
            long j = this.C + 1;
            this.C = j;
            QnHx qnHx = this.B;
            if (qnHx != null) {
                bm0.c(qnHx);
            }
            QnHx qnHx2 = new QnHx(t, j, this);
            this.B = qnHx2;
            bm0.g(qnHx2, this.z.d(qnHx2, this.x, this.y));
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            if (this.D) {
                m14.b(th);
                return;
            }
            QnHx qnHx = this.B;
            if (qnHx != null) {
                bm0.c(qnHx);
            }
            this.D = true;
            this.w.onError(th);
            this.z.a();
        }
    }

    public static final class QnHx<T> extends AtomicReference<vl0> implements Runnable, vl0 {
        public final T w;
        public final long x;
        public final CQf<T> y;
        public final AtomicBoolean z = new AtomicBoolean();

        public QnHx(T t, long j, CQf<T> cQf) {
            this.w = t;
            this.x = j;
            this.y = cQf;
        }

        @Override // defpackage.vl0
        public final void a() {
            bm0.c(this);
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return get() == bm0.DISPOSED;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.z.compareAndSet(false, true)) {
                CQf<T> cQf = this.y;
                long j = this.x;
                T t = this.w;
                if (j == cQf.C) {
                    cQf.w.g(t);
                    bm0.c(this);
                }
            }
        }
    }

    public fr2(hr2 hr2Var, TimeUnit timeUnit, c54 c54Var) {
        super(hr2Var);
        this.x = 500L;
        this.y = timeUnit;
        this.z = c54Var;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        this.w.a(new CQf(new eb4(ht2Var), this.x, this.y, this.z.a()));
    }
}
