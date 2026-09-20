package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgsn extends zzgon implements zzgpy {
    private static final zzgsn zzb;
    private int zze;
    private zzgnf zzf = zzgnf.zzb;

    static {
        zzgsn zzgsnVar = new zzgsn();
        zzb = zzgsnVar;
        zzgon.i(zzgsn.class, zzgsnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgsn();
        }
        if (i2 == 4) {
            return new zzgsm(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
