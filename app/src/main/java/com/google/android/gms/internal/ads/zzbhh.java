package com.google.android.gms.internal.ads;

import defpackage.e46;
import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbhh extends zzgon implements zzgpy {
    private static final zzbhh zzb;
    private int zze;
    private String zzf = "";
    private int zzg;
    private zzbhj zzh;

    static {
        zzbhh zzbhhVar = new zzbhh();
        zzb = zzbhhVar;
        zzgon.i(zzbhh.class, zzbhhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", e46.a, "zzh"});
        }
        if (i2 == 3) {
            return new zzbhh();
        }
        if (i2 == 4) {
            return new zzbhg(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
