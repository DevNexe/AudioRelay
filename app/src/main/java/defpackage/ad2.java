package defpackage;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.DzVS;
import com.google.protobuf.F1;
import com.google.protobuf.FA4;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.NUlFixed;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.k;
import com.google.protobuf.lPt3Fixed;
import com.google.protobuf.mw0t;
import com.google.protobuf.roZB;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ad2 extends lPt3Fixed implements roZB {
    public static final ad2 R = new ad2();
    public static final QnHx S = new QnHx();
    public aj2 A;
    public bk0 B;
    public dc2 C;
    public s_ D;
    public eo E;
    public np2 F;
    public hl0 G;
    public rq3 H;
    public sq3 I;
    public kp2 J;
    public xt4 K;
    public c33 L;
    public e33 M;
    public ag3 N;
    public bg3 O;
    public xf3 P;
    public byte Q;
    public el0 z;

    public static final class CQf extends lPt3Fixed.CQf<CQf> implements roZB {
        public el0 A;
        public aj2 B;
        public bk0 C;
        public dc2 D;
        public s_ E;
        public eo F;
        public np2 G;
        public hl0 H;
        public rq3 I;
        public sq3 J;
        public FA4<sq3, sq3.CQf, Object> K;
        public kp2 L;
        public FA4<kp2, kp2.CQf, Object> M;
        public xt4 N;
        public c33 O;
        public e33 P;
        public ag3 Q;
        public bg3 R;
        public xf3 S;

        public CQf() {
            ad2 ad2Var = ad2.R;
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
        public final void B(k kVar) {
            super.B(kVar);
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf
        /* JADX INFO: renamed from: E */
        public final lPt3Fixed.CQf g(Descriptors.NUlFixed nUl, Object obj) {
            super.g(nUl, obj);
            return this;
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf
        /* JADX INFO: renamed from: F */
        public final lPt3Fixed.CQf clone() {
            return (CQf) super.clone();
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf
        public final lPt3Fixed.YKK I() {
            lPt3Fixed.YKK ykk = tb5.b;
            ykk.c(ad2.class, CQf.class);
            return ykk;
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf
        /* JADX INFO: renamed from: J */
        public final lPt3Fixed.CQf B(k kVar) {
            super.B(kVar);
            return this;
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf
        /* JADX INFO: renamed from: O */
        public final lPt3Fixed.CQf b(Descriptors.NUlFixed nUl, Object obj) {
            super.b(nUl, obj);
            return this;
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf
        /* JADX INFO: renamed from: P */
        public final lPt3Fixed.CQf y(k kVar) {
            this.z = kVar;
            M();
            return this;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public final ad2 build() {
            ad2 ad2VarF = f();
            if (ad2VarF.isInitialized()) {
                return ad2VarF;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(ad2VarF);
        }

        @Override // com.google.protobuf.DzVS.QnHx
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public final ad2 f() {
            ad2 ad2Var = new ad2(this);
            ad2Var.z = this.A;
            ad2Var.A = this.B;
            ad2Var.B = this.C;
            ad2Var.C = this.D;
            ad2Var.D = this.E;
            ad2Var.E = this.F;
            ad2Var.F = this.G;
            ad2Var.G = this.H;
            ad2Var.H = this.I;
            FA4<sq3, sq3.CQf, Object> fa4 = this.K;
            if (fa4 == null) {
                ad2Var.I = this.J;
            } else {
                ad2Var.I = (sq3) fa4.b();
            }
            FA4<kp2, kp2.CQf, Object> fa5 = this.M;
            if (fa5 == null) {
                ad2Var.J = this.L;
            } else {
                ad2Var.J = (kp2) fa5.b();
            }
            ad2Var.K = this.N;
            ad2Var.L = this.O;
            ad2Var.M = this.P;
            ad2Var.N = this.Q;
            ad2Var.O = this.R;
            ad2Var.P = this.S;
            L();
            return ad2Var;
        }

        public final void S(ad2 ad2Var) {
            if (ad2Var == ad2.R) {
                return;
            }
            if (ad2Var.l0()) {
                el0 el0VarV = ad2Var.V();
                el0 el0Var = this.A;
                if (el0Var != null) {
                    el0.CQf cQfC = el0.B.c();
                    cQfC.R(el0Var);
                    cQfC.R(el0VarV);
                    this.A = cQfC.f();
                } else {
                    this.A = el0VarV;
                }
                M();
            }
            if (ad2Var.A != null) {
                aj2 aj2VarY = ad2Var.Y();
                aj2 aj2Var = this.B;
                if (aj2Var != null) {
                    aj2.CQf cQfU = aj2.D.c();
                    cQfU.R(aj2Var);
                    cQfU.R(aj2VarY);
                    this.B = cQfU.f();
                } else {
                    this.B = aj2VarY;
                }
                M();
            }
            if (ad2Var.B != null) {
                bk0 bk0VarU = ad2Var.U();
                bk0 bk0Var = this.C;
                if (bk0Var != null) {
                    bk0.CQf cQfT = bk0.B.c();
                    cQfT.R(bk0Var);
                    cQfT.R(bk0VarU);
                    this.C = cQfT.f();
                } else {
                    this.C = bk0VarU;
                }
                M();
            }
            if (ad2Var.C != null) {
                dc2 dc2VarX = ad2Var.X();
                dc2 dc2Var = this.D;
                if (dc2Var != null) {
                    dc2.CQf cQfT2 = dc2.B.c();
                    cQfT2.R(dc2Var);
                    cQfT2.R(dc2VarX);
                    this.D = cQfT2.f();
                } else {
                    this.D = dc2VarX;
                }
                M();
            }
            if (ad2Var.j0()) {
                s_ s_VarS = ad2Var.S();
                s_ s_Var = this.E;
                if (s_Var != null) {
                    s_.CQf cQfT3 = s_.D.c();
                    cQfT3.R(s_Var);
                    cQfT3.R(s_VarS);
                    this.E = cQfT3.f();
                } else {
                    this.E = s_VarS;
                }
                M();
            }
            if (ad2Var.k0()) {
                eo eoVarT = ad2Var.T();
                eo eoVar = this.F;
                if (eoVar != null) {
                    eo.CQf cQfT4 = eo.B.c();
                    cQfT4.R(eoVar);
                    cQfT4.R(eoVarT);
                    this.F = cQfT4.f();
                } else {
                    this.F = eoVarT;
                }
                M();
            }
            if (ad2Var.o0()) {
                np2 np2VarA0 = ad2Var.a0();
                np2 np2Var = this.G;
                if (np2Var != null) {
                    np2.CQf cQfX = np2.F.c();
                    cQfX.R(np2Var);
                    cQfX.R(np2VarA0);
                    this.G = cQfX.f();
                } else {
                    this.G = np2VarA0;
                }
                M();
            }
            if (ad2Var.m0()) {
                hl0 hl0VarW = ad2Var.W();
                hl0 hl0Var = this.H;
                if (hl0Var != null) {
                    hl0.CQf cQfU2 = hl0.B.c();
                    cQfU2.R(hl0Var);
                    cQfU2.R(hl0VarW);
                    this.H = cQfU2.f();
                } else {
                    this.H = hl0VarW;
                }
                M();
            }
            if (ad2Var.r0()) {
                rq3 rq3VarD0 = ad2Var.d0();
                rq3 rq3Var = this.I;
                if (rq3Var != null) {
                    rq3.CQf cQfT5 = rq3.B.c();
                    cQfT5.R(rq3Var);
                    cQfT5.R(rq3VarD0);
                    this.I = cQfT5.f();
                } else {
                    this.I = rq3VarD0;
                }
                M();
            }
            if (ad2Var.s0()) {
                sq3 sq3VarE0 = ad2Var.e0();
                FA4<sq3, sq3.CQf, Object> fa4 = this.K;
                if (fa4 == null) {
                    sq3 sq3Var = this.J;
                    if (sq3Var != null) {
                        sq3.CQf cQfU3 = sq3.B.c();
                        cQfU3.R(sq3Var);
                        cQfU3.R(sq3VarE0);
                        this.J = cQfU3.f();
                    } else {
                        this.J = sq3VarE0;
                    }
                    M();
                } else {
                    fa4.e(sq3VarE0);
                }
            }
            if (ad2Var.n0()) {
                kp2 kp2VarZ = ad2Var.Z();
                FA4<kp2, kp2.CQf, Object> fa5 = this.M;
                if (fa5 == null) {
                    kp2 kp2Var = this.L;
                    if (kp2Var != null) {
                        kp2.CQf cQfT6 = kp2.B.c();
                        cQfT6.R(kp2Var);
                        cQfT6.R(kp2VarZ);
                        this.L = cQfT6.f();
                    } else {
                        this.L = kp2VarZ;
                    }
                    M();
                } else {
                    fa5.e(kp2VarZ);
                }
            }
            if (ad2Var.v0()) {
                xt4 xt4VarI0 = ad2Var.i0();
                xt4 xt4Var = this.N;
                if (xt4Var != null) {
                    xt4.CQf cQfU4 = xt4.B.c();
                    cQfU4.R(xt4Var);
                    cQfU4.R(xt4VarI0);
                    this.N = cQfU4.f();
                } else {
                    this.N = xt4VarI0;
                }
                M();
            }
            if (ad2Var.p0()) {
                c33 c33VarB0 = ad2Var.b0();
                c33 c33Var = this.O;
                if (c33Var != null) {
                    c33.CQf cQfT7 = c33.B.c();
                    cQfT7.R(c33Var);
                    cQfT7.R(c33VarB0);
                    this.O = cQfT7.f();
                } else {
                    this.O = c33VarB0;
                }
                M();
            }
            if (ad2Var.q0()) {
                e33 e33VarC0 = ad2Var.c0();
                e33 e33Var = this.P;
                if (e33Var != null) {
                    e33.CQf cQfT8 = e33.B.c();
                    cQfT8.R(e33Var);
                    cQfT8.R(e33VarC0);
                    this.P = cQfT8.f();
                } else {
                    this.P = e33VarC0;
                }
                M();
            }
            if (ad2Var.N != null) {
                ag3 ag3VarG0 = ad2Var.g0();
                ag3 ag3Var = this.Q;
                if (ag3Var != null) {
                    ag3.CQf cQfT9 = ag3.A.c();
                    cQfT9.Q(ag3Var);
                    cQfT9.Q(ag3VarG0);
                    ag3 ag3Var2 = new ag3(cQfT9);
                    cQfT9.L();
                    this.Q = ag3Var2;
                } else {
                    this.Q = ag3VarG0;
                }
                M();
            }
            if (ad2Var.u0()) {
                bg3 bg3VarH0 = ad2Var.h0();
                bg3 bg3Var = this.R;
                if (bg3Var != null) {
                    bg3.CQf cQfU5 = bg3.B.c();
                    cQfU5.R(bg3Var);
                    cQfU5.R(bg3VarH0);
                    this.R = cQfU5.f();
                } else {
                    this.R = bg3VarH0;
                }
                M();
            }
            if (ad2Var.t0()) {
                xf3 xf3VarF0 = ad2Var.f0();
                xf3 xf3Var = this.S;
                if (xf3Var != null) {
                    xf3.CQf cQfU6 = xf3.B.c();
                    cQfU6.S(xf3Var);
                    cQfU6.S(xf3VarF0);
                    this.S = cQfU6.f();
                } else {
                    this.S = xf3VarF0;
                }
                M();
            }
            super.B(ad2Var.y);
            M();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0020  */
        public final void T(NUlFixed nUl, vv0 vv0Var) throws Throwable {
            ad2 ad2Var;
            try {
                try {
                    ad2.S.getClass();
                    S(new ad2(nUl, vv0Var));
                } catch (InvalidProtocolBufferException e) {
                    ad2Var = (ad2) e.w;
                    try {
                        throw e.g();
                    } catch (Throwable th) {
                        th = th;
                        if (ad2Var != null) {
                            S(ad2Var);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                ad2Var = null;
                if (ad2Var != null) {
                    S(ad2Var);
                }
                throw th;
            }
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return ad2.R;
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
        public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
            super.b(nUl, obj);
            return this;
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
        public final Object clone() {
            return (CQf) super.clone();
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
        public final Descriptors.QnHx e() {
            return tb5.a;
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
        public final mw0t.QnHx g(Descriptors.NUlFixed nUl, Object obj) {
            super.g(nUl, obj);
            return this;
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, defpackage.jd2
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
        /* JADX INFO: renamed from: r */
        public final com.google.protobuf.QnHx.AbstractC0099QnHx clone() {
            return (CQf) super.clone();
        }

        @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.mw0t.QnHx
        public final mw0t.QnHx s(mw0t mw0tVar) {
            if (mw0tVar instanceof ad2) {
                S((ad2) mw0tVar);
            } else {
                super.s(mw0tVar);
            }
            return this;
        }

        @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.DzVS.QnHx
        public final /* bridge */ /* synthetic */ DzVS.QnHx v(NUlFixed nUl, vv0 vv0Var) throws Throwable {
            T(nUl, vv0Var);
            return this;
        }

        @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
        /* JADX INFO: renamed from: w */
        public final /* bridge */ /* synthetic */ com.google.protobuf.QnHx.AbstractC0099QnHx v(NUlFixed nUl, vv0 vv0Var) throws Throwable {
            T(nUl, vv0Var);
            return this;
        }

        @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
        /* JADX INFO: renamed from: x */
        public final com.google.protobuf.QnHx.AbstractC0099QnHx s(mw0t mw0tVar) {
            if (mw0tVar instanceof ad2) {
                S((ad2) mw0tVar);
            } else {
                super.s(mw0tVar);
            }
            return this;
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
        public final mw0t.QnHx y(k kVar) {
            this.z = kVar;
            M();
            return this;
        }

        @Override // defpackage.jd2
        public final DzVS a() {
            return ad2.R;
        }

        public CQf(lPt3Fixed.QnHx qnHx) {
            super(qnHx);
            ad2 ad2Var = ad2.R;
        }
    }

    public class QnHx extends F1<ad2> {
        @Override // defpackage.oz2
        public final Object b(NUlFixed nUl, vv0 vv0Var) {
            return new ad2(nUl, vv0Var);
        }
    }

    public ad2(lPt3Fixed.CQf cQf) {
        super(cQf);
        this.Q = (byte) -1;
    }

    public static CQf w0() {
        return R.c();
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final lPt3Fixed.YKK L() {
        lPt3Fixed.YKK ykk = tb5.b;
        ykk.c(ad2.class, CQf.class);
        return ykk;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
        return new CQf(qnHx);
    }

    public final s_ S() {
        s_ s_Var = this.D;
        return s_Var == null ? s_.D : s_Var;
    }

    public final eo T() {
        eo eoVar = this.E;
        return eoVar == null ? eo.B : eoVar;
    }

    public final bk0 U() {
        bk0 bk0Var = this.B;
        return bk0Var == null ? bk0.B : bk0Var;
    }

    public final el0 V() {
        el0 el0Var = this.z;
        return el0Var == null ? el0.B : el0Var;
    }

    public final hl0 W() {
        hl0 hl0Var = this.G;
        return hl0Var == null ? hl0.B : hl0Var;
    }

    public final dc2 X() {
        dc2 dc2Var = this.C;
        return dc2Var == null ? dc2.B : dc2Var;
    }

    public final aj2 Y() {
        aj2 aj2Var = this.A;
        return aj2Var == null ? aj2.D : aj2Var;
    }

    public final kp2 Z() {
        kp2 kp2Var = this.J;
        return kp2Var == null ? kp2.B : kp2Var;
    }

    @Override // defpackage.jd2
    public final mw0t a() {
        return R;
    }

    public final np2 a0() {
        np2 np2Var = this.F;
        return np2Var == null ? np2.F : np2Var;
    }

    public final c33 b0() {
        c33 c33Var = this.L;
        return c33Var == null ? c33.B : c33Var;
    }

    public final e33 c0() {
        e33 e33Var = this.M;
        return e33Var == null ? e33.B : e33Var;
    }

    public final rq3 d0() {
        rq3 rq3Var = this.H;
        return rq3Var == null ? rq3.B : rq3Var;
    }

    public final sq3 e0() {
        sq3 sq3Var = this.I;
        return sq3Var == null ? sq3.B : sq3Var;
    }

    @Override // com.google.protobuf.QnHx
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ad2)) {
            return super.equals(obj);
        }
        ad2 ad2Var = (ad2) obj;
        if (l0() != ad2Var.l0()) {
            return false;
        }
        if (l0() && !V().equals(ad2Var.V())) {
            return false;
        }
        aj2 aj2Var = this.A;
        if ((aj2Var != null) != (ad2Var.A != null)) {
            return false;
        }
        if ((aj2Var != null) && !Y().equals(ad2Var.Y())) {
            return false;
        }
        bk0 bk0Var = this.B;
        if ((bk0Var != null) != (ad2Var.B != null)) {
            return false;
        }
        if ((bk0Var != null) && !U().equals(ad2Var.U())) {
            return false;
        }
        dc2 dc2Var = this.C;
        if ((dc2Var != null) != (ad2Var.C != null)) {
            return false;
        }
        if (((dc2Var != null) && !X().equals(ad2Var.X())) || j0() != ad2Var.j0()) {
            return false;
        }
        if ((j0() && !S().equals(ad2Var.S())) || k0() != ad2Var.k0()) {
            return false;
        }
        if ((k0() && !T().equals(ad2Var.T())) || o0() != ad2Var.o0()) {
            return false;
        }
        if ((o0() && !a0().equals(ad2Var.a0())) || m0() != ad2Var.m0()) {
            return false;
        }
        if ((m0() && !W().equals(ad2Var.W())) || r0() != ad2Var.r0()) {
            return false;
        }
        if ((r0() && !d0().equals(ad2Var.d0())) || s0() != ad2Var.s0()) {
            return false;
        }
        if ((s0() && !e0().equals(ad2Var.e0())) || n0() != ad2Var.n0()) {
            return false;
        }
        if ((n0() && !Z().equals(ad2Var.Z())) || v0() != ad2Var.v0()) {
            return false;
        }
        if ((v0() && !i0().equals(ad2Var.i0())) || p0() != ad2Var.p0()) {
            return false;
        }
        if ((p0() && !b0().equals(ad2Var.b0())) || q0() != ad2Var.q0()) {
            return false;
        }
        if (q0() && !c0().equals(ad2Var.c0())) {
            return false;
        }
        ag3 ag3Var = this.N;
        if ((ag3Var != null) != (ad2Var.N != null)) {
            return false;
        }
        if (((ag3Var != null) && !g0().equals(ad2Var.g0())) || u0() != ad2Var.u0()) {
            return false;
        }
        if ((!u0() || h0().equals(ad2Var.h0())) && t0() == ad2Var.t0()) {
            return (!t0() || f0().equals(ad2Var.f0())) && this.y.equals(ad2Var.y);
        }
        return false;
    }

    public final xf3 f0() {
        xf3 xf3Var = this.P;
        return xf3Var == null ? xf3.B : xf3Var;
    }

    public final ag3 g0() {
        ag3 ag3Var = this.N;
        return ag3Var == null ? ag3.A : ag3Var;
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
    public final void h(CodedOutputStream codedOutputStream) {
        if (this.z != null) {
            codedOutputStream.G1(1, V());
        }
        if (this.A != null) {
            codedOutputStream.G1(2, Y());
        }
        if (this.B != null) {
            codedOutputStream.G1(3, U());
        }
        if (this.C != null) {
            codedOutputStream.G1(4, X());
        }
        if (this.D != null) {
            codedOutputStream.G1(5, S());
        }
        if (this.E != null) {
            codedOutputStream.G1(6, T());
        }
        if (this.F != null) {
            codedOutputStream.G1(7, a0());
        }
        if (this.G != null) {
            codedOutputStream.G1(8, W());
        }
        if (this.H != null) {
            codedOutputStream.G1(9, d0());
        }
        if (this.I != null) {
            codedOutputStream.G1(10, e0());
        }
        if (this.J != null) {
            codedOutputStream.G1(11, Z());
        }
        if (this.K != null) {
            codedOutputStream.G1(12, i0());
        }
        if (this.L != null) {
            codedOutputStream.G1(21, b0());
        }
        if (this.M != null) {
            codedOutputStream.G1(22, c0());
        }
        if (this.N != null) {
            codedOutputStream.G1(23, g0());
        }
        if (this.O != null) {
            codedOutputStream.G1(24, h0());
        }
        if (this.P != null) {
            codedOutputStream.G1(25, f0());
        }
        this.y.h(codedOutputStream);
    }

    public final bg3 h0() {
        bg3 bg3Var = this.O;
        return bg3Var == null ? bg3.B : bg3Var;
    }

    @Override // com.google.protobuf.QnHx
    public final int hashCode() {
        int i = this.w;
        if (i != 0) {
            return i;
        }
        int iHashCode = tb5.a.hashCode() + 779;
        if (l0()) {
            iHashCode = Xs.a(iHashCode, 37, 1, 53) + V().hashCode();
        }
        if (this.A != null) {
            iHashCode = Xs.a(iHashCode, 37, 2, 53) + Y().hashCode();
        }
        if (this.B != null) {
            iHashCode = Xs.a(iHashCode, 37, 3, 53) + U().hashCode();
        }
        if (this.C != null) {
            iHashCode = Xs.a(iHashCode, 37, 4, 53) + X().hashCode();
        }
        if (j0()) {
            iHashCode = Xs.a(iHashCode, 37, 5, 53) + S().hashCode();
        }
        if (k0()) {
            iHashCode = Xs.a(iHashCode, 37, 6, 53) + T().hashCode();
        }
        if (o0()) {
            iHashCode = Xs.a(iHashCode, 37, 7, 53) + a0().hashCode();
        }
        if (m0()) {
            iHashCode = Xs.a(iHashCode, 37, 8, 53) + W().hashCode();
        }
        if (r0()) {
            iHashCode = Xs.a(iHashCode, 37, 9, 53) + d0().hashCode();
        }
        if (s0()) {
            iHashCode = Xs.a(iHashCode, 37, 10, 53) + e0().hashCode();
        }
        if (n0()) {
            iHashCode = Xs.a(iHashCode, 37, 11, 53) + Z().hashCode();
        }
        if (v0()) {
            iHashCode = Xs.a(iHashCode, 37, 12, 53) + i0().hashCode();
        }
        if (p0()) {
            iHashCode = Xs.a(iHashCode, 37, 21, 53) + b0().hashCode();
        }
        if (q0()) {
            iHashCode = Xs.a(iHashCode, 37, 22, 53) + c0().hashCode();
        }
        if (this.N != null) {
            iHashCode = Xs.a(iHashCode, 37, 23, 53) + g0().hashCode();
        }
        if (u0()) {
            iHashCode = Xs.a(iHashCode, 37, 24, 53) + h0().hashCode();
        }
        if (t0()) {
            iHashCode = Xs.a(iHashCode, 37, 25, 53) + f0().hashCode();
        }
        int iHashCode2 = this.y.hashCode() + (iHashCode * 29);
        this.w = iHashCode2;
        return iHashCode2;
    }

    public final xt4 i0() {
        xt4 xt4Var = this.K;
        return xt4Var == null ? xt4.B : xt4Var;
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
    public final boolean isInitialized() {
        byte b = this.Q;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.Q = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
    public final int j() {
        int i = this.x;
        if (i != -1) {
            return i;
        }
        int iI1 = this.z != null ? 0 + CodedOutputStream.i1(1, V()) : 0;
        if (this.A != null) {
            iI1 += CodedOutputStream.i1(2, Y());
        }
        if (this.B != null) {
            iI1 += CodedOutputStream.i1(3, U());
        }
        if (this.C != null) {
            iI1 += CodedOutputStream.i1(4, X());
        }
        if (this.D != null) {
            iI1 += CodedOutputStream.i1(5, S());
        }
        if (this.E != null) {
            iI1 += CodedOutputStream.i1(6, T());
        }
        if (this.F != null) {
            iI1 += CodedOutputStream.i1(7, a0());
        }
        if (this.G != null) {
            iI1 += CodedOutputStream.i1(8, W());
        }
        if (this.H != null) {
            iI1 += CodedOutputStream.i1(9, d0());
        }
        if (this.I != null) {
            iI1 += CodedOutputStream.i1(10, e0());
        }
        if (this.J != null) {
            iI1 += CodedOutputStream.i1(11, Z());
        }
        if (this.K != null) {
            iI1 += CodedOutputStream.i1(12, i0());
        }
        if (this.L != null) {
            iI1 += CodedOutputStream.i1(21, b0());
        }
        if (this.M != null) {
            iI1 += CodedOutputStream.i1(22, c0());
        }
        if (this.N != null) {
            iI1 += CodedOutputStream.i1(23, g0());
        }
        if (this.O != null) {
            iI1 += CodedOutputStream.i1(24, h0());
        }
        if (this.P != null) {
            iI1 += CodedOutputStream.i1(25, f0());
        }
        int iJ = this.y.j() + iI1;
        this.x = iJ;
        return iJ;
    }

    public final boolean j0() {
        return this.D != null;
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
    public final k k() {
        return this.y;
    }

    public final boolean k0() {
        return this.E != null;
    }

    public final boolean l0() {
        return this.z != null;
    }

    public final boolean m0() {
        return this.G != null;
    }

    @Override // com.google.protobuf.mw0t
    public final mw0t.QnHx n() {
        return w0();
    }

    public final boolean n0() {
        return this.J != null;
    }

    public final boolean o0() {
        return this.F != null;
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
    public final oz2<ad2> p() {
        return S;
    }

    public final boolean p0() {
        return this.L != null;
    }

    public final boolean q0() {
        return this.M != null;
    }

    public final boolean r0() {
        return this.H != null;
    }

    public final boolean s0() {
        return this.I != null;
    }

    public final boolean t0() {
        return this.P != null;
    }

    public final boolean u0() {
        return this.O != null;
    }

    public final boolean v0() {
        return this.K != null;
    }

    @Override // com.google.protobuf.DzVS
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public final CQf c() {
        if (this == R) {
            return new CQf();
        }
        CQf cQf = new CQf();
        cQf.S(this);
        return cQf;
    }

    @Override // defpackage.jd2
    public final DzVS a() {
        return R;
    }

    public ad2() {
        this.Q = (byte) -1;
    }

    public ad2(NUlFixed nUl, vv0 vv0Var) {
        this();
        vv0Var.getClass();
        k.QnHx qnHxR = k.r();
        boolean z = false;
        while (!z) {
            try {
                try {
                    try {
                        int iZ = nUl.z();
                        switch (iZ) {
                            case 0:
                                break;
                            case 10:
                                el0 el0Var = this.z;
                                el0.CQf cQfC = el0Var != null ? el0Var.c() : null;
                                el0 el0Var2 = (el0) nUl.q(el0.S(), vv0Var);
                                this.z = el0Var2;
                                if (cQfC != null) {
                                    cQfC.R(el0Var2);
                                    this.z = cQfC.f();
                                } else {
                                    continue;
                                }
                                break;
                            case 18:
                                aj2 aj2Var = this.A;
                                aj2.CQf cQfU = aj2Var != null ? aj2Var.c() : null;
                                aj2 aj2Var2 = (aj2) nUl.q(aj2.T(), vv0Var);
                                this.A = aj2Var2;
                                if (cQfU != null) {
                                    cQfU.R(aj2Var2);
                                    this.A = cQfU.f();
                                } else {
                                    continue;
                                }
                                break;
                            case 26:
                                bk0 bk0Var = this.B;
                                bk0.CQf cQfT = bk0Var != null ? bk0Var.c() : null;
                                bk0 bk0Var2 = (bk0) nUl.q(bk0.S(), vv0Var);
                                this.B = bk0Var2;
                                if (cQfT != null) {
                                    cQfT.R(bk0Var2);
                                    this.B = cQfT.f();
                                } else {
                                    continue;
                                }
                                break;
                            case 34:
                                dc2 dc2Var = this.C;
                                dc2.CQf cQfT2 = dc2Var != null ? dc2Var.c() : null;
                                dc2 dc2Var2 = (dc2) nUl.q(dc2.S(), vv0Var);
                                this.C = dc2Var2;
                                if (cQfT2 != null) {
                                    cQfT2.R(dc2Var2);
                                    this.C = cQfT2.f();
                                } else {
                                    continue;
                                }
                                break;
                            case 42:
                                s_ s_Var = this.D;
                                s_.CQf cQfT3 = s_Var != null ? s_Var.c() : null;
                                s_ s_Var2 = (s_) nUl.q(s_.S(), vv0Var);
                                this.D = s_Var2;
                                if (cQfT3 != null) {
                                    cQfT3.R(s_Var2);
                                    this.D = cQfT3.f();
                                } else {
                                    continue;
                                }
                                break;
                            case 50:
                                eo eoVar = this.E;
                                eo.CQf cQfT4 = eoVar != null ? eoVar.c() : null;
                                eo eoVar2 = (eo) nUl.q(eo.S(), vv0Var);
                                this.E = eoVar2;
                                if (cQfT4 != null) {
                                    cQfT4.R(eoVar2);
                                    this.E = cQfT4.f();
                                } else {
                                    continue;
                                }
                                break;
                            case 58:
                                np2 np2Var = this.F;
                                np2.CQf cQfX = np2Var != null ? np2Var.c() : null;
                                np2 np2Var2 = (np2) nUl.q(np2.W(), vv0Var);
                                this.F = np2Var2;
                                if (cQfX != null) {
                                    cQfX.R(np2Var2);
                                    this.F = cQfX.f();
                                } else {
                                    continue;
                                }
                                break;
                            case 66:
                                hl0 hl0Var = this.G;
                                hl0.CQf cQfU2 = hl0Var != null ? hl0Var.c() : null;
                                hl0 hl0Var2 = (hl0) nUl.q(hl0.T(), vv0Var);
                                this.G = hl0Var2;
                                if (cQfU2 != null) {
                                    cQfU2.R(hl0Var2);
                                    this.G = cQfU2.f();
                                } else {
                                    continue;
                                }
                                break;
                            case 74:
                                rq3 rq3Var = this.H;
                                rq3.CQf cQfT5 = rq3Var != null ? rq3Var.c() : null;
                                rq3 rq3Var2 = (rq3) nUl.q(rq3.S(), vv0Var);
                                this.H = rq3Var2;
                                if (cQfT5 != null) {
                                    cQfT5.R(rq3Var2);
                                    this.H = cQfT5.f();
                                } else {
                                    continue;
                                }
                                break;
                            case 82:
                                sq3 sq3Var = this.I;
                                sq3.CQf cQfU3 = sq3Var != null ? sq3Var.c() : null;
                                sq3 sq3Var2 = (sq3) nUl.q(sq3.T(), vv0Var);
                                this.I = sq3Var2;
                                if (cQfU3 != null) {
                                    cQfU3.R(sq3Var2);
                                    this.I = cQfU3.f();
                                } else {
                                    continue;
                                }
                                break;
                            case 90:
                                kp2 kp2Var = this.J;
                                kp2.CQf cQfT6 = kp2Var != null ? kp2Var.c() : null;
                                kp2 kp2Var2 = (kp2) nUl.q(kp2.S(), vv0Var);
                                this.J = kp2Var2;
                                if (cQfT6 != null) {
                                    cQfT6.R(kp2Var2);
                                    this.J = cQfT6.f();
                                } else {
                                    continue;
                                }
                                break;
                            case 98:
                                xt4 xt4Var = this.K;
                                xt4.CQf cQfU4 = xt4Var != null ? xt4Var.c() : null;
                                xt4 xt4Var2 = (xt4) nUl.q(xt4.T(), vv0Var);
                                this.K = xt4Var2;
                                if (cQfU4 != null) {
                                    cQfU4.R(xt4Var2);
                                    this.K = cQfU4.f();
                                } else {
                                    continue;
                                }
                                break;
                            case 170:
                                c33 c33Var = this.L;
                                c33.CQf cQfT7 = c33Var != null ? c33Var.c() : null;
                                c33 c33Var2 = (c33) nUl.q(c33.S(), vv0Var);
                                this.L = c33Var2;
                                if (cQfT7 != null) {
                                    cQfT7.R(c33Var2);
                                    this.L = cQfT7.f();
                                } else {
                                    continue;
                                }
                                break;
                            case 178:
                                e33 e33Var = this.M;
                                e33.CQf cQfT8 = e33Var != null ? e33Var.c() : null;
                                e33 e33Var2 = (e33) nUl.q(e33.S(), vv0Var);
                                this.M = e33Var2;
                                if (cQfT8 != null) {
                                    cQfT8.R(e33Var2);
                                    this.M = cQfT8.f();
                                } else {
                                    continue;
                                }
                                break;
                            case 186:
                                ag3 ag3Var = this.N;
                                ag3.CQf cQfT9 = ag3Var != null ? ag3Var.c() : null;
                                ag3 ag3Var2 = (ag3) nUl.q(ag3.S(), vv0Var);
                                this.N = ag3Var2;
                                if (cQfT9 != null) {
                                    cQfT9.Q(ag3Var2);
                                    ag3 ag3Var3 = new ag3(cQfT9);
                                    cQfT9.L();
                                    this.N = ag3Var3;
                                } else {
                                    continue;
                                }
                                break;
                            case 194:
                                bg3 bg3Var = this.O;
                                bg3.CQf cQfU5 = bg3Var != null ? bg3Var.c() : null;
                                bg3 bg3Var2 = (bg3) nUl.q(bg3.T(), vv0Var);
                                this.O = bg3Var2;
                                if (cQfU5 != null) {
                                    cQfU5.R(bg3Var2);
                                    this.O = cQfU5.f();
                                } else {
                                    continue;
                                }
                                break;
                            case 202:
                                xf3 xf3Var = this.P;
                                xf3.CQf cQfU6 = xf3Var != null ? xf3Var.c() : null;
                                xf3 xf3Var2 = (xf3) nUl.q(xf3.T(), vv0Var);
                                this.P = xf3Var2;
                                if (cQfU6 != null) {
                                    cQfU6.S(xf3Var2);
                                    this.P = cQfU6.f();
                                } else {
                                    continue;
                                }
                                break;
                            default:
                                if (!lPt3Fixed.Q(nUl, qnHxR, iZ)) {
                                    break;
                                }
                                break;
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.e(this);
                        throw e;
                    } catch (UninitializedMessageException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                        invalidProtocolBufferExceptionA.e(this);
                        throw invalidProtocolBufferExceptionA;
                    }
                } catch (IOException e3) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                    invalidProtocolBufferException.e(this);
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th) {
                this.y = qnHxR.build();
                throw th;
            }
        }
        this.y = qnHxR.build();
    }
}
