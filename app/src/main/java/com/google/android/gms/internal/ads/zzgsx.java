package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgsx extends zzgon implements zzgpy {
    private static final zzgsx zzb;
    private int zze;
    private int zzf;
    private zzgnf zzg;
    private zzgnf zzh;

    static {
        zzgsx zzgsxVar = new zzgsx();
        zzb = zzgsxVar;
        zzgon.i(zzgsx.class, zzgsxVar);
    }

    public zzgsx() {
        zzgnf zzgnfVar = zzgnf.zzb;
        this.zzg = zzgnfVar;
        this.zzh = zzgnfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzgsx();
        }
        if (i2 == 4) {
            return new zzgsw(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
