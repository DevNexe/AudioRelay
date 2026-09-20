package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzggw extends zzgon implements zzgpy {
    private static final zzggw zzb;
    private int zze;
    private int zzf;

    static {
        zzggw zzggwVar = new zzggw();
        zzb = zzggwVar;
        zzgon.i(zzggw.class, zzggwVar);
    }

    public static zzggv zzc() {
        return (zzggv) zzb.j();
    }

    public static zzggw zze(zzgnf zzgnfVar, zzgnz zzgnzVar) {
        return (zzggw) zzgon.f(zzb, zzgnfVar, zzgnzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
        }
        if (i2 == 3) {
            return new zzggw();
        }
        if (i2 == 4) {
            return new zzggv(i3);
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
