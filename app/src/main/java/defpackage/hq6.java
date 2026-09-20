package defpackage;

import com.google.android.gms.internal.ads.zzfsf;
import com.google.android.gms.internal.ads.zzfyx;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class hq6 implements zzfyx {
    public static final hq6 x = new hq6(null);
    public static final Logger y = Logger.getLogger(hq6.class.getName());
    public final Object w;

    public hq6(Object obj) {
        this.w = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.w;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.w;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.w + "]]";
    }

    @Override // com.google.android.gms.internal.ads.zzfyx
    public final void zzc(Runnable runnable, Executor executor) {
        zzfsf.zzc(runnable, "Runnable was null.");
        zzfsf.zzc(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            y.logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }
}
