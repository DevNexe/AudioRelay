package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import defpackage.ly5;
import defpackage.my5;
import defpackage.qu6;
import defpackage.ru6;
import defpackage.ry5;
import defpackage.sy5;
import defpackage.ty5;

/* JADX INFO: loaded from: classes3.dex */
public final class zzamx extends zzgon implements zzgpy {
    private static final zzamx zzb;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzG;
    private long zzH;
    private long zzI;
    private long zzK;
    private zzamz zzN;
    private zzgow zzaA;
    private int zzaB;
    private zzgow zzaC;
    private zzams zzaD;
    private String zzaE;
    private long zzaF;
    private long zzaG;
    private long zzaH;
    private long zzaI;
    private long zzaJ;
    private long zzaK;
    private String zzaL;
    private long zzaM;
    private String zzaN;
    private int zzaO;
    private boolean zzaP;
    private String zzaQ;
    private long zzaR;
    private zzang zzaS;
    private long zzaT;
    private String zzaU;
    private zzamu zzaf;
    private zzgow zzag;
    private zzamw zzah;
    private long zzai;
    private long zzaj;
    private long zzak;
    private long zzal;
    private long zzam;
    private long zzan;
    private long zzao;
    private long zzap;
    private String zzaq;
    private long zzar;
    private int zzas;
    private int zzat;
    private int zzau;
    private zzani zzav;
    private long zzaw;
    private int zzax;
    private int zzay;
    private String zzaz;
    private int zze;
    private int zzf;
    private int zzg;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzh = "";
    private String zzi = "";
    private String zzt = "";
    private String zzD = "";
    private String zzE = "D";
    private String zzF = "";
    private String zzJ = "";
    private long zzL = -1;
    private long zzM = -1;
    private long zzO = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private String zzU = "D";
    private String zzV = "D";
    private long zzW = -1;
    private int zzX = AdError.NETWORK_ERROR_CODE;
    private int zzY = AdError.NETWORK_ERROR_CODE;
    private long zzZ = -1;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private int zzae = AdError.NETWORK_ERROR_CODE;

    static {
        zzamx zzamxVar = new zzamx();
        zzb = zzamxVar;
        zzgon.i(zzamx.class, zzamxVar);
    }

    public zzamx() {
        qu6 qu6Var = qu6.z;
        this.zzag = qu6Var;
        this.zzai = -1L;
        this.zzaj = -1L;
        this.zzak = -1L;
        this.zzal = -1L;
        this.zzam = -1L;
        this.zzan = -1L;
        this.zzao = -1L;
        this.zzap = -1L;
        this.zzaq = "D";
        this.zzar = -1L;
        this.zzaw = -1L;
        this.zzax = AdError.NETWORK_ERROR_CODE;
        this.zzay = AdError.NETWORK_ERROR_CODE;
        this.zzaz = "D";
        this.zzaA = qu6Var;
        this.zzaB = AdError.NETWORK_ERROR_CODE;
        this.zzaC = qu6Var;
        this.zzaE = "";
        this.zzaF = -1L;
        this.zzaG = -1L;
        this.zzaH = -1L;
        this.zzaI = -1L;
        this.zzaK = -1L;
        this.zzaL = "";
        this.zzaN = "";
        this.zzaO = 2;
        this.zzaQ = "";
        this.zzaU = "";
    }

    public static /* synthetic */ void A(zzamx zzamxVar, long j) {
        zzamxVar.zzf |= 8192;
        zzamxVar.zzaa = j;
    }

    public static /* synthetic */ void B(zzamx zzamxVar, long j) {
        zzamxVar.zzf |= 16384;
        zzamxVar.zzab = j;
    }

    public static /* synthetic */ void C(zzamx zzamxVar, zzamu zzamuVar) {
        zzamuVar.getClass();
        zzamxVar.zzaf = zzamuVar;
        zzamxVar.zzf |= 262144;
    }

    public static /* synthetic */ void D(zzamx zzamxVar, zzamu zzamuVar) {
        zzamuVar.getClass();
        zzgow zzgowVar = zzamxVar.zzag;
        if (!zzgowVar.zzc()) {
            zzamxVar.zzag = zzgon.g(zzgowVar);
        }
        zzamxVar.zzag.add(zzamuVar);
    }

    public static void E(zzamx zzamxVar) {
        zzamxVar.zzag = qu6.z;
    }

    public static /* synthetic */ void F(zzamx zzamxVar, zzamw zzamwVar) {
        zzamwVar.getClass();
        zzamxVar.zzah = zzamwVar;
        zzamxVar.zzf |= 524288;
    }

    public static /* synthetic */ void G(zzamx zzamxVar, long j) {
        zzamxVar.zzf |= 2097152;
        zzamxVar.zzaj = j;
    }

    public static /* synthetic */ void H(zzamx zzamxVar, long j) {
        zzamxVar.zzf |= 4194304;
        zzamxVar.zzak = j;
    }

