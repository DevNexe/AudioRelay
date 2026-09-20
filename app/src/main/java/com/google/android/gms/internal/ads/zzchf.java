package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public class zzchf implements zzfyx {
    public final zzfzg w = zzfzg.zzf();

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.w.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.w.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.w.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.w.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzfyx
    public final void zzc(Runnable runnable, Executor executor) {
        this.w.zzc(runnable, executor);
    }

    public final boolean zzd(Object obj) {
        boolean zZzd = this.w.zzd(obj);
        if (!zZzd) {
            com.google.android.gms.ads.internal.zzt.zzp().zzs(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return zZzd;
    }

    public final boolean zze(Throwable th) {
        boolean zZze = this.w.zze(th);
        if (!zZze) {
            com.google.android.gms.ads.internal.zzt.zzp().zzs(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return zZze;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.w.get(j, timeUnit);
    }
}
