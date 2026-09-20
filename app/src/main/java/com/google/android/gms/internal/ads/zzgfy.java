package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgfy extends zzgon implements zzgpy {
    private static final zzgfy zzb;
    private zzggb zze;
    private int zzf;

    static {
        zzgfy zzgfyVar = new zzgfy();
        zzb = zzgfyVar;
        zzgon.i(zzgfy.class, zzgfyVar);
    }

    public static /* synthetic */ void n(zzgfy zzgfyVar, zzggb zzggbVar) {
        zzggbVar.getClass();
        zzgfyVar.zze = zzggbVar;
    }

    public static zzgfx zzc() {
        return (zzgfx) zzb.j();
    }

    public static zzgfy zze() {
        return zzb;
    }

    public static zzgfy zzf(zzgnf zzgnfVar, zzgnz zzgnzVar) {
        return (zzgfy) zzgon.f(zzb, zzgnfVar, zzgnzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgfy();
        }
        if (i2 == 4) {
            return new zzgfx(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzggb zzg() {
        zzggb zzggbVar = this.zze;
        return zzggbVar == null ? zzggb.zze() : zzggbVar;
    }
}
