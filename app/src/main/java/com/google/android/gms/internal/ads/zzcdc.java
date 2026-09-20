package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcdc extends zzccp {
    public final RewardedInterstitialAdLoadCallback w;
    public final zzcdd x;

    public zzcdc(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzcdd zzcddVar) {
        this.w = rewardedInterstitialAdLoadCallback;
        this.x = zzcddVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zze(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.w;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzg() {
        zzcdd zzcddVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.w;
        if (rewardedInterstitialAdLoadCallback == null || (zzcddVar = this.x) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onAdLoaded(zzcddVar);
    }
}
