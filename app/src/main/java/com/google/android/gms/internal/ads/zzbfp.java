package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import defpackage.e46;
import defpackage.qu6;
import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbfp extends zzgon implements zzgpy {
    private static final zzbfp zzb;
    private int zze;
    private String zzf = "";
    private zzgow zzg = qu6.z;
    private int zzh = AdError.NETWORK_ERROR_CODE;
    private int zzi = AdError.NETWORK_ERROR_CODE;
    private int zzj = AdError.NETWORK_ERROR_CODE;

    static {
        zzbfp zzbfpVar = new zzbfp();
        zzb = zzbfpVar;
        zzgon.i(zzbfp.class, zzbfpVar);
    }

    public static /* synthetic */ void n(zzbfp zzbfpVar, String str) {
        str.getClass();
        zzbfpVar.zze |= 1;
        zzbfpVar.zzf = str;
    }

    public static zzbfp zzc() {
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
            return new ru6(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zze", "zzf", "zzg", zzbfl.class, "zzh", e46Var, "zzi", e46Var, "zzj", e46Var});
        }
        if (i2 == 3) {
            return new zzbfp();
        }
        if (i2 == 4) {
            return new zzbfo(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
