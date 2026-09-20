package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzann extends zzanl {
    public String zza;
    public long zzb;
    public String zzc;
    public String zzd;
    public String zze;

    public zzann() {
        this.zza = "E";
        this.zzb = -1L;
        this.zzc = "E";
        this.zzd = "E";
        this.zze = "E";
    }

    @Override // com.google.android.gms.internal.ads.zzanl
    public final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.zza);
        map.put(4, this.zze);
        map.put(3, this.zzd);
        map.put(2, this.zzc);
        map.put(1, Long.valueOf(this.zzb));
        return map;
    }

    public zzann(String str) {
        this.zza = "E";
        this.zzb = -1L;
        this.zzc = "E";
        this.zzd = "E";
        this.zze = "E";
        HashMap mapA = zzanl.a(str);
        if (mapA != null) {
            this.zza = mapA.get(0) == null ? "E" : (String) mapA.get(0);
            this.zzb = mapA.get(1) != null ? ((Long) mapA.get(1)).longValue() : -1L;
            this.zzc = mapA.get(2) == null ? "E" : (String) mapA.get(2);
            this.zzd = mapA.get(3) == null ? "E" : (String) mapA.get(3);
            this.zze = mapA.get(4) != null ? (String) mapA.get(4) : "E";
        }
    }
}
