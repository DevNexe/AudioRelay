package com.google.android.gms.internal.ads;

import defpackage.gw6;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzguv extends gw6 {
    public static final zzgur b = zzgus.zza(Collections.emptyMap());

    public /* synthetic */ zzguv(LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
    }

    public static zzguu zzc(int i) {
        return new zzguu(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        Map map = this.a;
        LinkedHashMap linkedHashMapZzb = zzguo.zzb(map.size());
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMapZzb.put(entry.getKey(), ((zzgve) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(linkedHashMapZzb);
    }
}
