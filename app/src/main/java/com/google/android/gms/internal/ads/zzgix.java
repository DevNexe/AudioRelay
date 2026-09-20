package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgix extends zzgon implements zzgpy {
    private static final zzgix zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzgix zzgixVar = new zzgix();
        zzb = zzgixVar;
        zzgon.i(zzgix.class, zzgixVar);
    }

    public static zzgiw zza() {
        return (zzgiw) zzb.j();
    }

    public static zzgix zzd() {
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
            return new ru6(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgix();
        }
        if (i2 == 4) {
            return new zzgiw(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zze() {
        int i = this.zzg;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                i2 = 3;
            } else if (i != 2) {
                i2 = i != 3 ? 0 : 5;
            } else {
                i2 = 4;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzf() {
        int i;
        int i2 = this.zzf;
        if (i2 != 0) {
            i = i2 != 1 ? 0 : 3;
        } else {
            i = 2;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int zzg() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = i2 != 1 ? 0 : 3;
        } else {
            i = 2;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
