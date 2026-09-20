package com.google.android.gms.internal.measurement;

import defpackage.d27;
import defpackage.km6;
import defpackage.r37;
import defpackage.w37;
import defpackage.x37;

/* JADX INFO: loaded from: classes3.dex */
public final class Xn1 extends vDR implements r37 {
    private static final Xn1 zza;
    private int zze;
    private d27 zzf = w37.z;
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        Xn1 xn1 = new Xn1();
        zza = xn1;
        vDR.m(Xn1.class, xn1);
    }

    public static /* synthetic */ void A(Xn1 xn1, int i, LPt9Fixed lPt9) {
        xn1.L();
        xn1.zzf.set(i, lPt9);
    }

    public static /* synthetic */ void B(Xn1 xn1, LPt9Fixed lPt9) {
        xn1.L();
        xn1.zzf.add(lPt9);
    }

    public static /* synthetic */ void C(Xn1 xn1, Iterable iterable) {
        xn1.L();
        com5Fixed.e(iterable, xn1.zzf);
    }

    public static void D(Xn1 xn1) {
        xn1.zzf = w37.z;
    }

    public static /* synthetic */ void E(Xn1 xn1, int i) {
        xn1.L();
        xn1.zzf.remove(i);
    }

    public static /* synthetic */ void F(Xn1 xn1, String str) {
        str.getClass();
        xn1.zze |= 1;
        xn1.zzg = str;
    }

    public static /* synthetic */ void G(long j, Xn1 xn1) {
        xn1.zze |= 2;
        xn1.zzh = j;
    }

    public static /* synthetic */ void H(long j, Xn1 xn1) {
        xn1.zze |= 4;
        xn1.zzi = j;
    }

    public static km6 v() {
        return (km6) zza.n();
    }

    public final boolean I() {
        return (this.zze & 8) != 0;
    }

    public final boolean J() {
        return (this.zze & 4) != 0;
    }

    public final boolean K() {
        return (this.zze & 2) != 0;
    }

    public final void L() {
        d27 d27Var = this.zzf;
        if (d27Var.zzc()) {
            return;
        }
        this.zzf = vDR.k(d27Var);
    }

    @Override // com.google.android.gms.internal.measurement.vDR
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new x37(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", LPt9Fixed.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new Xn1();
        }
        if (i2 == 4) {
            return new km6(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int r() {
        return this.zzj;
    }

    public final int s() {
        return this.zzf.size();
    }

    public final long t() {
        return this.zzi;
    }

    public final long u() {
        return this.zzh;
    }

    public final LPt9Fixed x(int i) {
        return (LPt9Fixed) this.zzf.get(i);
    }

    public final String y() {
        return this.zzg;
    }

    public final d27 z() {
        return this.zzf;
    }
}
