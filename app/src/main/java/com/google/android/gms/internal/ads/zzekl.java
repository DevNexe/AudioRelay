package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public class zzekl extends zzelm {
    public final zzdku G;

    public zzekl(zzdcw zzdcwVar, zzdkj zzdkjVar, zzddq zzddqVar, zzdef zzdefVar, zzdek zzdekVar, zzddl zzddlVar, zzdhr zzdhrVar, zzdlb zzdlbVar, zzdfe zzdfeVar, zzdku zzdkuVar, zzdhn zzdhnVar) {
        super(zzdcwVar, zzdkjVar, zzddqVar, zzdefVar, zzdekVar, zzdhrVar, zzdfeVar, zzdlbVar, zzdhnVar, zzddlVar);
        this.G = zzdkuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelm, com.google.android.gms.internal.ads.zzbvl
    public final void zzs(zzccc zzcccVar) {
        this.G.zza(zzcccVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelm, com.google.android.gms.internal.ads.zzbvl
    public final void zzt(zzccg zzccgVar) {
        this.G.zza(new zzccc(zzccgVar.zzf(), zzccgVar.zze()));
    }

    @Override // com.google.android.gms.internal.ads.zzelm, com.google.android.gms.internal.ads.zzbvl
    public final void zzu() {
        this.G.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzelm, com.google.android.gms.internal.ads.zzbvl
    public final void zzv() {
        this.G.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzelm, com.google.android.gms.internal.ads.zzbvl
    public final void zzy() {
        this.G.zzc();
    }
}
