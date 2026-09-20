package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import defpackage.e46;
import defpackage.ru6;
import defpackage.xApe;
import defpackage.yt6;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbgu extends zzgon implements zzgpy {
    private static final zzgot zzb = new xApe();
    private static final zzbgu zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private long zzi;
    private long zzj;
    private zzgos zzk = yt6.z;
    private zzbgp zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private long zzs;

    static {
        zzbgu zzbguVar = new zzbgu();
        zze = zzbguVar;
        zzgon.i(zzbgu.class, zzbguVar);
    }

    public static /* synthetic */ void m(zzbgu zzbguVar, int i) {
        zzbguVar.zzn = i - 1;
        zzbguVar.zzf |= 64;
    }

    public static /* synthetic */ void n(zzbgu zzbguVar, int i) {
        zzbguVar.zzo = i - 1;
        zzbguVar.zzf |= 128;
    }

    public static /* synthetic */ void o(zzbgu zzbguVar, int i) {
        zzbguVar.zzq = i - 1;
        zzbguVar.zzf |= AdRequest.MAX_CONTENT_URL_LENGTH;
    }

    public static /* synthetic */ void q(zzbgu zzbguVar, long j) {
        zzbguVar.zzf |= 1;
        zzbguVar.zzg = j;
    }

    public static /* synthetic */ void r(zzbgu zzbguVar, long j) {
        zzbguVar.zzf |= 4;
        zzbguVar.zzi = j;
    }

    public static /* synthetic */ void s(zzbgu zzbguVar, long j) {
        zzbguVar.zzf |= 8;
        zzbguVar.zzj = j;
    }

    public static void t(zzbgu zzbguVar, Iterable iterable) {
        zzgos zzgosVar = zzbguVar.zzk;
        if (!zzgosVar.zzc()) {
            int size = zzgosVar.size();
            zzbguVar.zzk = zzgosVar.zzd(size == 0 ? 10 : size + size);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzbguVar.zzk.zzh(((zzbfj) it.next()).zza());
        }
    }

    public static /* synthetic */ void u(zzbgu zzbguVar, zzbgp zzbgpVar) {
        zzbgpVar.getClass();
        zzbguVar.zzl = zzbgpVar;
        zzbguVar.zzf |= 16;
    }

    public static /* synthetic */ void v(zzbgu zzbguVar, int i) {
        zzbguVar.zzf |= 256;
        zzbguVar.zzp = i;
    }

    public static /* synthetic */ void w(zzbgu zzbguVar, zzbgy zzbgyVar) {
        zzbguVar.zzr = zzbgyVar.zza();
        zzbguVar.zzf |= 1024;
    }

    public static /* synthetic */ void x(zzbgu zzbguVar, long j) {
        zzbguVar.zzf |= 2048;
        zzbguVar.zzs = j;
    }

    public static /* synthetic */ void y(zzbgu zzbguVar, int i) {
        zzbguVar.zzh = i - 1;
        zzbguVar.zzf |= 2;
    }

    public static /* synthetic */ void z(zzbgu zzbguVar, int i) {
        zzbguVar.zzm = i - 1;
        zzbguVar.zzf |= 32;
    }

    public static zzbgt zzg() {
        return (zzbgt) zze.j();
    }

    public static zzbgu zzi(byte[] bArr) {
        zzgon zzgonVarL = zzgon.l(zze, bArr, bArr.length, zzgnz.zza());
        zzgon.d(zzgonVarL);
        return (zzbgu) zzgonVarL;
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            e46 e46Var = e46.a;
            return new ru6(zze, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n\rဂ\u000b", new Object[]{"zzf", "zzg", "zzh", e46Var, "zzi", "zzj", "zzk", zzbfj.zzc(), "zzl", "zzm", e46Var, "zzn", e46Var, "zzo", e46Var, "zzp", "zzq", e46Var, "zzr", zzbgy.zzc(), "zzs"});
        }
        if (i2 == 3) {
            return new zzbgu();
        }
        if (i2 == 4) {
            return new zzbgt(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zze;
    }

    public final int zza() {
        return this.zzp;
    }

    public final long zzc() {
        return this.zzj;
    }

    public final long zzd() {
        return this.zzi;
    }

    public final long zze() {
        return this.zzg;
    }

    public final zzbgp zzf() {
        zzbgp zzbgpVar = this.zzl;
        return zzbgpVar == null ? zzbgp.zzd() : zzbgpVar;
    }

    public final zzbgy zzj() {
        zzbgy zzbgyVarZzb = zzbgy.zzb(this.zzr);
        return zzbgyVarZzb == null ? zzbgy.UNSPECIFIED : zzbgyVarZzb;
    }

    public final List zzk() {
        return new zzgou(this.zzk, zzb);
    }

    public final int zzt() {
        int iZza = zzbfz.zza(this.zzn);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzu() {
        int iZza = zzbfz.zza(this.zzo);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzv() {
        int iZza = zzbfz.zza(this.zzq);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzw() {
        int iZza = zzbfz.zza(this.zzh);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzx() {
        int iZza = zzbfz.zza(this.zzm);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }
}
