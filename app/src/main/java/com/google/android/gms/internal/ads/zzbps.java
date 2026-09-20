package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbps implements zzbpq {
    public final zzbpt a;

    public zzbps(zzbpt zzbptVar, byte[] bArr) {
        this.a = zzbptVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcmn zzcmnVar = (zzcmn) obj;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            zzcgn.zzh("Fail to parse float", e);
        }
        zzbpt zzbptVar = this.a;
        zzbptVar.zzc(zEquals);
        zzbptVar.zzb(zEquals2, f);
        zzcmnVar.zzav(zEquals);
    }
}
