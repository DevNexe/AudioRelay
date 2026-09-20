package com.google.android.gms.internal.measurement;

import defpackage.fn6;
import defpackage.r37;
import defpackage.x37;

/* JADX INFO: loaded from: classes3.dex */
public final class ta extends vDR implements r37 {
    private static final ta zza;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        ta taVar = new ta();
        zza = taVar;
        vDR.m(ta.class, taVar);
    }

    @Override // com.google.android.gms.internal.measurement.vDR
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new x37(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new ta();
        }
        if (i2 == 4) {
            return new fn6(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }
}
