package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* JADX INFO: loaded from: classes3.dex */
public final class zzboj extends zzbnt {
    public final UnifiedNativeAd.UnconfirmedClickListener w;

    public zzboj(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.w = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final void zze() {
        this.w.onUnconfirmedClickCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final void zzf(String str) {
        this.w.onUnconfirmedClickReceived(str);
    }
}
