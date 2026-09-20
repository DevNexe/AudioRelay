package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgjd extends zzgon implements zzgpy {
    private static final zzgjd zzb;
    private int zze;
    private zzgix zzf;
    private zzgnf zzg = zzgnf.zzb;

    static {
        zzgjd zzgjdVar = new zzgjd();
        zzb = zzgjdVar;
        zzgon.i(zzgjd.class, zzgjdVar);
    }

    public static /* synthetic */ void o(zzgjd zzgjdVar, zzgix zzgixVar) {
        zzgixVar.getClass();
        zzgjdVar.zzf = zzgixVar;
    }

    public static zzgjc zzd() {
        return (zzgjc) zzb.j();
    }

    public static zzgjd zzf() {
        return zzb;
    }

    public static zzgjd zzg(zzgnf zzgnfVar, zzgnz zzgnzVar) {
        return (zzgjd) zzgon.f(zzb, zzgnfVar, zzgnzVar);
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
            return new zzgjd();
        }
        if (i2 == 4) {
            return new zzgjc(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzgix zzc() {
        zzgix zzgixVar = this.zzf;
        return zzgixVar == null ? zzgix.zzd() : zzgixVar;
    }

    public final zzgnf zzh() {
        return this.zzg;
    }

    public final boolean zzl() {
        return this.zzf != null;
    }
}
