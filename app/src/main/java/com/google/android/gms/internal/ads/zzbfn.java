package com.google.android.gms.internal.ads;

import defpackage.e46;
import defpackage.qu6;
import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbfn extends zzgon implements zzgpy {
    private static final zzbfn zzb;
    private int zze;
    private String zzf = "";
    private zzgow zzg = qu6.z;
    private int zzh;

    static {
        zzbfn zzbfnVar = new zzbfn();
        zzb = zzbfnVar;
        zzgon.i(zzbfn.class, zzbfnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"zze", "zzf", "zzg", zzbfl.class, "zzh", e46.a});
        }
        if (i2 == 3) {
            return new zzbfn();
        }
        if (i2 == 4) {
            return new zzbfm(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
