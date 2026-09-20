package com.google.android.gms.internal.measurement;

import defpackage.r37;
import defpackage.ts6;
import defpackage.x37;

/* JADX INFO: loaded from: classes3.dex */
public final class qc extends vDR implements r37 {
    private static final qc zza;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        qc qcVar = new qc();
        zza = qcVar;
        vDR.m(qc.class, qcVar);
    }

    public static /* synthetic */ void A(qc qcVar, String str) {
        str.getClass();
        qcVar.zze |= 4;
        qcVar.zzh = str;
    }

    public static /* synthetic */ void B(qc qcVar) {
        qcVar.zze &= -5;
        qcVar.zzh = zza.zzh;
    }

    public static /* synthetic */ void C(qc qcVar, long j) {
        qcVar.zze |= 8;
        qcVar.zzi = j;
    }

    public static /* synthetic */ void D(qc qcVar) {
        qcVar.zze &= -9;
        qcVar.zzi = 0L;
    }

    public static /* synthetic */ void E(qc qcVar, double d) {
        qcVar.zze |= 32;
        qcVar.zzk = d;
    }

    public static /* synthetic */ void F(qc qcVar) {
        qcVar.zze &= -33;
        qcVar.zzk = 0.0d;
    }

    public static ts6 u() {
        return (ts6) zza.n();
    }

    public static /* synthetic */ void y(qc qcVar, long j) {
        qcVar.zze |= 1;
        qcVar.zzf = j;
    }

    public static /* synthetic */ void z(qc qcVar, String str) {
        str.getClass();
        qcVar.zze |= 2;
        qcVar.zzg = str;
    }

    public final boolean G() {
        return (this.zze & 32) != 0;
    }

    public final boolean H() {
        return (this.zze & 8) != 0;
    }

    public final boolean I() {
        return (this.zze & 1) != 0;
    }

    public final boolean J() {
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
            return new x37(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new qc();
        }
        if (i2 == 4) {
            return new ts6(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final double r() {
        return this.zzk;
    }

    public final long s() {
        return this.zzi;
    }

    public final long t() {
        return this.zzf;
    }

    public final String w() {
        return this.zzg;
    }

    public final String x() {
        return this.zzh;
    }
}
