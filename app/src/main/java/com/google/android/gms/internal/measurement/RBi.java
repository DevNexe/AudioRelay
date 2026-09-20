package com.google.android.gms.internal.measurement;

import defpackage.r37;
import defpackage.x37;
import defpackage.xh6;

/* JADX INFO: loaded from: classes3.dex */
public final class RBi extends vDR implements r37 {
    private static final RBi zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";

    static {
        RBi rBi = new RBi();
        zza = rBi;
        vDR.m(RBi.class, rBi);
    }

    @Override // com.google.android.gms.internal.measurement.vDR
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new x37(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new RBi();
        }
        Object obj = null;
        if (i2 == 4) {
            return new xh6(obj);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }
}
