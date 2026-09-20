package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbda extends zzbdh {
    public final AppOpenAd.AppOpenAdLoadCallback w;
    public final String x;

    public zzbda(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.w = appOpenAdLoadCallback;
        this.x = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final void zzb(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.w;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final void zzd(zzbdf zzbdfVar) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.w;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAdLoaded(new zzbdb(zzbdfVar, this.x));
        }
    }
}
