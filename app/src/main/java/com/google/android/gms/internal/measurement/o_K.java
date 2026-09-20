package com.google.android.gms.internal.measurement;

import defpackage.b70;
import defpackage.d27;
import defpackage.r37;
import defpackage.w37;
import defpackage.x37;
import defpackage.xh6;

/* JADX INFO: loaded from: classes3.dex */
public final class o_K extends vDR implements r37 {
    private static final o_K zza;
    private int zze;
    private d27 zzf = w37.z;
    private Z zzg;

    static {
        o_K o_k = new o_K();
        zza = o_k;
        vDR.m(o_K.class, o_k);
    }

    @Override // com.google.android.gms.internal.measurement.vDR
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new x37(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", QX.class, "zzg"});
        }
        if (i2 == 3) {
            return new o_K();
        }
        b70 b70Var = null;
        if (i2 == 4) {
            return new xh6(b70Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final Z r() {
        Z z = this.zzg;
        return z == null ? Z.t() : z;
    }

    public final d27 t() {
        return this.zzf;
    }
}
