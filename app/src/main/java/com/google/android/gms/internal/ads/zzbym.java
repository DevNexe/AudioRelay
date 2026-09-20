package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbym extends zzbnn {
    public final NativeAd.OnNativeAdLoadedListener w;

    public zzbym(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.w = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbno
    public final void zze(zzbnx zzbnxVar) {
        this.w.onNativeAdLoaded(new zzbyf(zzbnxVar));
    }
}
