package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzarr extends zzgon implements zzgpy {
    private static final zzarr zzb;
    private int zze;
    private zzaru zzf;
    private zzgnf zzg;
    private zzgnf zzh;

    static {
        zzarr zzarrVar = new zzarr();
        zzb = zzarrVar;
        zzgon.i(zzarr.class, zzarrVar);
    }

    public zzarr() {
        zzgnf zzgnfVar = zzgnf.zzb;
        this.zzg = zzgnfVar;
        this.zzh = zzgnfVar;
    }

    public static zzarr zzc(zzgnf zzgnfVar, zzgnz zzgnzVar) {
        return (zzarr) zzgon.f(zzb, zzgnfVar, zzgnzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzarr();
        }
        if (i2 == 4) {
            return new zzarq(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzaru zzd() {
        zzaru zzaruVar = this.zzf;
        return zzaruVar == null ? zzaru.zzg() : zzaruVar;
    }

    public final zzgnf zze() {
        return this.zzh;
    }

    public final zzgnf zzf() {
        return this.zzg;
    }
}
