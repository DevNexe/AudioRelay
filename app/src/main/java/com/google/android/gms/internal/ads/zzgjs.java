package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgjs extends zzgon implements zzgpy {
    private static final zzgjs zzb;
    private zzgjg zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzgjs zzgjsVar = new zzgjs();
        zzb = zzgjsVar;
        zzgon.i(zzgjs.class, zzgjsVar);
    }

    public static /* synthetic */ void n(zzgjs zzgjsVar, zzgjg zzgjgVar) {
        zzgjgVar.getClass();
        zzgjsVar.zze = zzgjgVar;
    }

    public static zzgjr zzd() {
        return (zzgjr) zzb.j();
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzgjs();
        }
        if (i2 == 4) {
            return new zzgjr(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zza() {
        return this.zzg;
    }

    public final zzgjg zzc() {
        zzgjg zzgjgVar = this.zze;
        return zzgjgVar == null ? zzgjg.zzd() : zzgjgVar;
    }

    public final boolean zzh() {
        return this.zze != null;
    }

    public final int zzi() {
        int i = this.zzf;
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

    public final int zzj() {
        int iZzb = zzgkm.zzb(this.zzh);
        if (iZzb == 0) {
            return 1;
        }
        return iZzb;
    }
}
