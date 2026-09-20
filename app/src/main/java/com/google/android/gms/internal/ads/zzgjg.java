package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgjg extends zzgon implements zzgpy {
    private static final zzgjg zzb;
    private String zze = "";
    private zzgnf zzf = zzgnf.zzb;
    private int zzg;

    static {
        zzgjg zzgjgVar = new zzgjg();
        zzb = zzgjgVar;
        zzgon.i(zzgjg.class, zzgjgVar);
    }

    public static zzgjf zza() {
        return (zzgjf) zzb.j();
    }

    public static zzgjg zzd() {
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
            return new ru6(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgjg();
        }
        if (i2 == 4) {
            return new zzgjf(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgnf zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    public final int zzi() {
        int i = this.zzg;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                i2 = 3;
            } else if (i == 2) {
                i2 = 4;
            } else if (i != 3) {
                i2 = i != 4 ? 0 : 6;
            } else {
                i2 = 5;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
