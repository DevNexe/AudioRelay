package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdyl implements zzdft, com.google.android.gms.ads.internal.client.zza, zzdcy, zzdds, zzddt, zzdem, zzddb, zzasb, zzfhq {
    public final List w;
    public final zzdxz x;
    public long y;

    public zzdyl(zzdxz zzdxzVar, zzcok zzcokVar) {
        this.x = zzdxzVar;
        this.w = Collections.singletonList(zzcokVar);
    }

    public final void a(Class cls, String str, Object... objArr) {
        this.x.zza(this.w, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        a(com.google.android.gms.ads.internal.client.zza.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        a(zzddb.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdft
    public final void zzb(zzfde zzfdeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdft
    public final void zzbE(zzcba zzcbaVar) {
        this.y = com.google.android.gms.ads.internal.zzt.zzB().c();
        a(zzdft.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfhq
    public final void zzbF(zzfhj zzfhjVar, String str) {
        a(zzfhi.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfhq
    public final void zzbG(zzfhj zzfhjVar, String str, Throwable th) {
        a(zzfhi.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzbq(Context context) {
        a(zzddt.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzbs(Context context) {
        a(zzddt.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzbt(Context context) {
        a(zzddt.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzasb
    public final void zzbu(String str, String str2) {
        a(zzasb.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzbv() {
        a(zzdcy.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfhq
    public final void zzc(zzfhj zzfhjVar, String str) {
        a(zzfhi.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfhq
    public final void zzd(zzfhj zzfhjVar, String str) {
        a(zzfhi.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzj() {
        a(zzdcy.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzl() {
        a(zzdds.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzm() {
        a(zzdcy.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final void zzn() {
        com.google.android.gms.ads.internal.util.zze.zza("Ad Request Latency : " + (com.google.android.gms.ads.internal.zzt.zzB().c() - this.y));
        a(zzdem.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzo() {
        a(zzdcy.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    @ParametersAreNonnullByDefault
    public final void zzp(zzcbq zzcbqVar, String str, String str2) {
        a(zzdcy.class, "onRewarded", zzcbqVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzr() {
        a(zzdcy.class, "onRewardedVideoStarted", new Object[0]);
    }
}
