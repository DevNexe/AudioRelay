package com.google.android.gms.internal.measurement;

import defpackage.r37;
import defpackage.x37;
import defpackage.xh6;

/* JADX INFO: loaded from: classes3.dex */
public final class PRnFixed extends vDR implements r37 {
    private static final PRnFixed zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        PRnFixed pRn = new PRnFixed();
        zza = pRn;
        vDR.m(PRnFixed.class, pRn);
    }

    @Override // com.google.android.gms.internal.measurement.vDR
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new x37(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new PRnFixed();
        }
        if (i2 == 4) {
            return new xh6(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }
}
