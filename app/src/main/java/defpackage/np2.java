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
public final class np2 extends lPt3Fixed implements roZB {
    public static final np2 F = new np2();
    public static final QnHx G = new QnHx();
    public volatile Object A;
    public volatile Object B;
    public volatile Object C;
    public long D;
    public byte E;
    public volatile Object z;

    public static final class CQf extends lPt3Fixed.CQf<CQf> implements roZB {
        public Object A;
        public Object B;
        public Object C;
        public Object D;
        public long E;

        public CQf() {
            this.A = "";
            this.B = "";
            this.C = "";
            this.D = "";
            np2 np2Var = np2.F;
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
            lPt3Fixed.YKK ykk = tb5.t;
            ykk.c(np2.class, CQf.class);
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
        public final np2 f() {
            np2 np2Var = new np2(this);
            np2Var.z = this.A;
            np2Var.A = this.B;
            np2Var.B = this.C;
            np2Var.C = this.D;
            np2Var.D = this.E;
            L();
            return np2Var;
        }

        public final void R(np2 np2Var) {
            if (np2Var == np2.F) {
                return;
            }
            if (!np2Var.U().isEmpty()) {
                this.A = np2Var.z;
                M();
            }
            if (!np2Var.V().isEmpty()) {
                this.B = np2Var.A;
                M();
            }
            if (!np2Var.S().isEmpty()) {
                this.C = np2Var.B;
                M();
            }
            if (!np2Var.T().isEmpty()) {
                this.D = np2Var.C;
                M();
            }
            long j = np2Var.D;
            if (j != 0) {
                this.E = j;
                M();
            }
            super.B(np2Var.y);
            M();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        public final void S(NUlFixed nUl, vv0 vv0Var) throws Throwable {
            np2 np2Var;
            try {
                try {
                    R((np2) np2.G.b(nUl, vv0Var));
                } catch (InvalidProtocolBufferException e) {
                    np2Var = (np2) e.w;
                    try {
                        throw e.g();
                    } catch (Throwable th) {
                        th = th;
                        if (np2Var != null) {
                            R(np2Var);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                np2Var = null;
                if (np2Var != null) {
                    R(np2Var);
                }
                throw th;
            }
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return np2.F;
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
        public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
            super.b(nUl, obj);
            return this;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final mw0t build() {
            np2 np2VarF = f();
            if (np2VarF.isInitialized()) {
                return np2VarF;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(np2VarF);
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
        public final Object clone() {
            return (CQf) super.clone();
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
        public final Descriptors.QnHx e() {
            return tb5.s;
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
            if (mw0tVar instanceof np2) {
                R((np2) mw0tVar);
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
            if (mw0tVar instanceof np2) {
                R((np2) mw0tVar);
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
            return np2.F;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final DzVS build() {
            np2 np2VarF = f();
            if (np2VarF.isInitialized()) {
                return np2VarF;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(np2VarF);
        }

        public CQf(lPt3Fixed.QnHx qnHx) {
            super(qnHx);
            this.A = "";
            this.B = "";
            this.C = "";
            this.D = "";
            np2 np2Var = np2.F;
        }
    }

    public class QnHx extends F1<np2> {
        @Override // defpackage.oz2
        public final Object b(NUlFixed nUl, vv0 vv0Var) {
            np2 np2Var = new np2();
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
                                    np2Var.z = nUl.y();
                                } else if (iZ == 18) {
                                    np2Var.A = nUl.y();
                                } else if (iZ == 26) {
                                    np2Var.B = nUl.y();
                                } else if (iZ == 34) {
                                    np2Var.C = nUl.y();
                                } else if (iZ == 40) {
                                    np2Var.D = nUl.p();
                                } else if (!qnHx.u(iZ, nUl)) {
                                }
                            }
                            z = true;
                        } catch (UninitializedMessageException e) {
                            InvalidProtocolBufferException invalidProtocolBufferExceptionA = e.a();
                            invalidProtocolBufferExceptionA.w = np2Var;
                            throw invalidProtocolBufferExceptionA;
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2);
                            invalidProtocolBufferException.w = np2Var;
                            throw invalidProtocolBufferException;
                        }
                    } catch (InvalidProtocolBufferException e3) {
                        e3.w = np2Var;
                        throw e3;
                    }
                } catch (Throwable th) {
                    np2Var.y = qnHx.build();
                    throw th;
                }
            }
            np2Var.y = qnHx.build();
            return np2Var;
        }
    }

    public np2(lPt3Fixed.CQf cQf) {
        super(cQf);
        this.E = (byte) -1;
    }

    public static QnHx W() {
        return G;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final lPt3Fixed.YKK L() {
        lPt3Fixed.YKK ykk = tb5.t;
        ykk.c(np2.class, CQf.class);
        return ykk;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
        return new CQf(qnHx);
    }

    public final String S() {
        Object obj = this.B;
        if (obj instanceof String) {
            return (String) obj;
        }
        String strS = ((lk) obj).s();
        this.B = strS;
        return strS;
    }

    public final String T() {
        Object obj = this.C;
        if (obj instanceof String) {
            return (String) obj;
        }
        String strS = ((lk) obj).s();
        this.C = strS;
        return strS;
    }

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
        Object obj = this.A;
        if (obj instanceof String) {
            return (String) obj;
        }
        String strS = ((lk) obj).s();
        this.A = strS;
        return strS;
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
        if (!(obj instanceof np2)) {
            return super.equals(obj);
        }
        np2 np2Var = (np2) obj;
        return U().equals(np2Var.U()) && V().equals(np2Var.V()) && S().equals(np2Var.S()) && T().equals(np2Var.T()) && this.D == np2Var.D && this.y.equals(np2Var.y);
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
    public final void h(CodedOutputStream codedOutputStream) {
        if (!lPt3Fixed.M(this.z)) {
            lPt3Fixed.R(codedOutputStream, 1, this.z);
        }
        if (!lPt3Fixed.M(this.A)) {
            lPt3Fixed.R(codedOutputStream, 2, this.A);
        }
        if (!lPt3Fixed.M(this.B)) {
            lPt3Fixed.R(codedOutputStream, 3, this.B);
        }
        if (!lPt3Fixed.M(this.C)) {
            lPt3Fixed.R(codedOutputStream, 4, this.C);
        }
        long j = this.D;
        if (j != 0) {
            codedOutputStream.Q1(5, j);
        }
        this.y.h(codedOutputStream);
    }

    @Override // com.google.protobuf.QnHx
    public final int hashCode() {
        int i = this.w;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.y.hashCode() + ((SjP.b(this.D) + ((((T().hashCode() + ((((S().hashCode() + ((((V().hashCode() + ((((U().hashCode() + u40.a(tb5.s, 779, 37, 1, 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 29);
        this.w = iHashCode;
        return iHashCode;
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
        if (!lPt3Fixed.M(this.B)) {
            iH += lPt3Fixed.H(3, this.B);
        }
        if (!lPt3Fixed.M(this.C)) {
            iH += lPt3Fixed.H(4, this.C);
        }
        long j = this.D;
        if (j != 0) {
            iH += CodedOutputStream.g1(5, j);
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
    public final oz2<np2> p() {
        return G;
    }

    @Override // defpackage.jd2
    public final DzVS a() {
        return F;
    }

    public np2() {
        this.E = (byte) -1;
        this.z = "";
        this.A = "";
        this.B = "";
        this.C = "";
    }
}
