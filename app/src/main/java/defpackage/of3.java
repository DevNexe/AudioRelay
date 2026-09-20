package defpackage;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.DzVS;
import com.google.protobuf.F1;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.NUlFixed;
import com.google.protobuf.SjP;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.k;
import com.google.protobuf.lPt3Fixed;
import com.google.protobuf.mw0t;
import com.google.protobuf.roZB;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class of3 extends lPt3Fixed implements roZB {
    public static final of3 N = new of3();
    public static final QnHx O = new QnHx();
    public volatile Object A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public uw0 H;
    public boolean I;
    public volatile Object J;
    public int K;
    public wf3 L;
    public byte M;
    public volatile Object z;

    public static final class CQf extends lPt3Fixed.CQf<CQf> implements roZB {
        public Object A;
        public Object B;
        public int C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public uw0 I;
        public boolean J;
        public Object K;
        public int L;
        public wf3 M;

        public CQf() {
            this.A = "";
            this.B = "";
            this.K = "";
            this.L = 0;
            of3 of3Var = of3.N;
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
            lPt3Fixed.YKK ykk = wb5.f;
            ykk.c(of3.class, CQf.class);
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
        public final of3 f() {
            of3 of3Var = new of3(this);
            of3Var.z = this.A;
            of3Var.A = this.B;
            of3Var.B = this.C;
            of3Var.C = this.D;
            of3Var.D = this.E;
            of3Var.E = this.F;
            of3Var.F = this.G;
            of3Var.G = this.H;
            of3Var.H = this.I;
            of3Var.I = this.J;
            of3Var.J = this.K;
            of3Var.K = this.L;
            of3Var.L = this.M;
            L();
            return of3Var;
        }

        public final void R(of3 of3Var) {
            if (of3Var == of3.N) {
                return;
            }
            if (!of3Var.U().isEmpty()) {
                this.A = of3Var.z;
                M();
            }
            if (!of3Var.S().isEmpty()) {
                this.B = of3Var.A;
                M();
            }
            int i = of3Var.B;
            if (i != 0) {
                this.C = i;
                M();
            }
            int i2 = of3Var.C;
            if (i2 != 0) {
                this.D = i2;
                M();
            }
            int i3 = of3Var.D;
            if (i3 != 0) {
                this.E = i3;
                M();
            }
            int i4 = of3Var.E;
            if (i4 != 0) {
                this.F = i4;
                M();
            }
            int i5 = of3Var.F;
            if (i5 != 0) {
                this.G = i5;
                M();
            }
            int i6 = of3Var.G;
            if (i6 != 0) {
                this.H = i6;
                M();
            }
            if (of3Var.H != null) {
                uw0 uw0VarW = of3Var.W();
                uw0 uw0Var = this.I;
                if (uw0Var != null) {
                    uw0.CQf cQfC = uw0.H.c();
                    cQfC.R(uw0Var);
                    cQfC.R(uw0VarW);
                    this.I = cQfC.f();
                } else {
                    this.I = uw0VarW;
                }
                M();
            }
            boolean z = of3Var.I;
            if (z) {
                this.J = z;
                M();
            }
            if (!of3Var.V().isEmpty()) {
                this.K = of3Var.J;
                M();
            }
            int i7 = of3Var.K;
            if (i7 != 0) {
                this.L = i7;
                M();
            }
            if (of3Var.X()) {
                wf3 wf3VarT = of3Var.T();
                wf3 wf3Var = this.M;
                if (wf3Var != null) {
                    wf3.CQf cQfC2 = wf3.C.c();
                    cQfC2.R(wf3Var);
                    cQfC2.R(wf3VarT);
                    this.M = cQfC2.f();
                } else {
                    this.M = wf3VarT;
                }
                M();
            }
            super.B(of3Var.y);
            M();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        public final void S(NUlFixed nUl, vv0 vv0Var) throws Throwable {
            of3 of3Var;
            try {
                try {
                    R((of3) of3.O.b(nUl, vv0Var));
                } catch (InvalidProtocolBufferException e) {
                    of3Var = (of3) e.w;
                    try {
                        throw e.g();
                    } catch (Throwable th) {
                        th = th;
                        if (of3Var != null) {
                            R(of3Var);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                of3Var = null;
                if (of3Var != null) {
                    R(of3Var);
                }
                throw th;
            }
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return of3.N;
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
        public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
            super.b(nUl, obj);
            return this;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final mw0t build() {
            of3 of3VarF = f();
            if (of3VarF.isInitialized()) {
                return of3VarF;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(of3VarF);
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
        public final Object clone() {
            return (CQf) super.clone();
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
        public final Descriptors.QnHx e() {
            return wb5.e;
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
            if (mw0tVar instanceof of3) {
                R((of3) mw0tVar);
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
            if (mw0tVar instanceof of3) {
                R((of3) mw0tVar);
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
            return of3.N;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final DzVS build() {
            of3 of3VarF = f();
            if (of3VarF.isInitialized()) {
                return of3VarF;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(of3VarF);
        }

        public CQf(lPt3Fixed.QnHx qnHx) {
            super(qnHx);
            this.A = "";
            this.B = "";
            this.K = "";
            this.L = 0;
            of3 of3Var = of3.N;
        }
    }

    public class QnHx extends F1<of3> {
        @Override // defpackage.oz2
        public final Object b(NUlFixed nUl, vv0 vv0Var) {
            of3 of3Var = new of3();
            vv0Var.getClass();
            k kVar = k.x;
            k.QnHx qnHx = new k.QnHx();
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
                                    of3Var.z = nUl.y();
                                    continue;
                                case 26:
                                    of3Var.A = nUl.y();
                                    continue;
                                case 48:
                                    of3Var.B = nUl.o();
                                    continue;
                                case 56:
                                    of3Var.C = nUl.o();
                                    continue;
                                case 64:
                                    of3Var.D = nUl.o();
                                    continue;
                                case 74:
                                    uw0 uw0Var = of3Var.H;
                                    uw0.CQf cQfC = uw0Var != null ? uw0Var.c() : null;
                                    uw0 uw0Var2 = (uw0) nUl.q(uw0.I, vv0Var);
                                    of3Var.H = uw0Var2;
                                    if (cQfC != null) {
                                        cQfC.R(uw0Var2);
                                        of3Var.H = cQfC.f();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 80:
                                    of3Var.I = nUl.g();
                                    continue;
                                case 104:
                                    of3Var.E = nUl.o();
                                    continue;
                                case 112:
                                    of3Var.F = nUl.o();
                                    continue;
                                case 120:
                                    of3Var.G = nUl.o();
                                    continue;
                                case 130:
                                    of3Var.J = nUl.y();
                                    continue;
                                case 136:
                                    of3Var.K = nUl.j();
                                    continue;
                                case 146:
                                    wf3 wf3Var = of3Var.L;
                                    wf3.CQf cQfC2 = wf3Var != null ? wf3Var.c() : null;
                                    wf3 wf3Var2 = (wf3) nUl.q(wf3.D, vv0Var);
                                    of3Var.L = wf3Var2;
                                    if (cQfC2 != null) {
                                        cQfC2.R(wf3Var2);
                                        of3Var.L = cQfC2.f();
                                    } else {
                                        continue;
                                    }
                                    break;
                                default:
                                    if (!qnHx.u(iZ, nUl)) {
                                        break;
                                    }
                                    break;
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            e.w = of3Var;
                            throw e;
                        } catch (UninitializedMessageException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                            invalidProtocolBufferExceptionA.w = of3Var;
                            throw invalidProtocolBufferExceptionA;
                        }
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                        invalidProtocolBufferException.w = of3Var;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    of3Var.y = qnHx.build();
                    throw th;
                }
            }
            of3Var.y = qnHx.build();
            return of3Var;
        }
    }

    public of3(lPt3Fixed.CQf cQf) {
        super(cQf);
        this.M = (byte) -1;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final lPt3Fixed.YKK L() {
        lPt3Fixed.YKK ykk = wb5.f;
        ykk.c(of3.class, CQf.class);
        return ykk;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
        return new CQf(qnHx);
    }

    public final String S() {
        Object obj = this.A;
        if (obj instanceof String) {
            return (String) obj;
        }
        String strS = ((lk) obj).s();
        this.A = strS;
        return strS;
    }

    public final wf3 T() {
        wf3 wf3Var = this.L;
        return wf3Var == null ? wf3.C : wf3Var;
    }

    @Deprecated
    public final String U() {
        Object obj = this.z;
        if (obj instanceof String) {
            return (String) obj;
        }
        String strS = ((lk) obj).s();
        this.z = strS;
        return strS;
    }

    public final String V() {
        Object obj = this.J;
        if (obj instanceof String) {
            return (String) obj;
        }
        String strS = ((lk) obj).s();
        this.J = strS;
        return strS;
    }

    public final uw0 W() {
        uw0 uw0Var = this.H;
        return uw0Var == null ? uw0.H : uw0Var;
    }

    public final boolean X() {
        return this.L != null;
    }

    @Override // com.google.protobuf.DzVS
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final CQf c() {
        if (this == N) {
            return new CQf();
        }
        CQf cQf = new CQf();
        cQf.R(this);
        return cQf;
    }

    @Override // defpackage.jd2
    public final mw0t a() {
        return N;
    }

    @Override // com.google.protobuf.QnHx
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof of3)) {
            return super.equals(obj);
        }
        of3 of3Var = (of3) obj;
        if (!U().equals(of3Var.U()) || !S().equals(of3Var.S()) || this.B != of3Var.B || this.C != of3Var.C || this.D != of3Var.D || this.E != of3Var.E || this.F != of3Var.F || this.G != of3Var.G) {
            return false;
        }
        uw0 uw0Var = this.H;
        if ((uw0Var != null) != (of3Var.H != null)) {
            return false;
        }
        if ((!(uw0Var != null) || W().equals(of3Var.W())) && this.I == of3Var.I && V().equals(of3Var.V()) && this.K == of3Var.K && X() == of3Var.X()) {
            return (!X() || T().equals(of3Var.T())) && this.y.equals(of3Var.y);
        }
        return false;
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
    public final void h(CodedOutputStream codedOutputStream) {
        if (!lPt3Fixed.M(this.z)) {
            lPt3Fixed.R(codedOutputStream, 1, this.z);
        }
        if (!lPt3Fixed.M(this.A)) {
            lPt3Fixed.R(codedOutputStream, 3, this.A);
        }
        int i = this.B;
        if (i != 0) {
            codedOutputStream.E1(6, i);
        }
        int i2 = this.C;
        if (i2 != 0) {
            codedOutputStream.E1(7, i2);
        }
        int i3 = this.D;
        if (i3 != 0) {
            codedOutputStream.E1(8, i3);
        }
        if (this.H != null) {
            codedOutputStream.G1(9, W());
        }
        boolean z = this.I;
        if (z) {
            codedOutputStream.w1(10, z);
        }
        int i4 = this.E;
        if (i4 != 0) {
            codedOutputStream.E1(13, i4);
        }
        int i5 = this.F;
        if (i5 != 0) {
            codedOutputStream.E1(14, i5);
        }
        int i6 = this.G;
        if (i6 != 0) {
            codedOutputStream.E1(15, i6);
        }
        if (!lPt3Fixed.M(this.J)) {
            lPt3Fixed.R(codedOutputStream, 16, this.J);
        }
        if (this.K != vf3.UNKNOWN.b()) {
            codedOutputStream.E1(17, this.K);
        }
        if (this.L != null) {
            codedOutputStream.G1(18, T());
        }
        this.y.h(codedOutputStream);
    }

    @Override // com.google.protobuf.QnHx
    public final int hashCode() {
        int i = this.w;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((((((((((S().hashCode() + ((((U().hashCode() + u40.a(wb5.e, 779, 37, 1, 53)) * 37) + 3) * 53)) * 37) + 6) * 53) + this.B) * 37) + 7) * 53) + this.C) * 37) + 8) * 53) + this.D) * 37) + 13) * 53) + this.E) * 37) + 14) * 53) + this.F) * 37) + 15) * 53) + this.G;
        if (this.H != null) {
            iHashCode = Xs.a(iHashCode, 37, 9, 53) + W().hashCode();
        }
        int iHashCode2 = ((((V().hashCode() + ((((SjP.a(this.I) + Xs.a(iHashCode, 37, 10, 53)) * 37) + 16) * 53)) * 37) + 17) * 53) + this.K;
        if (X()) {
            iHashCode2 = Xs.a(iHashCode2, 37, 18, 53) + T().hashCode();
        }
        int iHashCode3 = this.y.hashCode() + (iHashCode2 * 29);
        this.w = iHashCode3;
        return iHashCode3;
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
    public final boolean isInitialized() {
        byte b = this.M;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.M = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
    public final int j() {
        int i = this.x;
        if (i != -1) {
            return i;
        }
        int iH = lPt3Fixed.M(this.z) ? 0 : 0 + lPt3Fixed.H(1, this.z);
        if (!lPt3Fixed.M(this.A)) {
            iH += lPt3Fixed.H(3, this.A);
        }
        int i2 = this.B;
        if (i2 != 0) {
            iH += CodedOutputStream.e1(6, i2);
        }
        int i3 = this.C;
        if (i3 != 0) {
            iH += CodedOutputStream.e1(7, i3);
        }
        int i4 = this.D;
        if (i4 != 0) {
            iH += CodedOutputStream.e1(8, i4);
        }
        if (this.H != null) {
            iH += CodedOutputStream.i1(9, W());
        }
        if (this.I) {
            iH += CodedOutputStream.V0(10);
        }
        int i5 = this.E;
        if (i5 != 0) {
            iH += CodedOutputStream.e1(13, i5);
        }
        int i6 = this.F;
        if (i6 != 0) {
            iH += CodedOutputStream.e1(14, i6);
        }
        int i7 = this.G;
        if (i7 != 0) {
            iH += CodedOutputStream.e1(15, i7);
        }
        if (!lPt3Fixed.M(this.J)) {
            iH += lPt3Fixed.H(16, this.J);
        }
        if (this.K != vf3.UNKNOWN.b()) {
            iH += CodedOutputStream.Z0(17, this.K);
        }
        if (this.L != null) {
            iH += CodedOutputStream.i1(18, T());
        }
        int iJ = this.y.j() + iH;
        this.x = iJ;
        return iJ;
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
    public final k k() {
        return this.y;
    }

    @Override // com.google.protobuf.mw0t
    public final mw0t.QnHx n() {
        return N.c();
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
    public final oz2<of3> p() {
        return O;
    }

    @Override // defpackage.jd2
    public final DzVS a() {
        return N;
    }

    public of3() {
        this.M = (byte) -1;
        this.z = "";
        this.A = "";
        this.J = "";
        this.K = 0;
    }
}
