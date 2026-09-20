package com.google.android.gms.internal.measurement;

import defpackage.d27;
import defpackage.hw6;
import defpackage.r37;
import defpackage.w37;
import defpackage.x37;
import defpackage.xk6;

/* JADX INFO: loaded from: classes3.dex */
public final class QX extends vDR implements r37 {
    private static final QX zza;
    private int zze;
    private int zzf;
    private d27 zzg = w37.z;
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    static {
        QX qx = new QX();
        zza = qx;
        vDR.m(QX.class, qx);
    }

    public final int A() {
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
        int i3 = 0;
        int i4 = 3;
        if (i2 == 2) {
            return new x37(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", hw6.a, "zzg", QX.class, "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new QX();
        }
        if (i2 == 4) {
            return new xk6(i4, i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final double r() {
        return this.zzk;
    }

    public final String t() {
        return this.zzh;
    }

    public final String u() {
        return this.zzi;
    }

    public final d27 v() {
        return this.zzg;
    }

    public final boolean w() {
        return this.zzj;
    }

    public final boolean x() {
        return (this.zze & 8) != 0;
    }

    public final boolean y() {
        return (this.zze & 16) != 0;
    }

    public final boolean z() {
        return (this.zze & 4) != 0;
    }
}
