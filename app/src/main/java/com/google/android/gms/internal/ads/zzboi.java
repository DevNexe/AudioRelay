package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* JADX INFO: loaded from: classes3.dex */
public final class zzboi extends zzbnn {
    public final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener w;

    public zzboi(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.w = onUnifiedNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbno
    public final void zze(zzbnx zzbnxVar) {
        this.w.onUnifiedNativeAdLoaded(new zzbny(zzbnxVar));
    }
}
