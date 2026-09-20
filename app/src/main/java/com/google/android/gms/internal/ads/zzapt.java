package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzapt extends zzanl {
    public Long zza;
    public Boolean zzb;
    public Boolean zzc;

    public zzapt() {
    }

    @Override // com.google.android.gms.internal.ads.zzanl
    public final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.zza);
        map.put(1, this.zzb);
        map.put(2, this.zzc);
        return map;
    }

    public zzapt(String str) {
        HashMap mapA = zzanl.a(str);
        if (mapA != null) {
            this.zza = (Long) mapA.get(0);
            this.zzb = (Boolean) mapA.get(1);
            this.zzc = (Boolean) mapA.get(2);
        }
    }
}
