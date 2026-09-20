package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class kz1 extends b43 implements ob2, iy1, xw2, j81<dn, sd5> {
    public static final LPt8Fixed S = LPt8Fixed.w;
    public static final F1 T = F1.w;
    public static final xq3 U = new xq3();
    public static final QnHx V = new QnHx();
    public static final CQf W = new CQf();
    public final yy1 A;
    public kz1 B;
    public boolean C;
    public j81<? super ta1, sd5> D;
    public ij0 E;
    public jy1 F;
    public boolean H;
    public sb2 I;
    public LinkedHashMap J;
    public float L;
    public boolean M;
    public oi2 N;
    public boolean Q;
    public uw2 R;
    public float G = 0.8f;
    public long K = mp1.b;
    public final fz1<?, ?>[] O = new fz1[6];
    public final T23 P = new T23();

    public static final class CQf implements NUlFixed<z84, z84, a94> {
        @Override // kz1.NUlFixed
        public final void a(yy1 yy1Var, long j, cd1<z84> cd1Var, boolean z, boolean z2) {
            cw2 cw2Var = yy1Var.Z;
            cw2Var.B.Q0(kz1.W, cw2Var.B.I0(j), cd1Var, true, z2);
        }

        @Override // kz1.NUlFixed
        public final /* bridge */ /* synthetic */ void b(fz1 fz1Var) {
        }

        @Override // kz1.NUlFixed
        public final z84 c(fz1 fz1Var) {
            return (z84) fz1Var;
        }

        @Override // kz1.NUlFixed
        public final boolean d(yy1 yy1Var) {
            x84 x84VarC;
            z84 z84VarZ = fp1.Z(yy1Var);
            boolean z = false;
            if (z84VarZ != null && (x84VarC = z84VarZ.c()) != null && x84VarC.y) {
                z = true;
            }
            return !z;
        }

        @Override // kz1.NUlFixed
        public final int e() {
            return 2;
        }
    }

    public static final class F1 extends cx1 implements j81<kz1, sd5> {
        public static final F1 w = new F1();

        public F1() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(kz1 kz1Var) {
            uw2 uw2Var = kz1Var.R;
            if (uw2Var != null) {
                uw2Var.invalidate();
            }
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements j81<kz1, sd5> {
        public static final LPt8Fixed w = new LPt8Fixed();

        public LPt8Fixed() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(kz1 kz1Var) {
            kz1 kz1Var2 = kz1Var;
            if (kz1Var2.isValid()) {
                kz1Var2.d1();
            }
            return sd5.a;
        }
    }

    public interface NUlFixed<T extends fz1<T, M>, C, M extends pg2> {
        void a(yy1 yy1Var, long j, cd1<C> cd1Var, boolean z, boolean z2);

        void b(fz1 fz1Var);

        C c(T t);

        boolean d(yy1 yy1Var);

        int e();
    }

    public static final class QnHx implements NUlFixed<f93, j93, k93> {
        @Override // kz1.NUlFixed
        public final void a(yy1 yy1Var, long j, cd1<j93> cd1Var, boolean z, boolean z2) {
            yy1Var.w(j, cd1Var, z, z2);
        }

        @Override // kz1.NUlFixed
        public final void b(fz1 fz1Var) {
            ((k93) ((f93) fz1Var).x).N().getClass();
        }

        @Override // kz1.NUlFixed
        public final j93 c(fz1 fz1Var) {
            return ((k93) ((f93) fz1Var).x).N();
        }

        @Override // kz1.NUlFixed
        public final boolean d(yy1 yy1Var) {
            return true;
        }

        @Override // kz1.NUlFixed
        public final int e() {
            return 1;
        }
    }

    public static final class T23 extends cx1 implements h81<sd5> {
        public T23() {
            super(0);
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            kz1 kz1Var = kz1.this.B;
            if (kz1Var != null) {
                kz1Var.S0();
            }
            return sd5.a;
        }
    }

    public static final class YKK extends cx1 implements h81<sd5> {
        public final /* synthetic */ cd1<C> A;
        public final /* synthetic */ boolean B;
        public final /* synthetic */ boolean C;

        /* JADX INFO: Incorrect field signature: TT; */
        public final /* synthetic */ fz1 x;
        public final /* synthetic */ NUlFixed<T, C, M> y;
        public final /* synthetic */ long z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lkz1;TT;Lkz1$NUl<TT;TC;TM;>;JLcd1<TC;>;ZZ)V */
        public YKK(fz1 fz1Var, NUlFixed nUl, long j, cd1 cd1Var, boolean z, boolean z2) {
            super(0);
            this.x = fz1Var;
            this.y = nUl;
            this.z = j;
            this.A = cd1Var;
            this.B = z;
            this.C = z2;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            kz1.this.O0(this.x.y, this.y, this.z, this.A, this.B, this.C);
            return sd5.a;
        }
    }

    public static final class auxFixed extends cx1 implements h81<sd5> {
        public final /* synthetic */ cd1<C> A;
        public final /* synthetic */ boolean B;
        public final /* synthetic */ boolean C;
        public final /* synthetic */ float D;

        /* JADX INFO: Incorrect field signature: TT; */
        public final /* synthetic */ fz1 x;
        public final /* synthetic */ NUlFixed<T, C, M> y;
        public final /* synthetic */ long z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lkz1;TT;Lkz1$NUl<TT;TC;TM;>;JLcd1<TC;>;ZZF)V */
        public auxFixed(fz1 fz1Var, NUlFixed nUl, long j, cd1 cd1Var, boolean z, boolean z2, float f) {
            super(0);
            this.x = fz1Var;
            this.y = nUl;
            this.z = j;
            this.A = cd1Var;
            this.B = z;
            this.C = z2;
            this.D = f;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            kz1.this.P0(this.x.y, this.y, this.z, this.A, this.B, this.C, this.D);
            return sd5.a;
        }
    }

    public static final class byN extends cx1 implements h81<sd5> {
        public final /* synthetic */ j81<ta1, sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public byN(j81<? super ta1, sd5> j81Var) {
            super(0);
            this.w = j81Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.invoke(kz1.U);
            return sd5.a;
        }
    }

    public kz1(yy1 yy1Var) {
        this.A = yy1Var;
        this.E = yy1Var.L;
        this.F = yy1Var.N;
    }

    public final long A0(kz1 kz1Var, long j) {
        if (kz1Var == this) {
            return j;
        }
        kz1 kz1Var2 = this.B;
        return (kz1Var2 == null || ur1.a(kz1Var, kz1Var2)) ? I0(j) : I0(kz1Var2.A0(kz1Var, j));
    }

    @Override // defpackage.b43, defpackage.zq1
    public final Object B() {
        return M0((pk4) this.O[3]);
    }

    public abstract int C0(IlK ilK);

    public final long D0(long j) {
        return ps0.e(Math.max(0.0f, (cm4.e(j) - k0()) / 2.0f), Math.max(0.0f, (cm4.c(j) - h0()) / 2.0f));
    }

    public final void E0() {
        for (fz1 fz1Var : this.O) {
            for (; fz1Var != null; fz1Var = fz1Var.y) {
                fz1Var.b();
            }
        }
        this.H = false;
        U0(this.D);
        yy1 yy1VarS = this.A.s();
        if (yy1VarS != null) {
            yy1VarS.A();
        }
    }

    public final float F0(long j, long j2) {
        if (k0() >= cm4.e(j2) && h0() >= cm4.c(j2)) {
            return Float.POSITIVE_INFINITY;
        }
        long jD0 = D0(j2);
        float fE = cm4.e(jD0);
        float fC = cm4.c(jD0);
        float fC2 = kt2.c(j);
        float fMax = Math.max(0.0f, fC2 < 0.0f ? -fC2 : fC2 - k0());
        float fD = kt2.d(j);
        long jA = X.a(fMax, Math.max(0.0f, fD < 0.0f ? -fD : fD - h0()));
        if ((fE > 0.0f || fC > 0.0f) && kt2.c(jA) <= fE && kt2.d(jA) <= fC) {
            return (kt2.d(jA) * kt2.d(jA)) + (kt2.c(jA) * kt2.c(jA));
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // defpackage.iy1
    public final kz1 G() {
        if (q()) {
            return this.A.Z.B.B;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    public final void G0(dn dnVar) {
        uw2 uw2Var = this.R;
        if (uw2Var != null) {
            uw2Var.d(dnVar);
            return;
        }
        long j = this.K;
        float f = (int) (j >> 32);
        float fA = mp1.a(j);
        dnVar.o(f, fA);
        lo0 lo0Var = (lo0) this.O[0];
        if (lo0Var == null) {
            X0(dnVar);
        } else {
            lo0Var.c(dnVar);
        }
        dnVar.o(-f, -fA);
    }

    public final kz1 H0(kz1 kz1Var) {
        yy1 yy1Var = kz1Var.A;
        yy1 yy1Var2 = this.A;
        if (yy1Var == yy1Var2) {
            kz1 kz1Var2 = yy1Var2.Z.B;
            kz1 kz1Var3 = this;
            while (kz1Var3 != kz1Var2 && kz1Var3 != kz1Var) {
                kz1Var3 = kz1Var3.B;
            }
            return kz1Var3 == kz1Var ? kz1Var : this;
        }
        yy1 yy1VarS = yy1Var;
        while (yy1VarS.D > yy1Var2.D) {
            yy1VarS = yy1VarS.s();
        }
        yy1 yy1VarS2 = yy1Var2;
        while (yy1VarS2.D > yy1VarS.D) {
            yy1VarS2 = yy1VarS2.s();
        }
        while (yy1VarS != yy1VarS2) {
            yy1VarS = yy1VarS.s();
            yy1VarS2 = yy1VarS2.s();
            if (yy1VarS == null || yy1VarS2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (yy1VarS2 == yy1Var2) {
            return this;
        }
        return yy1VarS == yy1Var ? kz1Var : yy1VarS.Y;
    }

    public final long I0(long j) {
        long j2 = this.K;
        float fC = kt2.c(j);
        int i = mp1.c;
        long jA = X.a(fC - ((int) (j2 >> 32)), kt2.d(j) - mp1.a(j2));
        uw2 uw2Var = this.R;
        return uw2Var != null ? uw2Var.e(jA, true) : jA;
    }

    @Override // defpackage.wb2
    public final int J(IlK ilK) {
        int iC0;
        if ((this.I != null) && (iC0 = C0(ilK)) != Integer.MIN_VALUE) {
            return mp1.a(g0()) + iC0;
        }
        return Integer.MIN_VALUE;
    }

    public final sb2 J0() {
        sb2 sb2Var = this.I;
        if (sb2Var != null) {
            return sb2Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier".toString());
    }

    public abstract vb2 K0();

    @Override // defpackage.iy1
    public final long L(iy1 iy1Var, long j) {
        kz1 kz1Var = (kz1) iy1Var;
        kz1 kz1VarH0 = H0(kz1Var);
        while (kz1Var != kz1VarH0) {
            j = kz1Var.c1(j);
            kz1Var = kz1Var.B;
        }
        return A0(kz1VarH0, j);
    }

    public final long L0() {
        return this.E.v0(this.A.O.d());
    }

    public final Object M0(pk4<lz2> pk4Var) {
        if (pk4Var != null) {
            lz2 lz2Var = (lz2) pk4Var.x;
            K0();
            return lz2Var.A0(M0((pk4) pk4Var.y));
        }
        kz1 kz1VarN0 = N0();
        if (kz1VarN0 != null) {
            return kz1VarN0.B();
        }
        return null;
    }

    @Override // defpackage.iy1
    public final dl3 N(iy1 iy1Var, boolean z) {
        if (!q()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        if (!iy1Var.q()) {
            throw new IllegalStateException(("LayoutCoordinates " + iy1Var + " is not attached!").toString());
        }
        kz1 kz1Var = (kz1) iy1Var;
        kz1 kz1VarH0 = H0(kz1Var);
        oi2 oi2Var = this.N;
        if (oi2Var == null) {
            oi2Var = new oi2();
            this.N = oi2Var;
        }
        oi2Var.a = 0.0f;
        oi2Var.b = 0.0f;
        oi2Var.c = (int) (iy1Var.a() >> 32);
        oi2Var.d = sp1.b(iy1Var.a());
        while (kz1Var != kz1VarH0) {
            kz1Var.Y0(oi2Var, z, false);
            if (oi2Var.b()) {
                return dl3.e;
            }
            kz1Var = kz1Var.B;
        }
        z0(kz1VarH0, oi2Var, z);
        return new dl3(oi2Var.a, oi2Var.b, oi2Var.c, oi2Var.d);
    }

    public kz1 N0() {
        return null;
    }

    @Override // defpackage.iy1
    public final long O(long j) {
        if (!q()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        for (kz1 kz1Var = this; kz1Var != null; kz1Var = kz1Var.B) {
            j = kz1Var.c1(j);
        }
        return j;
    }

    public final <T extends fz1<T, M>, C, M extends pg2> void O0(T t, NUlFixed<T, C, M> nUl, long j, cd1<C> cd1Var, boolean z, boolean z2) {
        if (t == null) {
            R0(nUl, j, cd1Var, z, z2);
        } else {
            cd1Var.b(nUl.c(t), -1.0f, z2, new YKK(t, nUl, j, cd1Var, z, z2));
        }
    }

    public final <T extends fz1<T, M>, C, M extends pg2> void P0(T t, NUlFixed<T, C, M> nUl, long j, cd1<C> cd1Var, boolean z, boolean z2, float f) {
        if (t == null) {
            R0(nUl, j, cd1Var, z, z2);
        } else {
            cd1Var.b(nUl.c(t), f, z2, new auxFixed(t, nUl, j, cd1Var, z, z2, f));
        }
    }

    public final <T extends fz1<T, M>, C, M extends pg2> void Q0(NUlFixed<T, C, M> nUl, long j, cd1<C> cd1Var, boolean z, boolean z2) {
        fz1<?, ?> fz1Var = this.O[nUl.e()];
        boolean z3 = true;
        if (!e1(j)) {
            if (z) {
                float fF0 = F0(j, L0());
                if ((Float.isInfinite(fF0) || Float.isNaN(fF0)) ? false : true) {
                    if (cd1Var.y != ps0.J(cd1Var)) {
                        if (fp1.N(cd1Var.a(), Cz.b(fF0, false)) <= 0) {
                            z3 = false;
                        }
                    }
                    if (z3) {
                        P0(fz1Var, nUl, j, cd1Var, z, false, fF0);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (fz1Var == null) {
            R0(nUl, j, cd1Var, z, z2);
            return;
        }
        float fC = kt2.c(j);
        float fD = kt2.d(j);
        if (fC >= 0.0f && fD >= 0.0f && fC < ((float) k0()) && fD < ((float) h0())) {
            O0(fz1Var, nUl, j, cd1Var, z, z2);
            return;
        }
        float fF1 = !z ? Float.POSITIVE_INFINITY : F0(j, L0());
        if ((Float.isInfinite(fF1) || Float.isNaN(fF1)) ? false : true) {
            if (cd1Var.y != ps0.J(cd1Var)) {
                if (fp1.N(cd1Var.a(), Cz.b(fF1, z2)) <= 0) {
                    z3 = false;
                }
            }
            if (z3) {
                P0(fz1Var, nUl, j, cd1Var, z, z2, fF1);
                return;
            }
        }
        b1(fz1Var, nUl, j, cd1Var, z, z2, fF1);
    }

    public <T extends fz1<T, M>, C, M extends pg2> void R0(NUlFixed<T, C, M> nUl, long j, cd1<C> cd1Var, boolean z, boolean z2) {
        kz1 kz1VarN0 = N0();
        if (kz1VarN0 != null) {
            kz1VarN0.Q0(nUl, kz1VarN0.I0(j), cd1Var, z, z2);
        }
    }

    public final void S0() {
        uw2 uw2Var = this.R;
        if (uw2Var != null) {
            uw2Var.invalidate();
            return;
        }
        kz1 kz1Var = this.B;
        if (kz1Var != null) {
            kz1Var.S0();
        }
    }

    public final boolean T0() {
        if (this.R != null && this.G <= 0.0f) {
            return true;
        }
        kz1 kz1Var = this.B;
        if (kz1Var != null) {
            return kz1Var.T0();
        }
        return false;
    }

    public final void U0(j81<? super ta1, sd5> j81Var) {
        ww2 ww2Var;
        j81<? super ta1, sd5> j81Var2 = this.D;
        yy1 yy1Var = this.A;
        boolean z = (j81Var2 == j81Var && ur1.a(this.E, yy1Var.L) && this.F == yy1Var.N) ? false : true;
        this.D = j81Var;
        this.E = yy1Var.L;
        this.F = yy1Var.N;
        boolean zQ = q();
        T23 t23 = this.P;
        if (!zQ || j81Var == null) {
            uw2 uw2Var = this.R;
            if (uw2Var != null) {
                uw2Var.destroy();
                yy1Var.d0 = true;
                t23.invoke();
                if (q() && (ww2Var = yy1Var.C) != null) {
                    ww2Var.p(yy1Var);
                }
            }
            this.R = null;
            this.Q = false;
            return;
        }
        if (this.R != null) {
            if (z) {
                d1();
                return;
            }
            return;
        }
        uw2 uw2VarG = Cz.B(yy1Var).g(t23, this);
        uw2VarG.f(this.y);
        uw2VarG.h(this.K);
        this.R = uw2VarG;
        d1();
        yy1Var.d0 = true;
        t23.invoke();
    }

    public final void V0() {
        fz1[] fz1VarArr = this.O;
        if (ym.d(fz1VarArr, 5)) {
            cp4 cp4VarF = ip4.f((cp4) ip4.b.h(), null, false);
            try {
                cp4 cp4VarI = cp4VarF.i();
                try {
                    for (fz1 fz1Var = fz1VarArr[5]; fz1Var != null; fz1Var = fz1Var.y) {
                        ((vu2) ((pk4) fz1Var).x).q(this.y);
                    }
                    sd5 sd5Var = sd5.a;
                    cp4.o(cp4VarI);
                    cp4VarF.c();
                } catch (Throwable th) {
                    cp4.o(cp4VarI);
                    throw th;
                }
            } catch (Throwable th2) {
                cp4VarF.c();
                throw th2;
            }
        }
    }

    public void W0() {
        uw2 uw2Var = this.R;
        if (uw2Var != null) {
            uw2Var.invalidate();
        }
    }

    public void X0(dn dnVar) {
        kz1 kz1VarN0 = N0();
        if (kz1VarN0 != null) {
            kz1VarN0.G0(dnVar);
        }
    }

    public final void Y0(oi2 oi2Var, boolean z, boolean z2) {
        uw2 uw2Var = this.R;
        if (uw2Var != null) {
            if (this.C) {
                if (z2) {
                    long jL0 = L0();
                    float fE = cm4.e(jL0) / 2.0f;
                    float fC = cm4.c(jL0) / 2.0f;
                    long j = this.y;
                    oi2Var.a(-fE, -fC, ((int) (j >> 32)) + fE, sp1.b(j) + fC);
                } else if (z) {
                    long j2 = this.y;
                    oi2Var.a(0.0f, 0.0f, (int) (j2 >> 32), sp1.b(j2));
                }
                if (oi2Var.b()) {
                    return;
                }
            }
            uw2Var.a(oi2Var, false);
        }
        long j3 = this.K;
        int i = mp1.c;
        float f = (int) (j3 >> 32);
        oi2Var.a += f;
        oi2Var.c += f;
        float fA = mp1.a(j3);
        oi2Var.b += fA;
        oi2Var.d += fA;
    }

    public final void Z0(sb2 sb2Var) {
        yy1 yy1VarS;
        sb2 sb2Var2 = this.I;
        if (sb2Var != sb2Var2) {
            this.I = sb2Var;
            yy1 yy1Var = this.A;
            if (sb2Var2 == null || sb2Var.getWidth() != sb2Var2.getWidth() || sb2Var.getHeight() != sb2Var2.getHeight()) {
                int width = sb2Var.getWidth();
                int height = sb2Var.getHeight();
                uw2 uw2Var = this.R;
                if (uw2Var != null) {
                    uw2Var.f(C0239D.e(width, height));
                } else {
                    kz1 kz1Var = this.B;
                    if (kz1Var != null) {
                        kz1Var.S0();
                    }
                }
                ww2 ww2Var = yy1Var.C;
                if (ww2Var != null) {
                    ww2Var.p(yy1Var);
                }
                r0(C0239D.e(width, height));
                for (fz1 fz1Var = this.O[0]; fz1Var != null; fz1Var = fz1Var.y) {
                    ((lo0) fz1Var).C = true;
                }
            }
            LinkedHashMap linkedHashMap = this.J;
            if ((!(linkedHashMap == null || linkedHashMap.isEmpty()) || (!sb2Var.c().isEmpty())) && !ur1.a(sb2Var.c(), this.J)) {
                kz1 kz1VarN0 = N0();
                if (ur1.a(kz1VarN0 != null ? kz1VarN0.A : null, yy1Var)) {
                    yy1 yy1VarS2 = yy1Var.s();
                    if (yy1VarS2 != null) {
                        yy1VarS2.J();
                    }
                    dz1 dz1Var = yy1Var.P;
                    if (dz1Var.c) {
                        yy1 yy1VarS3 = yy1Var.s();
                        if (yy1VarS3 != null) {
                            yy1VarS3.P(false);
                        }
                    } else if (dz1Var.d && (yy1VarS = yy1Var.s()) != null) {
                        yy1VarS.O(false);
                    }
                } else {
                    yy1Var.J();
                }
                yy1Var.P.b = true;
                LinkedHashMap linkedHashMap2 = this.J;
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    this.J = linkedHashMap2;
                }
                linkedHashMap2.clear();
                linkedHashMap2.putAll(sb2Var.c());
            }
        }
    }

    @Override // defpackage.iy1
    public final long a() {
        return this.y;
    }

    public final boolean a1() {
        f93 f93Var = (f93) this.O[1];
        if (f93Var != null && f93Var.c()) {
            return true;
        }
        kz1 kz1VarN0 = N0();
        return kz1VarN0 != null && kz1VarN0.a1();
    }

    public final <T extends fz1<T, M>, C, M extends pg2> void b1(T t, NUlFixed<T, C, M> nUl, long j, cd1<C> cd1Var, boolean z, boolean z2, float f) {
        if (t == null) {
            R0(nUl, j, cd1Var, z, z2);
        } else {
            nUl.b(t);
            b1(t.y, nUl, j, cd1Var, z, z2, f);
        }
    }

    public final long c1(long j) {
        uw2 uw2Var = this.R;
        if (uw2Var != null) {
            j = uw2Var.e(j, false);
        }
        long j2 = this.K;
        float fC = kt2.c(j);
        int i = mp1.c;
        return X.a(fC + ((int) (j2 >> 32)), kt2.d(j) + mp1.a(j2));
    }

    public final void d1() {
        kz1 kz1Var;
        yy1 yy1Var;
        xq3 xq3Var;
        uw2 uw2Var = this.R;
        xq3 xq3Var2 = U;
        yy1 yy1Var2 = this.A;
        if (uw2Var != null) {
            j81<? super ta1, sd5> j81Var = this.D;
            if (j81Var == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            xq3Var2.w = 1.0f;
            xq3Var2.x = 1.0f;
            xq3Var2.y = 1.0f;
            xq3Var2.z = 0.0f;
            xq3Var2.A = 0.0f;
            xq3Var2.B = 0.0f;
            long j = ua1.a;
            xq3Var2.C = j;
            xq3Var2.D = j;
            xq3Var2.E = 0.0f;
            xq3Var2.F = 0.0f;
            xq3Var2.G = 0.0f;
            xq3Var2.H = 8.0f;
            xq3Var2.I = m95.b;
            xq3Var2.J = el3.a;
            xq3Var2.K = false;
            xq3Var2.L = yy1Var2.L;
            Cz.B(yy1Var2).getSnapshotObserver().a(this, S, new byN(j81Var));
            yy1Var = yy1Var2;
            uw2Var.b(xq3Var2.w, xq3Var2.x, xq3Var2.y, xq3Var2.z, xq3Var2.A, xq3Var2.B, xq3Var2.E, xq3Var2.F, xq3Var2.G, xq3Var2.H, xq3Var2.I, xq3Var2.J, xq3Var2.K, xq3Var2.C, xq3Var2.D, yy1Var.N, yy1Var.L);
            xq3Var = xq3Var2;
            kz1Var = this;
            kz1Var.C = xq3Var.K;
        } else {
            kz1Var = this;
            yy1Var = yy1Var2;
            xq3Var = xq3Var2;
            if (!(kz1Var.D == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        kz1Var.G = xq3Var.y;
        ww2 ww2Var = yy1Var.C;
        if (ww2Var != null) {
            ww2Var.p(yy1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    public final boolean e1(long j) {
        boolean z;
        float fC = kt2.c(j);
        if ((Float.isInfinite(fC) || Float.isNaN(fC)) ? false : true) {
            float fD = kt2.d(j);
            if ((Float.isInfinite(fD) || Float.isNaN(fD)) ? false : true) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        uw2 uw2Var = this.R;
        return uw2Var == null || !this.C || uw2Var.c(j);
    }

    @Override // defpackage.j81
    public final sd5 invoke(dn dnVar) {
        dn dnVar2 = dnVar;
        yy1 yy1Var = this.A;
        if (yy1Var.Q) {
            Cz.B(yy1Var).getSnapshotObserver().a(this, T, new lz1(this, dnVar2));
            this.Q = false;
        } else {
            this.Q = true;
        }
        return sd5.a;
    }

    @Override // defpackage.xw2
    public final boolean isValid() {
        return this.R != null;
    }

    @Override // defpackage.iy1
    public final long l(long j) {
        return Cz.B(this.A).d(O(j));
    }

    @Override // defpackage.b43
    public void m0(long j, float f, j81<? super ta1, sd5> j81Var) {
        U0(j81Var);
        long j2 = this.K;
        int i = mp1.c;
        if (!(j2 == j)) {
            this.K = j;
            uw2 uw2Var = this.R;
            if (uw2Var != null) {
                uw2Var.h(j);
            } else {
                kz1 kz1Var = this.B;
                if (kz1Var != null) {
                    kz1Var.S0();
                }
            }
            kz1 kz1VarN0 = N0();
            yy1 yy1Var = kz1VarN0 != null ? kz1VarN0.A : null;
            yy1 yy1Var2 = this.A;
            if (ur1.a(yy1Var, yy1Var2)) {
                yy1 yy1VarS = yy1Var2.s();
                if (yy1VarS != null) {
                    yy1VarS.J();
                }
            } else {
                yy1Var2.J();
            }
            ww2 ww2Var = yy1Var2.C;
            if (ww2Var != null) {
                ww2Var.p(yy1Var2);
            }
        }
        this.L = f;
    }

    @Override // defpackage.iy1
    public final boolean q() {
        if (!this.H || this.A.E()) {
            return this.H;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // defpackage.iy1
    public final long z(long j) {
        if (!q()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        iy1 iy1VarF = ps0.F(this);
        return L(iy1VarF, kt2.f(Cz.B(this.A).e(j), ps0.b0(iy1VarF)));
    }

    public final void z0(kz1 kz1Var, oi2 oi2Var, boolean z) {
        if (kz1Var == this) {
            return;
        }
        kz1 kz1Var2 = this.B;
        if (kz1Var2 != null) {
            kz1Var2.z0(kz1Var, oi2Var, z);
        }
        long j = this.K;
        int i = mp1.c;
        float f = (int) (j >> 32);
        oi2Var.a -= f;
        oi2Var.c -= f;
        float fA = mp1.a(j);
        oi2Var.b -= fA;
        oi2Var.d -= fA;
        uw2 uw2Var = this.R;
        if (uw2Var != null) {
            uw2Var.a(oi2Var, true);
            if (this.C && z) {
                long j2 = this.y;
                oi2Var.a(0.0f, 0.0f, (int) (j2 >> 32), sp1.b(j2));
            }
        }
    }
}
