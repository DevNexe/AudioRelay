package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgsq extends zzgon implements zzgpy {
    private static final zzgsq zzb;
    private int zze;
    private zzgnf zzf;
    private zzgnf zzg;
    private byte zzh = 2;

    static {
        zzgsq zzgsqVar = new zzgsq();
        zzb = zzgsqVar;
        zzgon.i(zzgsq.class, zzgsqVar);
    }

    public zzgsq() {
        zzgnf zzgnfVar = zzgnf.zzb;
        this.zzf = zzgnfVar;
        this.zzg = zzgnfVar;
    }

    public static /* synthetic */ void n(zzgsq zzgsqVar, zzgnf zzgnfVar) {
        zzgsqVar.zze |= 1;
        zzgsqVar.zzf = zzgnfVar;
    }

    public static /* synthetic */ void o(zzgsq zzgsqVar, zzgnf zzgnfVar) {
        zzgsqVar.zze |= 2;
        zzgsqVar.zzg = zzgnfVar;
    }

    public static zzgsp zza() {
        return (zzgsp) zzb.j();
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        byte b = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgsq();
        }
        if (i2 == 4) {
            return new zzgsp(b);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzh = zzgonVar != null ? (byte) 1 : (byte) 0;
        return null;
    }
}
