package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbyn extends zzbnt {
    public final NativeAd.UnconfirmedClickListener w;

    public zzbyn(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
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
