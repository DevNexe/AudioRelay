package defpackage;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.DzVS;
import com.google.protobuf.F1;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.NUlFixed;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.k;
import com.google.protobuf.lPt3Fixed;
import com.google.protobuf.mw0t;
import com.google.protobuf.roZB;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class uw0 extends lPt3Fixed implements roZB {
    public static final uw0 H = new uw0();
    public static final QnHx I = new QnHx();
    public iu4 A;
    public v40 B;
    public xd2 C;
    public lq3 D;
    public sf3 E;
    public zf3 F;
    public byte G;
    public mh2 z;

    public static final class CQf extends lPt3Fixed.CQf<CQf> implements roZB {
        public mh2 A;
        public iu4 B;
        public v40 C;
        public xd2 D;
        public lq3 E;
        public sf3 F;
        public zf3 G;

        public CQf() {
            uw0 uw0Var = uw0.H;
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
            lPt3Fixed.YKK ykk = wb5.h;
            ykk.c(uw0.class, CQf.class);
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
        public final uw0 f() {
            uw0 uw0Var = new uw0(this);
            uw0Var.z = this.A;
            uw0Var.A = this.B;
            uw0Var.B = this.C;
            uw0Var.C = this.D;
            uw0Var.D = this.E;
            uw0Var.E = this.F;
            uw0Var.F = this.G;
            L();
            return uw0Var;
        }

        public final void R(uw0 uw0Var) {
            if (uw0Var == uw0.H) {
                return;
            }
            if (uw0Var.c0()) {
                mh2 mh2VarV = uw0Var.V();
                mh2 mh2Var = this.A;
                if (mh2Var != null) {
                    mh2.CQf cQfC = mh2.D.c();
                    cQfC.R(mh2Var);
                    cQfC.R(mh2VarV);
                    this.A = cQfC.f();
                } else {
                    this.A = mh2VarV;
                }
                M();
            }
            if (uw0Var.f0()) {
                iu4 iu4VarY = uw0Var.Y();
                iu4 iu4Var = this.B;
                if (iu4Var != null) {
                    iu4.CQf cQfC2 = iu4.B.c();
                    cQfC2.R(iu4Var);
                    cQfC2.R(iu4VarY);
                    this.B = cQfC2.f();
                } else {
                    this.B = iu4VarY;
                }
                M();
            }
            if (uw0Var.Z()) {
                v40 v40VarS = uw0Var.S();
                v40 v40Var = this.C;
                if (v40Var != null) {
                    v40.CQf cQfC3 = v40.C.c();
                    cQfC3.R(v40Var);
                    cQfC3.R(v40VarS);
                    this.C = cQfC3.f();
                } else {
                    this.C = v40VarS;
                }
                M();
            }
            if (uw0Var.b0()) {
                xd2 xd2VarU = uw0Var.U();
                xd2 xd2Var = this.D;
                if (xd2Var != null) {
                    xd2.CQf cQfC4 = xd2.B.c();
                    cQfC4.R(xd2Var);
                    cQfC4.R(xd2VarU);
                    this.D = cQfC4.f();
                } else {
                    this.D = xd2VarU;
                }
                M();
            }
            if (uw0Var.d0()) {
                lq3 lq3VarW = uw0Var.W();
                lq3 lq3Var = this.E;
                if (lq3Var != null) {
                    lq3.CQf cQfC5 = lq3.B.c();
                    cQfC5.R(lq3Var);
                    cQfC5.R(lq3VarW);
                    this.E = cQfC5.f();
                } else {
                    this.E = lq3VarW;
                }
                M();
            }
            if (uw0Var.a0()) {
                sf3 sf3VarT = uw0Var.T();
                sf3 sf3Var = this.F;
                if (sf3Var != null) {
                    sf3.CQf cQfC6 = sf3.B.c();
                    cQfC6.R(sf3Var);
                    cQfC6.R(sf3VarT);
                    this.F = cQfC6.f();
                } else {
                    this.F = sf3VarT;
                }
                M();
            }
            if (uw0Var.e0()) {
                zf3 zf3VarX = uw0Var.X();
                zf3 zf3Var = this.G;
                if (zf3Var != null) {
                    zf3.CQf cQfC7 = zf3.B.c();
                    cQfC7.R(zf3Var);
                    cQfC7.R(zf3VarX);
                    this.G = cQfC7.f();
                } else {
                    this.G = zf3VarX;
                }
                M();
            }
            super.B(uw0Var.y);
            M();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        public final void S(NUlFixed nUl, vv0 vv0Var) throws Throwable {
            uw0 uw0Var;
            try {
                try {
                    R((uw0) uw0.I.b(nUl, vv0Var));
                } catch (InvalidProtocolBufferException e) {
                    uw0Var = (uw0) e.w;
                    try {
                        throw e.g();
                    } catch (Throwable th) {
                        th = th;
                        if (uw0Var != null) {
                            R(uw0Var);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                uw0Var = null;
                if (uw0Var != null) {
                    R(uw0Var);
                }
                throw th;
            }
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return uw0.H;
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
        public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
            super.b(nUl, obj);
            return this;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final mw0t build() {
            uw0 uw0VarF = f();
            if (uw0VarF.isInitialized()) {
                return uw0VarF;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(uw0VarF);
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
        public final Object clone() {
            return (CQf) super.clone();
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
        public final Descriptors.QnHx e() {
            return wb5.g;
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
            if (mw0tVar instanceof uw0) {
                R((uw0) mw0tVar);
            } else {
                super.s(mw0tVar);
            }
            return this;
        }

        @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.DzVS.QnHx
        public final /* bridge */ /* synthetic */ DzVS.QnHx v(NUlFixed nUl, vv0 vv0Var) throws Throwable {
            S(nUl, vv0Var);
            return this;
        }

        @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
        /* JADX INFO: renamed from: w */
        public final /* bridge */ /* synthetic */ com.google.protobuf.QnHx.AbstractC0099QnHx v(NUlFixed nUl, vv0 vv0Var) throws Throwable {
            S(nUl, vv0Var);
            return this;
        }

        @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
        /* JADX INFO: renamed from: x */
        public final com.google.protobuf.QnHx.AbstractC0099QnHx s(mw0t mw0tVar) {
            if (mw0tVar instanceof uw0) {
                R((uw0) mw0tVar);
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
            return uw0.H;
        }

        public CQf(lPt3Fixed.QnHx qnHx) {
            super(qnHx);
            uw0 uw0Var = uw0.H;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final DzVS build() {
            uw0 uw0VarF = f();
            if (uw0VarF.isInitialized()) {
                return uw0VarF;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(uw0VarF);
        }
    }

    public class QnHx extends F1<uw0> {
        @Override // defpackage.oz2
        public final Object b(NUlFixed nUl, vv0 vv0Var) {
            uw0 uw0Var = new uw0();
            vv0Var.getClass();
            k kVar = k.x;
            k.QnHx qnHx = new k.QnHx();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int iZ = nUl.z();
                            if (iZ != 0) {
                                if (iZ == 10) {
                                    mh2 mh2Var = uw0Var.z;
                                    mh2.CQf cQfC = mh2Var != null ? mh2Var.c() : null;
                                    mh2 mh2Var2 = (mh2) nUl.q(mh2.E, vv0Var);
                                    uw0Var.z = mh2Var2;
                                    if (cQfC != null) {
                                        cQfC.R(mh2Var2);
                                        uw0Var.z = cQfC.f();
                                    }
                                } else if (iZ == 18) {
                                    iu4 iu4Var = uw0Var.A;
                                    iu4.CQf cQfC2 = iu4Var != null ? iu4Var.c() : null;
                                    iu4 iu4Var2 = (iu4) nUl.q(iu4.C, vv0Var);
                                    uw0Var.A = iu4Var2;
                                    if (cQfC2 != null) {
                                        cQfC2.R(iu4Var2);
                                        uw0Var.A = cQfC2.f();
                                    }
                                } else if (iZ == 26) {
                                    v40 v40Var = uw0Var.B;
                                    v40.CQf cQfC3 = v40Var != null ? v40Var.c() : null;
                                    v40 v40Var2 = (v40) nUl.q(v40.D, vv0Var);
                                    uw0Var.B = v40Var2;
                                    if (cQfC3 != null) {
                                        cQfC3.R(v40Var2);
                                        uw0Var.B = cQfC3.f();
                                    }
                                } else if (iZ == 34) {
                                    xd2 xd2Var = uw0Var.C;
                                    xd2.CQf cQfC4 = xd2Var != null ? xd2Var.c() : null;
                                    xd2 xd2Var2 = (xd2) nUl.q(xd2.C, vv0Var);
                                    uw0Var.C = xd2Var2;
                                    if (cQfC4 != null) {
                                        cQfC4.R(xd2Var2);
                                        uw0Var.C = cQfC4.f();
                                    }
                                } else if (iZ == 42) {
                                    lq3 lq3Var = uw0Var.D;
                                    lq3.CQf cQfC5 = lq3Var != null ? lq3Var.c() : null;
                                    lq3 lq3Var2 = (lq3) nUl.q(lq3.C, vv0Var);
                                    uw0Var.D = lq3Var2;
                                    if (cQfC5 != null) {
                                        cQfC5.R(lq3Var2);
                                        uw0Var.D = cQfC5.f();
                                    }
                                } else if (iZ == 50) {
                                    sf3 sf3Var = uw0Var.E;
                                    sf3.CQf cQfC6 = sf3Var != null ? sf3Var.c() : null;
                                    sf3 sf3Var2 = (sf3) nUl.q(sf3.C, vv0Var);
                                    uw0Var.E = sf3Var2;
                                    if (cQfC6 != null) {
                                        cQfC6.R(sf3Var2);
                                        uw0Var.E = cQfC6.f();
                                    }
                                } else if (iZ == 58) {
                                    zf3 zf3Var = uw0Var.F;
                                    zf3.CQf cQfC7 = zf3Var != null ? zf3Var.c() : null;
                                    zf3 zf3Var2 = (zf3) nUl.q(zf3.C, vv0Var);
                                    uw0Var.F = zf3Var2;
                                    if (cQfC7 != null) {
                                        cQfC7.R(zf3Var2);
                                        uw0Var.F = cQfC7.f();
                                    }
                                } else if (!qnHx.u(iZ, nUl)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            e.w = uw0Var;
                            throw e;
                        } catch (UninitializedMessageException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                            invalidProtocolBufferExceptionA.w = uw0Var;
                            throw invalidProtocolBufferExceptionA;
                        }
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                        invalidProtocolBufferException.w = uw0Var;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    uw0Var.y = qnHx.build();
                    throw th;
                }
            }
            uw0Var.y = qnHx.build();
            return uw0Var;
        }
    }

    public uw0(lPt3Fixed.CQf cQf) {
        super(cQf);
        this.G = (byte) -1;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final lPt3Fixed.YKK L() {
        lPt3Fixed.YKK ykk = wb5.h;
        ykk.c(uw0.class, CQf.class);
        return ykk;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
        return new CQf(qnHx);
    }

    public final v40 S() {
        v40 v40Var = this.B;
        return v40Var == null ? v40.C : v40Var;
    }

    public final sf3 T() {
        sf3 sf3Var = this.E;
        return sf3Var == null ? sf3.B : sf3Var;
    }

    public final xd2 U() {
        xd2 xd2Var = this.C;
        return xd2Var == null ? xd2.B : xd2Var;
    }

    public final mh2 V() {
        mh2 mh2Var = this.z;
        return mh2Var == null ? mh2.D : mh2Var;
    }

    public final lq3 W() {
        lq3 lq3Var = this.D;
        return lq3Var == null ? lq3.B : lq3Var;
    }

    public final zf3 X() {
        zf3 zf3Var = this.F;
        return zf3Var == null ? zf3.B : zf3Var;
    }

    public final iu4 Y() {
        iu4 iu4Var = this.A;
        return iu4Var == null ? iu4.B : iu4Var;
    }

    public final boolean Z() {
        return this.B != null;
    }

    @Override // defpackage.jd2
    public final mw0t a() {
        return H;
    }

    public final boolean a0() {
        return this.E != null;
    }

    public final boolean b0() {
        return this.C != null;
    }

    public final boolean c0() {
        return this.z != null;
    }

    public final boolean d0() {
        return this.D != null;
    }

    public final boolean e0() {
        return this.F != null;
    }

    @Override // com.google.protobuf.QnHx
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uw0)) {
            return super.equals(obj);
        }
        uw0 uw0Var = (uw0) obj;
        if (c0() != uw0Var.c0()) {
            return false;
        }
        if ((c0() && !V().equals(uw0Var.V())) || f0() != uw0Var.f0()) {
            return false;
        }
        if ((f0() && !Y().equals(uw0Var.Y())) || Z() != uw0Var.Z()) {
            return false;
        }
        if ((Z() && !S().equals(uw0Var.S())) || b0() != uw0Var.b0()) {
            return false;
        }
        if ((b0() && !U().equals(uw0Var.U())) || d0() != uw0Var.d0()) {
            return false;
        }
        if ((d0() && !W().equals(uw0Var.W())) || a0() != uw0Var.a0()) {
            return false;
        }
        if ((!a0() || T().equals(uw0Var.T())) && e0() == uw0Var.e0()) {
            return (!e0() || X().equals(uw0Var.X())) && this.y.equals(uw0Var.y);
        }
        return false;
    }

    public final boolean f0() {
        return this.A != null;
    }

    @Override // com.google.protobuf.DzVS
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final CQf c() {
        if (this == H) {
            return new CQf();
        }
        CQf cQf = new CQf();
        cQf.R(this);
        return cQf;
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
            codedOutputStream.G1(3, S());
        }
        if (this.C != null) {
            codedOutputStream.G1(4, U());
        }
        if (this.D != null) {
            codedOutputStream.G1(5, W());
        }
        if (this.E != null) {
            codedOutputStream.G1(6, T());
        }
        if (this.F != null) {
            codedOutputStream.G1(7, X());
        }
        this.y.h(codedOutputStream);
    }

    @Override // com.google.protobuf.QnHx
    public final int hashCode() {
        int i = this.w;
        if (i != 0) {
            return i;
        }
        int iHashCode = wb5.g.hashCode() + 779;
        if (c0()) {
            iHashCode = Xs.a(iHashCode, 37, 1, 53) + V().hashCode();
        }
        if (f0()) {
            iHashCode = Xs.a(iHashCode, 37, 2, 53) + Y().hashCode();
        }
        if (Z()) {
            iHashCode = Xs.a(iHashCode, 37, 3, 53) + S().hashCode();
        }
        if (b0()) {
            iHashCode = Xs.a(iHashCode, 37, 4, 53) + U().hashCode();
        }
        if (d0()) {
            iHashCode = Xs.a(iHashCode, 37, 5, 53) + W().hashCode();
        }
        if (a0()) {
            iHashCode = Xs.a(iHashCode, 37, 6, 53) + T().hashCode();
        }
        if (e0()) {
            iHashCode = Xs.a(iHashCode, 37, 7, 53) + X().hashCode();
        }
        int iHashCode2 = this.y.hashCode() + (iHashCode * 29);
        this.w = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
    public final boolean isInitialized() {
        byte b = this.G;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.G = (byte) 1;
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
            iI1 += CodedOutputStream.i1(3, S());
        }
        if (this.C != null) {
            iI1 += CodedOutputStream.i1(4, U());
        }
        if (this.D != null) {
            iI1 += CodedOutputStream.i1(5, W());
        }
        if (this.E != null) {
            iI1 += CodedOutputStream.i1(6, T());
        }
        if (this.F != null) {
            iI1 += CodedOutputStream.i1(7, X());
        }
        int iJ = this.y.j() + iI1;
        this.x = iJ;
        return iJ;
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
    public final k k() {
        return this.y;
    }

    @Override // com.google.protobuf.mw0t
    public final mw0t.QnHx n() {
        return H.c();
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
    public final oz2<uw0> p() {
        return I;
    }

    @Override // defpackage.jd2
    public final DzVS a() {
        return H;
    }

    public uw0() {
        this.G = (byte) -1;
    }
}
