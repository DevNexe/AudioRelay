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
public final class ak0 extends lPt3Fixed implements roZB {
    public static final ak0 G = new ak0();
    public static final QnHx H = new QnHx();
    public volatile Object A;
    public boolean B;
    public boolean C;
    public double D;
    public boolean E;
    public byte F;
    public volatile Object z;

    public static final class CQf extends lPt3Fixed.CQf<CQf> implements roZB {
        public Object A;
        public Object B;
        public boolean C;
        public boolean D;
        public double E;
        public boolean F;

        public CQf() {
            this.A = "";
            this.B = "";
            ak0 ak0Var = ak0.G;
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
            lPt3Fixed.YKK ykk = tb5.n;
            ykk.c(ak0.class, CQf.class);
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
        public final ak0 f() {
            ak0 ak0Var = new ak0(this);
            ak0Var.z = this.A;
            ak0Var.A = this.B;
            ak0Var.B = this.C;
            ak0Var.C = this.D;
            ak0Var.D = this.E;
            ak0Var.E = this.F;
            L();
            return ak0Var;
        }

        public final void R(ak0 ak0Var) {
            if (ak0Var == ak0.G) {
                return;
            }
            if (!ak0Var.S().isEmpty()) {
                this.A = ak0Var.z;
                M();
            }
            if (!ak0Var.T().isEmpty()) {
                this.B = ak0Var.A;
                M();
            }
            boolean z = ak0Var.B;
            if (z) {
                this.C = z;
                M();
            }
            boolean z2 = ak0Var.C;
            if (z2) {
                this.D = z2;
                M();
            }
            double d = ak0Var.D;
            if (d != 0.0d) {
                this.E = d;
                M();
            }
            boolean z3 = ak0Var.E;
            if (z3) {
                this.F = z3;
                M();
            }
            super.B(ak0Var.y);
            M();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        public final void S(NUlFixed nUl, vv0 vv0Var) throws Throwable {
            ak0 ak0Var;
            try {
                try {
                    R((ak0) ak0.H.b(nUl, vv0Var));
                } catch (InvalidProtocolBufferException e) {
                    ak0Var = (ak0) e.w;
                    try {
                        throw e.g();
                    } catch (Throwable th) {
                        th = th;
                        if (ak0Var != null) {
                            R(ak0Var);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                ak0Var = null;
                if (ak0Var != null) {
                    R(ak0Var);
                }
                throw th;
            }
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return ak0.G;
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
        public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
            super.b(nUl, obj);
            return this;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final mw0t build() {
            ak0 ak0VarF = f();
            if (ak0VarF.isInitialized()) {
                return ak0VarF;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(ak0VarF);
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
        public final Object clone() {
            return (CQf) super.clone();
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
        public final Descriptors.QnHx e() {
            return tb5.m;
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
            if (mw0tVar instanceof ak0) {
                R((ak0) mw0tVar);
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
            if (mw0tVar instanceof ak0) {
                R((ak0) mw0tVar);
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
            return ak0.G;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final DzVS build() {
            ak0 ak0VarF = f();
            if (ak0VarF.isInitialized()) {
                return ak0VarF;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(ak0VarF);
        }

        public CQf(lPt3Fixed.QnHx qnHx) {
            super(qnHx);
            this.A = "";
            this.B = "";
            ak0 ak0Var = ak0.G;
        }
    }

    public class QnHx extends F1<ak0> {
        @Override // defpackage.oz2
        public final Object b(NUlFixed nUl, vv0 vv0Var) {
            ak0 ak0Var = new ak0();
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
                                    ak0Var.z = nUl.y();
                                } else if (iZ == 18) {
                                    ak0Var.A = nUl.y();
                                } else if (iZ == 24) {
                                    ak0Var.B = nUl.g();
                                } else if (iZ == 32) {
                                    ak0Var.C = nUl.g();
                                } else if (iZ == 41) {
                                    ak0Var.D = nUl.i();
                                } else if (iZ == 48) {
                                    ak0Var.E = nUl.g();
                                } else if (!qnHx.u(iZ, nUl)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            e.w = ak0Var;
                            throw e;
                        } catch (UninitializedMessageException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                            invalidProtocolBufferExceptionA.w = ak0Var;
                            throw invalidProtocolBufferExceptionA;
                        }
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                        invalidProtocolBufferException.w = ak0Var;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    ak0Var.y = qnHx.build();
                    throw th;
                }
            }
            ak0Var.y = qnHx.build();
            return ak0Var;
        }
    }

    public ak0(lPt3Fixed.CQf cQf) {
        super(cQf);
        this.F = (byte) -1;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final lPt3Fixed.YKK L() {
        lPt3Fixed.YKK ykk = tb5.n;
        ykk.c(ak0.class, CQf.class);
        return ykk;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
        return new CQf(qnHx);
    }

    public final String S() {
        Object obj = this.z;
        if (obj instanceof String) {
            return (String) obj;
        }
        String strS = ((lk) obj).s();
        this.z = strS;
        return strS;
    }

    public final String T() {
        Object obj = this.A;
        if (obj instanceof String) {
            return (String) obj;
        }
        String strS = ((lk) obj).s();
        this.A = strS;
        return strS;
    }

    @Override // com.google.protobuf.DzVS
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final CQf c() {
        if (this == G) {
            return new CQf();
        }
        CQf cQf = new CQf();
        cQf.R(this);
        return cQf;
    }

    @Override // defpackage.jd2
    public final mw0t a() {
        return G;
    }

    @Override // com.google.protobuf.QnHx
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ak0)) {
            return super.equals(obj);
        }
        ak0 ak0Var = (ak0) obj;
        return S().equals(ak0Var.S()) && T().equals(ak0Var.T()) && this.B == ak0Var.B && this.C == ak0Var.C && Double.doubleToLongBits(this.D) == Double.doubleToLongBits(ak0Var.D) && this.E == ak0Var.E && this.y.equals(ak0Var.y);
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
    public final void h(CodedOutputStream codedOutputStream) {
        if (!lPt3Fixed.M(this.z)) {
            lPt3Fixed.R(codedOutputStream, 1, this.z);
        }
        if (!lPt3Fixed.M(this.A)) {
            lPt3Fixed.R(codedOutputStream, 2, this.A);
        }
        boolean z = this.B;
        if (z) {
            codedOutputStream.w1(3, z);
        }
        boolean z2 = this.C;
        if (z2) {
            codedOutputStream.w1(4, z2);
        }
        if (Double.doubleToRawLongBits(this.D) != 0) {
            double d = this.D;
            codedOutputStream.getClass();
            codedOutputStream.C1(5, Double.doubleToRawLongBits(d));
        }
        boolean z3 = this.E;
        if (z3) {
            codedOutputStream.w1(6, z3);
        }
        this.y.h(codedOutputStream);
    }

    @Override // com.google.protobuf.QnHx
    public final int hashCode() {
        int i = this.w;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.y.hashCode() + ((SjP.a(this.E) + ((((SjP.b(Double.doubleToLongBits(this.D)) + ((((SjP.a(this.C) + ((((SjP.a(this.B) + ((((T().hashCode() + ((((S().hashCode() + u40.a(tb5.m, 779, 37, 1, 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 29);
        this.w = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
    public final boolean isInitialized() {
        byte b = this.F;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.F = (byte) 1;
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
        if (this.B) {
            iH += CodedOutputStream.V0(3);
        }
        if (this.C) {
            iH += CodedOutputStream.V0(4);
        }
        if (Double.doubleToRawLongBits(this.D) != 0) {
            iH += CodedOutputStream.Y0(5);
        }
        if (this.E) {
            iH += CodedOutputStream.V0(6);
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
        return G.c();
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
    public final oz2<ak0> p() {
        return H;
    }

    @Override // defpackage.jd2
    public final DzVS a() {
        return G;
    }

    public ak0() {
        this.F = (byte) -1;
        this.z = "";
        this.A = "";
    }
}
