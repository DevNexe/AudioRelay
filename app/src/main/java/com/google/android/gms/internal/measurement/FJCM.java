package com.google.android.gms.internal.measurement;

import defpackage.d27;
import defpackage.r37;
import defpackage.w37;
import defpackage.x37;
import defpackage.yj6;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class FJCM extends vDR implements r37 {
    private static final FJCM zza;
    private int zze;
    private long zzf;
    private String zzg = "";
    private int zzh;
    private d27 zzi;
    private d27 zzj;
    private d27 zzk;
    private String zzl;
    private boolean zzm;
    private d27 zzn;
    private d27 zzo;
    private String zzp;

    static {
        FJCM fjcm = new FJCM();
        zza = fjcm;
        vDR.m(FJCM.class, fjcm);
    }

    public FJCM() {
        w37 w37Var = w37.z;
        this.zzi = w37Var;
        this.zzj = w37Var;
        this.zzk = w37Var;
        this.zzl = "";
        this.zzn = w37Var;
        this.zzo = w37Var;
        this.zzp = "";
    }

    public static /* synthetic */ void E(FJCM fjcm, int i, EQ eq) {
        d27 d27Var = fjcm.zzj;
        if (!d27Var.zzc()) {
            fjcm.zzj = vDR.k(d27Var);
        }
        fjcm.zzj.set(i, eq);
    }

    public static void F(FJCM fjcm) {
        fjcm.zzk = w37.z;
    }

    public static yj6 v() {
        return (yj6) zza.n();
    }

    public static FJCM x() {
        return zza;
    }

    public final d27 A() {
        return this.zzk;
    }

    public final List B() {
        return this.zzo;
    }

    public final d27 C() {
        return this.zzn;
    }

    public final List D() {
        return this.zzi;
    }

    public final boolean G() {
        return this.zzm;
    }

    public final boolean H() {
        return (this.zze & 2) != 0;
    }

    public final boolean I() {
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
            return new x37(zza, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", y.class, "zzj", EQ.class, "zzk", F1.class, "zzl", "zzm", "zzn", o_K.class, "zzo", byN.class, "zzp"});
        }
        if (i2 == 3) {
            return new FJCM();
        }
        if (i2 == 4) {
            return new yj6(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int r() {
        return this.zzn.size();
    }

    public final int s() {
        return this.zzj.size();
    }

    public final long t() {
        return this.zzf;
    }

    public final EQ u(int i) {
        return (EQ) this.zzj.get(i);
    }

    public final String y() {
        return this.zzg;
    }

    public final String z() {
        return this.zzp;
    }
}
