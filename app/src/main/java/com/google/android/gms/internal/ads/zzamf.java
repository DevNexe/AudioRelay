package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzamf extends zzgon implements zzgpy {
    private static final zzamf zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        zzamf zzamfVar = new zzamf();
        zzb = zzamfVar;
        zzgon.i(zzamf.class, zzamfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzamf();
        }
        if (i2 == 4) {
            return new zzame(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
