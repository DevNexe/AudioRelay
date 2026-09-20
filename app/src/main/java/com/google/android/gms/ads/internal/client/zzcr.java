package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.MuteThisAdListener;

/* JADX INFO: loaded from: classes.dex */
public final class zzcr extends zzcp {
    public final MuteThisAdListener w;

    public zzcr(MuteThisAdListener muteThisAdListener) {
        this.w = muteThisAdListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcq
    public final void zze() {
        this.w.onAdMuted();
    }
}
