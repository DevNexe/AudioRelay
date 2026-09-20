package com.google.android.gms.internal.measurement;

import defpackage.r37;
import defpackage.x37;
import defpackage.xl6;

/* JADX INFO: loaded from: classes3.dex */
public final class LPt6Fixed extends vDR implements r37 {
    private static final LPt6Fixed zza;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        LPt6Fixed lPt6 = new LPt6Fixed();
        zza = lPt6;
        vDR.m(LPt6Fixed.class, lPt6);
    }

    public static xl6 t() {
        return (xl6) zza.n();
    }

    public static /* synthetic */ void v(LPt6Fixed lPt6, int i) {
        lPt6.zze |= 1;
        lPt6.zzf = i;
    }

    public static /* synthetic */ void w(LPt6Fixed lPt6, long j) {
        lPt6.zze |= 2;
        lPt6.zzg = j;
    }

    @Override // com.google.android.gms.internal.measurement.vDR
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new x37(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new LPt6Fixed();
        }
        if (i2 == 4) {
            return new xl6(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int r() {
        return this.zzf;
    }

    public final long s() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zze & 2) != 0;
    }

    public final boolean y() {
        return (this.zze & 1) != 0;
    }
}
