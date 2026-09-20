package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ql4 extends c54 {
    public static final q14 c;
    public final AtomicReference<ScheduledExecutorService> b;

    public static final class QnHx extends c54.F1 {
        public final ScheduledExecutorService w;
        public final h40 x = new h40();
        public volatile boolean y;

        public QnHx(ScheduledExecutorService scheduledExecutorService) {
            this.w = scheduledExecutorService;
        }

        @Override // defpackage.vl0
        public final void a() {
            if (this.y) {
                return;
            }
            this.y = true;
            this.x.a();
        }

        @Override // c54.F1
        public final vl0 d(Runnable runnable, long j, TimeUnit timeUnit) {
            boolean z = this.y;
            yr0 yr0Var = yr0.INSTANCE;
            if (z) {
                return yr0Var;
            }
            m14.c(runnable);
            a54 a54Var = new a54(runnable, this.x);
            this.x.b(a54Var);
            try {
                a54Var.b(j <= 0 ? this.w.submit((Callable) a54Var) : this.w.schedule((Callable) a54Var, j, timeUnit));
                return a54Var;
            } catch (RejectedExecutionException e) {
                a();
                m14.b(e);
                return yr0Var;
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.y;
        }
    }

    static {
        Executors.newScheduledThreadPool(0).shutdown();
        c = new q14(true, "RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())));
    }

    public ql4() {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.b = atomicReference;
        boolean z = i54.a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, c);
        if (i54.a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            i54.d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        atomicReference.lazySet(scheduledExecutorServiceNewScheduledThreadPool);
    }

    @Override // defpackage.c54
    public final c54.F1 a() {
        return new QnHx(this.b.get());
    }

    @Override // defpackage.c54
    public final vl0 c(Runnable runnable, long j, TimeUnit timeUnit) {
        m14.c(runnable);
        z44 z44Var = new z44(runnable);
        AtomicReference<ScheduledExecutorService> atomicReference = this.b;
        try {
            z44Var.b(j <= 0 ? atomicReference.get().submit(z44Var) : atomicReference.get().schedule(z44Var, j, timeUnit));
            return z44Var;
        } catch (RejectedExecutionException e) {
            m14.b(e);
            return yr0.INSTANCE;
        }
    }

    @Override // defpackage.c54
    public final vl0 d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        yr0 yr0Var = yr0.INSTANCE;
        AtomicReference<ScheduledExecutorService> atomicReference = this.b;
        if (j2 > 0) {
            y44 y44Var = new y44(runnable);
            try {
                y44Var.b(atomicReference.get().scheduleAtFixedRate(y44Var, j, j2, timeUnit));
                return y44Var;
            } catch (RejectedExecutionException e) {
                m14.b(e);
                return yr0Var;
            }
        }
        ScheduledExecutorService scheduledExecutorService = atomicReference.get();
        hp1 hp1Var = new hp1(runnable, scheduledExecutorService);
        try {
            hp1Var.b(j <= 0 ? scheduledExecutorService.submit(hp1Var) : scheduledExecutorService.schedule(hp1Var, j, timeUnit));
            return hp1Var;
        } catch (RejectedExecutionException e2) {
            m14.b(e2);
            return yr0Var;
        }
    }
}
