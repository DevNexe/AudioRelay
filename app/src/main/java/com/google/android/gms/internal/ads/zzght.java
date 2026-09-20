package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzght extends zzgon implements zzgpy {
    private static final zzght zzb;
    private zzgic zze;
    private zzghn zzf;
    private int zzg;

    static {
        zzght zzghtVar = new zzght();
        zzb = zzghtVar;
        zzgon.i(zzght.class, zzghtVar);
    }

    public static /* synthetic */ void n(zzght zzghtVar, zzgic zzgicVar) {
        zzgicVar.getClass();
        zzghtVar.zze = zzgicVar;
    }

    public static /* synthetic */ void o(zzght zzghtVar, zzghn zzghnVar) {
        zzghnVar.getClass();
        zzghtVar.zzf = zzghnVar;
    }

    public static zzghs zzc() {
        return (zzghs) zzb.j();
    }

    public static zzght zze() {
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
            return new ru6(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzght();
        }
        if (i2 == 4) {
            return new zzghs(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzghn zza() {
        zzghn zzghnVar = this.zzf;
        return zzghnVar == null ? zzghn.zzd() : zzghnVar;
    }

    public final zzgic zzf() {
        zzgic zzgicVar = this.zze;
        return zzgicVar == null ? zzgic.zzd() : zzgicVar;
    }

    public final int zzi() {
        int i = this.zzg;
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
}
