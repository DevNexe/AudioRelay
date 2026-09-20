package com.google.android.gms.internal.ads;

import defpackage.fy5;
import defpackage.qu6;
import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzalx extends zzgon implements zzgpy {
    private static final zzalx zzb;
    private int zze;
    private long zzg;
    private long zzk;
    private long zzl;
    private long zzn;
    private int zzr;
    private String zzf = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzm = "";
    private String zzo = "";
    private String zzp = "";
    private zzgow zzq = qu6.z;

    static {
        zzalx zzalxVar = new zzalx();
        zzb = zzalxVar;
        zzgon.i(zzalx.class, zzalxVar);
    }

    public static /* synthetic */ void n(zzalx zzalxVar, long j) {
        zzalxVar.zze |= 2;
        zzalxVar.zzg = j;
    }

    public static /* synthetic */ void o(zzalx zzalxVar, String str) {
        str.getClass();
        zzalxVar.zze |= 4;
        zzalxVar.zzh = str;
    }

    public static /* synthetic */ void p(zzalx zzalxVar, String str) {
        str.getClass();
        zzalxVar.zze |= 8;
        zzalxVar.zzi = str;
    }

    public static /* synthetic */ void q(zzalx zzalxVar, String str) {
        zzalxVar.zze |= 16;
        zzalxVar.zzj = str;
    }

    public static /* synthetic */ void r(zzalx zzalxVar, String str) {
        zzalxVar.zze |= 1024;
        zzalxVar.zzp = str;
    }

    public static /* synthetic */ void s(zzalx zzalxVar, String str) {
        str.getClass();
        zzalxVar.zze |= 1;
        zzalxVar.zzf = str;
    }

    public static /* synthetic */ void t(zzalx zzalxVar, int i) {
        zzalxVar.zzr = i - 1;
        zzalxVar.zze |= 2048;
    }

    public static zzalt zza() {
        return (zzalt) zzb.j();
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", zzalv.class, "zzr", fy5.a});
        }
        if (i2 == 3) {
            return new zzalx();
        }
        if (i2 == 4) {
            return new zzalt(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
