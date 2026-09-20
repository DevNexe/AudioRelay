package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgkv extends zzgon implements zzgpy {
    private static final zzgkv zzb;
    private int zze;

    static {
        zzgkv zzgkvVar = new zzgkv();
        zzb = zzgkvVar;
        zzgon.i(zzgkv.class, zzgkvVar);
    }

    public static zzgkv zzc() {
        return zzb;
    }

    public static zzgkv zzd(zzgnf zzgnfVar, zzgnz zzgnzVar) {
        return (zzgkv) zzgon.f(zzb, zzgnfVar, zzgnzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzgkv();
        }
        if (i2 == 4) {
            return new zzgku(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
