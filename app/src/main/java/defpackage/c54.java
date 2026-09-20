package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c54 {
    public static final long a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    public static final class CQf implements vl0, Runnable {
        public final Runnable w;
        public final F1 x;
        public volatile boolean y;

        public CQf(Runnable runnable, F1 f1) {
            this.w = runnable;
            this.x = f1;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.y = true;
            this.x.a();
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.y;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.y) {
                return;
            }
            try {
                this.w.run();
            } catch (Throwable th) {
                XTd3.w(th);
                this.x.a();
                throw uu0.d(th);
            }
        }
    }

    public static abstract class F1 implements vl0 {

        public final class QnHx implements Runnable {
            public long A;
            public long B;
            public final Runnable w;
            public final av3 x;
            public final long y;
            public long z;

            public QnHx(long j, Runnable runnable, long j2, av3 av3Var, long j3) {
                this.w = runnable;
                this.x = av3Var;
                this.y = j3;
                this.A = j2;
                this.B = j;
            }

            @Override // java.lang.Runnable
            public final void run() {
                long j;
                this.w.run();
                av3 av3Var = this.x;
                if (av3Var.e()) {
                    return;
                }
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                F1 f1 = F1.this;
                f1.getClass();
                long jB = F1.b(timeUnit);
                long j2 = c54.a;
                long j3 = jB + j2;
                long j4 = this.A;
                long j5 = this.y;
                if (j3 < j4 || jB >= j4 + j5 + j2) {
                    j = jB + j5;
                    long j6 = this.z + 1;
                    this.z = j6;
                    this.B = j - (j5 * j6);
                } else {
                    long j7 = this.B;
                    long j8 = this.z + 1;
                    this.z = j8;
                    j = (j8 * j5) + j7;
                }
                this.A = jB;
                bm0.g(av3Var, f1.d(this, j - jB, timeUnit));
            }
        }

        public static long b(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        public vl0 c(Runnable runnable) {
            return d(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public abstract vl0 d(Runnable runnable, long j, TimeUnit timeUnit);

        public final vl0 f(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            av3 av3Var = new av3();
            av3 av3Var2 = new av3(av3Var);
            long nanos = timeUnit.toNanos(j2);
            long jB = b(TimeUnit.NANOSECONDS);
            vl0 vl0VarD = d(new QnHx(timeUnit.toNanos(j) + jB, runnable, jB, av3Var2, nanos), j, timeUnit);
            if (vl0VarD == yr0.INSTANCE) {
                return vl0VarD;
            }
            bm0.g(av3Var, vl0VarD);
            return av3Var2;
        }
    }

    public static final class QnHx implements vl0, Runnable {
        public final Runnable w;
        public final F1 x;
        public Thread y;

        public QnHx(Runnable runnable, F1 f1) {
            this.w = runnable;
            this.x = f1;
        }

        @Override // defpackage.vl0
        public final void a() {
            if (this.y == Thread.currentThread()) {
                F1 f1 = this.x;
                if (f1 instanceof ko2) {
                    ko2 ko2Var = (ko2) f1;
                    if (ko2Var.x) {
                        return;
                    }
                    ko2Var.x = true;
                    ko2Var.w.shutdown();
                    return;
                }
            }
            this.x.a();
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.x.e();
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.y = Thread.currentThread();
            try {
                this.w.run();
            } finally {
                a();
                this.y = null;
            }
        }
    }

    public abstract F1 a();

    public vl0 b(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public vl0 c(Runnable runnable, long j, TimeUnit timeUnit) {
        F1 f1A = a();
        m14.c(runnable);
        QnHx qnHx = new QnHx(runnable, f1A);
        f1A.d(qnHx, j, timeUnit);
        return qnHx;
    }

    public vl0 d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        F1 f1A = a();
        CQf cQf = new CQf(runnable, f1A);
        vl0 vl0VarF = f1A.f(cQf, j, j2, timeUnit);
        return vl0VarF == yr0.INSTANCE ? vl0VarF : cQf;
    }
}
