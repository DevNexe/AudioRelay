package defpackage;

import android.net.Uri;
import android.os.Handler;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.ads.zzaag;
import com.google.android.gms.internal.ads.zzaai;
import com.google.android.gms.internal.ads.zzaam;
import com.google.android.gms.internal.ads.zzacj;
import com.google.android.gms.internal.ads.zzad;
import com.google.android.gms.internal.ads.zzaf;
import com.google.android.gms.internal.ads.zzbq;
import com.google.android.gms.internal.ads.zzbt;
import com.google.android.gms.internal.ads.zzbu;
import com.google.android.gms.internal.ads.zzcp;
import com.google.android.gms.internal.ads.zzdd;
import com.google.android.gms.internal.ads.zzde;
import com.google.android.gms.internal.ads.zzdg;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zzev;
import com.google.android.gms.internal.ads.zzew;
import com.google.android.gms.internal.ads.zzfa;
import com.google.android.gms.internal.ads.zzfn;
import com.google.android.gms.internal.ads.zzfw;
import com.google.android.gms.internal.ads.zzkb;
import com.google.android.gms.internal.ads.zzpi;
import com.google.android.gms.internal.ads.zzpo;
import com.google.android.gms.internal.ads.zzrj;
import com.google.android.gms.internal.ads.zzrx;
import com.google.android.gms.internal.ads.zzsc;
import com.google.android.gms.internal.ads.zzsd;
import com.google.android.gms.internal.ads.zzse;
import com.google.android.gms.internal.ads.zzsp;
import com.google.android.gms.internal.ads.zzsz;
import com.google.android.gms.internal.ads.zzta;
import com.google.android.gms.internal.ads.zztb;
import com.google.android.gms.internal.ads.zztn;
import com.google.android.gms.internal.ads.zztu;
import com.google.android.gms.internal.ads.zztv;
import com.google.android.gms.internal.ads.zztw;
import com.google.android.gms.internal.ads.zzue;
import com.google.android.gms.internal.ads.zzvq;
import com.google.android.gms.internal.ads.zzwf;
import com.google.android.gms.internal.ads.zzwj;
import com.google.android.gms.internal.ads.zzwk;
import com.google.android.gms.internal.ads.zzwl;
import com.google.android.gms.internal.ads.zzwn;
import com.google.android.gms.internal.ads.zzwp;
import com.google.android.gms.internal.ads.zzwq;
import com.google.android.gms.internal.ads.zzws;
import com.google.android.gms.internal.ads.zzwt;
import com.google.android.gms.internal.ads.zzzi;
import defpackage.hb7;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class hb7 implements zzse, zzzi, zzwl, zzwq, zztu {
    public static final Map f0;
    public static final zzaf g0;
    public final zztn A;
    public final long B;
    public final zzsz D;
    public zzsd I;
    public zzacj J;
    public boolean M;
    public boolean N;
    public boolean O;
    public j95 P;
    public zzaai Q;
    public boolean S;
    public boolean U;
    public boolean V;
    public int W;
    public long Y;
    public boolean a0;
    public int b0;
    public boolean c0;
    public boolean d0;
    public final zzwf e0;
    public final Uri w;
    public final zzev x;
    public final zzpo y;
    public final zzsp z;
    public final zzwt C = new zzwt("ProgressiveMediaPeriod");
    public final zzdg E = new zzdg(zzde.zza);
    public final zzta F = new Runnable() { // from class: com.google.android.gms.internal.ads.zzta
        @Override // java.lang.Runnable
        public final void run() {
            hb7 hb7Var = this.zza;
            Map map = hb7.f0;
            hb7Var.e();
        }
    };
    public final zztb G = new Runnable() { // from class: com.google.android.gms.internal.ads.zztb
        @Override // java.lang.Runnable
        public final void run() {
            hb7 hb7Var = this.zza;
            if (hb7Var.d0) {
                return;
            }
            zzsd zzsdVar = hb7Var.I;
            zzsdVar.getClass();
            zzsdVar.zzg(hb7Var);
        }
    };
    public final Handler H = zzel.zzD(null);
    public gb7[] L = new gb7[0];
    public zztv[] K = new zztv[0];
    public long Z = -9223372036854775807L;
    public long X = -1;
    public long R = -9223372036854775807L;
    public int T = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f0 = Collections.unmodifiableMap(map);
        zzad zzadVar = new zzad();
        zzadVar.zzH("icy");
        zzadVar.zzS("application/x-icy");
        g0 = zzadVar.zzY();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.ads.zzta] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.android.gms.internal.ads.zztb] */
    public hb7(Uri uri, zzev zzevVar, zzrj zzrjVar, zzpo zzpoVar, zzpi zzpiVar, zzsp zzspVar, zztn zztnVar, zzwf zzwfVar, int i) {
        this.w = uri;
        this.x = zzevVar;
        this.y = zzpoVar;
        this.z = zzspVar;
        this.A = zztnVar;
        this.e0 = zzwfVar;
        this.B = i;
        this.D = zzrjVar;
    }

    public final int a() {
        int iZzc = 0;
        for (zztv zztvVar : this.K) {
            iZzc += zztvVar.zzc();
        }
        return iZzc;
    }

    public final long b() {
        long jMax = Long.MIN_VALUE;
        for (zztv zztvVar : this.K) {
            jMax = Math.max(jMax, zztvVar.zzg());
        }
        return jMax;
    }

    public final zztv c(gb7 gb7Var) {
        int length = this.K.length;
        for (int i = 0; i < length; i++) {
            if (gb7Var.equals(this.L[i])) {
                return this.K[i];
            }
        }
        zzpo zzpoVar = this.y;
        zzpoVar.getClass();
        zztv zztvVar = new zztv(this.e0, zzpoVar);
        zztvVar.zzu(this);
        int i2 = length + 1;
        gb7[] gb7VarArr = (gb7[]) Arrays.copyOf(this.L, i2);
        gb7VarArr[length] = gb7Var;
        this.L = (gb7[]) zzel.zzac(gb7VarArr);
        zztv[] zztvVarArr = (zztv[]) Arrays.copyOf(this.K, i2);
        zztvVarArr[length] = zztvVar;
        this.K = (zztv[]) zzel.zzac(zztvVarArr);
        return zztvVar;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    public final void d() {
        zzdd.zzf(this.N);
        this.P.getClass();
        this.Q.getClass();
    }

    public final void e() {
        int i;
        if (this.d0 || this.N || !this.M || this.Q == null) {
            return;
        }
        for (zztv zztvVar : this.K) {
            if (zztvVar.zzh() == null) {
                return;
            }
        }
        this.E.zzc();
        int length = this.K.length;
        zzcp[] zzcpVarArr = new zzcp[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzaf zzafVarZzh = this.K[i2].zzh();
            zzafVarZzh.getClass();
            String str = zzafVarZzh.zzm;
            boolean zZzg = zzbt.zzg(str);
            boolean z = zZzg || zzbt.zzh(str);
            zArr[i2] = z;
            this.O = z | this.O;
            zzacj zzacjVar = this.J;
            if (zzacjVar != null) {
                if (zZzg || this.L[i2].b) {
                    zzbq zzbqVar = zzafVarZzh.zzk;
                    zzbq zzbqVar2 = zzbqVar == null ? new zzbq(zzacjVar) : zzbqVar.zzc(zzacjVar);
                    zzad zzadVarZzb = zzafVarZzh.zzb();
                    zzadVarZzb.zzM(zzbqVar2);
                    zzafVarZzh = zzadVarZzb.zzY();
                }
                if (zZzg && zzafVarZzh.zzg == -1 && zzafVarZzh.zzh == -1 && (i = zzacjVar.zza) != -1) {
                    zzad zzadVarZzb2 = zzafVarZzh.zzb();
                    zzadVarZzb2.zzv(i);
                    zzafVarZzh = zzadVarZzb2.zzY();
                }
            }
            zzcpVarArr[i2] = new zzcp(Integer.toString(i2), zzafVarZzh.zzc(this.y.zza(zzafVarZzh)));
        }
        this.P = new j95(new zzue(zzcpVarArr), zArr);
        this.N = true;
        zzsd zzsdVar = this.I;
        zzsdVar.getClass();
        zzsdVar.zzi(this);
    }

    public final void f(int i) {
        d();
        j95 j95Var = this.P;
        boolean[] zArr = (boolean[]) j95Var.d;
        if (zArr[i]) {
            return;
        }
        zzaf zzafVarZzb = ((zzue) j95Var.a).zzb(i).zzb(0);
        this.z.zzd(zzbt.zzb(zzafVarZzb.zzm), zzafVarZzb, 0, null, this.Y);
        zArr[i] = true;
    }

    public final void g(int i) {
        d();
        boolean[] zArr = (boolean[]) this.P.b;
        if (this.a0 && zArr[i] && !this.K[i].zzx(false)) {
            this.Z = 0L;
            this.a0 = false;
            this.V = true;
            this.Y = 0L;
            this.b0 = 0;
            for (zztv zztvVar : this.K) {
                zztvVar.zzp(false);
            }
            zzsd zzsdVar = this.I;
            zzsdVar.getClass();
            zzsdVar.zzg(this);
        }
    }

    public final void h() {
        eb7 eb7Var = new eb7(this, this.w, this.x, this.D, this, this.E);
        if (this.N) {
            zzdd.zzf(i());
            long j = this.R;
            if (j != -9223372036854775807L && this.Z > j) {
                this.c0 = true;
                this.Z = -9223372036854775807L;
                return;
            }
            zzaai zzaaiVar = this.Q;
            zzaaiVar.getClass();
            long j2 = zzaaiVar.zzg(this.Z).zza.zzc;
            long j3 = this.Z;
            eb7Var.g.zza = j2;
            eb7Var.j = j3;
            eb7Var.i = true;
            eb7Var.n = false;
            for (zztv zztvVar : this.K) {
                zztvVar.zzt(this.Z);
            }
            this.Z = -9223372036854775807L;
        }
        this.b0 = a();
        long jZza = this.C.zza(eb7Var, this, zzwj.zza(this.T));
        zzfa zzfaVar = eb7Var.k;
        this.z.zzl(new zzrx(eb7Var.a, zzfaVar, zzfaVar.zza, Collections.emptyMap(), jZza, 0L, 0L), 1, -1, null, 0, null, eb7Var.j, this.R);
    }

    public final boolean i() {
        return this.Z != -9223372036854775807L;
    }

    public final boolean j() {
        return this.V || i();
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzB() {
        this.M = true;
        this.H.post(this.F);
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    public final void zzG(zzwp zzwpVar, long j, long j2, boolean z) {
        eb7 eb7Var = (eb7) zzwpVar;
        zzfw zzfwVar = eb7Var.c;
        this.z.zzf(new zzrx(eb7Var.a, eb7Var.k, zzfwVar.zzh(), zzfwVar.zzi(), j, j2, zzfwVar.zzg()), 1, -1, null, 0, null, eb7Var.j, this.R);
        if (z) {
            return;
        }
        if (this.X == -1) {
            this.X = eb7Var.l;
        }
        for (zztv zztvVar : this.K) {
            zztvVar.zzp(false);
        }
        if (this.W > 0) {
            zzsd zzsdVar = this.I;
            zzsdVar.getClass();
            zzsdVar.zzg(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    public final void zzH(zzwp zzwpVar, long j, long j2) {
        zzaai zzaaiVar;
        if (this.R == -9223372036854775807L && (zzaaiVar = this.Q) != null) {
            boolean zZzh = zzaaiVar.zzh();
            long jB = b();
            long j3 = jB == Long.MIN_VALUE ? 0L : jB + 10000;
            this.R = j3;
            this.A.zza(j3, zZzh, this.S);
        }
        eb7 eb7Var = (eb7) zzwpVar;
        zzfw zzfwVar = eb7Var.c;
        this.z.zzh(new zzrx(eb7Var.a, eb7Var.k, zzfwVar.zzh(), zzfwVar.zzi(), j, j2, zzfwVar.zzg()), 1, -1, null, 0, null, eb7Var.j, this.R);
        if (this.X == -1) {
            this.X = eb7Var.l;
        }
        this.c0 = true;
        zzsd zzsdVar = this.I;
        zzsdVar.getClass();
        zzsdVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzwq
    public final void zzI() {
        for (zztv zztvVar : this.K) {
            zztvVar.zzo();
        }
        this.D.zze();
    }

    @Override // com.google.android.gms.internal.ads.zztu
    public final void zzJ(zzaf zzafVar) {
        this.H.post(this.F);
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzL(final zzaai zzaaiVar) {
        this.H.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zztc
            @Override // java.lang.Runnable
            public final void run() {
                hb7 hb7Var = this.zza;
                zzaai zzaaiVar2 = zzaaiVar;
                hb7Var.Q = hb7Var.J == null ? zzaaiVar2 : new zzaah(-9223372036854775807L, 0L);
                hb7Var.R = zzaaiVar2.zze();
                boolean z = hb7Var.X == -1 && zzaaiVar2.zze() == -9223372036854775807L;
                hb7Var.S = z;
                hb7Var.T = true == z ? 7 : 1;
                hb7Var.A.zza(hb7Var.R, zzaaiVar2.zzh(), hb7Var.S);
                if (hb7Var.N) {
                    return;
                }
                hb7Var.e();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final long zza(long j, zzkb zzkbVar) {
        long j2;
        d();
        if (!this.Q.zzh()) {
            return 0L;
        }
        zzaag zzaagVarZzg = this.Q.zzg(j);
        long j3 = zzaagVarZzg.zza.zzb;
        long j4 = zzaagVarZzg.zzb.zzb;
        long j5 = zzkbVar.zzf;
        if (j5 != 0) {
            j2 = j5;
        } else {
            if (zzkbVar.zzg == 0) {
                return j;
            }
            j2 = 0;
        }
        long jZzx = zzel.zzx(j, j2, Long.MIN_VALUE);
        long jZzq = zzel.zzq(j, zzkbVar.zzg, Long.MAX_VALUE);
        boolean z = jZzx <= j3 && j3 <= jZzq;
        boolean z2 = jZzx <= j4 && j4 <= jZzq;
        if (z && z2) {
            if (Math.abs(j3 - j) > Math.abs(j4 - j)) {
                return j4;
            }
        } else if (!z) {
            return z2 ? j4 : jZzx;
        }
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzty
    public final long zzb() {
        long jB;
        d();
        boolean[] zArr = (boolean[]) this.P.b;
        if (this.c0) {
            return Long.MIN_VALUE;
        }
        if (i()) {
            return this.Z;
        }
        if (this.O) {
            int length = this.K.length;
            jB = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.K[i].zzw()) {
                    jB = Math.min(jB, this.K[i].zzg());
                }
            }
        } else {
            jB = Long.MAX_VALUE;
        }
        if (jB == Long.MAX_VALUE) {
            jB = b();
        }
        return jB == Long.MIN_VALUE ? this.Y : jB;
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzty
    public final long zzc() {
        if (this.W == 0) {
            return Long.MIN_VALUE;
        }
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final long zzd() {
        if (!this.V) {
            return -9223372036854775807L;
        }
        if (!this.c0 && a() <= this.b0) {
            return -9223372036854775807L;
        }
        this.V = false;
        return this.Y;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final long zze(long j) {
        d();
        boolean[] zArr = (boolean[]) this.P.b;
        if (true != this.Q.zzh()) {
            j = 0;
        }
        this.V = false;
        this.Y = j;
        if (i()) {
            this.Z = j;
            return j;
        }
        if (this.T != 7) {
            int length = this.K.length;
            for (int i = 0; i < length; i++) {
                if (this.K[i].zzy(j, false) || (!zArr[i] && this.O)) {
                }
            }
            return j;
        }
        this.a0 = false;
        this.Z = j;
        this.c0 = false;
        zzwt zzwtVar = this.C;
        if (zzwtVar.zzl()) {
            for (zztv zztvVar : this.K) {
                zztvVar.zzj();
            }
            zzwtVar.zzg();
        } else {
            zzwtVar.zzh();
            for (zztv zztvVar2 : this.K) {
                zztvVar2.zzp(false);
            }
        }
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    @Override // com.google.android.gms.internal.ads.zzse
    public final long zzf(zzvq[] zzvqVarArr, boolean[] zArr, zztw[] zztwVarArr, boolean[] zArr2, long j) {
        boolean z;
        zzvq zzvqVar;
        d();
        j95 j95Var = this.P;
        zzue zzueVar = (zzue) j95Var.a;
        boolean[] zArr3 = (boolean[]) j95Var.c;
        int i = this.W;
        int i2 = 0;
        for (int i3 = 0; i3 < zzvqVarArr.length; i3++) {
            zztw zztwVar = zztwVarArr[i3];
            if (zztwVar != null && (zzvqVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((fb7) zztwVar).a;
                zzdd.zzf(zArr3[i4]);
                this.W--;
                zArr3[i4] = false;
                zztwVarArr[i3] = null;
            }
        }
        if (this.U) {
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
        } else if (j != 0) {
            z = true;
        } else {
            j = 0;
            z = false;
        }
        for (int i5 = 0; i5 < zzvqVarArr.length; i5++) {
            if (zztwVarArr[i5] == null && (zzvqVar = zzvqVarArr[i5]) != null) {
                zzdd.zzf(zzvqVar.zzc() == 1);
                zzdd.zzf(zzvqVar.zza(0) == 0);
                int iZza = zzueVar.zza(zzvqVar.zze());
                zzdd.zzf(!zArr3[iZza]);
                this.W++;
                zArr3[iZza] = true;
                zztwVarArr[i5] = new fb7(this, iZza);
                zArr2[i5] = true;
                if (!z) {
                    zztv zztvVar = this.K[iZza];
                    z = (zztvVar.zzy(j, true) || zztvVar.zza() == 0) ? false : true;
                }
            }
        }
        if (this.W == 0) {
            this.a0 = false;
            this.V = false;
            zzwt zzwtVar = this.C;
            if (zzwtVar.zzl()) {
                zztv[] zztvVarArr = this.K;
                int length = zztvVarArr.length;
                while (i2 < length) {
                    zztvVarArr[i2].zzj();
                    i2++;
                }
                zzwtVar.zzg();
            } else {
                for (zztv zztvVar2 : this.K) {
                    zztvVar2.zzp(false);
                }
            }
        } else if (z) {
            j = zze(j);
            while (i2 < zztwVarArr.length) {
                if (zztwVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.U = true;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final zzue zzh() {
        d();
        return (zzue) this.P.a;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzj(long j, boolean z) {
        d();
        if (i()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.P.c;
        int length = this.K.length;
        for (int i = 0; i < length; i++) {
            this.K[i].zzi(j, false, zArr[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzk() throws IOException {
        this.C.zzi(zzwj.zza(this.T));
        if (this.c0 && !this.N) {
            throw zzbu.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzl(zzsd zzsdVar, long j) {
        this.I = zzsdVar;
        this.E.zze();
        h();
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzty
    public final void zzm(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzty
    public final boolean zzo(long j) {
        if (this.c0) {
            return false;
        }
        zzwt zzwtVar = this.C;
        if (zzwtVar.zzk() || this.a0) {
            return false;
        }
        if (this.N && this.W == 0) {
            return false;
        }
        boolean zZze = this.E.zze();
        if (zzwtVar.zzl()) {
            return zZze;
        }
        h();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzty
    public final boolean zzp() {
        return this.C.zzl() && this.E.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    public final zzwn zzt(zzwp zzwpVar, long j, long j2, IOException iOException, int i) {
        long jMin;
        zzwn zzwnVarZzb;
        zzaai zzaaiVar;
        eb7 eb7Var = (eb7) zzwpVar;
        if (this.X == -1) {
            this.X = eb7Var.l;
        }
        zzfw zzfwVar = eb7Var.c;
        zzrx zzrxVar = new zzrx(eb7Var.a, eb7Var.k, zzfwVar.zzh(), zzfwVar.zzi(), j, j2, zzfwVar.zzg());
        zzwk zzwkVar = new zzwk(zzrxVar, new zzsc(1, -1, null, 0, null, zzel.zzz(eb7Var.j), zzel.zzz(this.R)), iOException, i);
        Throwable cause = zzwkVar.zzc;
        if ((cause instanceof zzbu) || (cause instanceof FileNotFoundException) || (cause instanceof zzfn) || (cause instanceof zzws)) {
            jMin = -9223372036854775807L;
            break;
        }
        while (true) {
            if (cause == null) {
                jMin = Math.min((zzwkVar.zzd - 1) * AdError.NETWORK_ERROR_CODE, 5000);
                break;
            }
            if ((cause instanceof zzew) && ((zzew) cause).zza == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            zzwnVarZzb = zzwt.zzd;
        } else {
            int iA = a();
            boolean z = iA > this.b0;
            if (this.X == -1 && ((zzaaiVar = this.Q) == null || zzaaiVar.zze() == -9223372036854775807L)) {
                boolean z2 = this.N;
                if (!z2 || j()) {
                    this.V = z2;
                    this.Y = 0L;
                    this.b0 = 0;
                    for (zztv zztvVar : this.K) {
                        zztvVar.zzp(false);
                    }
                    eb7Var.g.zza = 0L;
                    eb7Var.j = 0L;
                    eb7Var.i = true;
                    eb7Var.n = false;
                } else {
                    this.a0 = true;
                    zzwnVarZzb = zzwt.zzc;
                }
            } else {
                this.b0 = iA;
            }
            zzwnVarZzb = zzwt.zzb(z, jMin);
        }
        this.z.zzj(zzrxVar, 1, -1, null, 0, null, eb7Var.j, this.R, iOException, !zzwnVarZzb.zzc());
        return zzwnVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final zzaam zzv(int i, int i2) {
        return c(new gb7(i, false));
    }
}
