package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgfg extends zzgon implements zzgpy {
    private static final zzgfg zzb;
    private int zze;
    private zzgnf zzf = zzgnf.zzb;
    private zzgfm zzg;

    static {
        zzgfg zzgfgVar = new zzgfg();
        zzb = zzgfgVar;
        zzgon.i(zzgfg.class, zzgfgVar);
    }

    public static /* synthetic */ void p(zzgfg zzgfgVar, zzgfm zzgfmVar) {
        zzgfmVar.getClass();
        zzgfgVar.zzg = zzgfmVar;
    }

    public static zzgff zzc() {
        return (zzgff) zzb.j();
    }

    public static zzgfg zze(zzgnf zzgnfVar, zzgnz zzgnzVar) {
        return (zzgfg) zzgon.f(zzb, zzgnfVar, zzgnzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgfg();
        }
        if (i2 == 4) {
            return new zzgff(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzgfm zzf() {
        zzgfm zzgfmVar = this.zzg;
        return zzgfmVar == null ? zzgfm.zze() : zzgfmVar;
    }

    public final zzgnf zzg() {
        return this.zzf;
    }
}
