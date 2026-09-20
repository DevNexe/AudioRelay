package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import defpackage.e46;
import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbic extends zzgon implements zzgpy {
    private static final zzbic zzb;
    private int zze;
    private int zzf = AdError.NETWORK_ERROR_CODE;
    private zzbhs zzg;
    private zzbhj zzh;

    static {
        zzbic zzbicVar = new zzbic();
        zzb = zzbicVar;
        zzgon.i(zzbic.class, zzbicVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", e46.a, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzbic();
        }
        if (i2 == 4) {
            return new zzbib(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
