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
public final class rf3 extends lPt3Fixed implements roZB {
    public static final rf3 D = new rf3();
    public static final QnHx E = new QnHx();
    public tf3 A;
    public uf3 B;
    public byte C;
    public boolean z;

    public static final class CQf extends lPt3Fixed.CQf<CQf> implements roZB {
        public boolean A;
        public tf3 B;
        public uf3 C;

        public CQf() {
            rf3 rf3Var = rf3.D;
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
            lPt3Fixed.YKK ykk = wb5.x;
            ykk.c(rf3.class, CQf.class);
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
        public final rf3 build() {
            rf3 rf3VarF = f();
            if (rf3VarF.isInitialized()) {
                return rf3VarF;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(rf3VarF);
        }

        @Override // com.google.protobuf.DzVS.QnHx
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public final rf3 f() {
            rf3 rf3Var = new rf3(this);
            rf3Var.z = this.A;
            rf3Var.A = this.B;
            rf3Var.B = this.C;
            L();
            return rf3Var;
        }

        public final void S(rf3 rf3Var) {
            if (rf3Var == rf3.D) {
                return;
            }
            boolean z = rf3Var.z;
            if (z) {
                this.A = z;
                M();
            }
            if (rf3Var.A != null) {
                tf3 tf3VarS = rf3Var.S();
                tf3 tf3Var = this.B;
                if (tf3Var != null) {
                    tf3.CQf cQfS = tf3.C.c();
                    cQfS.R(tf3Var);
                    cQfS.R(tf3VarS);
                    this.B = cQfS.f();
                } else {
                    this.B = tf3VarS;
                }
                M();
            }
            if (rf3Var.B != null) {
                uf3 uf3VarT = rf3Var.T();
                uf3 uf3Var = this.C;
                if (uf3Var != null) {
                    uf3.CQf cQfS2 = uf3.C.c();
                    cQfS2.R(uf3Var);
                    cQfS2.R(uf3VarT);
                    this.C = cQfS2.f();
                } else {
                    this.C = uf3VarT;
                }
                M();
            }
            super.B(rf3Var.y);
            M();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        public final void T(NUlFixed nUl, vv0 vv0Var) throws Throwable {
            rf3 rf3Var;
            try {
                try {
                    S((rf3) rf3.E.b(nUl, vv0Var));
                } catch (InvalidProtocolBufferException e) {
                    rf3Var = (rf3) e.w;
                    try {
                        throw e.g();
                    } catch (Throwable th) {
                        th = th;
                        if (rf3Var != null) {
                            S(rf3Var);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                rf3Var = null;
                if (rf3Var != null) {
                    S(rf3Var);
                }
                throw th;
            }
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return rf3.D;
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
            return wb5.w;
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
            if (mw0tVar instanceof rf3) {
                S((rf3) mw0tVar);
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
            if (mw0tVar instanceof rf3) {
                S((rf3) mw0tVar);
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
            return rf3.D;
        }

        public CQf(lPt3Fixed.QnHx qnHx) {
            super(qnHx);
            rf3 rf3Var = rf3.D;
        }
    }

    public class QnHx extends F1<rf3> {
        @Override // defpackage.oz2
        public final Object b(NUlFixed nUl, vv0 vv0Var) {
            rf3 rf3Var = new rf3();
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
                                if (iZ != 8) {
                                    if (iZ == 18) {
                                        tf3 tf3Var = rf3Var.A;
                                        tf3.CQf cQfS = tf3Var != null ? tf3Var.c() : null;
                                        tf3 tf3Var2 = (tf3) nUl.q(tf3.D, vv0Var);
                                        rf3Var.A = tf3Var2;
                                        if (cQfS != null) {
                                            cQfS.R(tf3Var2);
                                            rf3Var.A = cQfS.f();
                                        }
                                    } else if (iZ == 26) {
                                        uf3 uf3Var = rf3Var.B;
                                        uf3.CQf cQfS2 = uf3Var != null ? uf3Var.c() : null;
                                        uf3 uf3Var2 = (uf3) nUl.q(uf3.D, vv0Var);
                                        rf3Var.B = uf3Var2;
                                        if (cQfS2 != null) {
                                            cQfS2.R(uf3Var2);
                                            rf3Var.B = cQfS2.f();
                                        }
                                    } else if (!qnHx.u(iZ, nUl)) {
                                    }
                                } else {
                                    rf3Var.z = nUl.g();
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            e.w = rf3Var;
                            throw e;
                        } catch (UninitializedMessageException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                            invalidProtocolBufferExceptionA.w = rf3Var;
                            throw invalidProtocolBufferExceptionA;
                        }
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                        invalidProtocolBufferException.w = rf3Var;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    rf3Var.y = qnHx.build();
                    throw th;
                }
            }
            rf3Var.y = qnHx.build();
            return rf3Var;
        }
    }

    public rf3(lPt3Fixed.CQf cQf) {
        super(cQf);
        this.C = (byte) -1;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final lPt3Fixed.YKK L() {
        lPt3Fixed.YKK ykk = wb5.x;
        ykk.c(rf3.class, CQf.class);
        return ykk;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
        return new CQf(qnHx);
    }

    public final tf3 S() {
        tf3 tf3Var = this.A;
        return tf3Var == null ? tf3.C : tf3Var;
    }

    public final uf3 T() {
        uf3 uf3Var = this.B;
        return uf3Var == null ? uf3.C : uf3Var;
    }

    @Override // com.google.protobuf.DzVS
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final CQf c() {
        if (this == D) {
            return new CQf();
        }
        CQf cQf = new CQf();
        cQf.S(this);
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
        if (!(obj instanceof rf3)) {
            return super.equals(obj);
        }
        rf3 rf3Var = (rf3) obj;
        if (this.z != rf3Var.z) {
            return false;
        }
        tf3 tf3Var = this.A;
        if ((tf3Var != null) != (rf3Var.A != null)) {
            return false;
        }
        if ((tf3Var != null) && !S().equals(rf3Var.S())) {
            return false;
        }
        uf3 uf3Var = this.B;
        if ((uf3Var != null) != (rf3Var.B != null)) {
            return false;
        }
        return (!(uf3Var != null) || T().equals(rf3Var.T())) && this.y.equals(rf3Var.y);
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
    public final void h(CodedOutputStream codedOutputStream) {
        boolean z = this.z;
        if (z) {
            codedOutputStream.w1(1, z);
        }
        if (this.A != null) {
            codedOutputStream.G1(2, S());
        }
        if (this.B != null) {
            codedOutputStream.G1(3, T());
        }
        this.y.h(codedOutputStream);
    }

    @Override // com.google.protobuf.QnHx
    public final int hashCode() {
        int i = this.w;
        if (i != 0) {
            return i;
        }
        int iA = SjP.a(this.z) + u40.a(wb5.w, 779, 37, 1, 53);
        if (this.A != null) {
            iA = S().hashCode() + Xs.a(iA, 37, 2, 53);
        }
        if (this.B != null) {
            iA = T().hashCode() + Xs.a(iA, 37, 3, 53);
        }
        int iHashCode = this.y.hashCode() + (iA * 29);
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
        if (this.A != null) {
            iV0 += CodedOutputStream.i1(2, S());
        }
        if (this.B != null) {
            iV0 += CodedOutputStream.i1(3, T());
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
    public final oz2<rf3> p() {
        return E;
    }

    @Override // defpackage.jd2
    public final DzVS a() {
        return D;
    }

    public rf3() {
        this.C = (byte) -1;
    }
}
