package com.google.android.gms.internal.measurement;

import defpackage.d27;
import defpackage.ih6;
import defpackage.r37;
import defpackage.w37;
import defpackage.x37;

/* JADX INFO: loaded from: classes3.dex */
public final class LPt8Fixed extends vDR implements r37 {
    private static final LPt8Fixed zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private d27 zzh = w37.z;
    private boolean zzi;
    private YKK zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        LPt8Fixed lPt8 = new LPt8Fixed();
        zza = lPt8;
        vDR.m(LPt8Fixed.class, lPt8);
    }

    public static /* synthetic */ void A(LPt8Fixed lPt8, int i, NUlFixed nUl) {
        d27 d27Var = lPt8.zzh;
        if (!d27Var.zzc()) {
            lPt8.zzh = vDR.k(d27Var);
        }
        lPt8.zzh.set(i, nUl);
    }

    public static ih6 t() {
        return (ih6) zza.n();
    }

    public static /* synthetic */ void z(LPt8Fixed lPt8, String str) {
        lPt8.zze |= 2;
        lPt8.zzg = str;
    }

    public final boolean B() {
        return this.zzk;
    }

    public final boolean C() {
        return this.zzl;
    }

    public final boolean D() {
        return this.zzm;
    }

    public final boolean E() {
        return (this.zze & 8) != 0;
    }

    public final boolean F() {
        return (this.zze & 1) != 0;
    }

    public final boolean G() {
        return (this.zze & 64) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.vDR
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new x37(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", NUlFixed.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new LPt8Fixed();
        }
        if (i2 == 4) {
            return new ih6(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int r() {
        return this.zzh.size();
    }

    public final int s() {
        return this.zzf;
    }

    public final NUlFixed v(int i) {
        return (NUlFixed) this.zzh.get(i);
    }

    public final YKK w() {
        YKK ykk = this.zzj;
        return ykk == null ? YKK.s() : ykk;
    }

    public final String x() {
        return this.zzg;
    }

    public final d27 y() {
        return this.zzh;
    }
}
