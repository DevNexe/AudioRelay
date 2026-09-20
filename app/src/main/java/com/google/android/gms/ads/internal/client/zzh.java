package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdLoadCallback;

/* JADX INFO: loaded from: classes.dex */
public final class zzh extends zzbh {
    public final AdLoadCallback w;
    public final Object x;

    public zzh(AdLoadCallback adLoadCallback, Object obj) {
        this.w = adLoadCallback;
        this.x = obj;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbi
    public final void zzb(zze zzeVar) {
        AdLoadCallback adLoadCallback = this.w;
        if (adLoadCallback != null) {
            adLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbi
    public final void zzc() {
        Object obj;
        AdLoadCallback adLoadCallback = this.w;
        if (adLoadCallback == null || (obj = this.x) == null) {
            return;
        }
        adLoadCallback.onAdLoaded(obj);
    }
}
