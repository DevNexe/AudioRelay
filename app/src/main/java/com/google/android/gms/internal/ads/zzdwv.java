package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdwv implements zzfhq {
    public final Map w;
    public final zzbel x;

    public zzdwv(zzbel zzbelVar, Map map) {
        this.w = map;
        this.x = zzbelVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfhq
    public final void zzbF(zzfhj zzfhjVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfhq
    public final void zzbG(zzfhj zzfhjVar, String str, Throwable th) {
        Map map = this.w;
        if (map.containsKey(zzfhjVar)) {
            this.x.zzc(((zzdwu) map.get(zzfhjVar)).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhq
    public final void zzc(zzfhj zzfhjVar, String str) {
        Map map = this.w;
        if (map.containsKey(zzfhjVar)) {
            this.x.zzc(((zzdwu) map.get(zzfhjVar)).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhq
    public final void zzd(zzfhj zzfhjVar, String str) {
        Map map = this.w;
        if (map.containsKey(zzfhjVar)) {
            this.x.zzc(((zzdwu) map.get(zzfhjVar)).zzb);
        }
    }
}
