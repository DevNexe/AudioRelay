package com.google.android.gms.internal.ads;

import defpackage.ky5;
import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzamc extends zzgon implements zzgpy {
    private static final zzamc zzb;
    private int zze;
    private int zzf = 2;

    static {
        zzamc zzamcVar = new zzamc();
        zzb = zzamcVar;
        zzgon.i(zzamc.class, zzamcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zze", "zzf", ky5.a});
        }
        if (i2 == 3) {
            return new zzamc();
        }
        if (i2 == 4) {
            return new zzamb(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
