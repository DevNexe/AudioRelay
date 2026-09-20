package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgke extends zzgon implements zzgpy {
    private static final zzgke zzb;
    private String zze = "";

    static {
        zzgke zzgkeVar = new zzgke();
        zzb = zzgkeVar;
        zzgon.i(zzgke.class, zzgkeVar);
    }

    public static zzgke zzc() {
        return zzb;
    }

    public static zzgke zzd(zzgnf zzgnfVar, zzgnz zzgnzVar) {
        return (zzgke) zzgon.f(zzb, zzgnfVar, zzgnzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzgke();
        }
        if (i2 == 4) {
            return new zzgkd(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zze() {
        return this.zze;
    }
}
