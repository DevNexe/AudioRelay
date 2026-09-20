package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbhj extends zzgon implements zzgpy {
    private static final zzbhj zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbhj zzbhjVar = new zzbhj();
        zzb = zzbhjVar;
        zzgon.i(zzbhj.class, zzbhjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzbhj();
        }
        if (i2 == 4) {
            return new zzbhi(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
