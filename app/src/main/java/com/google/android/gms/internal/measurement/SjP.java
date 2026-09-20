package com.google.android.gms.internal.measurement;

import com.google.android.gms.ads.AdRequest;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import defpackage.d27;
import defpackage.fr6;
import defpackage.hl6;
import defpackage.r37;
import defpackage.s17;
import defpackage.w37;
import defpackage.wy6;
import defpackage.x37;
import defpackage.y17;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class SjP extends vDR implements r37 {
    public static final /* synthetic */ int zza = 0;
    private static final SjP zze;
    private boolean zzA;
    private String zzB;
    private long zzC;
    private int zzD;
    private String zzE;
    private String zzF;
    private boolean zzG;
    private d27 zzH;
    private String zzI;
    private int zzJ;
    private int zzK;
    private int zzL;
    private String zzM;
    private long zzN;
    private long zzO;
    private String zzP;
    private String zzQ;
    private int zzR;
    private String zzS;
    private Aa zzT;
    private y17 zzU;
    private long zzV;
    private long zzW;
    private String zzX;
    private String zzY;
    private int zzZ;
    private boolean zzaa;
    private String zzab;
    private boolean zzac;
    private lPt3Fixed zzad;
    private String zzae;
    private d27 zzaf;
    private String zzag;
    private int zzf;
    private int zzg;
    private int zzh;
    private d27 zzi;
    private d27 zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private String zzs;
    private int zzt;
    private String zzu;
    private String zzv;
    private String zzw;
    private long zzx;
    private long zzy;
    private String zzz;

    static {
        SjP sjP = new SjP();
        zze = sjP;
        vDR.m(SjP.class, sjP);
    }

    public SjP() {
        w37 w37Var = w37.z;
        this.zzi = w37Var;
        this.zzj = w37Var;
        this.zzp = "";
        this.zzq = "";
        this.zzr = "";
        this.zzs = "";
        this.zzu = "";
        this.zzv = "";
        this.zzw = "";
        this.zzz = "";
        this.zzB = "";
        this.zzE = "";
        this.zzF = "";
        this.zzH = w37Var;
        this.zzI = "";
        this.zzM = "";
        this.zzP = "";
        this.zzQ = "";
        this.zzS = "";
        this.zzU = s17.z;
        this.zzX = "";
        this.zzY = "";
        this.zzab = "";
        this.zzae = "";
        this.zzaf = w37Var;
        this.zzag = "";
    }

    public static /* synthetic */ void A0(SjP sjP, long j) {
        sjP.zzf |= 2;
        sjP.zzk = j;
    }

    public static fr6 A1() {
        return (fr6) zze.n();
    }

    public static /* synthetic */ void B0(SjP sjP, long j) {
        sjP.zzf |= 4;
        sjP.zzl = j;
    }

    public static /* synthetic */ void C0(SjP sjP, long j) {
        sjP.zzf |= 8;
        sjP.zzm = j;
    }

    public static /* synthetic */ void D0(SjP sjP, long j) {
        sjP.zzf |= 16;
        sjP.zzn = j;
    }

    public static /* synthetic */ void E0(SjP sjP) {
        sjP.zzf &= -17;
        sjP.zzn = 0L;
    }

    public static /* synthetic */ void F0(SjP sjP, long j) {
        sjP.zzf |= 32;
        sjP.zzo = j;
    }

    public static /* synthetic */ void G(SjP sjP) {
        sjP.zzf &= Integer.MAX_VALUE;
        sjP.zzP = zze.zzP;
    }

    public static /* synthetic */ void G0(SjP sjP) {
        sjP.zzf &= -33;
        sjP.zzo = 0L;
    }

    public static /* synthetic */ void H(SjP sjP, int i) {
        sjP.zzg |= 2;
        sjP.zzR = i;
    }

    public static /* synthetic */ void H0(SjP sjP) {
        sjP.zzf |= 64;
        sjP.zzp = MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID;
    }

    public static /* synthetic */ void I(SjP sjP, int i, Xn1 xn1) {
        sjP.R0();
        sjP.zzi.set(i, xn1);
    }

    public static /* synthetic */ void I0(SjP sjP, String str) {
        str.getClass();
        sjP.zzf |= 128;
        sjP.zzq = str;
    }

    public static /* synthetic */ void J(SjP sjP, String str) {
        str.getClass();
        sjP.zzg |= 4;
        sjP.zzS = str;
    }

    public static /* synthetic */ void J0(SjP sjP) {
        sjP.zzf &= -129;
        sjP.zzq = zze.zzq;
    }

    public static void K(SjP sjP, ArrayList arrayList) {
        List list = sjP.zzU;
        if (!((wy6) list).w) {
            int size = list.size();
            int i = size == 0 ? 10 : size + size;
            s17 s17Var = (s17) list;
            if (i < s17Var.y) {
                throw new IllegalArgumentException();
            }
            sjP.zzU = new s17(Arrays.copyOf(s17Var.x, i), s17Var.y);
        }
        com5Fixed.e(arrayList, sjP.zzU);
    }

    public static /* synthetic */ void K0(SjP sjP, String str) {
        str.getClass();
        sjP.zzf |= 256;
        sjP.zzr = str;
    }

    public static /* synthetic */ void L(SjP sjP, Xn1 xn1) {
        sjP.R0();
        sjP.zzi.add(xn1);
    }

    public static /* synthetic */ void L0(SjP sjP) {
        sjP.zzf &= -257;
        sjP.zzr = zze.zzr;
    }

    public static /* synthetic */ void M(SjP sjP, long j) {
        sjP.zzg |= 16;
        sjP.zzV = j;
    }

    public static /* synthetic */ void M0(SjP sjP, String str) {
        str.getClass();
        sjP.zzf |= AdRequest.MAX_CONTENT_URL_LENGTH;
        sjP.zzs = str;
    }

    public static /* synthetic */ void N(SjP sjP, long j) {
        sjP.zzg |= 32;
        sjP.zzW = j;
    }

    public static /* synthetic */ void N0(SjP sjP, int i) {
        sjP.zzf |= 1024;
        sjP.zzt = i;
    }

    public static /* synthetic */ void O(SjP sjP, String str) {
        sjP.zzg |= 128;
        sjP.zzY = str;
    }

    public static /* synthetic */ void O0(SjP sjP, String str) {
        str.getClass();
        sjP.zzf |= 2048;
        sjP.zzu = str;
    }

    public static /* synthetic */ void P(SjP sjP, ArrayList arrayList) {
        sjP.R0();
        com5Fixed.e(arrayList, sjP.zzi);
    }

    public static /* synthetic */ void P0(SjP sjP, String str) {
        str.getClass();
        sjP.zzf |= 4096;
        sjP.zzv = str;
    }

    public static /* synthetic */ void R(SjP sjP, String str) {
        str.getClass();
        sjP.zzf |= 8192;
        sjP.zzw = str;
    }

    public static /* synthetic */ void S(SjP sjP, long j) {
        sjP.zzf |= 16384;
        sjP.zzx = j;
    }

    public static /* synthetic */ void T(SjP sjP) {
        sjP.zzf |= 32768;
        sjP.zzy = 73000L;
    }

    public static /* synthetic */ void U(SjP sjP, String str) {
        str.getClass();
        sjP.zzf |= 65536;
        sjP.zzz = str;
    }

    public static /* synthetic */ void V(SjP sjP) {
        sjP.zzf &= -65537;
        sjP.zzz = zze.zzz;
    }

    public static /* synthetic */ void W(SjP sjP, boolean z) {
        sjP.zzf |= 131072;
        sjP.zzA = z;
    }

    public static /* synthetic */ void X(SjP sjP) {
        sjP.zzf &= -131073;
        sjP.zzA = false;
    }

    public static /* synthetic */ void Y(SjP sjP, String str) {
        sjP.zzf |= 262144;
        sjP.zzB = str;
    }

    public static /* synthetic */ void Z(SjP sjP) {
        sjP.zzf &= -262145;
        sjP.zzB = zze.zzB;
    }

    public static /* synthetic */ void a0(SjP sjP, long j) {
        sjP.zzf |= 524288;
        sjP.zzC = j;
    }

    public static /* synthetic */ void b0(SjP sjP, int i) {
        sjP.zzf |= 1048576;
        sjP.zzD = i;
    }

    public static /* synthetic */ void c0(SjP sjP, String str) {
        sjP.zzf |= 2097152;
        sjP.zzE = str;
    }

    public static /* synthetic */ void d0(SjP sjP) {
        sjP.zzf &= -2097153;
        sjP.zzE = zze.zzE;
    }

    public static /* synthetic */ void e0(SjP sjP, String str) {
        str.getClass();
        sjP.zzf |= 4194304;
        sjP.zzF = str;
    }

    public static /* synthetic */ void f0(SjP sjP) {
        sjP.zzf |= 8388608;
        sjP.zzG = false;
    }

    public static /* synthetic */ void g0(SjP sjP, ArrayList arrayList) {
        d27 d27Var = sjP.zzH;
        if (!d27Var.zzc()) {
            sjP.zzH = vDR.k(d27Var);
        }
        com5Fixed.e(arrayList, sjP.zzH);
    }

    public static void h0(SjP sjP) {
        sjP.zzH = w37.z;
    }

    public static /* synthetic */ void i0(SjP sjP, String str) {
        sjP.zzf |= 16777216;
        sjP.zzI = str;
    }

    public static /* synthetic */ void j0(SjP sjP, int i) {
        sjP.zzf |= 33554432;
        sjP.zzJ = i;
    }

    public static /* synthetic */ void k0(SjP sjP) {
        sjP.zzf |= 1;
        sjP.zzh = 1;
    }

    public static /* synthetic */ void l0(SjP sjP) {
        sjP.zzf &= -268435457;
        sjP.zzM = zze.zzM;
    }

    public static /* synthetic */ void m0(SjP sjP, long j) {
        sjP.zzf |= 536870912;
        sjP.zzN = j;
    }

    public static /* synthetic */ void r0(SjP sjP, String str) {
        str.getClass();
        sjP.zzg |= 8192;
        sjP.zzae = str;
    }

    public static /* synthetic */ void s0(SjP sjP) {
        sjP.zzg &= -8193;
        sjP.zzae = zze.zzae;
    }

    public static /* synthetic */ void t0(SjP sjP, Set set) {
        d27 d27Var = sjP.zzaf;
        if (!d27Var.zzc()) {
            sjP.zzaf = vDR.k(d27Var);
        }
        com5Fixed.e(set, sjP.zzaf);
    }

    public static void u0(SjP sjP) {
        sjP.zzi = w37.z;
    }

    public static /* synthetic */ void v0(SjP sjP, String str) {
        str.getClass();
        sjP.zzg |= 16384;
        sjP.zzag = str;
    }

    public static /* synthetic */ void w0(SjP sjP, int i) {
        sjP.R0();
        sjP.zzi.remove(i);
    }

    public static /* synthetic */ void x0(SjP sjP, int i, qc qcVar) {
        sjP.S0();
        sjP.zzj.set(i, qcVar);
    }

    public static /* synthetic */ void y0(SjP sjP, qc qcVar) {
        sjP.S0();
        sjP.zzj.add(qcVar);
    }

    public static /* synthetic */ void z0(SjP sjP, int i) {
        sjP.S0();
        sjP.zzj.remove(i);
    }

    public final String A() {
        return this.zzz;
    }

    public final String B() {
        return this.zzae;
    }

    public final String C() {
        return this.zzs;
    }

    public final qc C1(int i) {
        return (qc) this.zzj.get(i);
    }

    public final d27 D() {
        return this.zzH;
    }

    public final String D1() {
        return this.zzS;
    }

    public final d27 E() {
        return this.zzi;
    }

    public final String E1() {
        return this.zzv;
    }

    public final d27 F() {
        return this.zzj;
    }

    public final String F1() {
        return this.zzB;
    }

    public final String G1() {
        return this.zzu;
    }

    public final int Q() {
        return this.zzJ;
    }

    public final int Q0() {
        return this.zzD;
    }

    public final void R0() {
        d27 d27Var = this.zzi;
        if (d27Var.zzc()) {
            return;
        }
        this.zzi = vDR.k(d27Var);
    }

    public final void S0() {
        d27 d27Var = this.zzj;
        if (d27Var.zzc()) {
            return;
        }
        this.zzj = vDR.k(d27Var);
    }

    public final boolean T0() {
        return (this.zzf & 536870912) != 0;
    }

    public final boolean U0() {
        return (this.zzg & 128) != 0;
    }

    public final boolean V0() {
        return (this.zzf & 524288) != 0;
    }

    public final boolean W0() {
        return (this.zzg & 16) != 0;
    }

    public final boolean X0() {
        return (this.zzf & 8) != 0;
    }

    public final boolean Y0() {
        return (this.zzf & 16384) != 0;
    }

    public final boolean Z0() {
        return (this.zzf & 131072) != 0;
    }

    public final boolean a1() {
        return (this.zzf & 32) != 0;
    }

    public final boolean b1() {
        return (this.zzf & 16) != 0;
    }

    public final boolean c1() {
        return (this.zzf & 1) != 0;
    }

    public final boolean d1() {
        return (this.zzg & 2) != 0;
    }

    public final boolean e1() {
        return (this.zzf & 8388608) != 0;
    }

    public final boolean f1() {
        return (this.zzg & 8192) != 0;
    }

    public final boolean g1() {
        return (this.zzf & 4) != 0;
    }

    public final boolean h1() {
        return (this.zzf & 1024) != 0;
    }

    public final boolean i1() {
        return (this.zzf & 2) != 0;
    }

    public final boolean j1() {
        return (this.zzf & 32768) != 0;
    }

    public final int k1() {
        return this.zzi.size();
    }

    public final int l1() {
        return this.zzh;
    }

    public final int m1() {
        return this.zzR;
    }

    public final boolean n0() {
        return this.zzA;
    }

    public final int n1() {
        return this.zzt;
    }

    public final boolean o0() {
        return this.zzG;
    }

    public final int o1() {
        return this.zzj.size();
    }

    public final boolean p0() {
        return (this.zzf & 33554432) != 0;
    }

    public final long p1() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.measurement.vDR
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new x37(zze, "\u00014\u0000\u0002\u0001A4\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.", new Object[]{"zzf", "zzg", "zzh", "zzi", Xn1.class, "zzj", qc.class, "zzk", "zzl", "zzm", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzn", "zzG", "zzH", MZ.class, "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", "zzZ", hl6.a, "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag"});
        }
        if (i2 == 3) {
            return new SjP();
        }
        if (i2 == 4) {
            return new fr6(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zze;
    }

    public final boolean q0() {
        return (this.zzf & 1048576) != 0;
    }

    public final long q1() {
        return this.zzC;
    }

    public final String r() {
        return this.zzw;
    }

    public final long r1() {
        return this.zzV;
    }

    public final String s() {
        return this.zzY;
    }

    public final long s1() {
        return this.zzm;
    }

    public final String t() {
        return this.zzr;
    }

    public final long t1() {
        return this.zzx;
    }

    public final String u() {
        return this.zzP;
    }

    public final long u1() {
        return this.zzo;
    }

    public final String v() {
        return this.zzI;
    }

    public final long v1() {
        return this.zzn;
    }

    public final String w() {
        return this.zzF;
    }

    public final long w1() {
        return this.zzl;
    }

    public final String x() {
        return this.zzE;
    }

    public final long x1() {
        return this.zzk;
    }

    public final String y() {
        return this.zzq;
    }

    public final long y1() {
        return this.zzy;
    }

    public final String z() {
        return this.zzp;
    }

    public final Xn1 z1(int i) {
        return (Xn1) this.zzi.get(i);
    }
}
