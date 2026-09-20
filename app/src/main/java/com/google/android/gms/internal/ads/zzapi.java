package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzapi extends zzanl {
    public long zza;
    public long zzb;

    public zzapi() {
        this.zza = -1L;
        this.zzb = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzanl
    public final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, Long.valueOf(this.zza));
        map.put(1, Long.valueOf(this.zzb));
        return map;
    }

    public zzapi(String str) {
        this.zza = -1L;
        this.zzb = -1L;
        HashMap mapA = zzanl.a(str);
        if (mapA != null) {
            this.zza = ((Long) mapA.get(0)).longValue();
            this.zzb = ((Long) mapA.get(1)).longValue();
        }
    }
}
