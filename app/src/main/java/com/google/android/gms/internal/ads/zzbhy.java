package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import defpackage.e46;
import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbhy extends zzgon implements zzgpy {
    private static final zzbhy zzb;
    private int zze;
    private int zzf = AdError.NETWORK_ERROR_CODE;
    private zzbhs zzg;
    private zzbhj zzh;

    static {
        zzbhy zzbhyVar = new zzbhy();
        zzb = zzbhyVar;
        zzgon.i(zzbhy.class, zzbhyVar);
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
            return new zzbhy();
        }
        if (i2 == 4) {
            return new zzbhx(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
