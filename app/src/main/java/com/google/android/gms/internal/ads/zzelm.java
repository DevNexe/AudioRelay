package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;

/* JADX INFO: loaded from: classes3.dex */
public class zzelm extends zzbvk {
    public final zzdek A;
    public final zzdhr B;
    public final zzdfe C;
    public final zzdlb D;
    public final zzdhn E;
    public final zzddl F;
    public final zzdcw w;
    public final zzdkj x;
    public final zzddq y;
    public final zzdef z;

    public zzelm(zzdcw zzdcwVar, zzdkj zzdkjVar, zzddq zzddqVar, zzdef zzdefVar, zzdek zzdekVar, zzdhr zzdhrVar, zzdfe zzdfeVar, zzdlb zzdlbVar, zzdhn zzdhnVar, zzddl zzddlVar) {
        this.w = zzdcwVar;
        this.x = zzdkjVar;
        this.y = zzddqVar;
        this.z = zzdefVar;
        this.A = zzdekVar;
        this.B = zzdhrVar;
        this.C = zzdfeVar;
        this.D = zzdlbVar;
        this.E = zzdhnVar;
        this.F = zzddlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zze() {
        this.w.onAdClicked();
        this.x.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzf() {
        this.C.zzf(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzg(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzi(int i, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    @Deprecated
    public final void zzj(int i) {
        zzk(new com.google.android.gms.ads.internal.client.zze(i, "", AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.F.zza(zzfem.zzc(8, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzl(String str) {
        zzk(new com.google.android.gms.ads.internal.client.zze(0, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    public void zzm() {
        this.y.zza();
        this.E.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzn() {
        this.z.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzo() {
        this.A.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzp() {
        this.C.zzb();
        this.E.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzq(String str, String str2) {
        this.B.zzbD(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzr(zzbmu zzbmuVar, String str) {
    }

    public void zzs(zzccc zzcccVar) {
    }

    public void zzt(zzccg zzccgVar) {
    }

    public void zzu() {
    }

    public void zzv() {
        this.D.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzw() {
        this.D.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzx() {
        this.D.zzc();
    }

    public void zzy() {
        this.D.zzd();
    }
}
