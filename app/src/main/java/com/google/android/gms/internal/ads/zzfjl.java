package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfjl extends zzgon implements zzgpy {
    private static final zzfjl zzb;
    private zzfjh zze;

    static {
        zzfjl zzfjlVar = new zzfjl();
        zzb = zzfjlVar;
        zzgon.i(zzfjl.class, zzfjlVar);
    }

    public static /* synthetic */ void n(zzfjl zzfjlVar, zzfjh zzfjhVar) {
        zzfjhVar.getClass();
        zzfjlVar.zze = zzfjhVar;
    }

    public static zzfjk zza() {
        return (zzfjk) zzb.j();
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0000\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0000\u0000\u0006\t", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzfjl();
        }
        if (i2 == 4) {
            return new zzfjk(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
