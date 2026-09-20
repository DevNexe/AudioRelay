package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcze implements zzczf {
    public final Map a;

    public zzcze(Map map) {
        this.a = map;
    }

    @Override // com.google.android.gms.internal.ads.zzczf
    public final zzegk zza(int i, String str) {
        return (zzegk) this.a.get(str);
    }
}
