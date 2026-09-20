package com.google.android.gms.internal.ads;

import defpackage.ru6;
import defpackage.tv6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgsd extends zzgon implements zzgpy {
    private static final zzgsd zzb;
    private int zze;
    private int zzf;
    private long zzg;
    private zzgnf zzh = zzgnf.zzb;

    static {
        zzgsd zzgsdVar = new zzgsd();
        zzb = zzgsdVar;
        zzgon.i(zzgsd.class, zzgsdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", tv6.a, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzgsd();
        }
        if (i2 == 4) {
            return new zzgsb(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
