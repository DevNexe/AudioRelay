package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzghw extends zzgon implements zzgpy {
    private static final zzghw zzb;
    private int zze;
    private zzghz zzf;
    private zzgnf zzg = zzgnf.zzb;

    static {
        zzghw zzghwVar = new zzghw();
        zzb = zzghwVar;
        zzgon.i(zzghw.class, zzghwVar);
    }

    public static /* synthetic */ void o(zzghw zzghwVar, zzghz zzghzVar) {
        zzghzVar.getClass();
        zzghwVar.zzf = zzghzVar;
    }

    public static zzghv zzc() {
        return (zzghv) zzb.j();
    }

    public static zzghw zze(zzgnf zzgnfVar, zzgnz zzgnzVar) {
        return (zzghw) zzgon.f(zzb, zzgnfVar, zzgnzVar);
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
            return new zzghw();
        }
        if (i2 == 4) {
            return new zzghv(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzghz zzf() {
        zzghz zzghzVar = this.zzf;
        return zzghzVar == null ? zzghz.zzf() : zzghzVar;
    }

    public final zzgnf zzg() {
        return this.zzg;
    }
}
