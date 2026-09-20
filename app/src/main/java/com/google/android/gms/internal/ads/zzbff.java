package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbff extends zzgon implements zzgpy {
    private static final zzbff zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        zzbff zzbffVar = new zzbff();
        zzb = zzbffVar;
        zzgon.i(zzbff.class, zzbffVar);
    }

    public static /* synthetic */ void n(zzbff zzbffVar, boolean z) {
        zzbffVar.zze |= 1;
        zzbffVar.zzf = z;
    }

    public static /* synthetic */ void o(zzbff zzbffVar, boolean z) {
        zzbffVar.zze |= 2;
        zzbffVar.zzg = z;
    }

    public static /* synthetic */ void p(zzbff zzbffVar, int i) {
        zzbffVar.zze |= 4;
        zzbffVar.zzh = i;
    }

    public static zzbfe zza() {
        return (zzbfe) zzb.j();
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzbff();
        }
        if (i2 == 4) {
            return new zzbfe(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
