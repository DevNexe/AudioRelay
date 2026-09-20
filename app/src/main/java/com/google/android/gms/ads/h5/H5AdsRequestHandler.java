package com.google.android.gms.ads.h5;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbqt;

/* JADX INFO: loaded from: classes.dex */
public final class H5AdsRequestHandler {
    public final zzbqt a;

    public H5AdsRequestHandler(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        this.a = new zzbqt(context, onH5AdsEventListener);
    }

    public void clearAdObjects() {
        this.a.zza();
    }

    public boolean handleH5AdsRequest(String str) {
        return this.a.zzb(str);
    }

    public boolean shouldInterceptRequest(String str) {
        return zzbqt.zzc(str);
    }
}
