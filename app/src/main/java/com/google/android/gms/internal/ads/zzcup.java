package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcup implements zzddb {
    public final zzfcv w;
    public final zzfde x;
    public final zzfjq y;
    public final zzfju z;

    public zzcup(zzfde zzfdeVar, zzfju zzfjuVar, zzfjq zzfjqVar) {
        this.x = zzfdeVar;
        this.z = zzfjuVar;
        this.y = zzfjqVar;
        this.w = zzfdeVar.zzb.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.z.zzd(this.y.zzc(this.x, null, this.w.zza));
    }
}
