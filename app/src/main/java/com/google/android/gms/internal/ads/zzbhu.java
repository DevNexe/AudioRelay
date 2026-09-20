package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import defpackage.e46;
import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbhu extends zzgon implements zzgpy {
    private static final zzbhu zzb;
    private int zze;
    private zzbhl zzf;
    private int zzg = AdError.NETWORK_ERROR_CODE;
    private zzbhs zzh;
    private zzbhj zzi;

    static {
        zzbhu zzbhuVar = new zzbhu();
        zzb = zzbhuVar;
        zzgon.i(zzbhu.class, zzbhuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", "zzg", e46.a, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzbhu();
        }
        if (i2 == 4) {
            return new zzbht(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
