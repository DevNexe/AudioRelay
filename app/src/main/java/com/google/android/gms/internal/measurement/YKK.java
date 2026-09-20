package com.google.android.gms.internal.measurement;

import defpackage.ci6;
import defpackage.r37;
import defpackage.x37;
import defpackage.xh6;

/* JADX INFO: loaded from: classes3.dex */
public final class YKK extends vDR implements r37 {
    private static final YKK zza;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        YKK ykk = new YKK();
        zza = ykk;
        vDR.m(YKK.class, ykk);
    }

    public static YKK s() {
        return zza;
    }

    public final boolean A() {
        return (this.zze & 16) != 0;
    }

    public final boolean B() {
        return (this.zze & 8) != 0;
    }

    public final int C() {
        int i;
        int i2 = this.zzf;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.vDR
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new x37(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", ci6.a, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new YKK();
        }
        if (i2 == 4) {
            return new xh6();
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final String t() {
        return this.zzh;
    }

    public final String u() {
        return this.zzj;
    }

    public final String v() {
        return this.zzi;
    }

    public final boolean w() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zze & 1) != 0;
    }

    public final boolean y() {
        return (this.zze & 4) != 0;
    }

    public final boolean z() {
        return (this.zze & 2) != 0;
    }
}
