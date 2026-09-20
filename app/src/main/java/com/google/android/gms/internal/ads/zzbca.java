package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbca extends com.google.android.gms.ads.internal.client.zzby {
    public final AppEventListener w;

    public zzbca(AppEventListener appEventListener) {
        this.w = appEventListener;
    }

    public final AppEventListener zzb() {
        return this.w;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbz
    public final void zzc(String str, String str2) {
        this.w.onAppEvent(str, str2);
    }
}
