package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.FullScreenContentCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbdc extends zzbdl {
    public FullScreenContentCallback w;

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zzb() {
        FullScreenContentCallback fullScreenContentCallback = this.w;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zzc() {
        FullScreenContentCallback fullScreenContentCallback = this.w;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        FullScreenContentCallback fullScreenContentCallback = this.w;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzeVar.zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback = this.w;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback = this.w;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }

    public final void zzg(FullScreenContentCallback fullScreenContentCallback) {
        this.w = fullScreenContentCallback;
    }
}
