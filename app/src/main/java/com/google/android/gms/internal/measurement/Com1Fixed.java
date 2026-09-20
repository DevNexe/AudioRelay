package com.google.android.gms.internal.measurement;

import defpackage.d27;
import defpackage.ni6;
import defpackage.r37;
import defpackage.w37;
import defpackage.x37;

/* JADX INFO: loaded from: classes3.dex */
public final class Com1Fixed extends vDR implements r37 {
    private static final Com1Fixed zza;
    private int zze;
    private String zzf = "";
    private d27 zzg = w37.z;

    static {
        Com1Fixed com1 = new Com1Fixed();
        zza = com1;
        vDR.m(Com1Fixed.class, com1);
    }

    @Override // com.google.android.gms.internal.measurement.vDR
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new x37(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", QX.class});
        }
        if (i2 == 3) {
            return new Com1Fixed();
        }
        Object obj = null;
        if (i2 == 4) {
            return new ni6(obj);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final String s() {
        return this.zzf;
    }

    public final d27 t() {
        return this.zzg;
    }
}
