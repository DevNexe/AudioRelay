package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class zzke implements zzjg {
    public zzby A = zzby.zza;
    public final zzde w;
    public boolean x;
    public long y;
    public long z;

    public zzke(zzde zzdeVar) {
        this.w = zzdeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjg
    public final long zza() {
        long j = this.y;
        if (!this.x) {
            return j;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.z;
        zzby zzbyVar = this.A;
        return j + (zzbyVar.zzc == 1.0f ? zzel.zzv(jElapsedRealtime) : zzbyVar.zza(jElapsedRealtime));
    }

    public final void zzb(long j) {
        this.y = j;
        if (this.x) {
            this.z = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjg
    public final zzby zzc() {
        return this.A;
    }

    public final void zzd() {
        if (this.x) {
            return;
        }
        this.z = SystemClock.elapsedRealtime();
        this.x = true;
    }

    public final void zze() {
        if (this.x) {
            zzb(zza());
            this.x = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjg
    public final void zzg(zzby zzbyVar) {
        if (this.x) {
            zzb(zza());
        }
        this.A = zzbyVar;
    }
}
