package com.google.android.gms.internal.ads;

import defpackage.ft;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcvu implements zzbcf {
    public final ScheduledExecutorService a;
    public final ft b;

    @GuardedBy("this")
    public ScheduledFuture c;

    @GuardedBy("this")
    public long d = -1;

    @GuardedBy("this")
    public long e = -1;

    @GuardedBy("this")
    public Runnable f = null;

    @GuardedBy("this")
    public boolean g = false;

    public zzcvu(ScheduledExecutorService scheduledExecutorService, ft ftVar) {
        this.a = scheduledExecutorService;
        this.b = ftVar;
        com.google.android.gms.ads.internal.zzt.zzb().zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbcf
    public final void zza(boolean z) {
        ScheduledFuture scheduledFuture;
        if (z) {
            synchronized (this) {
                if (this.g) {
                    if (this.e > 0 && (scheduledFuture = this.c) != null && scheduledFuture.isCancelled()) {
                        this.c = this.a.schedule(this.f, this.e, TimeUnit.MILLISECONDS);
                    }
                    this.g = false;
                }
            }
            return;
        }
        synchronized (this) {
            if (!this.g) {
                ScheduledFuture scheduledFuture2 = this.c;
                if (scheduledFuture2 == null || scheduledFuture2.isDone()) {
                    this.e = -1L;
                } else {
                    this.c.cancel(true);
                    this.e = this.d - this.b.c();
                }
                this.g = true;
            }
        }
    }

    public final synchronized void zzd(int i, Runnable runnable) {
        this.f = runnable;
        long j = i;
        this.d = this.b.c() + j;
        this.c = this.a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }
}
