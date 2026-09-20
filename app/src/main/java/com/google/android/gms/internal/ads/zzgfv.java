package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgfv extends zzgon implements zzgpy {
    private static final zzgfv zzb;
    private int zze;
    private zzggb zzf;
    private zzgnf zzg = zzgnf.zzb;

    static {
        zzgfv zzgfvVar = new zzgfv();
        zzb = zzgfvVar;
        zzgon.i(zzgfv.class, zzgfvVar);
    }

    public static /* synthetic */ void o(zzgfv zzgfvVar, zzggb zzggbVar) {
        zzggbVar.getClass();
        zzgfvVar.zzf = zzggbVar;
    }

    public static zzgfu zzc() {
        return (zzgfu) zzb.j();
    }

    public static zzgfv zze() {
        return zzb;
    }

    public static zzgfv zzf(zzgnf zzgnfVar, zzgnz zzgnzVar) {
        return (zzgfv) zzgon.f(zzb, zzgnfVar, zzgnzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgfv();
        }
        if (i2 == 4) {
            return new zzgfu(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzggb zzg() {
        zzggb zzggbVar = this.zzf;
        return zzggbVar == null ? zzggb.zze() : zzggbVar;
    }

    public final zzgnf zzh() {
        return this.zzg;
    }
}
