package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgge extends zzgon implements zzgpy {
    private static final zzgge zzb;
    private int zze;
    private zzggk zzf;
    private zzgnf zzg = zzgnf.zzb;

    static {
        zzgge zzggeVar = new zzgge();
        zzb = zzggeVar;
        zzgon.i(zzgge.class, zzggeVar);
    }

    public static /* synthetic */ void o(zzgge zzggeVar, zzggk zzggkVar) {
        zzggkVar.getClass();
        zzggeVar.zzf = zzggkVar;
    }

    public static zzggd zzc() {
        return (zzggd) zzb.j();
    }

    public static zzgge zze(zzgnf zzgnfVar, zzgnz zzgnzVar) {
        return (zzgge) zzgon.f(zzb, zzgnfVar, zzgnzVar);
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
            return new zzgge();
        }
        if (i2 == 4) {
            return new zzggd(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzggk zzf() {
        zzggk zzggkVar = this.zzf;
        return zzggkVar == null ? zzggk.zze() : zzggkVar;
    }

    public final zzgnf zzg() {
        return this.zzg;
    }
}
