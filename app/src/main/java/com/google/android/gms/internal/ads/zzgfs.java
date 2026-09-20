package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgfs extends zzgon implements zzgpy {
    private static final zzgfs zzb;
    private zzgfy zze;
    private zzgim zzf;

    static {
        zzgfs zzgfsVar = new zzgfs();
        zzb = zzgfsVar;
        zzgon.i(zzgfs.class, zzgfsVar);
    }

    public static /* synthetic */ void n(zzgfs zzgfsVar, zzgfy zzgfyVar) {
        zzgfyVar.getClass();
        zzgfsVar.zze = zzgfyVar;
    }

    public static /* synthetic */ void o(zzgfs zzgfsVar, zzgim zzgimVar) {
        zzgimVar.getClass();
        zzgfsVar.zzf = zzgimVar;
    }

    public static zzgfr zza() {
        return (zzgfr) zzb.j();
    }

    public static zzgfs zzd(zzgnf zzgnfVar, zzgnz zzgnzVar) {
        return (zzgfs) zzgon.f(zzb, zzgnfVar, zzgnzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgfs();
        }
        if (i2 == 4) {
            return new zzgfr(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgfy zze() {
        zzgfy zzgfyVar = this.zze;
        return zzgfyVar == null ? zzgfy.zze() : zzgfyVar;
    }

    public final zzgim zzf() {
        zzgim zzgimVar = this.zzf;
        return zzgimVar == null ? zzgim.zze() : zzgimVar;
    }
}
