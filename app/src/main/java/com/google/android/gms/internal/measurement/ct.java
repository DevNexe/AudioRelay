package com.google.android.gms.internal.measurement;

import defpackage.a37;
import defpackage.b27;
import defpackage.qs6;
import defpackage.r37;
import defpackage.wy6;
import defpackage.x37;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ct extends vDR implements r37 {
    private static final ct zza;
    private int zze;
    private int zzf;
    private b27 zzg = a37.z;

    static {
        ct ctVar = new ct();
        zza = ctVar;
        vDR.m(ct.class, ctVar);
    }

    public static qs6 u() {
        return (qs6) zza.n();
    }

    public static /* synthetic */ void x(ct ctVar, int i) {
        ctVar.zze |= 1;
        ctVar.zzf = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void y(ct ctVar, List list) {
        b27 b27Var = ctVar.zzg;
        if (!((wy6) b27Var).w) {
            ctVar.zzg = vDR.j(b27Var);
        }
        com5Fixed.e(list, ctVar.zzg);
    }

    @Override // com.google.android.gms.internal.measurement.vDR
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new x37(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new ct();
        }
        if (i2 == 4) {
            return new qs6(i3);
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
        return this.zzf;
    }

    public final long t(int i) {
        a37 a37Var = (a37) this.zzg;
        a37Var.c(i);
        return a37Var.x[i];
    }

    public final List w() {
        return this.zzg;
    }

    public final boolean z() {
        return (this.zze & 1) != 0;
    }
}
