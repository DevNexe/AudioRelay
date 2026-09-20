package com.google.android.gms.internal.ads;

import defpackage.ny5;
import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzamk extends zzgon implements zzgpy {
    private static final zzamk zzb;
    private int zze;
    private int zzf;

    static {
        zzamk zzamkVar = new zzamk();
        zzb = zzamkVar;
        zzgon.i(zzamk.class, zzamkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zze", "zzf", ny5.a});
        }
        if (i2 == 3) {
            return new zzamk();
        }
        if (i2 == 4) {
            return new zzamj(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
