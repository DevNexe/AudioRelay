package com.google.android.gms.internal.ads;

import defpackage.d46;
import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbfw extends zzgon implements zzgpy {
    private static final zzbfw zzb;
    private int zze;
    private int zzf;
    private zzbhl zzg;
    private String zzh = "";
    private String zzi = "";

    static {
        zzbfw zzbfwVar = new zzbfw();
        zzb = zzbfwVar;
        zzgon.i(zzbfw.class, zzbfwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005ဌ\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zze", "zzf", d46.a, "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzbfw();
        }
        if (i2 == 4) {
            return new zzbfu(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
