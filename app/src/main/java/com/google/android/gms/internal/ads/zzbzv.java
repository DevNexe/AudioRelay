package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzbzv extends zzbzo {
    public final /* synthetic */ List w;

    public zzbzv(List list) {
        this.w = list;
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final void zze(String str) {
        zzcgn.zzg("Error recording click: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final void zzf(List list) {
        zzcgn.zzi("Recorded click: ".concat(this.w.toString()));
    }
}
