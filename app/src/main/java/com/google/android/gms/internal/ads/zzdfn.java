package com.google.android.gms.internal.ads;

import defpackage.cz5;
import defpackage.ft;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdfn extends zzdih {

    @GuardedBy("this")
    public long A;

    @GuardedBy("this")
    public boolean B;

    @GuardedBy("this")
    public ScheduledFuture C;
    public final ScheduledExecutorService x;
    public final ft y;

    @GuardedBy("this")
    public long z;

    public zzdfn(ScheduledExecutorService scheduledExecutorService, ft ftVar) {
        super(Collections.emptySet());
        this.z = -1L;
        this.A = -1L;
        this.B = false;
        this.x = scheduledExecutorService;
        this.y = ftVar;
    }

    public final synchronized void b(long j) {
        ScheduledFuture scheduledFuture = this.C;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.C.cancel(true);
        }
        this.z = this.y.c() + j;
        this.C = this.x.schedule(new cz5(this), j, TimeUnit.MILLISECONDS);
    }

    public final synchronized void zza() {
        this.B = false;
        b(0L);
    }

    public final synchronized void zzb() {
        if (this.B) {
            return;
        }
        ScheduledFuture scheduledFuture = this.C;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            this.A = -1L;
        } else {
            this.C.cancel(true);
            this.A = this.z - this.y.c();
        }
        this.B = true;
    }

    public final synchronized void zzc() {
        if (this.B) {
            if (this.A > 0 && this.C.isCancelled()) {
                b(this.A);
            }
            this.B = false;
        }
    }

    public final synchronized void zzd(int i) {
        if (i <= 0) {
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(i);
        if (this.B) {
            long j = this.A;
            if (j <= 0 || millis >= j) {
                millis = j;
            }
            this.A = millis;
            return;
        }
        long jC = this.y.c();
        long j2 = this.z;
        if (jC > j2 || j2 - this.y.c() > millis) {
            b(millis);
        }
    }
}
