package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import defpackage.ru6;
import defpackage.sy5;

/* JADX INFO: loaded from: classes3.dex */
public final class zzams extends zzgon implements zzgpy {
    private static final zzams zzb;
    private int zze;
    private long zzf = -1;
    private int zzg = AdError.NETWORK_ERROR_CODE;

    static {
        zzams zzamsVar = new zzams();
        zzb = zzamsVar;
        zzgon.i(zzams.class, zzamsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", "zzg", sy5.a});
        }
        if (i2 == 3) {
            return new zzams();
        }
        if (i2 == 4) {
            return new zzamr(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
