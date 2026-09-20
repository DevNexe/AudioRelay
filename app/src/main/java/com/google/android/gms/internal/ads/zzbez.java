package com.google.android.gms.internal.ads;

import defpackage.b46;
import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbez extends zzgon implements zzgpy {
    private static final zzbez zzb;
    private int zze;
    private int zzf;
    private zzbfd zzg;
    private zzbff zzh;

    static {
        zzbez zzbezVar = new zzbez();
        zzb = zzbezVar;
        zzgon.i(zzbez.class, zzbezVar);
    }

    public static /* synthetic */ void n(zzbez zzbezVar, zzbfd zzbfdVar) {
        zzbfdVar.getClass();
        zzbezVar.zzg = zzbfdVar;
        zzbezVar.zze |= 2;
    }

    public static /* synthetic */ void o(zzbez zzbezVar, zzbff zzbffVar) {
        zzbffVar.getClass();
        zzbezVar.zzh = zzbffVar;
        zzbezVar.zze |= 4;
    }

    public static /* synthetic */ void p(zzbez zzbezVar) {
        zzbezVar.zzf = 1;
        zzbezVar.zze = 1 | zzbezVar.zze;
    }

    public static zzbey zza() {
        return (zzbey) zzb.j();
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", b46.a, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzbez();
        }
        if (i2 == 4) {
            return new zzbey(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
