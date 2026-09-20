package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgja extends zzgon implements zzgpy {
    private static final zzgja zzb;
    private int zze;
    private zzgjd zzf;
    private zzgnf zzg = zzgnf.zzb;

    static {
        zzgja zzgjaVar = new zzgja();
        zzb = zzgjaVar;
        zzgon.i(zzgja.class, zzgjaVar);
    }

    public static /* synthetic */ void o(zzgja zzgjaVar, zzgjd zzgjdVar) {
        zzgjdVar.getClass();
        zzgjaVar.zzf = zzgjdVar;
    }

    public static zzgiz zzc() {
        return (zzgiz) zzb.j();
    }

    public static zzgja zze(zzgnf zzgnfVar, zzgnz zzgnzVar) {
        return (zzgja) zzgon.f(zzb, zzgnfVar, zzgnzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgja();
        }
        if (i2 == 4) {
            return new zzgiz(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzgjd zzf() {
        zzgjd zzgjdVar = this.zzf;
        return zzgjdVar == null ? zzgjd.zzf() : zzgjdVar;
    }

    public final zzgnf zzg() {
        return this.zzg;
    }

    public final boolean zzk() {
        return this.zzf != null;
    }
}
