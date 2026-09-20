package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzama extends zzgon implements zzgpy {
    private static final zzama zzb;
    private int zze;
    private zzamc zzf;
    private zzamf zzg;

    static {
        zzama zzamaVar = new zzama();
        zzb = zzamaVar;
        zzgon.i(zzama.class, zzamaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzama();
        }
        if (i2 == 4) {
            return new zzalz(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
