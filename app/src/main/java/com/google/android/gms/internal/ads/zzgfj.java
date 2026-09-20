package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgfj extends zzgon implements zzgpy {
    private static final zzgfj zzb;
    private int zze;
    private zzgfm zzf;

    static {
        zzgfj zzgfjVar = new zzgfj();
        zzb = zzgfjVar;
        zzgon.i(zzgfj.class, zzgfjVar);
    }

    public static /* synthetic */ void o(zzgfj zzgfjVar, zzgfm zzgfmVar) {
        zzgfmVar.getClass();
        zzgfjVar.zzf = zzgfmVar;
    }

    public static zzgfi zzc() {
        return (zzgfi) zzb.j();
    }

    public static zzgfj zze(zzgnf zzgnfVar, zzgnz zzgnzVar) {
        return (zzgfj) zzgon.f(zzb, zzgnfVar, zzgnzVar);
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
            return new zzgfj();
        }
        if (i2 == 4) {
            return new zzgfi(i3);
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
        zzgfm zzgfmVar = this.zzf;
        return zzgfmVar == null ? zzgfm.zze() : zzgfmVar;
    }
}
