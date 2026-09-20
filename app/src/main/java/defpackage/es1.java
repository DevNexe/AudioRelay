package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class es1 extends c54 {
    public static final q14 c;
    public static final q14 d;
    public static final F1 g;
    public static final QnHx h;
    public final AtomicReference<QnHx> b;
    public static final TimeUnit f = TimeUnit.SECONDS;
    public static final long e = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    public static final class CQf extends c54.F1 {
        public final QnHx x;
        public final F1 y;
        public final AtomicBoolean z = new AtomicBoolean();
        public final h40 w = new h40();

        public CQf(QnHx qnHx) {
            F1 f1;
            F1 f2;
            this.x = qnHx;
            if (qnHx.y.x) {
                f2 = es1.g;
            } else {
                do {
                    if (qnHx.x.isEmpty()) {
                        f1 = new F1(qnHx.B);
                        qnHx.y.b(f1);
                        break;
                    }
                    f1 = qnHx.x.poll();
                } while (f1 == null);
                f2 = f1;
            }
            this.y = f2;
        }

        @Override // defpackage.vl0
        public final void a() {
            if (this.z.compareAndSet(false, true)) {
                this.w.a();
                QnHx qnHx = this.x;
                qnHx.getClass();
                long jNanoTime = System.nanoTime() + qnHx.w;
                F1 f1 = this.y;
                f1.y = jNanoTime;
                qnHx.x.offer(f1);
            }
        }

        @Override // c54.F1
        public final vl0 d(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.w.x ? yr0.INSTANCE : this.y.g(runnable, j, timeUnit, this.w);
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.z.get();
        }
    }

    public static final class F1 extends ko2 {
        public long y;

        public F1(ThreadFactory threadFactory) {
            super(threadFactory);
            this.y = 0L;
        }
    }

    public static final class QnHx implements Runnable {
        public final ScheduledFuture A;
        public final ThreadFactory B;
        public final long w;
        public final ConcurrentLinkedQueue<F1> x;
        public final h40 y;
        public final ScheduledExecutorService z;

        public QnHx(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.w = nanos;
            this.x = new ConcurrentLinkedQueue<>();
            this.y = new h40();
            this.B = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, es1.d);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.z = scheduledExecutorServiceNewScheduledThreadPool;
            this.A = scheduledFutureScheduleWithFixedDelay;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ConcurrentLinkedQueue<F1> concurrentLinkedQueue = this.x;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            long jNanoTime = System.nanoTime();
            for (F1 f1 : concurrentLinkedQueue) {
                if (f1.y > jNanoTime) {
                    return;
                }
                if (concurrentLinkedQueue.remove(f1)) {
                    this.y.c(f1);
                }
            }
        }
    }

    static {
        F1 f1 = new F1(new q14("RxCachedThreadSchedulerShutdown"));
        g = f1;
        f1.a();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        q14 q14Var = new q14(false, "RxCachedThreadScheduler", iMax);
        c = q14Var;
        d = new q14(false, "RxCachedWorkerPoolEvictor", iMax);
        QnHx qnHx = new QnHx(0L, null, q14Var);
        h = qnHx;
        qnHx.y.a();
        ScheduledFuture scheduledFuture = qnHx.A;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = qnHx.z;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public es1() {
        boolean z;
        QnHx qnHx = h;
        this.b = new AtomicReference<>(qnHx);
        QnHx qnHx2 = new QnHx(e, f, c);
        while (true) {
            AtomicReference<QnHx> atomicReference = this.b;
            if (atomicReference.compareAndSet(qnHx, qnHx2)) {
                z = true;
                break;
            } else if (atomicReference.get() != qnHx) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        qnHx2.y.a();
        ScheduledFuture scheduledFuture = qnHx2.A;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = qnHx2.z;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // defpackage.c54
    public final c54.F1 a() {
        return new CQf(this.b.get());
    }
}
