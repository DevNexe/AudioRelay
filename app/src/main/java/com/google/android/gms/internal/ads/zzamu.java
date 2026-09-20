package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import defpackage.ru6;
import defpackage.sy5;

/* JADX INFO: loaded from: classes3.dex */
public final class zzamu extends zzgon implements zzgpy {
    private static final zzamu zzb;
    private int zze;
    private long zzu;
    private long zzv;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private int zzl = AdError.NETWORK_ERROR_CODE;
    private long zzm = -1;
    private long zzn = -1;
    private long zzo = -1;
    private int zzp = AdError.NETWORK_ERROR_CODE;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzt = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;
    private long zzz = -1;

    static {
        zzamu zzamuVar = new zzamu();
        zzb = zzamuVar;
        zzgon.i(zzamu.class, zzamuVar);
    }

    public static /* synthetic */ void A(zzamu zzamuVar, long j) {
        zzamuVar.zze |= 16384;
        zzamuVar.zzt = j;
    }

    public static /* synthetic */ void B(zzamu zzamuVar, long j) {
        zzamuVar.zze |= 32768;
        zzamuVar.zzu = j;
    }

    public static /* synthetic */ void C(zzamu zzamuVar, long j) {
        zzamuVar.zze |= 65536;
        zzamuVar.zzv = j;
    }

    public static /* synthetic */ void D(zzamu zzamuVar, long j) {
        zzamuVar.zze |= 131072;
        zzamuVar.zzw = j;
    }

    public static /* synthetic */ void E(zzamu zzamuVar, long j) {
        zzamuVar.zze |= 262144;
        zzamuVar.zzx = j;
    }

    public static /* synthetic */ void F(zzamu zzamuVar, int i) {
        zzamuVar.zzl = i - 1;
        zzamuVar.zze |= 64;
    }

    public static /* synthetic */ void G(zzamu zzamuVar, int i) {
        zzamuVar.zzp = i - 1;
        zzamuVar.zze |= 1024;
    }

    public static /* synthetic */ void n(zzamu zzamuVar, long j) {
        zzamuVar.zze |= 1;
        zzamuVar.zzf = j;
    }

    public static /* synthetic */ void o(zzamu zzamuVar, long j) {
        zzamuVar.zze |= 2;
        zzamuVar.zzg = j;
    }

    public static /* synthetic */ void p(zzamu zzamuVar, long j) {
        zzamuVar.zze |= 4;
        zzamuVar.zzh = j;
    }

    public static /* synthetic */ void q(zzamu zzamuVar, long j) {
        zzamuVar.zze |= 8;
        zzamuVar.zzi = j;
    }

    public static /* synthetic */ void r(zzamu zzamuVar) {
        zzamuVar.zze &= -9;
        zzamuVar.zzi = -1L;
    }

    public static /* synthetic */ void s(zzamu zzamuVar, long j) {
        zzamuVar.zze |= 16;
        zzamuVar.zzj = j;
    }

    public static /* synthetic */ void t(zzamu zzamuVar, long j) {
        zzamuVar.zze |= 32;
        zzamuVar.zzk = j;
    }

    public static /* synthetic */ void u(zzamu zzamuVar, long j) {
        zzamuVar.zze |= 128;
        zzamuVar.zzm = j;
    }

    public static /* synthetic */ void v(zzamu zzamuVar, long j) {
        zzamuVar.zze |= 256;
        zzamuVar.zzn = j;
    }

    public static /* synthetic */ void w(zzamu zzamuVar, long j) {
        zzamuVar.zze |= AdRequest.MAX_CONTENT_URL_LENGTH;
        zzamuVar.zzo = j;
    }

    public static /* synthetic */ void x(zzamu zzamuVar, long j) {
        zzamuVar.zze |= 2048;
        zzamuVar.zzq = j;
    }

    public static /* synthetic */ void y(zzamu zzamuVar, long j) {
        zzamuVar.zze |= 4096;
        zzamuVar.zzr = j;
    }

    public static /* synthetic */ void z(zzamu zzamuVar, long j) {
        zzamuVar.zze |= 8192;
        zzamuVar.zzs = j;
    }

    public static zzamt zza() {
        return (zzamt) zzb.j();
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            sy5 sy5Var = sy5.a;
            return new ru6(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", sy5Var, "zzm", "zzn", "zzo", "zzp", sy5Var, "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        }
        if (i2 == 3) {
            return new zzamu();
        }
        if (i2 == 4) {
            return new zzamt(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
