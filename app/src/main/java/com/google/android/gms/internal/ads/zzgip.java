package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgip extends zzgon implements zzgpy {
    private static final zzgip zzb;
    private int zze;
    private int zzf;

    static {
        zzgip zzgipVar = new zzgip();
        zzb = zzgipVar;
        zzgon.i(zzgip.class, zzgipVar);
    }

    public static zzgio zzc() {
        return (zzgio) zzb.j();
    }

    public static zzgip zze() {
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
            return new ru6(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgip();
        }
        if (i2 == 4) {
            return new zzgio(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zza() {
        return this.zzf;
    }

    public final int zzg() {
        int iZzb = zzgig.zzb(this.zze);
        if (iZzb == 0) {
            return 1;
        }
        return iZzb;
    }
}
