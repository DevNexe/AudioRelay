package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* JADX INFO: loaded from: classes3.dex */
final class zzbyj extends zzbng {
    public final /* synthetic */ zzbyk w;

    @Override // com.google.android.gms.internal.ads.zzbnh
    public final void zze(zzbmu zzbmuVar) {
        zzbyl zzbylVar;
        zzbyk zzbykVar = this.w;
        NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener = zzbykVar.a;
        synchronized (zzbykVar) {
            zzbylVar = zzbykVar.c;
            if (zzbylVar == null) {
                zzbylVar = new zzbyl(zzbmuVar);
                zzbykVar.c = zzbylVar;
            }
        }
        onCustomFormatAdLoadedListener.onCustomFormatAdLoaded(zzbylVar);
    }
}
