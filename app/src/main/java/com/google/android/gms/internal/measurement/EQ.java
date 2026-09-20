package com.google.android.gms.internal.measurement;

import defpackage.r37;
import defpackage.sj6;
import defpackage.x37;

/* JADX INFO: loaded from: classes3.dex */
public final class EQ extends vDR implements r37 {
    private static final EQ zza;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        EQ eq = new EQ();
        zza = eq;
        vDR.m(EQ.class, eq);
    }

    public static /* synthetic */ void u(EQ eq, String str) {
        str.getClass();
        eq.zze |= 1;
        eq.zzf = str;
    }

    @Override // com.google.android.gms.internal.measurement.vDR
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new x37(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new EQ();
        }
        if (i2 == 4) {
            return new sj6(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int r() {
        return this.zzi;
    }

    public final String t() {
        return this.zzf;
    }

    public final boolean v() {
        return this.zzg;
    }

    public final boolean w() {
        return this.zzh;
    }

    public final boolean x() {
        return (this.zze & 2) != 0;
    }

    public final boolean y() {
        return (this.zze & 4) != 0;
    }

    public final boolean z() {
        return (this.zze & 8) != 0;
    }
}
