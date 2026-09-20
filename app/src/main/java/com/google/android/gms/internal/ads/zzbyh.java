package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* JADX INFO: loaded from: classes3.dex */
final class zzbyh extends zzbnd {
    public final /* synthetic */ zzbyk w;

    @Override // com.google.android.gms.internal.ads.zzbne
    public final void zze(zzbmu zzbmuVar, String str) {
        zzbyl zzbylVar;
        zzbyk zzbykVar = this.w;
        NativeCustomFormatAd.OnCustomClickListener onCustomClickListener = zzbykVar.b;
        if (onCustomClickListener == null) {
            return;
        }
        synchronized (zzbykVar) {
            zzbylVar = zzbykVar.c;
            if (zzbylVar == null) {
                zzbylVar = new zzbyl(zzbmuVar);
                zzbykVar.c = zzbylVar;
            }
        }
        onCustomClickListener.onCustomClick(zzbylVar, str);
    }
}
