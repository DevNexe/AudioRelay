package com.google.android.gms.internal.measurement;

import defpackage.ah6;
import defpackage.d27;
import defpackage.r37;
import defpackage.w37;
import defpackage.x37;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class F1 extends vDR implements r37 {
    private static final F1 zza;
    private int zze;
    private int zzf;
    private d27 zzg;
    private d27 zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        F1 f1 = new F1();
        zza = f1;
        vDR.m(F1.class, f1);
    }

    public F1() {
        w37 w37Var = w37.z;
        this.zzg = w37Var;
        this.zzh = w37Var;
    }

    public static /* synthetic */ void A(F1 f1, int i, LPt8Fixed lPt8) {
        d27 d27Var = f1.zzh;
        if (!d27Var.zzc()) {
            f1.zzh = vDR.k(d27Var);
        }
        f1.zzh.set(i, lPt8);
    }

    public static /* synthetic */ void z(F1 f1, int i, auxFixed auxVar) {
        d27 d27Var = f1.zzg;
        if (!d27Var.zzc()) {
            f1.zzg = vDR.k(d27Var);
        }
        f1.zzg.set(i, auxVar);
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
            return new x37(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", auxFixed.class, "zzh", LPt8Fixed.class, "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new F1();
        }
        if (i2 == 4) {
            return new ah6(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int r() {
        return this.zzf;
    }

    public final int s() {
        return this.zzh.size();
    }

    public final int t() {
        return this.zzg.size();
    }

    public final LPt8Fixed v(int i) {
        return (LPt8Fixed) this.zzh.get(i);
    }

    public final auxFixed w(int i) {
        return (auxFixed) this.zzg.get(i);
    }

    public final List x() {
        return this.zzh;
    }

    public final d27 y() {
        return this.zzg;
    }
}
