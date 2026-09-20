package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbig extends zzgon implements zzgpy {
    private static final zzbig zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        zzbig zzbigVar = new zzbig();
        zzb = zzbigVar;
        zzgon.i(zzbig.class, zzbigVar);
    }

    public static /* synthetic */ void n(zzbig zzbigVar, boolean z) {
        zzbigVar.zze |= 1;
        zzbigVar.zzf = z;
    }

    public static /* synthetic */ void o(zzbig zzbigVar, int i) {
        zzbigVar.zze |= 2;
        zzbigVar.zzg = i;
    }

    public static zzbif zza() {
        return (zzbif) zzb.j();
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzbig();
        }
        if (i2 == 4) {
            return new zzbif(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean zzf() {
        return this.zzf;
    }
}
