package com.google.android.gms.internal.ads;

import defpackage.lt6;
import defpackage.pu6;
import defpackage.ru6;
import defpackage.wu6;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaru extends zzgon implements zzgpy {
    private static final zzaru zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private long zzi;
    private long zzj;

    static {
        zzaru zzaruVar = new zzaru();
        zzb = zzaruVar;
        zzgon.i(zzaru.class, zzaruVar);
    }

    public static /* synthetic */ void n(zzaru zzaruVar, String str) {
        str.getClass();
        zzaruVar.zze |= 1;
        zzaruVar.zzf = str;
    }

    public static /* synthetic */ void o(zzaru zzaruVar, long j) {
        zzaruVar.zze |= 16;
        zzaruVar.zzj = j;
    }

    public static /* synthetic */ void p(zzaru zzaruVar, String str) {
        str.getClass();
        zzaruVar.zze |= 2;
        zzaruVar.zzg = str;
    }

    public static /* synthetic */ void q(zzaru zzaruVar, long j) {
        zzaruVar.zze |= 4;
        zzaruVar.zzh = j;
    }

    public static /* synthetic */ void r(zzaru zzaruVar, long j) {
        zzaruVar.zze |= 8;
        zzaruVar.zzi = j;
    }

    public static zzart zze() {
        return (zzart) zzb.j();
    }

    public static zzaru zzg() {
        return zzb;
    }

    public static zzaru zzh(zzgnf zzgnfVar) throws zzgoz {
        zzaru zzaruVar = zzb;
        zzgnz zzgnzVarZza = zzgnz.zza();
        zzgnn zzgnnVarZzl = zzgnfVar.zzl();
        zzgon zzgonVar = (zzgon) zzaruVar.k(4, null);
        try {
            wu6 wu6VarA = pu6.c.a(zzgonVar.getClass());
            lt6 lt6Var = zzgnnVarZzl.b;
            if (lt6Var == null) {
                lt6Var = new lt6(zzgnnVarZzl);
            }
            wu6VarA.f(zzgonVar, lt6Var, zzgnzVarZza);
            wu6VarA.zzf(zzgonVar);
            try {
                zzgnnVarZzl.zzz(0);
                zzgon.d(zzgonVar);
                zzgon.d(zzgonVar);
                return (zzaru) zzgonVar;
            } catch (zzgoz e) {
                e.zzh(zzgonVar);
                throw e;
            }
        } catch (zzgoz e2) {
            e = e2;
            if (e.x) {
                e = new zzgoz(e);
            }
            e.zzh(zzgonVar);
            throw e;
        } catch (zzgrg e3) {
            zzgoz zzgozVarZza = e3.zza();
            zzgozVarZza.zzh(zzgonVar);
            throw zzgozVarZza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzgoz) {
                throw ((zzgoz) e4.getCause());
            }
            zzgoz zzgozVar = new zzgoz(e4);
            zzgozVar.zzh(zzgonVar);
            throw zzgozVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzgoz) {
                throw ((zzgoz) e5.getCause());
            }
            throw e5;
        }
    }

    public static zzaru zzi(zzgnf zzgnfVar, zzgnz zzgnzVar) {
        return (zzaru) zzgon.f(zzb, zzgnfVar, zzgnzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzaru();
        }
        if (i2 == 4) {
            return new zzart(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final long zza() {
        return this.zzi;
    }

    public final long zzc() {
        return this.zzh;
    }

    public final long zzd() {
        return this.zzj;
    }

    public final String zzj() {
        return this.zzg;
    }

    public final String zzk() {
        return this.zzf;
    }
}
