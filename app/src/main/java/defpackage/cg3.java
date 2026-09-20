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
public final class cg3 extends lPt3Fixed implements roZB {
    public static final cg3 F = new cg3();
    public static final QnHx G = new QnHx();
    public volatile Object A;
    public int B;
    public volatile Object C;
    public wf3 D;
    public byte E;
    public volatile Object z;

    public static final class CQf extends lPt3Fixed.CQf<CQf> implements roZB {
        public Object A;
        public Object B;
        public int C;
        public Object D;
        public wf3 E;

        public CQf() {
            this.A = "";
            this.B = "";
            this.C = 0;
            this.D = "";
            cg3 cg3Var = cg3.F;
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
            lPt3Fixed.YKK ykk = wb5.d;
            ykk.c(cg3.class, CQf.class);
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
        public final cg3 f() {
            cg3 cg3Var = new cg3(this);
            cg3Var.z = this.A;
            cg3Var.A = this.B;
            cg3Var.B = this.C;
            cg3Var.C = this.D;
            cg3Var.D = this.E;
            L();
            return cg3Var;
        }

        public final void R(cg3 cg3Var) {
            if (cg3Var == cg3.F) {
                return;
            }
            if (!cg3Var.T().isEmpty()) {
                this.A = cg3Var.z;
                M();
            }
            if (!cg3Var.V().isEmpty()) {
                this.B = cg3Var.A;
                M();
            }
            int i = cg3Var.B;
            if (i != 0) {
                this.C = i;
                M();
            }
            if (!cg3Var.U().isEmpty()) {
                this.D = cg3Var.C;
                M();
            }
            if (cg3Var.W()) {
                wf3 wf3VarS = cg3Var.S();
                wf3 wf3Var = this.E;
                if (wf3Var != null) {
                    wf3.CQf cQfT = wf3.C.c();
                    cQfT.R(wf3Var);
                    cQfT.R(wf3VarS);
                    this.E = cQfT.f();
                } else {
                    this.E = wf3VarS;
                }
                M();
            }
            super.B(cg3Var.y);
            M();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        public final void S(NUlFixed nUl, vv0 vv0Var) throws Throwable {
            cg3 cg3Var;
            try {
                try {
                    R((cg3) cg3.G.b(nUl, vv0Var));
                } catch (InvalidProtocolBufferException e) {
                    cg3Var = (cg3) e.w;
                    try {
                        throw e.g();
                    } catch (Throwable th) {
                        th = th;
                        if (cg3Var != null) {
                            R(cg3Var);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                cg3Var = null;
                if (cg3Var != null) {
                    R(cg3Var);
                }
                throw th;
            }
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return cg3.F;
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
        public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
            super.b(nUl, obj);
            return this;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final mw0t build() {
            cg3 cg3VarF = f();
            if (cg3VarF.isInitialized()) {
                return cg3VarF;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(cg3VarF);
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
        public final Object clone() {
            return (CQf) super.clone();
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
        public final Descriptors.QnHx e() {
            return wb5.c;
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
            if (mw0tVar instanceof cg3) {
                R((cg3) mw0tVar);
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
            if (mw0tVar instanceof cg3) {
                R((cg3) mw0tVar);
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
            return cg3.F;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final DzVS build() {
            cg3 cg3VarF = f();
            if (cg3VarF.isInitialized()) {
                return cg3VarF;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(cg3VarF);
        }

        public CQf(lPt3Fixed.QnHx qnHx) {
            super(qnHx);
            this.A = "";
            this.B = "";
            this.C = 0;
            this.D = "";
            cg3 cg3Var = cg3.F;
        }
    }

    public class QnHx extends F1<cg3> {
        @Override // defpackage.oz2
        public final Object b(NUlFixed nUl, vv0 vv0Var) {
            cg3 cg3Var = new cg3();
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
                                    cg3Var.z = nUl.y();
                                } else if (iZ == 18) {
                                    cg3Var.A = nUl.y();
                                } else if (iZ == 26) {
                                    cg3Var.C = nUl.y();
                                } else if (iZ == 40) {
                                    cg3Var.B = nUl.j();
                                } else if (iZ == 58) {
                                    wf3 wf3Var = cg3Var.D;
                                    wf3.CQf cQfT = wf3Var != null ? wf3Var.c() : null;
                                    wf3 wf3Var2 = (wf3) nUl.q(wf3.D, vv0Var);
                                    cg3Var.D = wf3Var2;
                                    if (cQfT != null) {
                                        cQfT.R(wf3Var2);
                                        cg3Var.D = cQfT.f();
                                    }
                                } else if (!qnHx.u(iZ, nUl)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            e.w = cg3Var;
                            throw e;
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2);
                            invalidProtocolBufferException.w = cg3Var;
                            throw invalidProtocolBufferException;
                        }
                    } catch (UninitializedMessageException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferExceptionA = e3.a();
                        invalidProtocolBufferExceptionA.w = cg3Var;
                        throw invalidProtocolBufferExceptionA;
                    }
                } catch (Throwable th) {
                    cg3Var.y = qnHx.build();
                    throw th;
                }
            }
            cg3Var.y = qnHx.build();
            return cg3Var;
        }
    }

    public cg3(lPt3Fixed.CQf cQf) {
        super(cQf);
        this.E = (byte) -1;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final lPt3Fixed.YKK L() {
        lPt3Fixed.YKK ykk = wb5.d;
        ykk.c(cg3.class, CQf.class);
        return ykk;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
        return new CQf(qnHx);
    }

    public final wf3 S() {
        wf3 wf3Var = this.D;
        return wf3Var == null ? wf3.C : wf3Var;
    }

    @Deprecated
    public final String T() {
        Object obj = this.z;
        if (obj instanceof String) {
            return (String) obj;
        }
        String strS = ((lk) obj).s();
        this.z = strS;
        return strS;
    }

    public final String U() {
        Object obj = this.C;
        if (obj instanceof String) {
            return (String) obj;
        }
        String strS = ((lk) obj).s();
        this.C = strS;
        return strS;
    }

    public final String V() {
        Object obj = this.A;
        if (obj instanceof String) {
            return (String) obj;
        }
        String strS = ((lk) obj).s();
        this.A = strS;
        return strS;
    }

    public final boolean W() {
        return this.D != null;
    }

    @Override // com.google.protobuf.DzVS
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final CQf c() {
        if (this == F) {
            return new CQf();
        }
        CQf cQf = new CQf();
        cQf.R(this);
        return cQf;
    }

    @Override // defpackage.jd2
    public final mw0t a() {
        return F;
    }

    @Override // com.google.protobuf.QnHx
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cg3)) {
            return super.equals(obj);
        }
        cg3 cg3Var = (cg3) obj;
        if (T().equals(cg3Var.T()) && V().equals(cg3Var.V()) && this.B == cg3Var.B && U().equals(cg3Var.U()) && W() == cg3Var.W()) {
            return (!W() || S().equals(cg3Var.S())) && this.y.equals(cg3Var.y);
        }
        return false;
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
    public final void h(CodedOutputStream codedOutputStream) {
        if (!lPt3Fixed.M(this.z)) {
            lPt3Fixed.R(codedOutputStream, 1, this.z);
        }
        if (!lPt3Fixed.M(this.A)) {
            lPt3Fixed.R(codedOutputStream, 2, this.A);
        }
        if (!lPt3Fixed.M(this.C)) {
            lPt3Fixed.R(codedOutputStream, 3, this.C);
        }
        if (this.B != vf3.UNKNOWN.b()) {
            codedOutputStream.E1(5, this.B);
        }
        if (this.D != null) {
            codedOutputStream.G1(7, S());
        }
        this.y.h(codedOutputStream);
    }

    @Override // com.google.protobuf.QnHx
    public final int hashCode() {
        int i = this.w;
        if (i != 0) {
            return i;
        }
        int iHashCode = U().hashCode() + ((((((((V().hashCode() + ((((T().hashCode() + u40.a(wb5.c, 779, 37, 1, 53)) * 37) + 2) * 53)) * 37) + 5) * 53) + this.B) * 37) + 3) * 53);
        if (W()) {
            iHashCode = S().hashCode() + Xs.a(iHashCode, 37, 7, 53);
        }
        int iHashCode2 = this.y.hashCode() + (iHashCode * 29);
        this.w = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
    public final boolean isInitialized() {
        byte b = this.E;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.E = (byte) 1;
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
            iH += lPt3Fixed.H(2, this.A);
        }
        if (!lPt3Fixed.M(this.C)) {
            iH += lPt3Fixed.H(3, this.C);
        }
        if (this.B != vf3.UNKNOWN.b()) {
            iH += CodedOutputStream.Z0(5, this.B);
        }
        if (this.D != null) {
            iH += CodedOutputStream.i1(7, S());
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
        return F.c();
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
    public final oz2<cg3> p() {
        return G;
    }

    @Override // defpackage.jd2
    public final DzVS a() {
        return F;
    }

    public cg3() {
        this.E = (byte) -1;
        this.z = "";
        this.A = "";
        this.B = 0;
        this.C = "";
    }
}
