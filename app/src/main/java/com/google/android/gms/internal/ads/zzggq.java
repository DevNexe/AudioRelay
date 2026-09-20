package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzggq extends zzgon implements zzgpy {
    private static final zzggq zzb;
    private int zze;
    private int zzf;

    static {
        zzggq zzggqVar = new zzggq();
        zzb = zzggqVar;
        zzgon.i(zzggq.class, zzggqVar);
    }

    public static zzggp zzc() {
        return (zzggp) zzb.j();
    }

    public static zzggq zze(zzgnf zzgnfVar, zzgnz zzgnzVar) {
        return (zzggq) zzgon.f(zzb, zzgnfVar, zzgnzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzggq();
        }
        if (i2 == 4) {
            return new zzggp(i3);
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