    public static /* synthetic */ void I(zzamx zzamxVar, long j) {
        zzamxVar.zzf |= 8388608;
        zzamxVar.zzal = j;
    }

    public static /* synthetic */ void J(zzamx zzamxVar, long j) {
        zzamxVar.zzf |= 67108864;
        zzamxVar.zzao = j;
    }

    public static /* synthetic */ void K(zzamx zzamxVar, long j) {
        zzamxVar.zzf |= 134217728;
        zzamxVar.zzap = j;
    }

    public static /* synthetic */ void L(zzamx zzamxVar, String str) {
        str.getClass();
        zzamxVar.zzf |= 268435456;
        zzamxVar.zzaq = str;
    }

    public static /* synthetic */ void M(zzamx zzamxVar, long j) {
        zzamxVar.zzg |= AdRequest.MAX_CONTENT_URL_LENGTH;
        zzamxVar.zzaF = j;
    }

    public static /* synthetic */ void N(zzamx zzamxVar, long j) {
        zzamxVar.zzg |= 1024;
        zzamxVar.zzaG = j;
    }

    public static /* synthetic */ void O(zzamx zzamxVar, long j) {
        zzamxVar.zzg |= 2048;
        zzamxVar.zzaH = j;
    }

    public static /* synthetic */ void P(zzamx zzamxVar, long j) {
        zzamxVar.zzg |= 4096;
        zzamxVar.zzaI = j;
    }

    public static /* synthetic */ void Q(zzamx zzamxVar, String str) {
        str.getClass();
        zzamxVar.zzg |= 131072;
        zzamxVar.zzaN = str;
    }

    public static /* synthetic */ void R(zzamx zzamxVar, boolean z) {
        zzamxVar.zzg |= 524288;
        zzamxVar.zzaP = z;
    }

    public static /* synthetic */ void S(zzamx zzamxVar, long j) {
        zzamxVar.zzg |= 2097152;
        zzamxVar.zzaR = j;
    }

    public static /* synthetic */ void T(zzamx zzamxVar, int i) {
        zzamxVar.zzX = i - 1;
        zzamxVar.zzf |= 1024;
    }

    public static /* synthetic */ void U(zzamx zzamxVar, int i) {
        zzamxVar.zzY = i - 1;
        zzamxVar.zzf |= 2048;
    }

    public static /* synthetic */ void V(zzamx zzamxVar, int i) {
        zzamxVar.zzae = i - 1;
        zzamxVar.zzf |= 131072;
    }

    public static /* synthetic */ void W(zzamx zzamxVar, int i) {
        zzamxVar.zzax = i - 1;
        zzamxVar.zzg |= 8;
    }

    public static /* synthetic */ void X(zzamx zzamxVar, int i) {
        zzamxVar.zzay = i - 1;
        zzamxVar.zzg |= 16;
    }

    public static /* synthetic */ void Y(zzamx zzamxVar) {
        zzamxVar.zzaO = 5;
        zzamxVar.zzg |= 262144;
    }

    public static /* synthetic */ void a0(zzamx zzamxVar, String str) {
        str.getClass();
        zzamxVar.zze |= 1;
        zzamxVar.zzh = str;
    }

    public static /* synthetic */ void b0(zzamx zzamxVar, String str) {
        str.getClass();
        zzamxVar.zze |= 2;
        zzamxVar.zzi = str;
    }

    public static /* synthetic */ void c0(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 4;
        zzamxVar.zzj = j;
    }

    public static /* synthetic */ void d0(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 16;
        zzamxVar.zzl = j;
    }

    public static /* synthetic */ void e0(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 32;
        zzamxVar.zzm = j;
    }

    public static /* synthetic */ void f0(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 1024;
        zzamxVar.zzr = j;
    }

    public static /* synthetic */ void g0(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 2048;
        zzamxVar.zzs = j;
    }

    public static /* synthetic */ void h0(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 8192;
        zzamxVar.zzu = j;
    }

    public static /* synthetic */ void i0(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 16384;
        zzamxVar.zzv = j;
    }

    public static /* synthetic */ void j0(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 32768;
        zzamxVar.zzw = j;
    }

    public static /* synthetic */ void k0(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 65536;
        zzamxVar.zzx = j;
    }

    public static /* synthetic */ void l0(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 524288;
        zzamxVar.zzA = j;
    }

    public static /* synthetic */ void m(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 134217728;
        zzamxVar.zzI = j;
    }

    public static /* synthetic */ void m0(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 1048576;
        zzamxVar.zzB = j;
    }

    public static /* synthetic */ void n(zzamx zzamxVar, String str) {
        str.getClass();
        zzamxVar.zze |= 268435456;
        zzamxVar.zzJ = str;
    }

    public static /* synthetic */ void n0(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 2097152;
        zzamxVar.zzC = j;
    }

    public static /* synthetic */ void o(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 536870912;
        zzamxVar.zzK = j;
    }

