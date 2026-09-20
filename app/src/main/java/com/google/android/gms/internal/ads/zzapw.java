package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzapw extends zzanl {
    public Long zza;
    public Long zzb;

    public zzapw() {
    }

    @Override // com.google.android.gms.internal.ads.zzanl
    public final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.zza);
        map.put(1, this.zzb);
        return map;
    }

    public zzapw(String str) {
        HashMap mapA = zzanl.a(str);
        if (mapA != null) {
            this.zza = (Long) mapA.get(0);
            this.zzb = (Long) mapA.get(1);
        }
    }
}
