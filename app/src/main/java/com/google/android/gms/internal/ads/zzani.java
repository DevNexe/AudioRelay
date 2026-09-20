package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzani extends zzgon implements zzgpy {
    private static final zzani zzb;
    private int zze;
    private String zzf = "";

    static {
        zzani zzaniVar = new zzani();
        zzb = zzaniVar;
        zzgon.i(zzani.class, zzaniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzani();
        }
        if (i2 == 4) {
            return new zzanh(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
