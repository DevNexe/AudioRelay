package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzghz extends zzgon implements zzgpy {
    private static final zzghz zzb;
    private int zze;
    private zzght zzf;
    private zzgnf zzg;
    private zzgnf zzh;

    static {
        zzghz zzghzVar = new zzghz();
        zzb = zzghzVar;
        zzgon.i(zzghz.class, zzghzVar);
    }

    public zzghz() {
        zzgnf zzgnfVar = zzgnf.zzb;
        this.zzg = zzgnfVar;
        this.zzh = zzgnfVar;
    }

    public static /* synthetic */ void o(zzghz zzghzVar, zzght zzghtVar) {
        zzghtVar.getClass();
        zzghzVar.zzf = zzghtVar;
    }

    public static zzghy zzd() {
        return (zzghy) zzb.j();
    }

    public static zzghz zzf() {
        return zzb;
    }

    public static zzghz zzg(zzgnf zzgnfVar, zzgnz zzgnzVar) {
        return (zzghz) zzgon.f(zzb, zzgnfVar, zzgnzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzghz();
        }
        if (i2 == 4) {
            return new zzghy(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzght zzc() {
        zzght zzghtVar = this.zzf;
        return zzghtVar == null ? zzght.zze() : zzghtVar;
    }

    public final zzgnf zzh() {
        return this.zzg;
    }

    public final zzgnf zzi() {
        return this.zzh;
    }
}
