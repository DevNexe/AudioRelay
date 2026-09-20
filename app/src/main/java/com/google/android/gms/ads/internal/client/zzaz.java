package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.FullScreenContentCallback;

/* JADX INFO: loaded from: classes.dex */
public final class zzaz extends zzcf {
    public final FullScreenContentCallback w;

    public zzaz(FullScreenContentCallback fullScreenContentCallback) {
        this.w = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcg
    public final void zzb() {
        FullScreenContentCallback fullScreenContentCallback = this.w;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcg
    public final void zzc() {
        FullScreenContentCallback fullScreenContentCallback = this.w;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcg
    public final void zzd(zze zzeVar) {
        FullScreenContentCallback fullScreenContentCallback = this.w;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzeVar.zza());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcg
    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback = this.w;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcg
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback = this.w;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }
}
