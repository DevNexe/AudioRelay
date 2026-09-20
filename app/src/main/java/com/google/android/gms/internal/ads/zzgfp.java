package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgfp extends zzgon implements zzgpy {
    private static final zzgfp zzb;
    private int zze;
    private zzgfv zzf;
    private zzgij zzg;

    static {
        zzgfp zzgfpVar = new zzgfp();
        zzb = zzgfpVar;
        zzgon.i(zzgfp.class, zzgfpVar);
    }

    public static /* synthetic */ void o(zzgfp zzgfpVar, zzgfv zzgfvVar) {
        zzgfvVar.getClass();
        zzgfpVar.zzf = zzgfvVar;
    }

    public static /* synthetic */ void p(zzgfp zzgfpVar, zzgij zzgijVar) {
        zzgijVar.getClass();
        zzgfpVar.zzg = zzgijVar;
    }

    public static zzgfo zzc() {
        return (zzgfo) zzb.j();
    }

    public static zzgfp zze(zzgnf zzgnfVar, zzgnz zzgnzVar) {
        return (zzgfp) zzgon.f(zzb, zzgnfVar, zzgnzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgfp();
        }
        if (i2 == 4) {
            return new zzgfo(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzgfv zzf() {
        zzgfv zzgfvVar = this.zzf;
        return zzgfvVar == null ? zzgfv.zze() : zzgfvVar;
    }

    public final zzgij zzg() {
        zzgij zzgijVar = this.zzg;
        return zzgijVar == null ? zzgij.zze() : zzgijVar;
    }
}
