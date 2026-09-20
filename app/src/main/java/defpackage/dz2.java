package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class dz2 extends c54 {
    public static final ScheduledExecutorService[] g = new ScheduledExecutorService[0];
    public static final ScheduledExecutorService h;
    public final ThreadFactory b;
    public final int c;
    public final boolean d;
    public final AtomicReference<ScheduledExecutorService[]> e;
    public int f;

    public static final class CQf extends c54.F1 {
        public final ScheduledExecutorService w;
        public final h40 x = new h40();

        public static final class QnHx extends AtomicReference<wl0> implements Callable<Object>, vl0 {
            public static final FutureTask y;
            public static final FutureTask z;
            public final AtomicReference<Future<?>> w;
            public final Runnable x;

            static {
                m91.EQ eq = m91.b;
                FutureTask futureTask = new FutureTask(eq, null);
                y = futureTask;
                futureTask.cancel(false);
                FutureTask futureTask2 = new FutureTask(eq, null);
                z = futureTask2;
                futureTask2.cancel(false);
            }

            public QnHx(Runnable runnable, h40 h40Var) {
                this.x = runnable;
                lazySet(h40Var);
                this.w = new AtomicReference<>();
            }

            @Override // defpackage.vl0
            public final void a() {
                FutureTask futureTask;
                Future<?> andSet;
                wl0 andSet2 = getAndSet(null);
                if (andSet2 != null) {
                    andSet2.d(this);
                }
                AtomicReference<Future<?>> atomicReference = this.w;
                Future<?> future = atomicReference.get();
                FutureTask futureTask2 = y;
                if (future == futureTask2 || future == (futureTask = z) || (andSet = atomicReference.getAndSet(futureTask)) == null || andSet == futureTask2 || andSet == futureTask) {
                    return;
                }
                andSet.cancel(true);
            }

            public final void b(Future<?> future) {
                boolean z2;
                AtomicReference<Future<?>> atomicReference = this.w;
                Future<?> future2 = atomicReference.get();
                if (future2 != y) {
                    FutureTask futureTask = z;
                    if (future2 == futureTask) {
                        future.cancel(true);
                        return;
                    }
                    while (true) {
                        if (atomicReference.compareAndSet(future2, future)) {
                            z2 = true;
                            break;
                        } else if (atomicReference.get() != future2) {
                            z2 = false;
                            break;
                        }
                    }
                    if (z2 || atomicReference.get() != futureTask) {
                        return;
                    }
                    future.cancel(true);
                }
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean z2;
                try {
                    this.x.run();
                } catch (Throwable th) {
                    XTd3.w(th);
                    m14.b(th);
                }
                wl0 wl0Var = get();
                if (wl0Var != null && compareAndSet(wl0Var, null)) {
                    wl0Var.d(this);
                }
                do {
                    AtomicReference<Future<?>> atomicReference = this.w;
                    Future<?> future = atomicReference.get();
                    if (future == z) {
                        break;
                    }
                    FutureTask futureTask = y;
                    while (true) {
                        if (atomicReference.compareAndSet(future, futureTask)) {
                            z2 = true;
                            break;
                        }
                        if (atomicReference.get() != future) {
                            z2 = false;
                            break;
                        }
                    }
                } while (!z2);
                return null;
            }

            @Override // defpackage.vl0
            public final boolean e() {
                return get() == null;
            }
        }

        public CQf(ScheduledExecutorService scheduledExecutorService) {
            this.w = scheduledExecutorService;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.x.a();
        }

        @Override // c54.F1
        public final vl0 c(Runnable runnable) {
            if (!this.x.x) {
                m14.c(runnable);
                QnHx qnHx = new QnHx(runnable, this.x);
                if (this.x.b(qnHx)) {
                    try {
                        qnHx.b(this.w.submit(qnHx));
                        return qnHx;
                    } catch (RejectedExecutionException unused) {
                    }
                }
            }
            return yr0.INSTANCE;
        }

        @Override // c54.F1
        public final vl0 d(Runnable runnable, long j, TimeUnit timeUnit) {
            if (!this.x.x) {
                m14.c(runnable);
                QnHx qnHx = new QnHx(runnable, this.x);
                if (this.x.b(qnHx)) {
                    try {
                        qnHx.b(this.w.schedule(qnHx, j, timeUnit));
                        return qnHx;
                    } catch (RejectedExecutionException unused) {
                    }
                }
            }
            return yr0.INSTANCE;
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.x.x;
        }
    }

    public static final class QnHx extends c54.F1 {
        public final ScheduledExecutorService w;
        public volatile boolean x;

        /* JADX INFO: renamed from: dz2$QnHx$QnHx, reason: collision with other inner class name */
        public final class CallableC0119QnHx implements Callable<Object>, vl0 {
            public final Runnable w;
            public volatile boolean x;

            public CallableC0119QnHx(Runnable runnable) {
                this.w = runnable;
            }

            @Override // defpackage.vl0
            public final void a() {
                this.x = true;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                if (this.x || QnHx.this.x) {
                    return null;
                }
                try {
                    this.w.run();
                    return null;
                } catch (Throwable th) {
                    XTd3.w(th);
                    m14.b(th);
                    return null;
                }
            }

            @Override // defpackage.vl0
            public final boolean e() {
                return this.x;
            }
        }

        public QnHx(ScheduledExecutorService scheduledExecutorService) {
            this.w = scheduledExecutorService;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.x = true;
        }

        @Override // c54.F1
        public final vl0 c(Runnable runnable) {
            if (!this.x) {
                try {
                    m14.c(runnable);
                    CallableC0119QnHx callableC0119QnHx = new CallableC0119QnHx(runnable);
                    this.w.submit(callableC0119QnHx);
                    return callableC0119QnHx;
                } catch (RejectedExecutionException unused) {
                }
            }
            return yr0.INSTANCE;
        }

        @Override // c54.F1
        public final vl0 d(Runnable runnable, long j, TimeUnit timeUnit) {
            if (!this.x) {
                try {
                    m14.c(runnable);
                    CallableC0119QnHx callableC0119QnHx = new CallableC0119QnHx(runnable);
                    this.w.schedule(callableC0119QnHx, j, timeUnit);
                    return callableC0119QnHx;
                } catch (RejectedExecutionException unused) {
                }
            }
            return yr0.INSTANCE;
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.x;
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        h = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.shutdownNow();
    }

    public dz2() {
        boolean z;
        q14 q14Var = new q14(false, "Server:Pipeline", 10);
        this.c = 1;
        this.b = q14Var;
        this.d = false;
        ScheduledExecutorService[] scheduledExecutorServiceArr = g;
        this.e = new AtomicReference<>(scheduledExecutorServiceArr);
        ScheduledExecutorService[] scheduledExecutorServiceArr2 = null;
        do {
            AtomicReference<ScheduledExecutorService[]> atomicReference = this.e;
            ScheduledExecutorService[] scheduledExecutorServiceArr3 = atomicReference.get();
            if (scheduledExecutorServiceArr3 != scheduledExecutorServiceArr) {
                if (scheduledExecutorServiceArr2 != null) {
                    for (ScheduledExecutorService scheduledExecutorService : scheduledExecutorServiceArr2) {
                        scheduledExecutorService.shutdownNow();
                    }
                    return;
                }
                return;
            }
            if (scheduledExecutorServiceArr2 == null) {
                int i = this.c;
                ScheduledExecutorService[] scheduledExecutorServiceArr4 = new ScheduledExecutorService[i];
                for (int i2 = 0; i2 < i; i2++) {
                    scheduledExecutorServiceArr4[i2] = Executors.newSingleThreadScheduledExecutor(this.b);
                }
                scheduledExecutorServiceArr2 = scheduledExecutorServiceArr4;
            }
            while (true) {
                if (!atomicReference.compareAndSet(scheduledExecutorServiceArr3, scheduledExecutorServiceArr2)) {
                    if (atomicReference.get() != scheduledExecutorServiceArr3) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
        } while (!z);
    }

    @Override // defpackage.c54
    public final c54.F1 a() {
        return this.d ? new CQf(e()) : new QnHx(e());
    }

    @Override // defpackage.c54
    public final vl0 b(Runnable runnable) {
        ScheduledExecutorService scheduledExecutorServiceE = e();
        yr0 yr0Var = yr0.INSTANCE;
        if (scheduledExecutorServiceE == h) {
            return yr0Var;
        }
        try {
            m14.c(runnable);
            return ac.d(scheduledExecutorServiceE.submit(runnable));
        } catch (RejectedExecutionException unused) {
            return yr0Var;
        }
    }

    @Override // defpackage.c54
    public final vl0 c(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorServiceE = e();
        yr0 yr0Var = yr0.INSTANCE;
        if (scheduledExecutorServiceE == h) {
            return yr0Var;
        }
        try {
            m14.c(runnable);
            return ac.d(scheduledExecutorServiceE.schedule(runnable, j, timeUnit));
        } catch (RejectedExecutionException unused) {
            return yr0Var;
        }
    }

    @Override // defpackage.c54
    public final vl0 d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorServiceE = e();
        yr0 yr0Var = yr0.INSTANCE;
        if (scheduledExecutorServiceE == h) {
            return yr0Var;
        }
        try {
            return ac.d(scheduledExecutorServiceE.scheduleAtFixedRate(runnable, j, j2, timeUnit));
        } catch (RejectedExecutionException unused) {
            return yr0Var;
        }
    }

    public final ScheduledExecutorService e() {
        ScheduledExecutorService[] scheduledExecutorServiceArr = this.e.get();
        if (scheduledExecutorServiceArr.length == 0) {
            return h;
        }
        int i = this.f;
        if (i >= this.c) {
            i = 0;
        }
        this.f = i + 1;
        return scheduledExecutorServiceArr[i];
    }
}
