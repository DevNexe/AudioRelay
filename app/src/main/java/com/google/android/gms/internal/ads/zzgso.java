package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgso extends zzgon implements zzgpy {
    private static final zzgso zzb;
    private int zze;
    private zzgsn zzg;
    private long zzh;
    private String zzf = "";
    private String zzi = "";

    static {
        zzgso zzgsoVar = new zzgso();
        zzb = zzgsoVar;
        zzgon.i(zzgso.class, zzgsoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzgso();
        }
        if (i2 == 4) {
            return new zzgsl(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
