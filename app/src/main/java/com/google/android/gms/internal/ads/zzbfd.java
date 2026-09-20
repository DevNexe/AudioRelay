package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbfd extends zzgon implements zzgpy {
    private static final zzbfd zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        zzbfd zzbfdVar = new zzbfd();
        zzb = zzbfdVar;
        zzgon.i(zzbfd.class, zzbfdVar);
    }

    public static /* synthetic */ void n(zzbfd zzbfdVar, boolean z) {
        zzbfdVar.zze |= 1;
        zzbfdVar.zzf = z;
    }

    public static /* synthetic */ void o(zzbfd zzbfdVar, int i) {
        zzbfdVar.zze |= 2;
        zzbfdVar.zzg = i;
    }

    public static zzbfc zza() {
        return (zzbfc) zzb.j();
    }

    public static zzbfd zzd() {
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
            return new ru6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzbfd();
        }
        if (i2 == 4) {
            return new zzbfc(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
