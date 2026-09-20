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
public final class sq3 extends lPt3Fixed implements roZB {
    public static final sq3 B = new sq3();
    public static final QnHx C = new QnHx();
    public byte A;
    public hu4 z;

    public static final class CQf extends lPt3Fixed.CQf<CQf> implements roZB {
        public hu4 A;

        public CQf() {
            sq3 sq3Var = sq3.B;
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
            lPt3Fixed.YKK ykk = tb5.z;
            ykk.c(sq3.class, CQf.class);
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
        public final sq3 f() {
            sq3 sq3Var = new sq3(this);
            sq3Var.z = this.A;
            L();
            return sq3Var;
        }

        public final void R(sq3 sq3Var) {
            if (sq3Var == sq3.B) {
                return;
            }
            if (sq3Var.z != null) {
                hu4 hu4VarS = sq3Var.S();
                hu4 hu4Var = this.A;
                if (hu4Var != null) {
                    hu4.CQf cQfC = hu4.G.c();
                    cQfC.S(hu4Var);
                    cQfC.S(hu4VarS);
                    this.A = cQfC.f();
                } else {
                    this.A = hu4VarS;
                }
                M();
            }
            super.B(sq3Var.y);
            M();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        public final void S(NUlFixed nUl, vv0 vv0Var) throws Throwable {
            sq3 sq3Var;
            try {
                try {
                    R((sq3) sq3.C.b(nUl, vv0Var));
                } catch (InvalidProtocolBufferException e) {
                    sq3Var = (sq3) e.w;
                    try {
                        throw e.g();
                    } catch (Throwable th) {
                        th = th;
                        if (sq3Var != null) {
                            R(sq3Var);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                sq3Var = null;
                if (sq3Var != null) {
                    R(sq3Var);
                }
                throw th;
            }
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return sq3.B;
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
        public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
            super.b(nUl, obj);
            return this;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final mw0t build() {
            sq3 sq3VarF = f();
            if (sq3VarF.isInitialized()) {
                return sq3VarF;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(sq3VarF);
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
        public final Object clone() {
            return (CQf) super.clone();
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
        public final Descriptors.QnHx e() {
            return tb5.y;
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
            if (mw0tVar instanceof sq3) {
                R((sq3) mw0tVar);
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
            if (mw0tVar instanceof sq3) {
                R((sq3) mw0tVar);
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
            return sq3.B;
        }

        public CQf(lPt3Fixed.QnHx qnHx) {
            super(qnHx);
            sq3 sq3Var = sq3.B;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final DzVS build() {
            sq3 sq3VarF = f();
            if (sq3VarF.isInitialized()) {
                return sq3VarF;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(sq3VarF);
        }
    }

    public class QnHx extends F1<sq3> {
        @Override // defpackage.oz2
        public final Object b(NUlFixed nUl, vv0 vv0Var) {
            sq3 sq3Var = new sq3();
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
                                    hu4 hu4Var = sq3Var.z;
                                    hu4.CQf cQfC = hu4Var != null ? hu4Var.c() : null;
                                    hu4 hu4Var2 = (hu4) nUl.q(hu4.H, vv0Var);
                                    sq3Var.z = hu4Var2;
                                    if (cQfC != null) {
                                        cQfC.S(hu4Var2);
                                        sq3Var.z = cQfC.f();
                                    }
                                } else if (!qnHx.u(iZ, nUl)) {
                                }
                            }
                            z = true;
                        } catch (UninitializedMessageException e) {
                            InvalidProtocolBufferException invalidProtocolBufferExceptionA = e.a();
                            invalidProtocolBufferExceptionA.w = sq3Var;
                            throw invalidProtocolBufferExceptionA;
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2);
                            invalidProtocolBufferException.w = sq3Var;
                            throw invalidProtocolBufferException;
                        }
                    } catch (InvalidProtocolBufferException e3) {
                        e3.w = sq3Var;
                        throw e3;
                    }
                } catch (Throwable th) {
                    sq3Var.y = qnHx.build();
                    throw th;
                }
            }
            sq3Var.y = qnHx.build();
            return sq3Var;
        }
    }

    public sq3(lPt3Fixed.CQf cQf) {
        super(cQf);
        this.A = (byte) -1;
    }

    public static QnHx T() {
        return C;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final lPt3Fixed.YKK L() {
        lPt3Fixed.YKK ykk = tb5.z;
        ykk.c(sq3.class, CQf.class);
        return ykk;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
        return new CQf(qnHx);
    }

    public final hu4 S() {
        hu4 hu4Var = this.z;
        return hu4Var == null ? hu4.G : hu4Var;
    }

    @Override // com.google.protobuf.DzVS
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final CQf c() {
        if (this == B) {
            return new CQf();
        }
        CQf cQf = new CQf();
        cQf.R(this);
        return cQf;
    }

    @Override // defpackage.jd2
    public final mw0t a() {
        return B;
    }

    @Override // com.google.protobuf.QnHx
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sq3)) {
            return super.equals(obj);
        }
        sq3 sq3Var = (sq3) obj;
        hu4 hu4Var = this.z;
        if ((hu4Var != null) != (sq3Var.z != null)) {
            return false;
        }
        return (!(hu4Var != null) || S().equals(sq3Var.S())) && this.y.equals(sq3Var.y);
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
    public final void h(CodedOutputStream codedOutputStream) {
        if (this.z != null) {
            codedOutputStream.G1(1, S());
        }
        this.y.h(codedOutputStream);
    }

    @Override // com.google.protobuf.QnHx
    public final int hashCode() {
        int i = this.w;
        if (i != 0) {
            return i;
        }
        int iHashCode = tb5.y.hashCode() + 779;
        if (this.z != null) {
            iHashCode = Xs.a(iHashCode, 37, 1, 53) + S().hashCode();
        }
        int iHashCode2 = this.y.hashCode() + (iHashCode * 29);
        this.w = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
    public final boolean isInitialized() {
        byte b = this.A;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.A = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
    public final int j() {
        int i = this.x;
        if (i != -1) {
            return i;
        }
        int iJ = this.y.j() + (this.z != null ? 0 + CodedOutputStream.i1(1, S()) : 0);
        this.x = iJ;
        return iJ;
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
    public final k k() {
        return this.y;
    }

    @Override // com.google.protobuf.mw0t
    public final mw0t.QnHx n() {
        return B.c();
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
    public final oz2<sq3> p() {
        return C;
    }

    @Override // defpackage.jd2
    public final DzVS a() {
        return B;
    }

    public sq3() {
        this.A = (byte) -1;
    }
}
