package com.google.android.gms.internal.ads;

import defpackage.e46;
import defpackage.ru6;
import defpackage.yt6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbgf extends zzgon implements zzgpy {
    private static final zzbgf zzb;
    private int zze;
    private int zzf;
    private zzgos zzg = yt6.z;

    static {
        zzbgf zzbgfVar = new zzbgf();
        zzb = zzbgfVar;
        zzgon.i(zzbgf.class, zzbgfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u0016", new Object[]{"zze", "zzf", e46.a, "zzg"});
        }
        if (i2 == 3) {
            return new zzbgf();
        }
        if (i2 == 4) {
            return new zzbge(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
