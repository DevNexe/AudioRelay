package com.google.android.gms.internal.ads;

import defpackage.my5;
import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzamq extends zzgon implements zzgpy {
    private static final zzamq zzb;
    private int zze;
    private int zzf;
    private long zzg = -1;

    static {
        zzamq zzamqVar = new zzamq();
        zzb = zzamqVar;
        zzgon.i(zzamq.class, zzamqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", my5.a, "zzg"});
        }
        if (i2 == 3) {
            return new zzamq();
        }
        if (i2 == 4) {
            return new zzamp(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
