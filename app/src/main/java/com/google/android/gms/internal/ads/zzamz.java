package com.google.android.gms.internal.ads;

import defpackage.ru6;
import defpackage.yt6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzamz extends zzgon implements zzgpy {
    private static final zzamz zzb;
    private int zze;
    private long zzf;
    private int zzg;
    private boolean zzh;
    private zzgos zzi = yt6.z;
    private long zzj;

    static {
        zzamz zzamzVar = new zzamz();
        zzb = zzamzVar;
        zzgon.i(zzamz.class, zzamzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzamz();
        }
        if (i2 == 4) {
            return new zzamy(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
