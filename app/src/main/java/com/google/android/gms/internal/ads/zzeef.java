package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeef implements zzdft, zzdem, zzddb {
    public final zzfhy w;
    public final zzfhz x;
    public final zzcga y;

    public zzeef(zzfhy zzfhyVar, zzfhz zzfhzVar, zzcga zzcgaVar) {
        this.w = zzfhyVar;
        this.x = zzfhzVar;
        this.y = zzcgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfhy zzfhyVar = this.w;
        zzfhyVar.zza("action", "ftl");
        zzfhyVar.zza("ftl", String.valueOf(zzeVar.zza));
        zzfhyVar.zza("ed", zzeVar.zzc);
        this.x.zzb(zzfhyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdft
    public final void zzb(zzfde zzfdeVar) {
        this.w.zzh(zzfdeVar, this.y);
    }

    @Override // com.google.android.gms.internal.ads.zzdft
    public final void zzbE(zzcba zzcbaVar) {
        this.w.zzi(zzcbaVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final void zzn() {
        zzfhy zzfhyVar = this.w;
        zzfhyVar.zza("action", "loaded");
        this.x.zzb(zzfhyVar);
    }
}
