package com.google.android.gms.internal.ads;

import defpackage.sd6;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdby implements zzdcy, zzdjv, zzdhp, zzddo, zzbbm {
    public ScheduledFuture B;
    public final zzddq w;
    public final zzfcs x;
    public final ScheduledExecutorService y;
    public final Executor z;
    public final zzfzg A = zzfzg.zzf();
    public final AtomicBoolean C = new AtomicBoolean();

    public zzdby(zzddq zzddqVar, zzfcs zzfcsVar, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.w = zzddqVar;
        this.x = zzfcsVar;
        this.y = scheduledExecutorService;
        this.z = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzbv() {
    }

    @Override // com.google.android.gms.internal.ads.zzbbm
    public final void zzc(zzbbl zzbblVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziL)).booleanValue() && this.x.zzZ != 2 && zzbblVar.zzj && this.C.compareAndSet(false, true)) {
            com.google.android.gms.ads.internal.util.zze.zza("Full screen 1px impression occurred");
            this.w.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhp
    public final void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzdhp
    public final synchronized void zze() {
        if (this.A.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.B;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.A.zzd(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzdjv
    public final void zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbp)).booleanValue()) {
            zzfcs zzfcsVar = this.x;
            if (zzfcsVar.zzZ == 2) {
                if (zzfcsVar.zzr == 0) {
                    this.w.zza();
                    return;
                }
                zzfyo.zzr(this.A, new sd6(this, 0), this.z);
                this.B = this.y.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdbw
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdby zzdbyVar = this.zza;
                        synchronized (zzdbyVar) {
                            if (zzdbyVar.A.isDone()) {
                                return;
                            }
                            zzdbyVar.A.zzd(Boolean.TRUE);
                        }
                    }
                }, zzfcsVar.zzr, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjv
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzddo
    public final synchronized void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.A.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.B;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.A.zze(new Exception());
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzo() {
        int i = this.x.zzZ;
        if (i == 0 || i == 1) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziL)).booleanValue()) {
                return;
            }
            this.w.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzp(zzcbq zzcbqVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzr() {
    }
}
