package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgfm extends zzgon implements zzgpy {
    private static final zzgfm zzb;
    private int zze;

    static {
        zzgfm zzgfmVar = new zzgfm();
        zzb = zzgfmVar;
        zzgon.i(zzgfm.class, zzgfmVar);
    }

    public static zzgfl zzc() {
        return (zzgfl) zzb.j();
    }

    public static zzgfm zze() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzgfm();
        }
        if (i2 == 4) {
            return new zzgfl(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }
}
