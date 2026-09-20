package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import defpackage.e46;
import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbhb extends zzgon implements zzgpy {
    private static final zzbhb zzb;
    private int zze;
    private int zzf = AdError.NETWORK_ERROR_CODE;
    private int zzg = AdError.NETWORK_ERROR_CODE;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private zzbhd zzp;

    static {
        zzbhb zzbhbVar = new zzbhb();
        zzb = zzbhbVar;
        zzgon.i(zzbhb.class, zzbhbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            e46 e46Var = e46.a;
            return new ru6(zzb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zze", "zzf", e46Var, "zzg", e46Var, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (i2 == 3) {
            return new zzbhb();
        }
        if (i2 == 4) {
            return new zzbha(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
