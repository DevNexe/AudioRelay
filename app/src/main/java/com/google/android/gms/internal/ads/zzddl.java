package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzddl extends zzdih implements zzddc {
    public final ScheduledExecutorService x;
    public ScheduledFuture y;
    public boolean z;

    public zzddl(zzddk zzddkVar, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.z = false;
        this.x = scheduledExecutorService;
        zzj(zzddkVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        a(new zzdig() { // from class: com.google.android.gms.internal.ads.zzdde
            @Override // com.google.android.gms.internal.ads.zzdig
            public final void zza(Object obj) {
                ((zzddc) obj).zza(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final void zzb() {
        a(new zzdig() { // from class: com.google.android.gms.internal.ads.zzddg
            @Override // com.google.android.gms.internal.ads.zzdig
            public final void zza(Object obj) {
                ((zzddc) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final void zzc(final zzdmm zzdmmVar) {
        if (this.z) {
            return;
        }
        ScheduledFuture scheduledFuture = this.y;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        a(new zzdig() { // from class: com.google.android.gms.internal.ads.zzddd
            @Override // com.google.android.gms.internal.ads.zzdig
            public final void zza(Object obj) {
                ((zzddc) obj).zzc(zzdmmVar);
            }
        });
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.y;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzf() {
        this.y = this.x.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzddf
            @Override // java.lang.Runnable
            public final void run() {
                zzddl zzddlVar = this.zza;
                synchronized (zzddlVar) {
                    zzcgn.zzg("Timeout waiting for show call succeed to be called.");
                    zzddlVar.zzc(new zzdmm("Timeout for show call succeed."));
                    zzddlVar.z = true;
                }
            }
        }, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzin)).intValue(), TimeUnit.MILLISECONDS);
    }
}
