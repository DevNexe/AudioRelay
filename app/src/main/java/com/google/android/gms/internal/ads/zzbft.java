package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import defpackage.e46;
import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbft extends zzgon implements zzgpy {
    private static final zzbft zzb;
    private int zze;
    private zzbhj zzg;
    private int zzh;
    private zzbhl zzi;
    private int zzj;
    private String zzf = "";
    private int zzk = AdError.NETWORK_ERROR_CODE;
    private int zzl = AdError.NETWORK_ERROR_CODE;
    private int zzm = AdError.NETWORK_ERROR_CODE;

    static {
        zzbft zzbftVar = new zzbft();
        zzb = zzbftVar;
        zzgon.i(zzbft.class, zzbftVar);
    }

    public static /* synthetic */ void n(zzbft zzbftVar, String str) {
        zzbftVar.zze |= 1;
        zzbftVar.zzf = str;
    }

    public static /* synthetic */ void o(zzbft zzbftVar, zzbhl zzbhlVar) {
        zzbhlVar.getClass();
        zzbftVar.zzi = zzbhlVar;
        zzbftVar.zze |= 8;
    }

    public static zzbft zzc() {
        return zzb;
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
            return new ru6(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", e46Var, "zzl", e46Var, "zzm", e46Var});
        }
        if (i2 == 3) {
            return new zzbft();
        }
        if (i2 == 4) {
            return new zzbfs(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
