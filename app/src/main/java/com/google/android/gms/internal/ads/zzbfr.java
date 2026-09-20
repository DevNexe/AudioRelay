package com.google.android.gms.internal.ads;

import defpackage.qu6;
import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbfr extends zzgon implements zzgpy {
    private static final zzbfr zzb;
    private int zze;
    private int zzf;
    private zzbhj zzg;
    private zzbhj zzh;
    private zzbhj zzi;
    private zzgow zzj = qu6.z;
    private int zzk;

    static {
        zzbfr zzbfrVar = new zzbfr();
        zzb = zzbfrVar;
        zzgon.i(zzbfr.class, zzbfrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzbhj.class, "zzk"});
        }
        if (i2 == 3) {
            return new zzbfr();
        }
        if (i2 == 4) {
            return new zzbfq(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
