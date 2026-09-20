package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbpr implements zzbpq {
    public final zzeai a;

    public zzbpr(zzeai zzeaiVar) {
        if (zzeaiVar == null) {
            throw new NullPointerException("The Inspector Manager must not be null");
        }
        this.a = zzeaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j = Long.parseLong((String) map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.a.zzh((String) map.get("extras"), j);
    }
}
