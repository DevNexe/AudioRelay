package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgst extends zzgon implements zzgpy {
    private static final zzgst zzb;
    private int zze;
    private zzgnf zzf;
    private zzgnf zzg;
    private zzgnf zzh;

    static {
        zzgst zzgstVar = new zzgst();
        zzb = zzgstVar;
        zzgon.i(zzgst.class, zzgstVar);
    }

    public zzgst() {
        zzgnf zzgnfVar = zzgnf.zzb;
        this.zzf = zzgnfVar;
        this.zzg = zzgnfVar;
        this.zzh = zzgnfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzgst();
        }
        if (i2 == 4) {
            return new zzgss(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
