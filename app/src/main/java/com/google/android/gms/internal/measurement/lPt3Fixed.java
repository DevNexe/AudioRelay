package com.google.android.gms.internal.measurement;

import defpackage.r37;
import defpackage.x37;
import defpackage.xk6;

/* JADX INFO: loaded from: classes3.dex */
public final class lPt3Fixed extends vDR implements r37 {
    private static final lPt3Fixed zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private RBi zzh;

    static {
        lPt3Fixed lpt3 = new lPt3Fixed();
        zza = lpt3;
        vDR.m(lPt3Fixed.class, lpt3);
    }

    @Override // com.google.android.gms.internal.measurement.vDR
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new x37(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new lPt3Fixed();
        }
        if (i2 == 4) {
            return new xk6(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }
}
