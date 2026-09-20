package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzag;
import com.google.android.gms.internal.ads.zzbg;
import com.google.android.gms.internal.ads.zzbh;
import com.google.android.gms.internal.ads.zzbk;
import com.google.android.gms.internal.ads.zzbm;
import com.google.android.gms.internal.ads.zzbq;
import com.google.android.gms.internal.ads.zzca;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzcf;
import com.google.android.gms.internal.ads.zzcg;
import com.google.android.gms.internal.ads.zzck;
import com.google.android.gms.internal.ads.zzcm;
import com.google.android.gms.internal.ads.zzcn;
import com.google.android.gms.internal.ads.zzcy;
import com.google.android.gms.internal.ads.zzda;
import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzdd;
import com.google.android.gms.internal.ads.zzde;
import com.google.android.gms.internal.ads.zzdg;
import com.google.android.gms.internal.ads.zzdn;
import com.google.android.gms.internal.ads.zzdq;
import com.google.android.gms.internal.ads.zzdr;
import com.google.android.gms.internal.ads.zzdt;
import com.google.android.gms.internal.ads.zzdu;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zzfuv;
import com.google.android.gms.internal.ads.zzgy;
import com.google.android.gms.internal.ads.zzgz;
import com.google.android.gms.internal.ads.zzhi;
import com.google.android.gms.internal.ads.zzhj;
import com.google.android.gms.internal.ads.zzhu;
import com.google.android.gms.internal.ads.zzhv;
import com.google.android.gms.internal.ads.zziz;
import com.google.android.gms.internal.ads.zzjd;
import com.google.android.gms.internal.ads.zzjf;
import com.google.android.gms.internal.ads.zzjv;
import com.google.android.gms.internal.ads.zzjy;
import com.google.android.gms.internal.ads.zzk;
import com.google.android.gms.internal.ads.zzka;
import com.google.android.gms.internal.ads.zzkb;
import com.google.android.gms.internal.ads.zzkm;
import com.google.android.gms.internal.ads.zzm;
import com.google.android.gms.internal.ads.zzmz;
import com.google.android.gms.internal.ads.zzrt;
import com.google.android.gms.internal.ads.zzsg;
import com.google.android.gms.internal.ads.zzt;
import com.google.android.gms.internal.ads.zztz;
import com.google.android.gms.internal.ads.zzue;
import com.google.android.gms.internal.ads.zzvq;
import com.google.android.gms.internal.ads.zzvw;
import com.google.android.gms.internal.ads.zzvx;
import com.google.android.gms.internal.ads.zzwi;
import com.google.android.gms.internal.ads.zzza;
import defpackage.cz6;
import defpackage.v07;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class cz6 extends zzm implements zzhj {
    public static final /* synthetic */ int S = 0;
    public zzbm A;
    public AudioTrack B;
    public Object C;
    public Surface D;
    public int E;
    public int F;
    public final int G;
    public float H;
    public boolean I;
    public boolean J;
    public boolean K;
    public zzt L;
    public zzbm M;
    public v07 N;
    public int O;
    public long P;
    public final zzhu Q;
    public zztz R;
    public final zzvx b;
    public final zzcc c;
    public final zzdg d;
    public final zzcg e;
    public final zzjy[] f;
    public final zzvw g;
    public final zzdn h;
    public final xz6 i;
    public final zzdt j;
    public final CopyOnWriteArraySet k;
    public final zzck l;
    public final ArrayList m;
    public final boolean n;
    public final zzkm o;
    public final Looper p;
    public final zzwi q;
    public final zzde r;
    public final rt6 s;
    public final z17 t;
    public final long u;
    public int v;
    public int w;
    public boolean x;
    public int y;
    public zzcc z;

    static {
        zzbh.zzb("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.internal.ads.zzkm, com.google.android.gms.internal.ads.zzwd, java.lang.Object] */
    @SuppressLint({"HandlerLeak"})
    public cz6(zzhi zzhiVar, zzcg zzcgVar) {
        zzde zzdeVar = zzhiVar.b;
        zzdg zzdgVar = new zzdg(zzde.zza);
        this.d = zzdgVar;
        try {
            Log.i("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.0.0-beta01] [" + zzel.zze + "]");
            Context context = zzhiVar.a;
            Context applicationContext = context.getApplicationContext();
            ?? Apply = zzhiVar.h.apply(zzdeVar);
            this.o = Apply;
            zzk zzkVar = zzhiVar.j;
            this.I = false;
            this.u = 2000L;
            uy6 uy6Var = new uy6(this);
            Object zy6Var = new zy6();
            Handler handler = new Handler(zzhiVar.i);
            zzjy[] zzjyVarArrZza = zzhiVar.c.zza.zza(handler, uy6Var, uy6Var, uy6Var, uy6Var);
            this.f = zzjyVarArrZza;
            int length = zzjyVarArrZza.length;
            zzvw zzvwVar = (zzvw) zzhiVar.e.zza();
            this.g = zzvwVar;
            new zzrt(zzhiVar.d.zza, new zzza());
            zzwi zzwiVarZzg = zzwi.zzg(zzhiVar.g.zza);
            this.q = zzwiVarZzg;
            this.n = true;
            zzkb zzkbVar = zzhiVar.k;
            Looper looper = zzhiVar.i;
            this.p = looper;
            this.r = zzdeVar;
            this.e = zzcgVar;
            zzdt zzdtVar = new zzdt(looper, zzdeVar, new zzdr() { // from class: com.google.android.gms.internal.ads.zzht
                @Override // com.google.android.gms.internal.ads.zzdr
                public final void zza(Object obj, zzaa zzaaVar) {
                }
            });
            this.j = zzdtVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.k = copyOnWriteArraySet;
            this.m = new ArrayList();
            this.R = new zztz(0);
            zzvx zzvxVar = new zzvx(new zzka[2], new zzvq[2], zzcy.zza, null);
            this.b = zzvxVar;
            this.l = new zzck();
            zzca zzcaVar = new zzca();
            zzcaVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28, 31);
            zzvwVar.zzl();
            zzcaVar.zzd(29, true);
            zzcc zzccVarZze = zzcaVar.zze();
            this.c = zzccVarZze;
            zzca zzcaVar2 = new zzca();
            zzcaVar2.zzb(zzccVarZze);
            zzcaVar2.zza(4);
            zzcaVar2.zza(10);
            this.z = zzcaVar2.zze();
            this.h = zzdeVar.zzb(looper, null);
            zzhu zzhuVar = new zzhu(this);
            this.Q = zzhuVar;
            this.N = v07.h(zzvxVar);
            Apply.zzS(zzcgVar, looper);
            int i = zzel.zza;
            this.i = new xz6(zzjyVarArrZza, zzvwVar, zzvxVar, (zzjf) zzhiVar.f.zza(), zzwiVarZzg, Apply, zzkbVar, zzhiVar.m, looper, zzdeVar, zzhuVar, i < 31 ? new zzmz() : ky6.a(applicationContext, this, true));
            this.H = 1.0f;
            zzbm zzbmVar = zzbm.zza;
            this.A = zzbmVar;
            this.M = zzbmVar;
            this.O = -1;
            if (i < 21) {
                AudioTrack audioTrack = this.B;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.B.release();
                    this.B = null;
                }
                if (this.B == null) {
                    this.B = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.G = this.B.getAudioSessionId();
            } else {
                this.G = zzel.zzi(applicationContext);
            }
            zzdc zzdcVar = zzdc.zza;
            this.J = true;
            zzdtVar.zzb(Apply);
            zzwiVarZzg.zze(new Handler(looper), Apply);
            copyOnWriteArraySet.add(uy6Var);
            context.getApplicationContext();
            new ss6(handler, uy6Var);
            this.s = new rt6(context, handler, uy6Var);
            zzel.zzT(null, null);
            z17 z17Var = new z17(context, handler, uy6Var);
            this.t = z17Var;
            int i2 = zzkVar.zzc;
            z17Var.a();
            this.L = e(z17Var);
            zzda zzdaVar = zzda.zza;
            zzvwVar.zzi(zzkVar);
            i(1, 10, Integer.valueOf(this.G));
            i(2, 10, Integer.valueOf(this.G));
            i(1, 3, zzkVar);
            i(2, 4, 1);
            i(2, 5, 0);
            i(1, 9, Boolean.valueOf(this.I));
            i(2, 7, zy6Var);
            i(6, 8, zy6Var);
            zzdgVar.zze();
        } catch (Throwable th) {
            this.d.zze();
            throw th;
        }
    }

    public static long c(v07 v07Var) {
        zzcm zzcmVar = new zzcm();
        zzck zzckVar = new zzck();
        v07Var.a.zzn(v07Var.b.zza, zzckVar);
        long j = v07Var.c;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = v07Var.a.zze(zzckVar.zzd, zzcmVar, 0L).zzm;
        return 0L;
    }

    public static zzt e(z17 z17Var) {
        z17Var.getClass();
        return new zzt(0, zzel.zza >= 28 ? z17Var.d.getStreamMinVolume(z17Var.f) : 0, z17Var.d.getStreamMaxVolume(z17Var.f));
    }

    public static boolean o(v07 v07Var) {
        return v07Var.e == 3 && v07Var.l && v07Var.m == 0;
    }

    public final int a() {
        if (this.N.a.zzo()) {
            return this.O;
        }
        v07 v07Var = this.N;
        return v07Var.a.zzn(v07Var.b.zza, this.l).zzd;
    }

    public final long b(v07 v07Var) {
        if (v07Var.a.zzo()) {
            return zzel.zzv(this.P);
        }
        if (v07Var.b.zzb()) {
            return v07Var.s;
        }
        zzcn zzcnVar = v07Var.a;
        zzsg zzsgVar = v07Var.b;
        long j = v07Var.s;
        zzcnVar.zzn(zzsgVar.zza, this.l);
        return j;
    }

    public final Pair d(zzcn zzcnVar, int i, long j) {
        if (zzcnVar.zzo()) {
            this.O = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.P = j;
            return null;
        }
        if (i == -1 || i >= zzcnVar.zzc()) {
            i = zzcnVar.zzg(false);
            long j2 = zzcnVar.zze(i, this.a, 0L).zzm;
            j = zzel.zzz(0L);
        }
        return zzcnVar.zzl(this.a, this.l, i, zzel.zzv(j));
    }

    public final v07 f(v07 v07Var, zzcn zzcnVar, Pair pair) {
        v07 v07VarB;
        zzdd.zzd(zzcnVar.zzo() || pair != null);
        zzcn zzcnVar2 = v07Var.a;
        v07 v07VarG = v07Var.g(zzcnVar);
        if (zzcnVar.zzo()) {
            zzsg zzsgVar = v07.t;
            long jZzv = zzel.zzv(this.P);
            v07 v07VarA = v07VarG.b(zzsgVar, jZzv, jZzv, jZzv, 0L, zzue.zza, this.b, zzfuv.zzo()).a(zzsgVar);
            v07VarA.q = v07VarA.s;
            return v07VarA;
        }
        Object obj = v07VarG.b.zza;
        int i = zzel.zza;
        boolean z = !obj.equals(pair.first);
        zzsg zzsgVar2 = z ? new zzsg(pair.first) : v07VarG.b;
        long jLongValue = ((Long) pair.second).longValue();
        long jZzv2 = zzel.zzv(zzk());
        if (!zzcnVar2.zzo()) {
            zzcnVar2.zzn(obj, this.l);
        }
        if (z || jLongValue < jZzv2) {
            zzdd.zzf(!zzsgVar2.zzb());
            v07 v07VarA2 = v07VarG.b(zzsgVar2, jLongValue, jLongValue, jLongValue, 0L, z ? zzue.zza : v07VarG.h, z ? this.b : v07VarG.i, z ? zzfuv.zzo() : v07VarG.j).a(zzsgVar2);
            v07VarA2.q = jLongValue;
            return v07VarA2;
        }
        if (jLongValue == jZzv2) {
            int iZza = zzcnVar.zza(v07VarG.k.zza);
            if (iZza != -1 && zzcnVar.zzd(iZza, this.l, false).zzd == zzcnVar.zzn(zzsgVar2.zza, this.l).zzd) {
                return v07VarG;
            }
            zzcnVar.zzn(zzsgVar2.zza, this.l);
            long jZzg = zzsgVar2.zzb() ? this.l.zzg(zzsgVar2.zzb, zzsgVar2.zzc) : this.l.zze;
            v07VarB = v07VarG.b(zzsgVar2, v07VarG.s, v07VarG.s, v07VarG.d, jZzg - v07VarG.s, v07VarG.h, v07VarG.i, v07VarG.j).a(zzsgVar2);
            v07VarB.q = jZzg;
        } else {
            zzdd.zzf(!zzsgVar2.zzb());
            long jMax = Math.max(0L, v07VarG.r - (jLongValue - jZzv2));
            long j = v07VarG.q;
            if (v07VarG.k.equals(v07VarG.b)) {
                j = jLongValue + jMax;
            }
            v07VarB = v07VarG.b(zzsgVar2, jLongValue, jLongValue, jLongValue, jMax, v07VarG.h, v07VarG.i, v07VarG.j);
            v07VarB.q = j;
        }
        return v07VarB;
    }

    public final zzjv g(zzjy zzjyVar) {
        int iA = a();
        zzcn zzcnVar = this.N.a;
        int i = iA == -1 ? 0 : iA;
        zzde zzdeVar = this.r;
        xz6 xz6Var = this.i;
        return new zzjv(xz6Var, zzjyVar, zzcnVar, i, zzdeVar, xz6Var.F);
    }

    public final void h(final int i, final int i2) {
        if (i == this.E && i2 == this.F) {
            return;
        }
        this.E = i;
        this.F = i2;
        zzdq zzdqVar = new zzdq() { // from class: com.google.android.gms.internal.ads.zzhx
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                int i3 = i;
                int i4 = i2;
                int i5 = cz6.S;
                ((zzcd) obj).zzr(i3, i4);
            }
        };
        zzdt zzdtVar = this.j;
        zzdtVar.zzd(24, zzdqVar);
        zzdtVar.zzc();
    }

    public final void i(int i, int i2, Object obj) {
        zzjy[] zzjyVarArr = this.f;
        int length = zzjyVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzjy zzjyVar = zzjyVarArr[i3];
            if (zzjyVar.zzb() == i) {
                zzjv zzjvVarG = g(zzjyVar);
                zzjvVarG.zzf(i2);
                zzjvVarG.zze(obj);
                zzjvVarG.zzd();
            }
        }
    }

    public final void j(Object obj) {
        ArrayList arrayList = new ArrayList();
        zzjy[] zzjyVarArr = this.f;
        int length = zzjyVarArr.length;
        boolean z = false;
        for (int i = 0; i < 2; i++) {
            zzjy zzjyVar = zzjyVarArr[i];
            if (zzjyVar.zzb() == 2) {
                zzjv zzjvVarG = g(zzjyVar);
                zzjvVarG.zzf(1);
                zzjvVarG.zze(obj);
                zzjvVarG.zzd();
                arrayList.add(zzjvVarG);
            }
        }
        Object obj2 = this.C;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((zzjv) it.next()).zzi(this.u);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.C;
            Surface surface = this.D;
            if (obj3 == surface) {
                surface.release();
                this.D = null;
            }
        }
        this.C = obj;
        if (z) {
            k(zzgy.zzd(new zzjd(3), 1003));
        }
    }

    public final void k(zzgy zzgyVar) {
        v07 v07Var = this.N;
        v07 v07VarA = v07Var.a(v07Var.b);
        v07VarA.q = v07VarA.s;
        v07VarA.r = 0L;
        v07 v07VarF = v07VarA.f(1);
        if (zzgyVar != null) {
            v07VarF = v07VarF.e(zzgyVar);
        }
        v07 v07Var2 = v07VarF;
        this.v++;
        this.i.D.zza(6).zza();
        m(v07Var2, 0, 1, false, v07Var2.a.zzo() && !this.N.a.zzo(), 4, b(v07Var2), -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void l(int i, int i2, boolean z) {
        int i3 = 0;
        ?? r3 = (!z || i == -1) ? 0 : 1;
        if (r3 != 0 && i != 1) {
            i3 = 1;
        }
        v07 v07Var = this.N;
        if (v07Var.l == r3 && v07Var.m == i3) {
            return;
        }
        this.v++;
        v07 v07VarD = v07Var.d(i3, r3);
        this.i.D.zzc(1, r3, i3).zza();
        m(v07VarD, 0, i2, false, false, 5, -9223372036854775807L, -1);
    }

    public final void m(final v07 v07Var, final int i, final int i2, boolean z, boolean z2, final int i3, long j, int i4) {
        Pair pair;
        int i5;
        final zzbg zzbgVar;
        int iZzh;
        int i6;
        Object obj;
        zzbg zzbgVar2;
        Object obj2;
        int iZza;
        long jC;
        long jC2;
        Object obj3;
        zzbg zzbgVar3;
        Object obj4;
        int iZza2;
        v07 v07Var2 = this.N;
        this.N = v07Var;
        boolean z3 = !v07Var2.a.equals(v07Var.a);
        zzcn zzcnVar = v07Var2.a;
        zzcn zzcnVar2 = v07Var.a;
        if (zzcnVar2.zzo() && zzcnVar.zzo()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (zzcnVar2.zzo() != zzcnVar.zzo()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (zzcnVar.zze(zzcnVar.zzn(v07Var2.b.zza, this.l).zzd, this.a, 0L).zzc.equals(zzcnVar2.zze(zzcnVar2.zzn(v07Var.b.zza, this.l).zzd, this.a, 0L).zzc)) {
            pair = (z2 && i3 == 0 && v07Var2.b.zzd < v07Var.b.zzd) ? new Pair(Boolean.TRUE, 0) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z2 && i3 == 0) {
                i5 = 1;
            } else if (z2 && i3 == 1) {
                i5 = 2;
            } else {
                if (!z3) {
                    throw new IllegalStateException();
                }
                i5 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i5));
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        final int iIntValue = ((Integer) pair.second).intValue();
        zzbm zzbmVarZzv = this.A;
        if (zBooleanValue) {
            zzbgVar = !v07Var.a.zzo() ? v07Var.a.zze(v07Var.a.zzn(v07Var.b.zza, this.l).zzd, this.a, 0L).zzd : null;
            this.M = zzbm.zza;
        } else {
            zzbgVar = null;
        }
        if (zBooleanValue || !v07Var2.j.equals(v07Var.j)) {
            zzbk zzbkVarZza = this.M.zza();
            List list = v07Var.j;
            for (int i7 = 0; i7 < list.size(); i7++) {
                zzbq zzbqVar = (zzbq) list.get(i7);
                for (int i8 = 0; i8 < zzbqVar.zza(); i8++) {
                    zzbqVar.zzb(i8).zza(zzbkVarZza);
                }
            }
            this.M = zzbkVarZza.zzv();
            zzcn zzcnVarZzn = zzn();
            if (zzcnVarZzn.zzo()) {
                zzbmVarZzv = this.M;
            } else {
                zzbg zzbgVar4 = zzcnVarZzn.zze(zzf(), this.a, 0L).zzd;
                zzbk zzbkVarZza2 = this.M.zza();
                zzbkVarZza2.zzb(zzbgVar4.zzg);
                zzbmVarZzv = zzbkVarZza2.zzv();
            }
        }
        boolean z4 = !zzbmVarZzv.equals(this.A);
        this.A = zzbmVarZzv;
        boolean z5 = v07Var2.l;
        boolean z6 = v07Var.l;
        int i9 = v07Var2.e;
        int i10 = v07Var.e;
        if ((i9 != i10 || z5 != z6) && ((iZzh = zzh()) == 2 || iZzh == 3)) {
            n();
            boolean z7 = this.N.p;
            zzq();
            zzq();
        }
        boolean z8 = v07Var2.g;
        boolean z9 = v07Var.g;
        if (!v07Var2.a.equals(v07Var.a)) {
            this.j.zzd(0, new zzdq() { // from class: com.google.android.gms.internal.ads.zzhz
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj5) {
                    v07 v07Var3 = v07Var;
                    int i11 = i;
                    int i12 = cz6.S;
                    ((zzcd) obj5).zzs(v07Var3.a, i11);
                }
            });
        }
        if (z2) {
            zzck zzckVar = new zzck();
            if (v07Var2.a.zzo()) {
                i6 = i4;
                obj = null;
                zzbgVar2 = null;
                obj2 = null;
                iZza = -1;
            } else {
                Object obj5 = v07Var2.b.zza;
                v07Var2.a.zzn(obj5, zzckVar);
                int i11 = zzckVar.zzd;
                iZza = v07Var2.a.zza(obj5);
                obj2 = obj5;
                obj = v07Var2.a.zze(i11, this.a, 0L).zzc;
                zzbgVar2 = this.a.zzd;
                i6 = i11;
            }
            if (i3 == 0) {
                if (v07Var2.b.zzb()) {
                    zzsg zzsgVar = v07Var2.b;
                    jC = zzckVar.zzg(zzsgVar.zzb, zzsgVar.zzc);
                    jC2 = c(v07Var2);
                } else {
                    jC = v07Var2.b.zze != -1 ? c(this.N) : zzckVar.zze;
                    jC2 = jC;
                }
            } else if (v07Var2.b.zzb()) {
                jC = v07Var2.s;
                jC2 = c(v07Var2);
            } else {
                jC = v07Var2.s;
                jC2 = jC;
            }
            long jZzz = zzel.zzz(jC);
            zzsg zzsgVar2 = v07Var2.b;
            final zzcf zzcfVar = new zzcf(obj, i6, zzbgVar2, obj2, iZza, jZzz, zzel.zzz(jC2), zzsgVar2.zzb, zzsgVar2.zzc);
            int iZzf = zzf();
            if (this.N.a.zzo()) {
                obj3 = null;
                zzbgVar3 = null;
                obj4 = null;
                iZza2 = -1;
            } else {
                v07 v07Var3 = this.N;
                Object obj6 = v07Var3.b.zza;
                v07Var3.a.zzn(obj6, this.l);
                iZza2 = this.N.a.zza(obj6);
                obj3 = this.N.a.zze(iZzf, this.a, 0L).zzc;
                zzbgVar3 = this.a.zzd;
                obj4 = obj6;
            }
            long jZzz2 = zzel.zzz(j);
            long jZzz3 = this.N.b.zzb() ? zzel.zzz(c(this.N)) : jZzz2;
            zzsg zzsgVar3 = this.N.b;
            final zzcf zzcfVar2 = new zzcf(obj3, iZzf, zzbgVar3, obj4, iZza2, jZzz2, jZzz3, zzsgVar3.zzb, zzsgVar3.zzc);
            this.j.zzd(11, new zzdq() { // from class: com.google.android.gms.internal.ads.zzif
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj7) {
                    int i12 = i3;
                    zzcf zzcfVar3 = zzcfVar;
                    zzcf zzcfVar4 = zzcfVar2;
                    int i13 = cz6.S;
                    ((zzcd) obj7).zzo(zzcfVar3, zzcfVar4, i12);
                }
            });
        } else {
            z6 = z6;
            i9 = i9;
            i10 = i10;
        }
        if (zBooleanValue) {
            this.j.zzd(1, new zzdq() { // from class: com.google.android.gms.internal.ads.zzhk
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj7) {
                    zzbg zzbgVar5 = zzbgVar;
                    int i12 = iIntValue;
                    int i13 = cz6.S;
                    ((zzcd) obj7).zzf(zzbgVar5, i12);
                }
            });
        }
        if (v07Var2.f != v07Var.f) {
            this.j.zzd(10, new zzdq() { // from class: com.google.android.gms.internal.ads.zzhl
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj7) {
                    v07 v07Var4 = v07Var;
                    int i12 = cz6.S;
                    ((zzcd) obj7).zzm(v07Var4.f);
                }
            });
            if (v07Var.f != null) {
                this.j.zzd(10, new zzdq() { // from class: com.google.android.gms.internal.ads.zzhm
                    @Override // com.google.android.gms.internal.ads.zzdq
                    public final void zza(Object obj7) {
                        v07 v07Var4 = v07Var;
                        int i12 = cz6.S;
                        ((zzcd) obj7).zzl(v07Var4.f);
                    }
                });
            }
        }
        zzvx zzvxVar = v07Var2.i;
        zzvx zzvxVar2 = v07Var.i;
        if (zzvxVar != zzvxVar2) {
            this.g.zzo(zzvxVar2.zze);
            this.j.zzd(2, new zzdq() { // from class: com.google.android.gms.internal.ads.zzhn
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj7) {
                    v07 v07Var4 = v07Var;
                    int i12 = cz6.S;
                    ((zzcd) obj7).zzt(v07Var4.i.zzd);
                }
            });
        }
        if (z4) {
            final zzbm zzbmVar = this.A;
            this.j.zzd(14, new zzdq() { // from class: com.google.android.gms.internal.ads.zzho
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj7) {
                    zzbm zzbmVar2 = zzbmVar;
                    int i12 = cz6.S;
                    ((zzcd) obj7).zzg(zzbmVar2);
                }
            });
        }
        if (z8 != z9) {
            this.j.zzd(3, new zzdq() { // from class: com.google.android.gms.internal.ads.zzhp
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj7) {
                    v07 v07Var4 = v07Var;
                    int i12 = cz6.S;
                    ((zzcd) obj7).zzd(v07Var4.g);
                }
            });
        }
        int i12 = i9;
        int i13 = i10;
        boolean z10 = z6;
        if (i12 != i13 || z5 != z10) {
            this.j.zzd(-1, new zzdq() { // from class: com.google.android.gms.internal.ads.zzhq
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj7) {
                    v07 v07Var4 = v07Var;
                    int i14 = cz6.S;
                    ((zzcd) obj7).zzn(v07Var4.l, v07Var4.e);
                }
            });
        }
        if (i12 != i13) {
            this.j.zzd(4, new zzdq() { // from class: com.google.android.gms.internal.ads.zzhr
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj7) {
                    v07 v07Var4 = v07Var;
                    int i14 = cz6.S;
                    ((zzcd) obj7).zzj(v07Var4.e);
                }
            });
        }
        if (z5 != z10) {
            this.j.zzd(5, new zzdq() { // from class: com.google.android.gms.internal.ads.zzia
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj7) {
                    v07 v07Var4 = v07Var;
                    int i14 = i2;
                    int i15 = cz6.S;
                    ((zzcd) obj7).zzh(v07Var4.l, i14);
                }
            });
        }
        if (v07Var2.m != v07Var.m) {
            this.j.zzd(6, new zzdq() { // from class: com.google.android.gms.internal.ads.zzib
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj7) {
                    v07 v07Var4 = v07Var;
                    int i14 = cz6.S;
                    ((zzcd) obj7).zzk(v07Var4.m);
                }
            });
        }
        if (o(v07Var2) != o(v07Var)) {
            this.j.zzd(7, new zzdq() { // from class: com.google.android.gms.internal.ads.zzic
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj7) {
                    ((zzcd) obj7).zze(cz6.o(v07Var));
                }
            });
        }
        if (!v07Var2.n.equals(v07Var.n)) {
            this.j.zzd(12, new zzdq() { // from class: com.google.android.gms.internal.ads.zzid
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj7) {
                    v07 v07Var4 = v07Var;
                    int i14 = cz6.S;
                    ((zzcd) obj7).zzi(v07Var4.n);
                }
            });
        }
        if (z) {
            this.j.zzd(-1, new zzdq() { // from class: com.google.android.gms.internal.ads.zzie
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj7) {
                    ((zzcd) obj7).zzp();
                }
            });
        }
        zzcc zzccVar = this.z;
        zzcc zzccVarZzG = zzel.zzG(this.e, this.c);
        this.z = zzccVarZzG;
        if (!zzccVarZzG.equals(zzccVar)) {
            this.j.zzd(13, new zzdq() { // from class: com.google.android.gms.internal.ads.zzhs
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj7) {
                    ((zzcd) obj7).zza(this.zza.z);
                }
            });
        }
        this.j.zzc();
        if (v07Var2.o != v07Var.o) {
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                ((zzgz) it.next()).zza(v07Var.o);
            }
        }
        if (v07Var2.p != v07Var.p) {
            Iterator it2 = this.k.iterator();
            while (it2.hasNext()) {
                ((zzgz) it2.next()).zzb(v07Var.p);
            }
        }
    }

    public final void n() {
        this.d.zzb();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.p;
        if (threadCurrentThread != looper.getThread()) {
            String strZzI = zzel.zzI("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), looper.getThread().getName());
            if (this.J) {
                throw new IllegalStateException(strZzI);
            }
            zzdu.zzb("ExoPlayerImpl", strZzI, this.K ? null : new IllegalStateException());
            this.K = true;
        }
    }

    public final long p() {
        n();
        if (!zzs()) {
            zzcn zzcnVarZzn = zzn();
            if (zzcnVarZzn.zzo()) {
                return -9223372036854775807L;
            }
            return zzel.zzz(zzcnVarZzn.zze(zzf(), this.a, 0L).zzn);
        }
        v07 v07Var = this.N;
        zzsg zzsgVar = v07Var.b;
        Object obj = zzsgVar.zza;
        zzcn zzcnVar = v07Var.a;
        zzck zzckVar = this.l;
        zzcnVar.zzn(obj, zzckVar);
        return zzel.zzz(zzckVar.zzg(zzsgVar.zzb, zzsgVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zzd() {
        n();
        if (zzs()) {
            return this.N.b.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zze() {
        n();
        if (zzs()) {
            return this.N.b.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zzf() {
        n();
        int iA = a();
        if (iA == -1) {
            return 0;
        }
        return iA;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zzg() {
        n();
        if (this.N.a.zzo()) {
            return 0;
        }
        v07 v07Var = this.N;
        return v07Var.a.zza(v07Var.b.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zzh() {
        n();
        return this.N.e;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zzi() {
        n();
        return this.N.m;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zzj() {
        n();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final long zzk() {
        n();
        if (!zzs()) {
            return zzl();
        }
        v07 v07Var = this.N;
        v07Var.a.zzn(v07Var.b.zza, this.l);
        v07 v07Var2 = this.N;
        if (v07Var2.c != -9223372036854775807L) {
            return zzel.zzz(0L) + zzel.zzz(this.N.c);
        }
        long j = v07Var2.a.zze(zzf(), this.a, 0L).zzm;
        return zzel.zzz(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final long zzl() {
        n();
        return zzel.zzz(b(this.N));
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final long zzm() {
        n();
        return zzel.zzz(this.N.r);
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final zzcn zzn() {
        n();
        return this.N.a;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final zzcy zzo() {
        n();
        return this.N.i.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzp(int i, long j) {
        n();
        this.o.zzx();
        zzcn zzcnVar = this.N.a;
        if (i < 0 || (!zzcnVar.zzo() && i >= zzcnVar.zzc())) {
            throw new zzag(zzcnVar, i, j);
        }
        this.v++;
        if (zzs()) {
            Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            zziz zzizVar = new zziz(this.N);
            zzizVar.zza(1);
            cz6 cz6Var = this.Q.zza;
            cz6Var.getClass();
            cz6Var.h.zzg(new zzhv(cz6Var, zzizVar));
            return;
        }
        int i2 = zzh() != 1 ? 2 : 1;
        int iZzf = zzf();
        v07 v07VarF = f(this.N.f(i2), zzcnVar, d(zzcnVar, i, j));
        long jZzv = zzel.zzv(j);
        xz6 xz6Var = this.i;
        xz6Var.getClass();
        xz6Var.D.zzb(3, new wz6(zzcnVar, i, jZzv)).zza();
        m(v07VarF, 0, 1, true, true, 1, b(v07VarF), iZzf);
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final boolean zzq() {
        n();
        return this.N.l;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final boolean zzr() {
        n();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final boolean zzs() {
        n();
        return this.N.b.zzb();
    }
}
