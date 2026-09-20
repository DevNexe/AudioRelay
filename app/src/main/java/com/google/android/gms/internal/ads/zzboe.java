package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* JADX INFO: loaded from: classes3.dex */
final class zzboe extends zzbng {
    public final /* synthetic */ zzbof w;

    @Override // com.google.android.gms.internal.ads.zzbnh
    public final void zze(zzbmu zzbmuVar) {
        zzbmv zzbmvVar;
        zzbof zzbofVar = this.w;
        NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener = zzbofVar.a;
        synchronized (zzbofVar) {
            zzbmvVar = zzbofVar.c;
            if (zzbmvVar == null) {
                zzbmvVar = new zzbmv(zzbmuVar);
                zzbofVar.c = zzbmvVar;
            }
        }
        onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded(zzbmvVar);
    }
}
