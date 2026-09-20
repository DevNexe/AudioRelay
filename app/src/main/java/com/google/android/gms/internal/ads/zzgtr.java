package com.google.android.gms.internal.ads;

import defpackage.qu6;
import defpackage.ru6;
import defpackage.yt6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgtr extends zzgon implements zzgpy {
    private static final zzgtr zzb;
    private int zze;
    private int zzf;
    private int zzi;
    private String zzg = "";
    private zzgos zzh = yt6.z;
    private zzgow zzj = qu6.z;
    private zzgnf zzk = zzgnf.zzb;

    static {
        zzgtr zzgtrVar = new zzgtr();
        zzb = zzgtrVar;
        zzgon.i(zzgtr.class, zzgtrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzgtp.class, "zzk"});
        }
        if (i2 == 3) {
            return new zzgtr();
        }
        if (i2 == 4) {
            return new zzgtq(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
