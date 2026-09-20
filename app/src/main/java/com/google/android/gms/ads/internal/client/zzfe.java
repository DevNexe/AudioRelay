package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.VideoController;

/* JADX INFO: loaded from: classes.dex */
public final class zzfe extends zzdm {
    public final VideoController.VideoLifecycleCallbacks w;

    public zzfe(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.w = videoLifecycleCallbacks;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zze() {
        this.w.onVideoEnd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zzf(boolean z) {
        this.w.onVideoMute(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zzg() {
        this.w.onVideoPause();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zzh() {
        this.w.onVideoPlay();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zzi() {
        this.w.onVideoStart();
    }
}
