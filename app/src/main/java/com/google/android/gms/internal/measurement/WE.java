package com.google.android.gms.internal.measurement;

import defpackage.a37;
import defpackage.b27;
import defpackage.d27;
import defpackage.ps6;
import defpackage.r37;
import defpackage.w37;
import defpackage.wy6;
import defpackage.x37;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class WE extends vDR implements r37 {
    private static final WE zza;
    private b27 zze;
    private b27 zzf;
    private d27 zzg;
    private d27 zzh;

    static {
        WE we = new WE();
        zza = we;
        vDR.m(WE.class, we);
    }

    public WE() {
        a37 a37Var = a37.z;
        this.zze = a37Var;
        this.zzf = a37Var;
        w37 w37Var = w37.z;
        this.zzg = w37Var;
        this.zzh = w37Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void E(WE we, List list) {
        b27 b27Var = we.zze;
        if (!((wy6) b27Var).w) {
            we.zze = vDR.j(b27Var);
        }
        com5Fixed.e(list, we.zze);
    }

    public static void F(WE we) {
        we.zze = a37.z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void G(WE we, List list) {
        b27 b27Var = we.zzf;
        if (!((wy6) b27Var).w) {
            we.zzf = vDR.j(b27Var);
        }
        com5Fixed.e(list, we.zzf);
    }

    public static void H(WE we) {
        we.zzf = a37.z;
    }

    public static /* synthetic */ void I(WE we, ArrayList arrayList) {
        we.O();
        com5Fixed.e(arrayList, we.zzg);
    }

    public static void J(WE we) {
        we.zzg = w37.z;
    }

    public static /* synthetic */ void K(WE we, int i) {
        we.O();
        we.zzg.remove(i);
    }

    public static void L(WE we, List list) {
        d27 d27Var = we.zzh;
        if (!d27Var.zzc()) {
            we.zzh = vDR.k(d27Var);
        }
        com5Fixed.e(list, we.zzh);
    }

    public static void M(WE we) {
        we.zzh = w37.z;
    }

    public static void N(WE we, int i) {
        d27 d27Var = we.zzh;
        if (!d27Var.zzc()) {
            we.zzh = vDR.k(d27Var);
        }
        we.zzh.remove(i);
    }

    public static ps6 w() {
        return (ps6) zza.n();
    }

    public static WE y() {
        return zza;
    }

    public final d27 A() {
        return this.zzg;
    }

    public final List B() {
        return this.zzf;
    }

    public final d27 C() {
        return this.zzh;
    }

    public final List D() {
        return this.zze;
    }

    public final void O() {
        d27 d27Var = this.zzg;
        if (d27Var.zzc()) {
            return;
        }
        this.zzg = vDR.k(d27Var);
    }

    @Override // com.google.android.gms.internal.measurement.vDR
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new x37(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", LPt6Fixed.class, "zzh", ct.class});
        }
        if (i2 == 3) {
            return new WE();
        }
        if (i2 == 4) {
            return new ps6(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int r() {
        return this.zzg.size();
    }

    public final int s() {
        return this.zzf.size();
    }

    public final int t() {
        return this.zzh.size();
    }

    public final int u() {
        return this.zze.size();
    }

    public final LPt6Fixed v(int i) {
        return (LPt6Fixed) this.zzg.get(i);
    }

    public final ct z(int i) {
        return (ct) this.zzh.get(i);
    }
}
