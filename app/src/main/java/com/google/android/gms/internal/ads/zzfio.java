package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfio implements zzdjv, zzddo, zzdjz {
    public final zzfjc w;
    public final zzfir x;

    public zzfio(Context context, zzfjc zzfjcVar) {
        this.w = zzfjcVar;
        this.x = zzfiq.zza(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzdjz
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjz
    public final void zzb() {
        if (((Boolean) zzbkh.zzd.zze()).booleanValue()) {
            zzfir zzfirVar = this.x;
            zzfirVar.zze(true);
            this.w.zza(zzfirVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjv
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjv
    public final void zzg() {
        if (((Boolean) zzbkh.zzd.zze()).booleanValue()) {
            this.x.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddo
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbkh.zzd.zze()).booleanValue()) {
            zzfir zzfirVar = this.x;
            zzfirVar.zze(false);
            this.w.zza(zzfirVar);
        }
    }
}
