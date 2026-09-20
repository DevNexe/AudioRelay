package com.google.android.gms.internal.ads;

import defpackage.ru6;
import defpackage.yv6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgtb extends zzgon implements zzgpy {
    private static final zzgtb zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private zzgnf zzh;
    private zzgnf zzi;

    static {
        zzgtb zzgtbVar = new zzgtb();
        zzb = zzgtbVar;
        zzgon.i(zzgtb.class, zzgtbVar);
    }

    public zzgtb() {
        zzgnf zzgnfVar = zzgnf.zzb;
        this.zzh = zzgnfVar;
        this.zzi = zzgnfVar;
    }

    public static /* synthetic */ void n(zzgtb zzgtbVar) {
        zzgtbVar.zze |= 2;
        zzgtbVar.zzg = "image/png";
    }

    public static /* synthetic */ void o(zzgtb zzgtbVar, zzgnf zzgnfVar) {
        zzgnfVar.getClass();
        zzgtbVar.zze |= 4;
        zzgtbVar.zzh = zzgnfVar;
    }

    public static /* synthetic */ void p(zzgtb zzgtbVar) {
        zzgtbVar.zzf = 1;
        zzgtbVar.zze = 1 | zzgtbVar.zze;
    }

    public static zzgsz zza() {
        return (zzgsz) zzb.j();
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zze", "zzf", yv6.a, "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzgtb();
        }
        if (i2 == 4) {
            return new zzgsz(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
