package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaqf extends zzanl {
    public Long zza;
    public Long zzb;
    public Long zzc;
    public Long zzd;
    public Long zze;

    public zzaqf() {
    }

    @Override // com.google.android.gms.internal.ads.zzanl
    public final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.zza);
        map.put(1, this.zzb);
        map.put(2, this.zzc);
        map.put(3, this.zzd);
        map.put(4, this.zze);
        return map;
    }

    public zzaqf(String str) {
        HashMap mapA = zzanl.a(str);
        if (mapA != null) {
            this.zza = (Long) mapA.get(0);
            this.zzb = (Long) mapA.get(1);
            this.zzc = (Long) mapA.get(2);
            this.zzd = (Long) mapA.get(3);
            this.zze = (Long) mapA.get(4);
        }
    }
}
