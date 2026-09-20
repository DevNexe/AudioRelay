package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgtm extends zzgon implements zzgpy {
    private static final zzgtm zzb;
    private int zze;
    private String zzf = "";
    private zzgnf zzg = zzgnf.zzb;

    static {
        zzgtm zzgtmVar = new zzgtm();
        zzb = zzgtmVar;
        zzgon.i(zzgtm.class, zzgtmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgtm();
        }
        if (i2 == 4) {
            return new zzgtl(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
