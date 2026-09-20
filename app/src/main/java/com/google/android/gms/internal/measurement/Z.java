package com.google.android.gms.internal.measurement;

import defpackage.d27;
import defpackage.r37;
import defpackage.w37;
import defpackage.x37;
import defpackage.xk6;

/* JADX INFO: loaded from: classes3.dex */
public final class Z extends vDR implements r37 {
    private static final Z zza;
    private d27 zze = w37.z;

    static {
        Z z = new Z();
        zza = z;
        vDR.m(Z.class, z);
    }

    public static Z t() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.vDR
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        int i4 = 2;
        if (i2 == 2) {
            return new x37(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", Com1Fixed.class});
        }
        if (i2 == 3) {
            return new Z();
        }
        if (i2 == 4) {
            return new xk6(i4, i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int r() {
        return this.zze.size();
    }

    public final d27 u() {
        return this.zze;
    }
}
