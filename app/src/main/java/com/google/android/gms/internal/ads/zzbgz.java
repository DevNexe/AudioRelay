package com.google.android.gms.internal.ads;

import defpackage.qu6;
import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbgz extends zzgon implements zzgpy {
    private static final zzbgz zzb;
    private int zze;
    private int zzg;
    private int zzh;
    private long zzi;
    private long zzl;
    private int zzm;
    private zzgow zzf = qu6.z;
    private String zzj = "";
    private String zzk = "";

    static {
        zzbgz zzbgzVar = new zzbgz();
        zzb = zzbgzVar;
        zzgon.i(zzbgz.class, zzbgzVar);
    }

    public static /* synthetic */ void n(zzbgz zzbgzVar, Iterable iterable) {
        zzgow zzgowVar = zzbgzVar.zzf;
        if (!zzgowVar.zzc()) {
            zzbgzVar.zzf = zzgon.g(zzgowVar);
        }
        zzgmo.b(iterable, zzbgzVar.zzf);
    }

    public static /* synthetic */ void o(zzbgz zzbgzVar, int i) {
        zzbgzVar.zze |= 1;
        zzbgzVar.zzg = i;
    }

    public static /* synthetic */ void p(zzbgz zzbgzVar, int i) {
        zzbgzVar.zze |= 2;
        zzbgzVar.zzh = i;
    }

    public static /* synthetic */ void q(zzbgz zzbgzVar, long j) {
        zzbgzVar.zze |= 4;
        zzbgzVar.zzi = j;
    }

    public static /* synthetic */ void r(zzbgz zzbgzVar, String str) {
        str.getClass();
        zzbgzVar.zze |= 8;
        zzbgzVar.zzj = str;
    }

    public static /* synthetic */ void s(zzbgz zzbgzVar, String str) {
        str.getClass();
        zzbgzVar.zze |= 16;
        zzbgzVar.zzk = str;
    }

    public static /* synthetic */ void t(zzbgz zzbgzVar, long j) {
        zzbgzVar.zze |= 32;
        zzbgzVar.zzl = j;
    }

    public static /* synthetic */ void u(zzbgz zzbgzVar, int i) {
        zzbgzVar.zze |= 64;
        zzbgzVar.zzm = i;
    }

    public static zzbgv zza() {
        return (zzbgv) zzb.j();
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zze", "zzf", zzbgu.class, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new zzbgz();
        }
        if (i2 == 4) {
            return new zzbgv(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
