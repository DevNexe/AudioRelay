package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfjh extends zzgon implements zzgpy {
    private static final zzfjh zzb;
    private int zze;
    private boolean zzf;
    private long zzg;
    private int zzh;
    private int zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private int zzp;
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";
    private String zzt = "";
    private String zzu = "";

    static {
        zzfjh zzfjhVar = new zzfjh();
        zzb = zzfjhVar;
        zzgon.i(zzfjh.class, zzfjhVar);
    }

    public static /* synthetic */ void B(zzfjh zzfjhVar, int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzfjhVar.zzm = i - 2;
    }

    public static /* synthetic */ void C(zzfjh zzfjhVar, int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzfjhVar.zzp = i - 2;
    }

    public static /* synthetic */ void n(zzfjh zzfjhVar, String str) {
        str.getClass();
        zzfjhVar.zzi = str;
    }

    public static /* synthetic */ void o(zzfjh zzfjhVar, String str) {
        str.getClass();
        zzfjhVar.zzj = str;
    }

    public static /* synthetic */ void p(zzfjh zzfjhVar, String str) {
        str.getClass();
        zzfjhVar.zzk = str;
    }

    public static /* synthetic */ void t(zzfjh zzfjhVar, String str) {
        str.getClass();
        zzfjhVar.zzq = str;
    }

    public static /* synthetic */ void u(zzfjh zzfjhVar, String str) {
        str.getClass();
        zzfjhVar.zzr = str;
    }

    public static /* synthetic */ void v(zzfjh zzfjhVar, String str) {
        str.getClass();
        zzfjhVar.zzs = str;
    }

    public static /* synthetic */ void y(zzfjh zzfjhVar, String str) {
        str.getClass();
        zzfjhVar.zzu = str;
    }

    public static zzfjg zza() {
        return (zzfjg) zzb.j();
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0000\u0011\u0000\u0000\u0001\u0011\u0011\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        }
        if (i2 == 3) {
            return new zzfjh();
        }
        if (i2 == 4) {
            return new zzfjg(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
