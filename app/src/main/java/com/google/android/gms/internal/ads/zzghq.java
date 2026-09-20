package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzghq extends zzgon implements zzgpy {
    private static final zzghq zzb;
    private zzght zze;

    static {
        zzghq zzghqVar = new zzghq();
        zzb = zzghqVar;
        zzgon.i(zzghq.class, zzghqVar);
    }

    public static /* synthetic */ void n(zzghq zzghqVar, zzght zzghtVar) {
        zzghtVar.getClass();
        zzghqVar.zze = zzghtVar;
    }

    public static zzghp zza() {
        return (zzghp) zzb.j();
    }

    public static zzghq zzd(zzgnf zzgnfVar, zzgnz zzgnzVar) {
        return (zzghq) zzgon.f(zzb, zzgnfVar, zzgnzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzghq();
        }
        if (i2 == 4) {
            return new zzghp(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzght zze() {
        zzght zzghtVar = this.zze;
        return zzghtVar == null ? zzght.zze() : zzghtVar;
    }
}
