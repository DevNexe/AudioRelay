package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzang extends zzgon implements zzgpy {
    private static final zzang zzb;
    private int zze;
    private long zzf;
    private String zzg = "";
    private zzgnf zzh = zzgnf.zzb;

    static {
        zzang zzangVar = new zzang();
        zzb = zzangVar;
        zzgon.i(zzang.class, zzangVar);
    }

    public static zzang zzd() {
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
            return new ru6(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzang();
        }
        if (i2 == 4) {
            return new zzanf(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final long zza() {
        return this.zzf;
    }

    public final boolean zze() {
        return (this.zze & 1) != 0;
    }
}
