package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgiu extends zzgon implements zzgpy {
    private static final zzgiu zzb;
    private zzgix zze;

    static {
        zzgiu zzgiuVar = new zzgiu();
        zzb = zzgiuVar;
        zzgon.i(zzgiu.class, zzgiuVar);
    }

    public static /* synthetic */ void n(zzgiu zzgiuVar, zzgix zzgixVar) {
        zzgixVar.getClass();
        zzgiuVar.zze = zzgixVar;
    }

    public static zzgit zza() {
        return (zzgit) zzb.j();
    }

    public static zzgiu zzd(zzgnf zzgnfVar, zzgnz zzgnzVar) {
        return (zzgiu) zzgon.f(zzb, zzgnfVar, zzgnzVar);
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
            return new zzgiu();
        }
        if (i2 == 4) {
            return new zzgit(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgix zze() {
        zzgix zzgixVar = this.zze;
        return zzgixVar == null ? zzgix.zzd() : zzgixVar;
    }
}
