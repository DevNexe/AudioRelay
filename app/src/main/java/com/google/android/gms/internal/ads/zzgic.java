package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgic extends zzgon implements zzgpy {
    private static final zzgic zzb;
    private int zze;
    private int zzf;
    private zzgnf zzg = zzgnf.zzb;

    static {
        zzgic zzgicVar = new zzgic();
        zzb = zzgicVar;
        zzgon.i(zzgic.class, zzgicVar);
    }

    public static zzgib zza() {
        return (zzgib) zzb.j();
    }

    public static zzgic zzd() {
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
            return new ru6(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgic();
        }
        if (i2 == 4) {
            return new zzgib(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgnf zze() {
        return this.zzg;
    }

    public final int zzg() {
        int i = this.zze;
        int i2 = 2;
        if (i != 0) {
            if (i == 2) {
                i2 = 4;
            } else if (i == 3) {
                i2 = 5;
            } else if (i != 4) {
                i2 = i != 5 ? 0 : 7;
            } else {
                i2 = 6;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzh() {
        int iZzb = zzgig.zzb(this.zzf);
        if (iZzb == 0) {
            return 1;
        }
        return iZzb;
    }
}
