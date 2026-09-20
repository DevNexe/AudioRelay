package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class zzccw extends zzccp {
    public final RewardedAdLoadCallback w;
    public final RewardedAd x;

    public zzccw(RewardedAdLoadCallback rewardedAdLoadCallback, RewardedAd rewardedAd) {
        this.w = rewardedAdLoadCallback;
        this.x = rewardedAd;
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zze(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.w;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzg() {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.w;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onAdLoaded(this.x);
        }
    }
}
