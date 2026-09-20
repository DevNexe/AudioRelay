package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzamw extends zzgon implements zzgpy {
    private static final zzamw zzb;
    private int zze;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;
    private long zzm = -1;

    static {
        zzamw zzamwVar = new zzamw();
        zzb = zzamwVar;
        zzgon.i(zzamw.class, zzamwVar);
    }

    public static /* synthetic */ void n(zzamw zzamwVar, long j) {
        zzamwVar.zze |= 1;
        zzamwVar.zzf = j;
    }

    public static /* synthetic */ void o(zzamw zzamwVar, long j) {
        zzamwVar.zze |= 4;
        zzamwVar.zzh = j;
    }

    public static /* synthetic */ void p(zzamw zzamwVar, long j) {
        zzamwVar.zze |= 8;
        zzamwVar.zzi = j;
    }

    public static /* synthetic */ void q(zzamw zzamwVar, long j) {
        zzamwVar.zze |= 16;
        zzamwVar.zzj = j;
    }

    public static /* synthetic */ void r(zzamw zzamwVar, long j) {
        zzamwVar.zze |= 32;
        zzamwVar.zzk = j;
    }

    public static zzamv zza() {
        return (zzamv) zzb.j();
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new zzamw();
        }
        if (i2 == 4) {
            return new zzamv(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
