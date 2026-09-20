package com.google.android.gms.internal.ads;

import defpackage.e46;
import defpackage.ru6;
import defpackage.yt6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbgd extends zzgon implements zzgpy {
    private static final zzbgd zzb;
    private int zze;
    private int zzg;
    private zzbhj zzi;
    private String zzf = "";
    private zzgos zzh = yt6.z;

    static {
        zzbgd zzbgdVar = new zzbgd();
        zzb = zzbgdVar;
        zzgon.i(zzbgd.class, zzbgdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", e46.a, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzbgd();
        }
        if (i2 == 4) {
            return new zzbgc(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
