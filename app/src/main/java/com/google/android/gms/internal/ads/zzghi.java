package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzghi extends zzgon implements zzgpy {
    private static final zzghi zzb;

    static {
        zzghi zzghiVar = new zzghi();
        zzb = zzghiVar;
        zzgon.i(zzghi.class, zzghiVar);
    }

    public static zzghi zzc() {
        return zzb;
    }

    public static zzghi zzd(zzgnf zzgnfVar, zzgnz zzgnzVar) {
        return (zzghi) zzgon.f(zzb, zzgnfVar, zzgnzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ru6(zzb, "\u0000\u0000", null);
        }
        if (i2 == 3) {
            return new zzghi();
        }
        if (i2 == 4) {
            return new zzghh(0);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
