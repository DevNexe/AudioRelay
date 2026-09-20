package com.google.android.gms.internal.ads;

import defpackage.bw6;
import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgtj extends zzgon implements zzgpy {
    private static final zzgtj zzb;
    private int zze;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private String zzf = "";
    private String zzj = "";
    private String zzk = "";

    static {
        zzgtj zzgtjVar = new zzgtj();
        zzb = zzgtjVar;
        zzgon.i(zzgtj.class, zzgtjVar);
    }

    public static /* synthetic */ void n(zzgtj zzgtjVar, String str) {
        zzgtjVar.zze |= 1;
        zzgtjVar.zzf = str;
    }

    public static /* synthetic */ void o(zzgtj zzgtjVar, long j) {
        zzgtjVar.zze |= 2;
        zzgtjVar.zzg = j;
    }

    public static /* synthetic */ void p(zzgtj zzgtjVar, boolean z) {
        zzgtjVar.zze |= 4;
        zzgtjVar.zzh = z;
    }

    public static zzgti zza() {
        return (zzgti) zzb.j();
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", bw6.a, "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzgtj();
        }
        if (i2 == 4) {
            return new zzgti(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
