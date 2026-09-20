package com.google.android.gms.internal.ads;

import defpackage.lt6;
import defpackage.pu6;
import defpackage.qu6;
import defpackage.ru6;
import defpackage.wu6;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgjt extends zzgon implements zzgpy {
    private static final zzgjt zzb;
    private int zze;
    private zzgow zzf = qu6.z;

    static {
        zzgjt zzgjtVar = new zzgjt();
        zzb = zzgjtVar;
        zzgon.i(zzgjt.class, zzgjtVar);
    }

    public static /* synthetic */ void o(zzgjt zzgjtVar, zzgjs zzgjsVar) {
        zzgjsVar.getClass();
        zzgow zzgowVar = zzgjtVar.zzf;
        if (!zzgowVar.zzc()) {
            zzgjtVar.zzf = zzgon.g(zzgowVar);
        }
        zzgjtVar.zzf.add(zzgjsVar);
    }

    public static zzgjq zzd() {
        return (zzgjq) zzb.j();
    }

    public static zzgjt zzf(InputStream inputStream, zzgnz zzgnzVar) throws zzgoz {
        zzgjt zzgjtVar = zzb;
        zzgnn zzgnnVarZzH = zzgnn.zzH(inputStream, 4096);
        zzgon zzgonVar = (zzgon) zzgjtVar.k(4, null);
        try {
            wu6 wu6VarA = pu6.c.a(zzgonVar.getClass());
            lt6 lt6Var = zzgnnVarZzH.b;
            if (lt6Var == null) {
                lt6Var = new lt6(zzgnnVarZzH);
            }
            wu6VarA.f(zzgonVar, lt6Var, zzgnzVar);
            wu6VarA.zzf(zzgonVar);
            zzgon.d(zzgonVar);
            return (zzgjt) zzgonVar;
        } catch (zzgoz e) {
            e = e;
            if (e.x) {
                e = new zzgoz(e);
            }
            e.zzh(zzgonVar);
            throw e;
        } catch (zzgrg e2) {
            zzgoz zzgozVarZza = e2.zza();
            zzgozVarZza.zzh(zzgonVar);
            throw zzgozVarZza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgoz) {
                throw ((zzgoz) e3.getCause());
            }
            zzgoz zzgozVar = new zzgoz(e3);
            zzgozVar.zzh(zzgonVar);
            throw zzgozVar;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzgoz) {
                throw ((zzgoz) e4.getCause());
            }
            throw e4;
        }
    }

    public static zzgjt zzg(byte[] bArr, zzgnz zzgnzVar) {
        zzgon zzgonVarL = zzgon.l(zzb, bArr, bArr.length, zzgnzVar);
        zzgon.d(zzgonVarL);
        return (zzgjt) zzgonVarL;
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzgjs.class});
        }
        if (i2 == 3) {
            return new zzgjt();
        }
        if (i2 == 4) {
            return new zzgjq(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final int zzc() {
        return this.zze;
    }

    public final List zzh() {
        return this.zzf;
    }
}