    public static /* synthetic */ void o0(zzamx zzamxVar, String str) {
        str.getClass();
        zzamxVar.zze |= 4194304;
        zzamxVar.zzD = str;
    }

    public static /* synthetic */ void p(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 1073741824;
        zzamxVar.zzL = j;
    }

    public static /* synthetic */ void p0(zzamx zzamxVar, String str) {
        str.getClass();
        zzamxVar.zze |= 16777216;
        zzamxVar.zzF = str;
    }

    public static /* synthetic */ void q(zzamx zzamxVar, long j) {
        zzamxVar.zze |= Integer.MIN_VALUE;
        zzamxVar.zzM = j;
    }

    public static /* synthetic */ void q0(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 33554432;
        zzamxVar.zzG = j;
    }

    public static /* synthetic */ void r(zzamx zzamxVar, long j) {
        zzamxVar.zzf |= 2;
        zzamxVar.zzO = j;
    }

    public static /* synthetic */ void r0(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 67108864;
        zzamxVar.zzH = j;
    }

    public static /* synthetic */ void s(zzamx zzamxVar, long j) {
        zzamxVar.zzf |= 4;
        zzamxVar.zzP = j;
    }

    public static /* synthetic */ void t(zzamx zzamxVar, long j) {
        zzamxVar.zzf |= 8;
        zzamxVar.zzQ = j;
    }

    public static /* synthetic */ void u(zzamx zzamxVar, long j) {
        zzamxVar.zzf |= 16;
        zzamxVar.zzR = j;
    }

    public static /* synthetic */ void v(zzamx zzamxVar, long j) {
        zzamxVar.zzf |= 32;
        zzamxVar.zzS = j;
    }

    public static /* synthetic */ void w(zzamx zzamxVar, long j) {
        zzamxVar.zzf |= 64;
        zzamxVar.zzT = j;
    }

    public static /* synthetic */ void x(zzamx zzamxVar, String str) {
        str.getClass();
        zzamxVar.zzf |= 128;
        zzamxVar.zzU = str;
    }

    public static /* synthetic */ void y(zzamx zzamxVar, String str) {
        str.getClass();
        zzamxVar.zzf |= 256;
        zzamxVar.zzV = str;
    }

    public static /* synthetic */ void z(zzamx zzamxVar, long j) {
        zzamxVar.zzf |= 4096;
        zzamxVar.zzZ = j;
    }

    public static zzamh zza() {
        return (zzamh) zzb.j();
    }

    public static zzamx zzd() {
        return zzb;
    }

    public static zzamx zze(byte[] bArr, zzgnz zzgnzVar) {
        zzgon zzgonVarL = zzgon.l(zzb, bArr, bArr.length, zzgnzVar);
        zzgon.d(zzgonVarL);
        return (zzamx) zzgonVarL;
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
            return new ru6(zzb, "\u0001\\\u0000\u0003\u0001Į\\\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂP\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈQ\u0019ဂU\u001aဌR\u001bဈ\u0016\u001cဇS\u001dဈ\u0018\u001eဈT\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0ဌ*1ဌ+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08ဌ19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=Aဌ>Bဌ?Cဈ<Dဌ@EဉAFဂBGဂ8Hဂ9IဌCJဂ)Kဈ\u0017LဌDMဈEN\u001bOဌFP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMXဂNYဈOÉဉVĭဂWĮဈX", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzaM", "zzB", "zzC", "zzaN", "zzaR", "zzaO", my5.a, "zzD", "zzaP", "zzF", "zzaQ", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzag", zzamu.class, "zzS", "zzT", "zzU", "zzV", "zzX", sy5Var, "zzY", sy5Var, "zzaf", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", sy5Var, "zzah", "zzai", "zzaj", "zzak", "zzal", "zzao", "zzap", "zzar", "zzas", ry5.a, "zzat", ty5.a, "zzaq", "zzau", ly5.a, "zzav", "zzaw", "zzam", "zzan", "zzax", sy5Var, "zzW", "zzE", "zzay", sy5Var, "zzaz", "zzaA", zzamq.class, "zzaB", sy5Var, "zzaC", zzamk.class, "zzaD", "zzaE", "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaS", "zzaT", "zzaU"});
        }
        if (i2 == 3) {
            return new zzamx();
        }
        if (i2 == 4) {
            return new zzamh(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean zzah() {
        return this.zzaP;
    }

    public final boolean zzai() {
        return (this.zze & 4194304) != 0;
    }

    public final boolean zzaj() {
        return (this.zzg & 4194304) != 0;
    }

    public final int zzak() {
        int iZza = zzamn.zza(this.zzaO);
        if (iZza == 0) {
            return 3;
        }
        return iZza;
    }

    public final zzang zzf() {
        zzang zzangVar = this.zzaS;
        return zzangVar == null ? zzang.zzd() : zzangVar;
    }

    public final String zzg() {
        return this.zzaN;
    }

    public final String zzh() {
        return this.zzD;
    }
}
