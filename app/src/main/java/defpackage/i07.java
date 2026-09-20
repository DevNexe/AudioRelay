package defpackage;

import android.os.Handler;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzck;
import com.google.android.gms.internal.ads.zzcm;
import com.google.android.gms.internal.ads.zzcn;
import com.google.android.gms.internal.ads.zzdd;
import com.google.android.gms.internal.ads.zzfus;
import com.google.android.gms.internal.ads.zzfuv;
import com.google.android.gms.internal.ads.zzjz;
import com.google.android.gms.internal.ads.zzkm;
import com.google.android.gms.internal.ads.zzsg;
import com.google.android.gms.internal.ads.zzvq;
import com.google.android.gms.internal.ads.zzvw;
import com.google.android.gms.internal.ads.zzvx;
import com.google.android.gms.internal.ads.zzwf;
import defpackage.i07;

/* JADX INFO: loaded from: classes3.dex */
public final class i07 {
    public final zzck a = new zzck();
    public final zzcm b = new zzcm();
    public final zzkm c;
    public final Handler d;
    public long e;
    public int f;
    public boolean g;
    public d07 h;
    public d07 i;
    public d07 j;
    public int k;
    public Object l;
    public long m;

    public i07(zzkm zzkmVar, Handler handler) {
        this.c = zzkmVar;
        this.d = handler;
    }

    public static zzsg v(zzcn zzcnVar, Object obj, long j, long j2, zzcm zzcmVar, zzck zzckVar) {
        zzcnVar.zzn(obj, zzckVar);
        zzcnVar.zze(zzckVar.zzd, zzcmVar, 0L);
        zzcnVar.zza(obj);
        if (zzckVar.zze == 0) {
            zzckVar.zzb();
        }
        zzcnVar.zzn(obj, zzckVar);
        int iZzd = zzckVar.zzd(j);
        return iZzd == -1 ? new zzsg(obj, j2, zzckVar.zzc(j)) : new zzsg(obj, iZzd, zzckVar.zze(iZzd), j2);
    }

    public final boolean a(zzcn zzcnVar, zzsg zzsgVar) {
        if (!zzsgVar.zzb() && zzsgVar.zze == -1) {
            return zzcnVar.zze(zzcnVar.zzn(zzsgVar.zza, this.a).zzd, this.b, 0L).zzp == zzcnVar.zza(zzsgVar.zza);
        }
        return false;
    }

    public final boolean b(zzcn zzcnVar) {
        d07 d07Var;
        d07 d07Var2 = this.h;
        if (d07Var2 == null) {
            return true;
        }
        int iZza = zzcnVar.zza(d07Var2.b);
        while (true) {
            iZza = zzcnVar.zzi(iZza, this.a, this.b, this.f, this.g);
            while (true) {
                d07Var = d07Var2.l;
                if (d07Var == null || d07Var2.f.f) {
                    break;
                }
                d07Var2 = d07Var;
            }
            if (iZza == -1 || d07Var == null || zzcnVar.zza(d07Var.b) != iZza) {
                break;
            }
            d07Var2 = d07Var;
        }
        boolean zL = l(d07Var2);
        d07Var2.f = i(zzcnVar, d07Var2.f);
        return !zL;
    }

    public final d07 c() {
        d07 d07Var = this.h;
        if (d07Var == null) {
            return null;
        }
        if (d07Var == this.i) {
            this.i = d07Var.l;
        }
        d07Var.i();
        int i = this.k - 1;
        this.k = i;
        if (i == 0) {
            this.j = null;
            d07 d07Var2 = this.h;
            this.l = d07Var2.b;
            this.m = d07Var2.f.a.zzd;
        }
        this.h = this.h.l;
        w();
        return this.h;
    }

    public final d07 d() {
        d07 d07Var = this.i;
        zzdd.zzf((d07Var == null || d07Var.l == null) ? false : true);
        this.i = this.i.l;
        w();
        return this.i;
    }

