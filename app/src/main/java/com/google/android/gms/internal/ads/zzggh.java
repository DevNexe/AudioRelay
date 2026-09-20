package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzggh extends zzgon implements zzgpy {
    private static final zzggh zzb;
    private zzggk zze;
    private int zzf;

    static {
        zzggh zzgghVar = new zzggh();
        zzb = zzgghVar;
        zzgon.i(zzggh.class, zzgghVar);
    }

    public static /* synthetic */ void n(zzggh zzgghVar, zzggk zzggkVar) {
        zzggkVar.getClass();
        zzgghVar.zze = zzggkVar;
    }

    public static zzggg zzc() {
        return (zzggg) zzb.j();
    }

    public static zzggh zze(zzgnf zzgnfVar, zzgnz zzgnzVar) {
        return (zzggh) zzgon.f(zzb, zzgnfVar, zzgnzVar);
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
            return new zzggh();
        }
        if (i2 == 4) {
            return new zzggg(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzggk zzf() {
        zzggk zzggkVar = this.zze;
        return zzggkVar == null ? zzggk.zze() : zzggkVar;
    }
}
