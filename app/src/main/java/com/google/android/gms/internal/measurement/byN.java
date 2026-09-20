package com.google.android.gms.internal.measurement;

import defpackage.d27;
import defpackage.ni6;
import defpackage.r37;
import defpackage.w37;
import defpackage.x37;

/* JADX INFO: loaded from: classes3.dex */
public final class byN extends vDR implements r37 {
    private static final byN zza;
    private int zze;
    private String zzf = "";
    private d27 zzg = w37.z;
    private boolean zzh;

    static {
        byN byn = new byN();
        zza = byn;
        vDR.m(byN.class, byn);
    }

    @Override // com.google.android.gms.internal.measurement.vDR
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new x37(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", PRnFixed.class, "zzh"});
        }
        if (i2 == 3) {
            return new byN();
        }
        if (i2 == 4) {
            return new ni6(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final String s() {
        return this.zzf;
    }
}
