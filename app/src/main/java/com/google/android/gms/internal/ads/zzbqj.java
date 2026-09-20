package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.h5.OnH5AdsEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbqj extends zzbql {
    public final OnH5AdsEventListener w;

    public zzbqj(OnH5AdsEventListener onH5AdsEventListener) {
        this.w = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbqm
    public final void zzb(String str) {
        this.w.onH5AdsEvent(str);
    }
}
