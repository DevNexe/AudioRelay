package com.google.android.gms.internal.measurement;

import defpackage.r37;
import defpackage.tl6;
import defpackage.x37;

/* JADX INFO: loaded from: classes3.dex */
public final class MZ extends vDR implements r37 {
    private static final MZ zza;
    private int zze;
    private int zzf;
    private WE zzg;
    private WE zzh;
    private boolean zzi;

    static {
        MZ mz = new MZ();
        zza = mz;
        vDR.m(MZ.class, mz);
    }

    public static tl6 s() {
        return (tl6) zza.n();
    }

    public static /* synthetic */ void w(MZ mz, int i) {
        mz.zze |= 1;
        mz.zzf = i;
    }

    public static /* synthetic */ void x(MZ mz, WE we) {
        mz.zzg = we;
        mz.zze |= 2;
    }

    public static /* synthetic */ void y(MZ mz, WE we) {
        mz.zzh = we;
        mz.zze |= 4;
    }

    public static /* synthetic */ void z(MZ mz, boolean z) {
        mz.zze |= 8;
        mz.zzi = z;
    }

    public final boolean A() {
        return this.zzi;
    }

    public final boolean B() {
        return (this.zze & 1) != 0;
    }

    public final boolean C() {
        return (this.zze & 8) != 0;
    }

    public final boolean D() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.vDR
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new x37(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new MZ();
        }
        if (i2 == 4) {
            return new tl6(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int r() {
        return this.zzf;
    }

    public final WE u() {
        WE we = this.zzg;
        return we == null ? WE.y() : we;
    }

    public final WE v() {
        WE we = this.zzh;
        return we == null ? WE.y() : we;
    }
}
