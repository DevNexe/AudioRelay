package com.google.android.gms.internal.ads;

import defpackage.e46;
import defpackage.qu6;
import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbgh extends zzgon implements zzgpy {
    private static final zzbgh zzb;
    private int zze;
    private zzbgd zzf;
    private zzgow zzg = qu6.z;
    private int zzh;
    private zzbhj zzi;

    static {
        zzbgh zzbghVar = new zzbgh();
        zzb = zzbghVar;
        zzgon.i(zzbgh.class, zzbghVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", zzbhh.class, "zzh", e46.a, "zzi"});
        }
        if (i2 == 3) {
            return new zzbgh();
        }
        if (i2 == 4) {
            return new zzbgg(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
