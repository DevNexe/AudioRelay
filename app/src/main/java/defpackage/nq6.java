package defpackage;

import com.google.android.gms.internal.ads.Com1Fixed;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class nq6 extends s86 implements ScheduledExecutorService {
    public final ScheduledExecutorService y;

    public nq6(ScheduledExecutorService scheduledExecutorService) {
        super((ExecutorService) scheduledExecutorService);
        this.y = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        tq6 tq6Var = new tq6(Executors.callable(runnable, null));
        return new mq6(tq6Var, this.y.schedule(tq6Var, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Com1Fixed com1 = new Com1Fixed(runnable);
        return new mq6(com1, this.y.scheduleAtFixedRate(com1, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Com1Fixed com1 = new Com1Fixed(runnable);
        return new mq6(com1, this.y.scheduleWithFixedDelay(com1, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        tq6 tq6Var = new tq6(callable);
        return new mq6(tq6Var, this.y.schedule(tq6Var, j, timeUnit));
    }
}
