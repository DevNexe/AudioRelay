package com.google.android.gms.internal.ads;

import defpackage.yf6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdys {
    public final zzbqm a;

    public zzdys(zzbqm zzbqmVar) {
        this.a = zzbqmVar;
    }

    public final void a(yf6 yf6Var) {
        String strA = yf6.a(yf6Var);
        zzcgn.zzi("Dispatching AFMA event on publisher webview: ".concat(strA));
        this.a.zzb(strA);
    }

    public final void zza() {
        a(new yf6("initialize"));
    }

    public final void zzb(long j) {
        yf6 yf6Var = new yf6("interstitial");
        yf6Var.a = Long.valueOf(j);
        yf6Var.c = "onAdClicked";
        this.a.zzb(yf6.a(yf6Var));
    }

    public final void zzc(long j) {
        yf6 yf6Var = new yf6("interstitial");
        yf6Var.a = Long.valueOf(j);
        yf6Var.c = "onAdClosed";
        a(yf6Var);
    }

    public final void zzd(long j, int i) {
        yf6 yf6Var = new yf6("interstitial");
        yf6Var.a = Long.valueOf(j);
        yf6Var.c = "onAdFailedToLoad";
        yf6Var.d = Integer.valueOf(i);
        a(yf6Var);
    }

    public final void zze(long j) {
        yf6 yf6Var = new yf6("interstitial");
        yf6Var.a = Long.valueOf(j);
        yf6Var.c = "onAdLoaded";
        a(yf6Var);
    }

    public final void zzf(long j) {
        yf6 yf6Var = new yf6("interstitial");
        yf6Var.a = Long.valueOf(j);
        yf6Var.c = "onNativeAdObjectNotAvailable";
        a(yf6Var);
    }

    public final void zzg(long j) {
        yf6 yf6Var = new yf6("interstitial");
        yf6Var.a = Long.valueOf(j);
        yf6Var.c = "onAdOpened";
        a(yf6Var);
    }

    public final void zzh(long j) {
        yf6 yf6Var = new yf6("creation");
        yf6Var.a = Long.valueOf(j);
        yf6Var.c = "nativeObjectCreated";
        a(yf6Var);
    }

    public final void zzi(long j) {
        yf6 yf6Var = new yf6("creation");
        yf6Var.a = Long.valueOf(j);
        yf6Var.c = "nativeObjectNotCreated";
        a(yf6Var);
    }

    public final void zzj(long j) {
        yf6 yf6Var = new yf6("rewarded");
        yf6Var.a = Long.valueOf(j);
        yf6Var.c = "onAdClicked";
        a(yf6Var);
    }

    public final void zzk(long j) {
        yf6 yf6Var = new yf6("rewarded");
        yf6Var.a = Long.valueOf(j);
        yf6Var.c = "onRewardedAdClosed";
        a(yf6Var);
    }

    public final void zzl(long j, zzccg zzccgVar) {
        yf6 yf6Var = new yf6("rewarded");
        yf6Var.a = Long.valueOf(j);
        yf6Var.c = "onUserEarnedReward";
        yf6Var.e = zzccgVar.zzf();
        yf6Var.f = Integer.valueOf(zzccgVar.zze());
        a(yf6Var);
    }

    public final void zzm(long j, int i) {
        yf6 yf6Var = new yf6("rewarded");
        yf6Var.a = Long.valueOf(j);
        yf6Var.c = "onRewardedAdFailedToLoad";
        yf6Var.d = Integer.valueOf(i);
        a(yf6Var);
    }

    public final void zzn(long j, int i) {
        yf6 yf6Var = new yf6("rewarded");
        yf6Var.a = Long.valueOf(j);
        yf6Var.c = "onRewardedAdFailedToShow";
        yf6Var.d = Integer.valueOf(i);
        a(yf6Var);
    }

    public final void zzo(long j) {
        yf6 yf6Var = new yf6("rewarded");
        yf6Var.a = Long.valueOf(j);
        yf6Var.c = "onAdImpression";
        a(yf6Var);
    }

    public final void zzp(long j) {
        yf6 yf6Var = new yf6("rewarded");
        yf6Var.a = Long.valueOf(j);
        yf6Var.c = "onRewardedAdLoaded";
        a(yf6Var);
    }

    public final void zzq(long j) {
        yf6 yf6Var = new yf6("rewarded");
        yf6Var.a = Long.valueOf(j);
        yf6Var.c = "onNativeAdObjectNotAvailable";
        a(yf6Var);
    }

    public final void zzr(long j) {
        yf6 yf6Var = new yf6("rewarded");
        yf6Var.a = Long.valueOf(j);
        yf6Var.c = "onRewardedAdOpened";
        a(yf6Var);
    }
}
