package com.google.android.gms.internal.ads;

import defpackage.fj6;
import defpackage.ru6;
import defpackage.ul6;
import defpackage.yt6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfnc extends zzgon implements zzgpy {
    private static final zzgot zzb = new fj6(8, 0);
    private static final zzfnc zze;
    private int zzf;
    private zzgos zzg = yt6.z;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzfnc zzfncVar = new zzfnc();
        zze = zzfncVar;
        zzgon.i(zzfnc.class, zzfncVar);
    }

    public static /* synthetic */ void n(zzfnc zzfncVar, String str) {
        str.getClass();
        zzfncVar.zzf |= 1;
        zzfncVar.zzh = str;
    }

    public static void o(zzfnc zzfncVar) {
        zzgos zzgosVar = zzfncVar.zzg;
        if (!zzgosVar.zzc()) {
            int size = zzgosVar.size();
            zzfncVar.zzg = zzgosVar.zzd(size == 0 ? 10 : size + size);
        }
        zzfncVar.zzg.zzh(2);
    }

    public static zzfnb zza() {
        return (zzfnb) zze.j();
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzf", "zzg", ul6.a, "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzfnc();
        }
        if (i2 == 4) {
            return new zzfnb(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zze;
    }
}
