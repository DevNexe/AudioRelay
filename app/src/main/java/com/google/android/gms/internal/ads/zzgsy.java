package com.google.android.gms.internal.ads;

import defpackage.qu6;
import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgsy extends zzgon implements zzgpy {
    private static final zzgsy zzb;
    private int zze;
    private zzgsx zzf;
    private zzgnf zzh;
    private zzgnf zzi;
    private int zzj;
    private zzgnf zzk;
    private byte zzl = 2;
    private zzgow zzg = qu6.z;

    static {
        zzgsy zzgsyVar = new zzgsy();
        zzb = zzgsyVar;
        zzgon.i(zzgsy.class, zzgsyVar);
    }

    public zzgsy() {
        zzgnf zzgnfVar = zzgnf.zzb;
        this.zzh = zzgnfVar;
        this.zzi = zzgnfVar;
        this.zzk = zzgnfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzl);
        }
        byte b = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zze", "zzf", "zzg", zzgsq.class, "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzgsy();
        }
        if (i2 == 4) {
            return new zzgsv(b);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzl = zzgonVar != null ? (byte) 1 : (byte) 0;
        return null;
    }
}
