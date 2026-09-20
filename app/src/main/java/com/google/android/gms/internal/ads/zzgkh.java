package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgkh extends zzgon implements zzgpy {
    private static final zzgkh zzb;
    private int zze;
    private zzgkk zzf;

    static {
        zzgkh zzgkhVar = new zzgkh();
        zzb = zzgkhVar;
        zzgon.i(zzgkh.class, zzgkhVar);
    }

    public static /* synthetic */ void o(zzgkh zzgkhVar, zzgkk zzgkkVar) {
        zzgkkVar.getClass();
        zzgkhVar.zzf = zzgkkVar;
    }

    public static zzgkg zzc() {
        return (zzgkg) zzb.j();
    }

    public static zzgkh zze(zzgnf zzgnfVar, zzgnz zzgnzVar) {
        return (zzgkh) zzgon.f(zzb, zzgnfVar, zzgnzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgkh();
        }
        if (i2 == 4) {
            return new zzgkg(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzgkk zzf() {
        zzgkk zzgkkVar = this.zzf;
        return zzgkkVar == null ? zzgkk.zzd() : zzgkkVar;
    }
}
