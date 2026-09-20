package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import defpackage.e46;
import defpackage.eu6;
import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbgb extends zzgon implements zzgpy {
    private static final zzbgb zzb;
    private int zze;
    private int zzf;
    private int zzh;
    private zzbhl zzj;
    private zzbft zzl;
    private zzbfw zzm;
    private zzbgp zzn;
    private zzbex zzo;
    private zzbgz zzp;
    private zzbig zzq;
    private zzbfg zzr;
    private String zzg = "";
    private int zzi = AdError.NETWORK_ERROR_CODE;
    private zzgov zzk = eu6.z;

    static {
        zzbgb zzbgbVar = new zzbgb();
        zzb = zzbgbVar;
        zzgon.i(zzbgb.class, zzbgbVar);
    }

    public static /* synthetic */ void n(zzbgb zzbgbVar, String str) {
        str.getClass();
        zzbgbVar.zze |= 2;
        zzbgbVar.zzg = str;
    }

    public static /* synthetic */ void o(zzbgb zzbgbVar, Iterable iterable) {
        zzgov zzgovVar = zzbgbVar.zzk;
        if (!zzgovVar.zzc()) {
            int size = zzgovVar.size();
            zzbgbVar.zzk = zzgovVar.zzd(size == 0 ? 10 : size + size);
        }
        zzgmo.b(iterable, zzbgbVar.zzk);
    }

    public static void p(zzbgb zzbgbVar) {
        zzbgbVar.zzk = eu6.z;
    }

    public static /* synthetic */ void q(zzbgb zzbgbVar, zzbft zzbftVar) {
        zzbftVar.getClass();
        zzbgbVar.zzl = zzbftVar;
        zzbgbVar.zze |= 32;
    }

    public static /* synthetic */ void r(zzbgb zzbgbVar, zzbex zzbexVar) {
        zzbexVar.getClass();
        zzbgbVar.zzo = zzbexVar;
        zzbgbVar.zze |= 256;
    }

    public static /* synthetic */ void s(zzbgb zzbgbVar, zzbgz zzbgzVar) {
        zzbgzVar.getClass();
        zzbgbVar.zzp = zzbgzVar;
        zzbgbVar.zze |= AdRequest.MAX_CONTENT_URL_LENGTH;
    }

    public static /* synthetic */ void t(zzbgb zzbgbVar, zzbig zzbigVar) {
        zzbigVar.getClass();
        zzbgbVar.zzq = zzbigVar;
        zzbgbVar.zze |= 1024;
    }

    public static /* synthetic */ void u(zzbgb zzbgbVar, zzbfg zzbfgVar) {
        zzbfgVar.getClass();
        zzbgbVar.zzr = zzbfgVar;
        zzbgbVar.zze |= 2048;
    }

    public static zzbga zzd() {
        return (zzbga) zzb.j();
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", e46.a, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        if (i2 == 3) {
            return new zzbgb();
        }
        if (i2 == 4) {
            return new zzbga(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzbex zza() {
        zzbex zzbexVar = this.zzo;
        return zzbexVar == null ? zzbex.zzc() : zzbexVar;
    }

    public final zzbft zzc() {
        zzbft zzbftVar = this.zzl;
        return zzbftVar == null ? zzbft.zzc() : zzbftVar;
    }

    public final String zzf() {
        return this.zzg;
    }
}
