package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgkk extends zzgon implements zzgpy {
    private static final zzgkk zzb;
    private String zze = "";
    private zzgjl zzf;

    static {
        zzgkk zzgkkVar = new zzgkk();
        zzb = zzgkkVar;
        zzgon.i(zzgkk.class, zzgkkVar);
    }

    public static zzgkk zzd() {
        return zzb;
    }

    public static zzgkk zze(zzgnf zzgnfVar, zzgnz zzgnzVar) {
        return (zzgkk) zzgon.f(zzb, zzgnfVar, zzgnzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgkk();
        }
        if (i2 == 4) {
            return new zzgkj(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgjl zza() {
        zzgjl zzgjlVar = this.zzf;
        return zzgjlVar == null ? zzgjl.zzd() : zzgjlVar;
    }

    public final String zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        return this.zzf != null;
    }
}
