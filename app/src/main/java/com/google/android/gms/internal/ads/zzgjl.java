package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgjl extends zzgon implements zzgpy {
    private static final zzgjl zzb;
    private String zze = "";
    private zzgnf zzf = zzgnf.zzb;
    private int zzg;

    static {
        zzgjl zzgjlVar = new zzgjl();
        zzb = zzgjlVar;
        zzgon.i(zzgjl.class, zzgjlVar);
    }

    public static /* synthetic */ void n(zzgjl zzgjlVar, String str) {
        str.getClass();
        zzgjlVar.zze = str;
    }

    public static zzgjk zza() {
        return (zzgjk) zzb.j();
    }

    public static zzgjl zzd() {
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
            return new zzgjl();
        }
        if (i2 == 4) {
            return new zzgjk(i3);
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
        int iZzb = zzgkm.zzb(this.zzg);
        if (iZzb == 0) {
            return 1;
        }
        return iZzb;
    }
}
