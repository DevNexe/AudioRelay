package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbhl extends zzgon implements zzgpy {
    private static final zzbhl zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzbhl zzbhlVar = new zzbhl();
        zzb = zzbhlVar;
        zzgon.i(zzbhl.class, zzbhlVar);
    }

    public static /* synthetic */ void n(zzbhl zzbhlVar, int i) {
        zzbhlVar.zze |= 1;
        zzbhlVar.zzf = i;
    }

    public static /* synthetic */ void o(zzbhl zzbhlVar, int i) {
        zzbhlVar.zze |= 2;
        zzbhlVar.zzg = i;
    }

    public static /* synthetic */ void p(zzbhl zzbhlVar, int i) {
        zzbhlVar.zze |= 4;
        zzbhlVar.zzh = i;
    }

    public static zzbhk zza() {
        return (zzbhk) zzb.j();
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzbhl();
        }
        if (i2 == 4) {
            return new zzbhk(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
