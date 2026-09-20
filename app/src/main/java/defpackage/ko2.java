package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class ko2 extends c54.F1 {
    public final ScheduledExecutorService w;
    public volatile boolean x;

    public ko2(ThreadFactory threadFactory) {
        boolean z = i54.a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (i54.a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            i54.d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        this.w = scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // defpackage.vl0
    public final void a() {
        if (this.x) {
            return;
        }
        this.x = true;
        this.w.shutdownNow();
    }

    @Override // c54.F1
    public final vl0 c(Runnable runnable) {
        return d(runnable, 0L, null);
    }

    @Override // c54.F1
    public final vl0 d(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.x ? yr0.INSTANCE : g(runnable, j, timeUnit, null);
    }

    @Override // defpackage.vl0
    public final boolean e() {
        return this.x;
    }

    public final a54 g(Runnable runnable, long j, TimeUnit timeUnit, wl0 wl0Var) {
        m14.c(runnable);
        a54 a54Var = new a54(runnable, wl0Var);
        if (wl0Var != null && !wl0Var.b(a54Var)) {
            return a54Var;
        }
        ScheduledExecutorService scheduledExecutorService = this.w;
        try {
            a54Var.b(j <= 0 ? scheduledExecutorService.submit((Callable) a54Var) : scheduledExecutorService.schedule((Callable) a54Var, j, timeUnit));
        } catch (RejectedExecutionException e) {
            if (wl0Var != null) {
                wl0Var.c(a54Var);
            }
            m14.b(e);
        }
        return a54Var;
    }
}
