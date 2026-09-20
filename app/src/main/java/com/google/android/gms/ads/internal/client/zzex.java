package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* JADX INFO: loaded from: classes.dex */
public final class zzex extends zzda {
    public final OnAdMetadataChangedListener w;

    public zzex(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.w = onAdMetadataChangedListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zze() {
        OnAdMetadataChangedListener onAdMetadataChangedListener = this.w;
        if (onAdMetadataChangedListener != null) {
            onAdMetadataChangedListener.onAdMetadataChanged();
        }
    }
}
