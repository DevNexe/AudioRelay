package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgij extends zzgon implements zzgpy {
    private static final zzgij zzb;
    private int zze;
    private zzgip zzf;
    private zzgnf zzg = zzgnf.zzb;

    static {
        zzgij zzgijVar = new zzgij();
        zzb = zzgijVar;
        zzgon.i(zzgij.class, zzgijVar);
    }

    public static /* synthetic */ void o(zzgij zzgijVar, zzgip zzgipVar) {
        zzgipVar.getClass();
        zzgijVar.zzf = zzgipVar;
    }

    public static zzgii zzc() {
        return (zzgii) zzb.j();
    }

    public static zzgij zze() {
        return zzb;
    }

    public static zzgij zzf(zzgnf zzgnfVar, zzgnz zzgnzVar) {
        return (zzgij) zzgon.f(zzb, zzgnfVar, zzgnzVar);
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
            return new zzgij();
        }
        if (i2 == 4) {
            return new zzgii(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzgip zzg() {
        zzgip zzgipVar = this.zzf;
        return zzgipVar == null ? zzgip.zze() : zzgipVar;
    }

    public final zzgnf zzh() {
        return this.zzg;
    }
}
