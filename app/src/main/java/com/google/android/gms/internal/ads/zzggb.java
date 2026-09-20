package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzggb extends zzgon implements zzgpy {
    private static final zzggb zzb;
    private int zze;

    static {
        zzggb zzggbVar = new zzggb();
        zzb = zzggbVar;
        zzgon.i(zzggb.class, zzggbVar);
    }

    public static zzgga zzc() {
        return (zzgga) zzb.j();
    }

    public static zzggb zze() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzggb();
        }
        if (i2 == 4) {
            return new zzgga(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }
}
