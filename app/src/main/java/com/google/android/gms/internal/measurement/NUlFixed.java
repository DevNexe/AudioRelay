package com.google.android.gms.internal.measurement;

import defpackage.oh6;
import defpackage.r37;
import defpackage.x37;

/* JADX INFO: loaded from: classes3.dex */
public final class NUlFixed extends vDR implements r37 {
    private static final NUlFixed zza;
    private int zze;
    private T23 zzf;
    private YKK zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        NUlFixed nUl = new NUlFixed();
        zza = nUl;
        vDR.m(NUlFixed.class, nUl);
    }

    public static NUlFixed s() {
        return zza;
    }

    public static /* synthetic */ void w(NUlFixed nUl, String str) {
        nUl.zze |= 8;
        nUl.zzi = str;
    }

    public final boolean A() {
        return (this.zze & 8) != 0;
    }

    public final boolean B() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.vDR
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new x37(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new NUlFixed();
        }
        if (i2 == 4) {
            return new oh6(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final YKK t() {
        YKK ykk = this.zzg;
        return ykk == null ? YKK.s() : ykk;
    }

    public final T23 u() {
        T23 t23 = this.zzf;
        return t23 == null ? T23.t() : t23;
    }

    public final String v() {
        return this.zzi;
    }

    public final boolean x() {
        return this.zzh;
    }

    public final boolean y() {
        return (this.zze & 4) != 0;
    }

    public final boolean z() {
        return (this.zze & 2) != 0;
    }
}
