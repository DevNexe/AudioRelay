package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfgu implements zzfyx {
    public final Object w;
    public final String x;
    public final zzfyx y;

    public zzfgu(Object obj, String str, zzfyx zzfyxVar) {
        this.w = obj;
        this.x = str;
        this.y = zzfyxVar;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.y.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.y.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.y.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.y.isDone();
    }

    public final String toString() {
        return this.x + "@" + System.identityHashCode(this);
    }

    public final Object zza() {
        return this.w;
    }

    public final String zzb() {
        return this.x;
    }

    @Override // com.google.android.gms.internal.ads.zzfyx
    public final void zzc(Runnable runnable, Executor executor) {
        this.y.zzc(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.y.get(j, timeUnit);
    }
}
