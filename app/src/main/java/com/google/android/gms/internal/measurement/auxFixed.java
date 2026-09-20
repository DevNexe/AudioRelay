package com.google.android.gms.internal.measurement;

import defpackage.ji6;
import defpackage.r37;
import defpackage.x37;

/* JADX INFO: loaded from: classes3.dex */
public final class auxFixed extends vDR implements r37 {
    private static final auxFixed zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private NUlFixed zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        auxFixed auxVar = new auxFixed();
        zza = auxVar;
        vDR.m(auxFixed.class, auxVar);
    }

    public static ji6 t() {
        return (ji6) zza.n();
    }

    public static /* synthetic */ void w(auxFixed auxVar, String str) {
        auxVar.zze |= 2;
        auxVar.zzg = str;
    }

    public final boolean A() {
        return (this.zze & 1) != 0;
    }

    public final boolean B() {
        return (this.zze & 32) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.vDR
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new x37(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new auxFixed();
        }
        if (i2 == 4) {
            return new ji6(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int r() {
        return this.zzf;
    }

    public final NUlFixed s() {
        NUlFixed nUl = this.zzh;
        return nUl == null ? NUlFixed.s() : nUl;
    }

    public final String v() {
        return this.zzg;
    }

    public final boolean x() {
        return this.zzi;
    }

    public final boolean y() {
        return this.zzj;
    }

    public final boolean z() {
        return this.zzk;
    }
}
