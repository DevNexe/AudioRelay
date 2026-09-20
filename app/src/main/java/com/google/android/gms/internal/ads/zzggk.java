package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzggk extends zzgon implements zzgpy {
    private static final zzggk zzb;
    private int zze;

    static {
        zzggk zzggkVar = new zzggk();
        zzb = zzggkVar;
        zzgon.i(zzggk.class, zzggkVar);
    }

    public static zzggj zzc() {
        return (zzggj) zzb.j();
    }

    public static zzggk zze() {
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
            return new zzggk();
        }
        if (i2 == 4) {
            return new zzggj(i3);
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
