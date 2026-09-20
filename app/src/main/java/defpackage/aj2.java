package defpackage;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.DzVS;
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
public final class aj2 extends lPt3Fixed implements roZB {
    public static final aj2 D = new aj2();
    public static final QnHx E = new QnHx();
    public int A;
    public volatile Object B;
    public byte C;
    public boolean z;

    public static final class CQf extends lPt3Fixed.CQf<CQf> implements roZB {
        public boolean A;
        public int B;
        public Object C;

        public CQf() {
            this.B = 0;
            this.C = "";
            aj2 aj2Var = aj2.D;
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
            lPt3Fixed.YKK ykk = tb5.h;
            ykk.c(aj2.class, CQf.class);
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
        public final aj2 f() {
            aj2 aj2Var = new aj2(this);
            aj2Var.z = this.A;
            aj2Var.A = this.B;
            aj2Var.B = this.C;
            L();
            return aj2Var;
        }

        public final void R(aj2 aj2Var) {
            if (aj2Var == aj2.D) {
                return;
            }
            boolean z = aj2Var.z;
            if (z) {
                this.A = z;
                M();
            }
            int i = aj2Var.A;
            if (i != 0) {
                this.B = i;
                M();
            }
            if (!aj2Var.S().isEmpty()) {
                this.C = aj2Var.B;
                M();
            }
            super.B(aj2Var.y);
            M();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        public final void S(NUlFixed nUl, vv0 vv0Var) throws Throwable {
            aj2 aj2Var;
            try {
                try {
                    R((aj2) aj2.E.b(nUl, vv0Var));
                } catch (InvalidProtocolBufferException e) {
                    aj2Var = (aj2) e.w;
                    try {
                        throw e.g();
                    } catch (Throwable th) {
                        th = th;
                        if (aj2Var != null) {
                            R(aj2Var);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                aj2Var = null;
                if (aj2Var != null) {
                    R(aj2Var);
                }
                throw th;
            }
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return aj2.D;
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
        public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
            super.b(nUl, obj);
            return this;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final mw0t build() {
            aj2 aj2VarF = f();
            if (aj2VarF.isInitialized()) {
                return aj2VarF;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(aj2VarF);
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
        public final Object clone() {
            return (CQf) super.clone();
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
        public final Descriptors.QnHx e() {
            return tb5.g;
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
            if (mw0tVar instanceof aj2) {
                R((aj2) mw0tVar);
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
            if (mw0tVar instanceof aj2) {
                R((aj2) mw0tVar);
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
            return aj2.D;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final DzVS build() {
            aj2 aj2VarF = f();
            if (aj2VarF.isInitialized()) {
                return aj2VarF;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(aj2VarF);
        }

        public CQf(lPt3Fixed.QnHx qnHx) {
            super(qnHx);
            this.B = 0;
            this.C = "";
            aj2 aj2Var = aj2.D;
        }
    }

    public enum F1 implements SjP.QnHx {
        ALL(0),
        /* JADX INFO: Fake field, exist only in values array */
        DEFAULT(1),
        /* JADX INFO: Fake field, exist only in values array */
        SPECIFIED(2),
        UNRECOGNIZED(-1);

        public final int w;

        static {
            values();
        }

        F1(int i) {
            this.w = i;
        }

        @Override // com.google.protobuf.SjP.QnHx
        public final int b() {
            if (this != UNRECOGNIZED) {
                return this.w;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public class QnHx extends com.google.protobuf.F1<aj2> {
        @Override // defpackage.oz2
        public final Object b(NUlFixed nUl, vv0 vv0Var) {
            aj2 aj2Var = new aj2();
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
                                if (iZ == 8) {
                                    aj2Var.z = nUl.g();
                                } else if (iZ == 16) {
                                    aj2Var.A = nUl.j();
                                } else if (iZ == 26) {
                                    aj2Var.B = nUl.y();
                                } else if (!qnHx.u(iZ, nUl)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            e.w = aj2Var;
                            throw e;
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2);
                            invalidProtocolBufferException.w = aj2Var;
                            throw invalidProtocolBufferException;
                        }
                    } catch (UninitializedMessageException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferExceptionA = e3.a();
                        invalidProtocolBufferExceptionA.w = aj2Var;
                        throw invalidProtocolBufferExceptionA;
                    }
                } catch (Throwable th) {
                    aj2Var.y = qnHx.build();
                    throw th;
                }
            }
            aj2Var.y = qnHx.build();
            return aj2Var;
        }
    }

    public aj2(lPt3Fixed.CQf cQf) {
        super(cQf);
        this.C = (byte) -1;
    }

    public static QnHx T() {
        return E;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final lPt3Fixed.YKK L() {
        lPt3Fixed.YKK ykk = tb5.h;
        ykk.c(aj2.class, CQf.class);
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

    @Override // com.google.protobuf.DzVS
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final CQf c() {
        if (this == D) {
            return new CQf();
        }
        CQf cQf = new CQf();
        cQf.R(this);
        return cQf;
    }

    @Override // defpackage.jd2
    public final mw0t a() {
        return D;
    }

    @Override // com.google.protobuf.QnHx
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aj2)) {
            return super.equals(obj);
        }
        aj2 aj2Var = (aj2) obj;
        return this.z == aj2Var.z && this.A == aj2Var.A && S().equals(aj2Var.S()) && this.y.equals(aj2Var.y);
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
    public final void h(CodedOutputStream codedOutputStream) {
        boolean z = this.z;
        if (z) {
            codedOutputStream.w1(1, z);
        }
        if (this.A != F1.ALL.b()) {
            codedOutputStream.E1(2, this.A);
        }
        if (!lPt3Fixed.M(this.B)) {
            lPt3Fixed.R(codedOutputStream, 3, this.B);
        }
        this.y.h(codedOutputStream);
    }

    @Override // com.google.protobuf.QnHx
    public final int hashCode() {
        int i = this.w;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.y.hashCode() + ((S().hashCode() + ((((((((SjP.a(this.z) + u40.a(tb5.g, 779, 37, 1, 53)) * 37) + 2) * 53) + this.A) * 37) + 3) * 53)) * 29);
        this.w = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
    public final boolean isInitialized() {
        byte b = this.C;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.C = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
    public final int j() {
        int i = this.x;
        if (i != -1) {
            return i;
        }
        int iV0 = this.z ? 0 + CodedOutputStream.V0(1) : 0;
        if (this.A != F1.ALL.b()) {
            iV0 += CodedOutputStream.Z0(2, this.A);
        }
        if (!lPt3Fixed.M(this.B)) {
            iV0 += lPt3Fixed.H(3, this.B);
        }
        int iJ = this.y.j() + iV0;
        this.x = iJ;
        return iJ;
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
    public final k k() {
        return this.y;
    }

    @Override // com.google.protobuf.mw0t
    public final mw0t.QnHx n() {
        return D.c();
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
    public final oz2<aj2> p() {
        return E;
    }

    @Override // defpackage.jd2
    public final DzVS a() {
        return D;
    }

    public aj2() {
        this.C = (byte) -1;
        this.A = 0;
        this.B = "";
    }
}
