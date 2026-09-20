package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgim extends zzgon implements zzgpy {
    private static final zzgim zzb;
    private zzgip zze;
    private int zzf;
    private int zzg;

    static {
        zzgim zzgimVar = new zzgim();
        zzb = zzgimVar;
        zzgon.i(zzgim.class, zzgimVar);
    }

    public static /* synthetic */ void n(zzgim zzgimVar, zzgip zzgipVar) {
        zzgipVar.getClass();
        zzgimVar.zze = zzgipVar;
    }

    public static zzgil zzc() {
        return (zzgil) zzb.j();
    }

    public static zzgim zze() {
        return zzb;
    }

    public static zzgim zzf(zzgnf zzgnfVar, zzgnz zzgnzVar) {
        return (zzgim) zzgon.f(zzb, zzgnfVar, zzgnzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgim();
        }
        if (i2 == 4) {
            return new zzgil(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzgip zzg() {
        zzgip zzgipVar = this.zze;
        return zzgipVar == null ? zzgip.zze() : zzgipVar;
    }
}
