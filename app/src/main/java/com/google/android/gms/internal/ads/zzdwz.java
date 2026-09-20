package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdwz implements zzdft, zzdem, zzddb {
    public final zzdxj w;
    public final zzdxt x;

    public zzdwz(zzdxj zzdxjVar, zzdxt zzdxtVar) {
        this.w = zzdxjVar;
        this.x = zzdxtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzdxj zzdxjVar = this.w;
        zzdxjVar.zza().put("action", "ftl");
        zzdxjVar.zza().put("ftl", String.valueOf(zzeVar.zza));
        zzdxjVar.zza().put("ed", zzeVar.zzc);
        this.x.zze(zzdxjVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzdft
    public final void zzb(zzfde zzfdeVar) {
        this.w.zzb(zzfdeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdft
    public final void zzbE(zzcba zzcbaVar) {
        this.w.zzc(zzcbaVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final void zzn() {
        zzdxj zzdxjVar = this.w;
        zzdxjVar.zza().put("action", "loaded");
        this.x.zze(zzdxjVar.zza());
    }
}
