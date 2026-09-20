package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* JADX INFO: loaded from: classes3.dex */
final class zzboc extends zzbnd {
    public final /* synthetic */ zzbof w;

    @Override // com.google.android.gms.internal.ads.zzbne
    public final void zze(zzbmu zzbmuVar, String str) {
        zzbmv zzbmvVar;
        zzbof zzbofVar = this.w;
        NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener = zzbofVar.b;
        if (onCustomClickListener == null) {
            return;
        }
        synchronized (zzbofVar) {
            zzbmvVar = zzbofVar.c;
            if (zzbmvVar == null) {
                zzbmvVar = new zzbmv(zzbmuVar);
                zzbofVar.c = zzbmvVar;
            }
        }
        onCustomClickListener.onCustomClick(zzbmvVar, str);
    }
}
