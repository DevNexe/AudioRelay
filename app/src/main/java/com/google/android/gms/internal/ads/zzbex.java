package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import defpackage.e46;
import defpackage.qu6;
import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbex extends zzgon implements zzgpy {
    private static final zzbex zzb;
    private int zze;
    private int zzf;
    private int zzg = AdError.NETWORK_ERROR_CODE;
    private zzbfn zzh;
    private zzbfp zzi;
    private zzgow zzj;
    private zzbfr zzk;
    private zzbhb zzl;
    private zzbgr zzm;
    private zzbgf zzn;
    private zzbgh zzo;
    private zzgow zzp;

    static {
        zzbex zzbexVar = new zzbex();
        zzb = zzbexVar;
        zzgon.i(zzbex.class, zzbexVar);
    }

    public zzbex() {
        qu6 qu6Var = qu6.z;
        this.zzj = qu6Var;
        this.zzp = qu6Var;
    }

    public static /* synthetic */ void m(zzbex zzbexVar, zzbev zzbevVar) {
        zzbexVar.zzf = zzbevVar.zza();
        zzbexVar.zze |= 1;
    }

    public static /* synthetic */ void n(zzbex zzbexVar, zzbfp zzbfpVar) {
        zzbfpVar.getClass();
        zzbexVar.zzi = zzbfpVar;
        zzbexVar.zze |= 8;
    }

    public static zzbex zzc() {
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
            return new ru6(zzb, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zze", "zzf", zzbev.zzc(), "zzg", e46.a, "zzh", "zzi", "zzj", zzbfl.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", zzbhn.class});
        }
        if (i2 == 3) {
            return new zzbex();
        }
        if (i2 == 4) {
            return new zzbew(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzbfp zzd() {
        zzbfp zzbfpVar = this.zzi;
        return zzbfpVar == null ? zzbfp.zzc() : zzbfpVar;
    }
}
