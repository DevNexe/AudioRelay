package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzggt extends zzgon implements zzgpy {
    private static final zzggt zzb;
    private int zze;
    private zzgnf zzf = zzgnf.zzb;

    static {
        zzggt zzggtVar = new zzggt();
        zzb = zzggtVar;
        zzgon.i(zzggt.class, zzggtVar);
    }

    public static zzggs zzc() {
        return (zzggs) zzb.j();
    }

    public static zzggt zze(zzgnf zzgnfVar, zzgnz zzgnzVar) {
        return (zzggt) zzgon.f(zzb, zzgnfVar, zzgnzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzggt();
        }
        if (i2 == 4) {
            return new zzggs(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzgnf zzf() {
        return this.zzf;
    }
}
