package com.google.android.gms.internal.measurement;

import defpackage.d27;
import defpackage.ni6;
import defpackage.ps0;
import defpackage.r37;
import defpackage.ri6;
import defpackage.w37;
import defpackage.x37;

/* JADX INFO: loaded from: classes3.dex */
public final class T23 extends vDR implements r37 {
    private static final T23 zza;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = "";
    private d27 zzi = w37.z;

    static {
        T23 t23 = new T23();
        zza = t23;
        vDR.m(T23.class, t23);
    }

    public static T23 t() {
        return zza;
    }

    public final int A() {
        int iV0 = ps0.v0(this.zzf);
        if (iV0 == 0) {
            return 1;
        }
        return iV0;
    }

    @Override // com.google.android.gms.internal.measurement.vDR
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new x37(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", ri6.a, "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new T23();
        }
        if (i2 == 4) {
            return new ni6();
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int r() {
        return this.zzi.size();
    }

    public final String u() {
        return this.zzg;
    }

    public final d27 v() {
        return this.zzi;
    }

    public final boolean w() {
        return this.zzh;
    }

    public final boolean x() {
        return (this.zze & 4) != 0;
    }

    public final boolean y() {
        return (this.zze & 2) != 0;
    }

    public final boolean z() {
        return (this.zze & 1) != 0;
    }
}