    public final d07 e() {
        return this.j;
    }

    public final d07 f() {
        return this.h;
    }

    public final d07 g() {
        return this.i;
    }

    public final g07 h(long j, v07 v07Var) {
        d07 d07Var = this.j;
        return d07Var == null ? s(v07Var.a, v07Var.b, v07Var.c, v07Var.s) : r(v07Var.a, d07Var, j);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    public final g07 i(zzcn zzcnVar, g07 g07Var) {
        long j;
        long jZzg;
        long j2;
        long j3;
        int i;
        int i2;
        zzsg zzsgVar = g07Var.a;
        boolean z = !zzsgVar.zzb() && zzsgVar.zze == -1;
        boolean zA = a(zzcnVar, zzsgVar);
        boolean zX = x(zzcnVar, zzsgVar, z);
        Object obj = g07Var.a.zza;
        zzck zzckVar = this.a;
        zzcnVar.zzn(obj, zzckVar);
        if (zzsgVar.zzb() || (i2 = zzsgVar.zze) == -1) {
            j = -9223372036854775807L;
        } else {
            zzckVar.zzh(i2);
            j = 0;
        }
        if (!zzsgVar.zzb()) {
            if (j != -9223372036854775807L) {
                j2 = 0;
                j3 = 0;
            } else {
                jZzg = zzckVar.zze;
            }
            if (zzsgVar.zzb()) {
                zzckVar.zzl(zzsgVar.zzb);
            } else {
                i = zzsgVar.zze;
                if (i != -1) {
                    zzckVar.zzl(i);
                }
            }
            return new g07(zzsgVar, g07Var.b, g07Var.c, j2, j3, z, zA, zX);
        }
        jZzg = zzckVar.zzg(zzsgVar.zzb, zzsgVar.zzc);
        j2 = j;
        j3 = jZzg;
        if (zzsgVar.zzb()) {
            zzckVar.zzl(zzsgVar.zzb);
        } else {
            i = zzsgVar.zze;
            if (i != -1) {
                zzckVar.zzl(i);
            }
        }
        return new g07(zzsgVar, g07Var.b, g07Var.c, j2, j3, z, zA, zX);
    }

    public final zzsg j(zzcn zzcnVar, Object obj, long j) {
        long j2;
        int iZza;
        zzck zzckVar = this.a;
        int i = zzcnVar.zzn(obj, zzckVar).zzd;
        Object obj2 = this.l;
        if (obj2 == null || (iZza = zzcnVar.zza(obj2)) == -1 || zzcnVar.zzd(iZza, zzckVar, false).zzd != i) {
            d07 d07Var = this.h;
            while (true) {
                if (d07Var == null) {
                    d07 d07Var2 = this.h;
                    while (true) {
                        if (d07Var2 == null) {
                            j2 = this.e;
                            this.e = 1 + j2;
                            if (this.h != null) {
                                break;
                            }
                            this.l = obj;
                            this.m = j2;
                            break;
                        }
                        int iZza2 = zzcnVar.zza(d07Var2.b);
                        if (iZza2 != -1 && zzcnVar.zzd(iZza2, zzckVar, false).zzd == i) {
                            j2 = d07Var2.f.a.zzd;
                            break;
                        }
                        d07Var2 = d07Var2.l;
                    }
                } else {
                    if (d07Var.b.equals(obj)) {
                        j2 = d07Var.f.a.zzd;
                        break;
                    }
                    d07Var = d07Var.l;
                }
            }
        } else {
            j2 = this.m;
        }
        long j3 = j2;
        zzcnVar.zzn(obj, zzckVar);
        int i2 = zzckVar.zzd;
        zzcm zzcmVar = this.b;
        zzcnVar.zze(i2, zzcmVar, 0L);
        Object obj3 = obj;
        for (int iZza3 = zzcnVar.zza(obj); iZza3 >= zzcmVar.zzo; iZza3--) {
            zzcnVar.zzd(iZza3, zzckVar, true);
            zzckVar.zzb();
            if (zzckVar.zzd(zzckVar.zze) != -1) {
                obj3 = zzckVar.zzc;
                obj3.getClass();
            }
        }
        return v(zzcnVar, obj3, j, j3, zzcmVar, this.a);
    }

    public final void k() {
        if (this.k == 0) {
            return;
        }
        d07 d07Var = this.h;
        zzdd.zzb(d07Var);
        this.l = d07Var.b;
        this.m = d07Var.f.a.zzd;
        while (d07Var != null) {
            d07Var.i();
            d07Var = d07Var.l;
        }
        this.h = null;
        this.j = null;
        this.i = null;
        this.k = 0;
        w();
    }

    public final boolean l(d07 d07Var) {
        int i = 0;
        zzdd.zzf(d07Var != null);
        if (d07Var.equals(this.j)) {
            return false;
        }
        this.j = d07Var;
        boolean z = false;
        while (true) {
            d07Var = d07Var.l;
            if (d07Var == null) {
                break;
            }
            if (d07Var == this.i) {
                this.i = this.h;
                z = true;
            }
            d07Var.i();
            this.k--;
        }
        d07 d07Var2 = this.j;
        if (d07Var2.l != null) {
            d07Var2.k();
            d07Var2.l = null;
            while (true) {
                zzvx zzvxVar = d07Var2.n;
                if (i >= zzvxVar.zza) {
                    break;
                }
                zzvxVar.zzb(i);
                zzvq zzvqVar = d07Var2.n.zzc[i];
                i++;
            }
        }
        w();
        return z;
    }

    public final boolean m() {
        d07 d07Var = this.j;
        if (d07Var == null) {
            return true;
        }
        if (!d07Var.f.h) {
            return (d07Var.d && (!d07Var.e || (d07Var.a.zzb() > Long.MIN_VALUE ? 1 : (d07Var.a.zzb() == Long.MIN_VALUE ? 0 : -1)) == 0)) && this.j.f.e != -9223372036854775807L && this.k < 100;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0078  */
    public final boolean n(zzcn zzcnVar, long j, long j2) {
        g07 g07VarI;
        boolean z;
        d07 d07Var = null;
        for (d07 d07Var2 = this.h; d07Var2 != null; d07Var2 = d07Var2.l) {
            g07 g07Var = d07Var2.f;
            if (d07Var == null) {
                g07VarI = i(zzcnVar, g07Var);
            } else {
                g07 g07VarR = r(zzcnVar, d07Var, j);
                if (g07VarR == null) {
                    return !l(d07Var);
                }
                if (g07Var.b != g07VarR.b || !g07Var.a.equals(g07VarR.a)) {
                    return !l(d07Var);
                }
                g07VarI = g07VarR;
            }
            d07Var2.f = g07VarI.a(g07Var.c);
            long j3 = g07Var.e;
            if (j3 != -9223372036854775807L) {
                long j4 = g07VarI.e;
                if (j3 != j4) {
                    d07Var2.j();
                    long j5 = j4 == -9223372036854775807L ? Long.MAX_VALUE : d07Var2.o + j4;
                    if (d07Var2 == this.i) {
                        d07Var2.f.getClass();
                        if (j2 == Long.MIN_VALUE || j2 >= j5) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    return (l(d07Var2) || z) ? false : true;
                }
            }
            d07Var = d07Var2;
        }
        return true;
    }

    public final boolean o(zzcn zzcnVar, int i) {
        this.f = i;
        return b(zzcnVar);
    }

    public final boolean p(zzcn zzcnVar, boolean z) {
        this.g = z;
        return b(zzcnVar);
    }

    public final d07 q(zzjz[] zzjzVarArr, zzvw zzvwVar, zzwf zzwfVar, t07 t07Var, g07 g07Var, zzvx zzvxVar) {
        d07 d07Var = this.j;
        d07 d07Var2 = new d07(zzjzVarArr, d07Var == null ? 1000000000000L : (d07Var.o + d07Var.f.e) - g07Var.b, zzvwVar, zzwfVar, t07Var, g07Var, zzvxVar);
        d07 d07Var3 = this.j;
        if (d07Var3 == null) {
            this.h = d07Var2;
            this.i = d07Var2;
        } else if (d07Var2 != d07Var3.l) {
            d07Var3.k();
            d07Var3.l = d07Var2;
        }
        this.l = null;
        this.j = d07Var2;
        this.k++;
        w();
        return d07Var2;
    }

    public final g07 r(zzcn zzcnVar, d07 d07Var, long j) {
        long jLongValue;
        long j2;
        long j3;
        g07 g07Var = d07Var.f;
        long j4 = (d07Var.o + g07Var.e) - j;
        boolean z = g07Var.f;
        zzck zzckVar = this.a;
        long j5 = g07Var.c;
        zzsg zzsgVar = g07Var.a;
        if (z) {
            int iZzi = zzcnVar.zzi(zzcnVar.zza(zzsgVar.zza), this.a, this.b, this.f, this.g);
            if (iZzi == -1) {
                return null;
            }
            int i = zzcnVar.zzd(iZzi, zzckVar, true).zzd;
            Object obj = zzckVar.zzc;
            obj.getClass();
            long j6 = zzsgVar.zzd;
            if (zzcnVar.zze(i, this.b, 0L).zzo == iZzi) {
                Pair pairZzm = zzcnVar.zzm(this.b, this.a, i, -9223372036854775807L, Math.max(0L, j4));
                if (pairZzm == null) {
                    return null;
                }
                obj = pairZzm.first;
                long jLongValue2 = ((Long) pairZzm.second).longValue();
                d07 d07Var2 = d07Var.l;
                if (d07Var2 == null || !d07Var2.b.equals(obj)) {
                    j6 = this.e;
                    this.e = 1 + j6;
                } else {
                    j6 = d07Var2.f.a.zzd;
                }
                j2 = jLongValue2;
                j3 = -9223372036854775807L;
            } else {
                j2 = 0;
                j3 = 0;
            }
            zzsg zzsgVarV = v(zzcnVar, obj, j2, j6, this.b, this.a);
            if (j3 != -9223372036854775807L && j5 != -9223372036854775807L) {
                zzcnVar.zzn(zzsgVar.zza, zzckVar).zzb();
            }
            return s(zzcnVar, zzsgVarV, j3, j2);
        }
        zzcnVar.zzn(zzsgVar.zza, zzckVar);
        if (!zzsgVar.zzb()) {
            int iZze = zzckVar.zze(zzsgVar.zze);
            zzckVar.zzl(zzsgVar.zze);
            if (iZze != zzckVar.zza(zzsgVar.zze)) {
                return t(zzcnVar, zzsgVar.zza, zzsgVar.zze, iZze, g07Var.e, zzsgVar.zzd);
            }
            Object obj2 = zzsgVar.zza;
            int i2 = zzsgVar.zze;
            zzcnVar.zzn(obj2, zzckVar);
            zzckVar.zzh(i2);
            zzckVar.zzj(i2);
            return u(zzcnVar, zzsgVar.zza, 0L, g07Var.e, zzsgVar.zzd);
        }
        int i3 = zzsgVar.zzb;
        if (zzckVar.zza(i3) == -1) {
            return null;
        }
        int iZzf = zzckVar.zzf(i3, zzsgVar.zzc);
        if (iZzf < 0) {
            return t(zzcnVar, zzsgVar.zza, i3, iZzf, g07Var.c, zzsgVar.zzd);
        }
        if (j5 == -9223372036854775807L) {
            Pair pairZzm2 = zzcnVar.zzm(this.b, zzckVar, zzckVar.zzd, -9223372036854775807L, Math.max(0L, j4));
            if (pairZzm2 == null) {
                return null;
            }
            jLongValue = ((Long) pairZzm2.second).longValue();
        } else {
            jLongValue = j5;
        }
        Object obj3 = zzsgVar.zza;
        int i4 = zzsgVar.zzb;
        zzcnVar.zzn(obj3, zzckVar);
        zzckVar.zzh(i4);
        zzckVar.zzj(i4);
        return u(zzcnVar, zzsgVar.zza, Math.max(0L, jLongValue), g07Var.c, zzsgVar.zzd);
    }

    public final g07 s(zzcn zzcnVar, zzsg zzsgVar, long j, long j2) {
        zzcnVar.zzn(zzsgVar.zza, this.a);
        return zzsgVar.zzb() ? t(zzcnVar, zzsgVar.zza, zzsgVar.zzb, zzsgVar.zzc, j, zzsgVar.zzd) : u(zzcnVar, zzsgVar.zza, j2, j, zzsgVar.zzd);
    }

    public final g07 t(zzcn zzcnVar, Object obj, int i, int i2, long j, long j2) {
        zzsg zzsgVar = new zzsg(obj, i, i2, j2);
        Object obj2 = zzsgVar.zza;
        zzck zzckVar = this.a;
        long jZzg = zzcnVar.zzn(obj2, zzckVar).zzg(zzsgVar.zzb, zzsgVar.zzc);
        if (i2 == zzckVar.zze(i)) {
            zzckVar.zzi();
        }
        zzckVar.zzl(zzsgVar.zzb);
        long jMax = 0;
        if (jZzg != -9223372036854775807L && jZzg <= 0) {
            jMax = Math.max(0L, (-1) + jZzg);
        }
        return new g07(zzsgVar, jMax, j, -9223372036854775807L, jZzg, false, false, false);
    }

    public final g07 u(zzcn zzcnVar, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        long jMax = j;
        zzck zzckVar = this.a;
        zzcnVar.zzn(obj, zzckVar);
        int iZzc = zzckVar.zzc(jMax);
        if (iZzc == -1) {
            zzckVar.zzb();
        } else {
            zzckVar.zzl(iZzc);
        }
        zzsg zzsgVar = new zzsg(obj, j3, iZzc);
        boolean z = !zzsgVar.zzb() && zzsgVar.zze == -1;
        boolean zA = a(zzcnVar, zzsgVar);
        boolean zX = x(zzcnVar, zzsgVar, z);
        if (iZzc != -1) {
            zzckVar.zzl(iZzc);
        }
        if (iZzc != -1) {
            zzckVar.zzh(iZzc);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j6 = j4;
            j5 = j6;
        } else {
            j5 = zzckVar.zze;
            j6 = -9223372036854775807L;
        }
        if (j5 != -9223372036854775807L && jMax >= j5) {
            jMax = Math.max(0L, j5 - 1);
        }
        return new g07(zzsgVar, jMax, j2, j6, j5, z, zA, zX);
    }

    public final void w() {
        final zzfus zzfusVarZzi = zzfuv.zzi();
        for (d07 d07Var = this.h; d07Var != null; d07Var = d07Var.l) {
            zzfusVarZzi.zze(d07Var.f.a);
        }
        d07 d07Var2 = this.i;
        final zzsg zzsgVar = d07Var2 == null ? null : d07Var2.f.a;
        this.d.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjj
            @Override // java.lang.Runnable
            public final void run() {
                i07 i07Var = this.zza;
                zzfus zzfusVar = zzfusVarZzi;
                i07Var.c.zzT(zzfusVar.zzg(), zzsgVar);
            }
        });
    }

    public final boolean x(zzcn zzcnVar, zzsg zzsgVar, boolean z) {
        int iZza = zzcnVar.zza(zzsgVar.zza);
        return !zzcnVar.zze(zzcnVar.zzd(iZza, this.a, false).zzd, this.b, 0L).zzi && zzcnVar.zzi(iZza, this.a, this.b, this.f, this.g) == -1 && z;
    }
}
