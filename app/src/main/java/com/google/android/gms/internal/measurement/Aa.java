package com.google.android.gms.internal.measurement;

import defpackage.d27;
import defpackage.ls6;
import defpackage.r37;
import defpackage.w37;
import defpackage.x37;
import defpackage.xr6;

/* JADX INFO: loaded from: classes3.dex */
public final class Aa extends vDR implements r37 {
    private static final Aa zza;
    private int zze;
    private int zzf = 1;
    private d27 zzg = w37.z;

    static {
        Aa aa = new Aa();
        zza = aa;
        vDR.m(Aa.class, aa);
    }

    @Override // com.google.android.gms.internal.measurement.vDR
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new x37(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zze", "zzf", ls6.a, "zzg", ta.class});
        }
        if (i2 == 3) {
            return new Aa();
        }
        if (i2 == 4) {
            return new xr6(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }
}
