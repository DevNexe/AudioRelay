package defpackage;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class k95 extends c54 {
    public static final k95 b = new k95();

    public static final class CQf implements Comparable<CQf> {
        public final Runnable w;
        public final long x;
        public final int y;
        public volatile boolean z;

        public CQf(Runnable runnable, Long l, int i) {
            this.w = runnable;
            this.x = l.longValue();
            this.y = i;
        }

        @Override // java.lang.Comparable
        public final int compareTo(CQf cQf) {
            int i;
            CQf cQf2 = cQf;
            long j = cQf2.x;
            long j2 = this.x;
            int i2 = 0;
            if (j2 < j) {
                i = -1;
            } else {
                i = j2 > j ? 1 : 0;
            }
            if (i != 0) {
                return i;
            }
            int i3 = this.y;
            int i4 = cQf2.y;
            if (i3 < i4) {
                i2 = -1;
            } else if (i3 > i4) {
                i2 = 1;
            }
            return i2;
        }
    }

    public static final class F1 extends c54.F1 {
        public final PriorityBlockingQueue<CQf> w = new PriorityBlockingQueue<>();
        public final AtomicInteger x = new AtomicInteger();
        public final AtomicInteger y = new AtomicInteger();
        public volatile boolean z;

        public final class QnHx implements Runnable {
            public final CQf w;

            public QnHx(CQf cQf) {
                this.w = cQf;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.w.z = true;
                F1.this.w.remove(this.w);
            }
        }

        @Override // defpackage.vl0
        public final void a() {
            this.z = true;
        }

        @Override // c54.F1
        public final vl0 c(Runnable runnable) {
            return g(runnable, c54.F1.b(TimeUnit.MILLISECONDS));
        }

        @Override // c54.F1
        public final vl0 d(Runnable runnable, long j, TimeUnit timeUnit) {
            long millis = timeUnit.toMillis(j) + c54.F1.b(TimeUnit.MILLISECONDS);
            return g(new QnHx(runnable, this, millis), millis);
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.z;
        }

        public final vl0 g(Runnable runnable, long j) {
            boolean z = this.z;
            yr0 yr0Var = yr0.INSTANCE;
            if (z) {
                return yr0Var;
            }
            CQf cQf = new CQf(runnable, Long.valueOf(j), this.y.incrementAndGet());
            this.w.add(cQf);
            if (this.x.getAndIncrement() != 0) {
                return new av3(new QnHx(cQf));
            }
            int iAddAndGet = 1;
            while (!this.z) {
                CQf cQfPoll = this.w.poll();
                if (cQfPoll == null) {
                    iAddAndGet = this.x.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return yr0Var;
                    }
                } else if (!cQfPoll.z) {
                    cQfPoll.w.run();
                }
            }
            this.w.clear();
            return yr0Var;
        }
    }

    public static final class QnHx implements Runnable {
        public final Runnable w;
        public final F1 x;
        public final long y;

        public QnHx(Runnable runnable, F1 f1, long j) {
            this.w = runnable;
            this.x = f1;
            this.y = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.x.z) {
                return;
            }
            F1 f1 = this.x;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            f1.getClass();
            long jB = c54.F1.b(timeUnit);
            long j = this.y;
            if (j > jB) {
                try {
                    Thread.sleep(j - jB);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    m14.b(e);
                    return;
                }
            }
            if (this.x.z) {
                return;
            }
            this.w.run();
        }
    }

    @Override // defpackage.c54
    public final c54.F1 a() {
        return new F1();
    }

    @Override // defpackage.c54
    public final vl0 b(Runnable runnable) {
        m14.c(runnable);
        runnable.run();
        return yr0.INSTANCE;
    }

    @Override // defpackage.c54
    public final vl0 c(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            m14.c(runnable);
            runnable.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            m14.b(e);
        }
        return yr0.INSTANCE;
    }
}
