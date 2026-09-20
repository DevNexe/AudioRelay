package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import defpackage.e46;
import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbia extends zzgon implements zzgpy {
    private static final zzbia zzb;
    private int zze;
    private int zzf = AdError.NETWORK_ERROR_CODE;
    private zzbhs zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;

    static {
        zzbia zzbiaVar = new zzbia();
        zzb = zzbiaVar;
        zzgon.i(zzbia.class, zzbiaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zze", "zzf", e46.a, "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzbia();
        }
        if (i2 == 4) {
            return new zzbhz(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
