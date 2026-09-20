package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzbzu extends zzbzo {
    public final /* synthetic */ List w;

    public zzbzu(List list) {
        this.w = list;
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final void zze(String str) {
        zzcgn.zzg("Error recording impression urls: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final void zzf(List list) {
        zzcgn.zzi("Recorded impression urls: ".concat(this.w.toString()));
    }
}
