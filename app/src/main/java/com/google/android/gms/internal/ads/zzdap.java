package com.google.android.gms.internal.ads;

import defpackage.ft;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdap implements zzdem, com.google.android.gms.ads.internal.client.zza, zzdft, zzdds, zzdcy, zzdie {
    public final ft w;
    public final zzcfp x;

    public zzdap(ft ftVar, zzcfp zzcfpVar) {
        this.w = ftVar;
        this.x = zzcfpVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.x.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzdft
    public final void zzb(zzfde zzfdeVar) {
        this.x.zzk(this.w.c());
    }

    @Override // com.google.android.gms.internal.ads.zzdft
    public final void zzbE(zzcba zzcbaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzbv() {
    }

    public final String zzc() {
        return this.x.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final void zze(zzbfg zzbfgVar) {
        this.x.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final void zzf(zzbfg zzbfgVar) {
    }

    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.x.zzj(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final void zzh(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final void zzi(zzbfg zzbfgVar) {
        this.x.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzj() {
        this.x.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final void zzk(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzl() {
        this.x.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final void zzn() {
        this.x.zzh(true);
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzp(zzcbq zzcbqVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzr() {
    }
}
