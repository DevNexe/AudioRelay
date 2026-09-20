package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnUserEarnedRewardListener;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcdb extends zzccl {
    public FullScreenContentCallback w;
    public OnUserEarnedRewardListener x;

    public final void zzb(FullScreenContentCallback fullScreenContentCallback) {
        this.w = fullScreenContentCallback;
    }

    public final void zzc(OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.x = onUserEarnedRewardListener;
    }

    @Override // com.google.android.gms.internal.ads.zzccm
    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback = this.w;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccm
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback = this.w;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccm
    public final void zzg() {
        FullScreenContentCallback fullScreenContentCallback = this.w;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccm
    public final void zzh(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzccm
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) {
        FullScreenContentCallback fullScreenContentCallback = this.w;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzeVar.zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccm
    public final void zzj() {
        FullScreenContentCallback fullScreenContentCallback = this.w;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccm
    public final void zzk(zzccg zzccgVar) {
        OnUserEarnedRewardListener onUserEarnedRewardListener = this.x;
        if (onUserEarnedRewardListener != null) {
            onUserEarnedRewardListener.onUserEarnedReward(new zzcct(zzccgVar));
        }
    }
}
