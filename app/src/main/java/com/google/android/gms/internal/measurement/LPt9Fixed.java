package com.google.android.gms.internal.measurement;

import defpackage.d27;
import defpackage.r37;
import defpackage.so6;
import defpackage.w37;
import defpackage.x37;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class LPt9Fixed extends vDR implements r37 {
    private static final LPt9Fixed zza;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private d27 zzk = w37.z;

    static {
        LPt9Fixed lPt9 = new LPt9Fixed();
        zza = lPt9;
        vDR.m(LPt9Fixed.class, lPt9);
    }

    public static /* synthetic */ void A(LPt9Fixed lPt9, String str) {
        str.getClass();
        lPt9.zze |= 1;
        lPt9.zzf = str;
    }

    public static /* synthetic */ void B(LPt9Fixed lPt9, String str) {
        str.getClass();
        lPt9.zze |= 2;
        lPt9.zzg = str;
    }

    public static /* synthetic */ void C(LPt9Fixed lPt9) {
        lPt9.zze &= -3;
        lPt9.zzg = zza.zzg;
    }

    public static /* synthetic */ void D(LPt9Fixed lPt9, long j) {
        lPt9.zze |= 4;
        lPt9.zzh = j;
    }

    public static /* synthetic */ void E(LPt9Fixed lPt9) {
        lPt9.zze &= -5;
        lPt9.zzh = 0L;
    }

    public static /* synthetic */ void F(LPt9Fixed lPt9, double d) {
        lPt9.zze |= 16;
        lPt9.zzj = d;
    }

    public static /* synthetic */ void G(LPt9Fixed lPt9) {
        lPt9.zze &= -17;
        lPt9.zzj = 0.0d;
    }

    public static void H(LPt9Fixed lPt9, LPt9Fixed lPt10) {
        d27 d27Var = lPt9.zzk;
        if (!d27Var.zzc()) {
            lPt9.zzk = vDR.k(d27Var);
        }
        lPt9.zzk.add(lPt10);
    }

    public static void I(LPt9Fixed lPt9, ArrayList arrayList) {
        d27 d27Var = lPt9.zzk;
        if (!d27Var.zzc()) {
            lPt9.zzk = vDR.k(d27Var);
        }
        com5Fixed.e(arrayList, lPt9.zzk);
    }

    public static void J(LPt9Fixed lPt9) {
        lPt9.zzk = w37.z;
    }

    public static so6 v() {
        return (so6) zza.n();
    }

    public final boolean K() {
        return (this.zze & 16) != 0;
    }

    public final boolean L() {
        return (this.zze & 8) != 0;
    }

    public final boolean M() {
        return (this.zze & 4) != 0;
    }

    public final boolean N() {
        return (this.zze & 1) != 0;
    }

    public final boolean O() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.vDR
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new x37(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", LPt9Fixed.class});
        }
        if (i2 == 3) {
            return new LPt9Fixed();
        }
        if (i2 == 4) {
            return new so6(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final double r() {
        return this.zzj;
    }

    public final float s() {
        return this.zzi;
    }

    public final int t() {
        return this.zzk.size();
    }

    public final long u() {
        return this.zzh;
    }

    public final String x() {
        return this.zzf;
    }

    public final String y() {
        return this.zzg;
    }

    public final d27 z() {
        return this.zzk;
    }
}
