package com.google.android.gms.internal.ads;

import defpackage.j46;
import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbhs extends zzgon implements zzgpy {
    private static final zzbhs zzb;
    private int zze;
    private int zzf;

    static {
        zzbhs zzbhsVar = new zzbhs();
        zzb = zzbhsVar;
        zzgon.i(zzbhs.class, zzbhsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zze", "zzf", j46.a});
        }
        if (i2 == 3) {
            return new zzbhs();
        }
        if (i2 == 4) {
            return new zzbhq(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
