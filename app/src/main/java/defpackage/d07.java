package defpackage;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzcn;
import com.google.android.gms.internal.ads.zzdd;
import com.google.android.gms.internal.ads.zzdu;
import com.google.android.gms.internal.ads.zzjz;
import com.google.android.gms.internal.ads.zzrl;
import com.google.android.gms.internal.ads.zzse;
import com.google.android.gms.internal.ads.zzsg;
import com.google.android.gms.internal.ads.zztw;
import com.google.android.gms.internal.ads.zzue;
import com.google.android.gms.internal.ads.zzvq;
import com.google.android.gms.internal.ads.zzvw;
import com.google.android.gms.internal.ads.zzvx;
import com.google.android.gms.internal.ads.zzwf;

/* JADX INFO: loaded from: classes3.dex */
public final class d07 {
    public final zzse a;
    public final Object b;
    public final zztw[] c;
    public boolean d;
    public boolean e;
    public g07 f;
    public boolean g;
    public final boolean[] h;
    public final zzjz[] i;
    public final zzvw j;
    public final t07 k;
    public d07 l;
    public zzue m;
    public zzvx n;
    public long o;

    public d07(zzjz[] zzjzVarArr, long j, zzvw zzvwVar, zzwf zzwfVar, t07 t07Var, g07 g07Var, zzvx zzvxVar) {
        this.i = zzjzVarArr;
        this.o = j;
        this.j = zzvwVar;
        this.k = t07Var;
        zzsg zzsgVar = g07Var.a;
        this.b = zzsgVar.zza;
        this.f = g07Var;
        this.m = zzue.zza;
        this.n = zzvxVar;
        this.c = new zztw[2];
        this.h = new boolean[2];
        long j2 = g07Var.d;
        t07Var.getClass();
        Pair pair = (Pair) zzsgVar.zza;
        Object obj = pair.first;
        zzsg zzsgVarZzc = zzsgVar.zzc(pair.second);
        p07 p07Var = (p07) t07Var.d.get(obj);
        p07Var.getClass();
        t07Var.i.add(p07Var);
        n07 n07Var = (n07) t07Var.h.get(p07Var);
        if (n07Var != null) {
            n07Var.a.zzk(n07Var.b);
        }
        p07Var.c.add(zzsgVarZzc);
        zzse zzseVarZzD = p07Var.a.zzD(zzsgVarZzc, zzwfVar, g07Var.b);
        t07Var.c.put(zzseVarZzD, p07Var);
        t07Var.j();
        this.a = j2 != -9223372036854775807L ? new zzrl(zzseVarZzD, true, 0L, j2) : zzseVarZzD;
    }

    public final long a(zzvx zzvxVar, long j, boolean z, boolean[] zArr) {
        zzjz[] zzjzVarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzvxVar.zza) {
                break;
            }
            if (z || !zzvxVar.zza(this.n, i)) {
                z2 = false;
            }
            this.h[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            zzjzVarArr = this.i;
            if (i2 >= 2) {
                break;
            }
            zzjzVarArr[i2].zzb();
            i2++;
        }
        k();
        this.n = zzvxVar;
        if (this.l == null) {
            int i3 = 0;
            while (true) {
                zzvx zzvxVar2 = this.n;
                if (i3 >= zzvxVar2.zza) {
                    break;
                }
                zzvxVar2.zzb(i3);
                zzvq zzvqVar = this.n.zzc[i3];
                i3++;
            }
        }
        long jZzf = this.a.zzf(zzvxVar.zzc, this.h, this.c, zArr, j);
        for (int i4 = 0; i4 < 2; i4++) {
            zzjzVarArr[i4].zzb();
        }
        this.e = false;
        for (int i5 = 0; i5 < 2; i5++) {
            if (this.c[i5] != null) {
                zzdd.zzf(zzvxVar.zzb(i5));
                zzjzVarArr[i5].zzb();
                this.e = true;
            } else {
                zzdd.zzf(zzvxVar.zzc[i5] == null);
            }
        }
        return jZzf;
    }

    public final long b() {
        if (!this.d) {
            return this.f.b;
        }
        long jZzb = this.e ? this.a.zzb() : Long.MIN_VALUE;
        return jZzb == Long.MIN_VALUE ? this.f.e : jZzb;
    }

    public final long c() {
        return this.o;
    }

    public final long d() {
        return this.f.b + this.o;
    }

    public final d07 e() {
        return this.l;
    }

    public final zzue f() {
        return this.m;
    }

    public final zzvx g() {
        return this.n;
    }

    public final void h(float f, zzcn zzcnVar) {
        this.d = true;
        zzue zzueVarZzh = this.a.zzh();
        this.m = zzueVarZzh;
        zzvx zzvxVarZzn = this.j.zzn(this.i, zzueVarZzh, this.f.a, zzcnVar);
        for (zzvq zzvqVar : zzvxVarZzn.zzc) {
        }
        g07 g07Var = this.f;
        long j = g07Var.b;
        long j2 = g07Var.e;
        long jA = a(zzvxVarZzn, (j2 == -9223372036854775807L || j < j2) ? j : Math.max(0L, j2 - 1), false, new boolean[2]);
        long j3 = this.o;
        g07 g07Var2 = this.f;
        this.o = (g07Var2.b - jA) + j3;
        this.f = g07Var2.b(jA);
    }

    public final void i() {
        k();
        zzse zzseVar = this.a;
        try {
            boolean z = zzseVar instanceof zzrl;
            t07 t07Var = this.k;
            if (z) {
                t07Var.c(((zzrl) zzseVar).zza);
            } else {
                t07Var.c(zzseVar);
            }
        } catch (RuntimeException e) {
            zzdu.zza("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void j() {
        zzse zzseVar = this.a;
        if (zzseVar instanceof zzrl) {
            long j = this.f.d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((zzrl) zzseVar).zzn(0L, j);
        }
    }

    public final void k() {
        int i = 0;
        if (!(this.l == null)) {
            return;
        }
        while (true) {
            zzvx zzvxVar = this.n;
            if (i >= zzvxVar.zza) {
                return;
            }
            zzvxVar.zzb(i);
            zzvq zzvqVar = this.n.zzc[i];
            i++;
        }
    }
}
