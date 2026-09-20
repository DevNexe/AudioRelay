package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgkb extends zzgon implements zzgpy {
    private static final zzgkb zzb;
    private int zze;
    private zzgke zzf;

    static {
        zzgkb zzgkbVar = new zzgkb();
        zzb = zzgkbVar;
        zzgon.i(zzgkb.class, zzgkbVar);
    }

    public static /* synthetic */ void o(zzgkb zzgkbVar, zzgke zzgkeVar) {
        zzgkeVar.getClass();
        zzgkbVar.zzf = zzgkeVar;
    }

    public static zzgka zzc() {
        return (zzgka) zzb.j();
    }

    public static zzgkb zze(zzgnf zzgnfVar, zzgnz zzgnzVar) {
        return (zzgkb) zzgon.f(zzb, zzgnfVar, zzgnzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgkb();
        }
        if (i2 == 4) {
            return new zzgka(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzgke zzf() {
        zzgke zzgkeVar = this.zzf;
        return zzgkeVar == null ? zzgke.zzc() : zzgkeVar;
    }
}
