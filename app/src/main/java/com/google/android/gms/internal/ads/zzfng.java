package com.google.android.gms.internal.ads;

import defpackage.ru6;
import defpackage.vl6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfng extends zzgon implements zzgpy {
    private static final zzfng zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";
    private zzfnc zzi;

    static {
        zzfng zzfngVar = new zzfng();
        zzb = zzfngVar;
        zzgon.i(zzfng.class, zzfngVar);
    }

    public static /* synthetic */ void n(zzfng zzfngVar, String str) {
        str.getClass();
        zzfngVar.zze |= 2;
        zzfngVar.zzg = str;
    }

    public static /* synthetic */ void o(zzfng zzfngVar, zzfnc zzfncVar) {
        zzfncVar.getClass();
        zzfngVar.zzi = zzfncVar;
        zzfngVar.zze |= 8;
    }

    public static /* synthetic */ void p(zzfng zzfngVar) {
        zzfngVar.zzf = 1;
        zzfngVar.zze = 1 | zzfngVar.zze;
    }

    public static zzfne zza() {
        return (zzfne) zzb.j();
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", vl6.a, "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzfng();
        }
        if (i2 == 4) {
            return new zzfne(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
