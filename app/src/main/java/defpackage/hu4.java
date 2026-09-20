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
public final class hu4 extends lPt3Fixed implements roZB {
    public static final hu4 G = new hu4();
    public static final QnHx H = new QnHx();
    public long A;
    public lk B;
    public int C;
    public boolean D;
    public long E;
    public byte F;
    public long z;

    public static final class CQf extends lPt3Fixed.CQf<CQf> implements roZB {
        public long A;
        public long B;
        public lk C;
        public int D;
        public boolean E;
        public long F;

        public CQf() {
            this.C = lk.x;
            hu4 hu4Var = hu4.G;
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
            lPt3Fixed.YKK ykk = ub5.b;
            ykk.c(hu4.class, CQf.class);
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
        public final hu4 build() {
            hu4 hu4VarF = f();
            if (hu4VarF.isInitialized()) {
                return hu4VarF;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(hu4VarF);
        }

        @Override // com.google.protobuf.DzVS.QnHx
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public final hu4 f() {
            hu4 hu4Var = new hu4(this);
            hu4Var.z = this.A;
            hu4Var.A = this.B;
            hu4Var.B = this.C;
            hu4Var.C = this.D;
            hu4Var.D = this.E;
            hu4Var.E = this.F;
            L();
            return hu4Var;
        }

        public final void S(hu4 hu4Var) {
            if (hu4Var == hu4.G) {
                return;
            }
            long j = hu4Var.z;
            if (j != 0) {
                this.A = j;
                M();
            }
            long j2 = hu4Var.A;
            if (j2 != 0) {
                this.B = j2;
                M();
            }
            lk lkVar = hu4Var.B;
            if (lkVar != lk.x) {
                lkVar.getClass();
                this.C = lkVar;
                M();
            }
            int i = hu4Var.C;
            if (i != 0) {
                this.D = i;
                M();
            }
            boolean z = hu4Var.D;
            if (z) {
                this.E = z;
                M();
            }
            long j3 = hu4Var.E;
            if (j3 != 0) {
                this.F = j3;
                M();
            }
            super.B(hu4Var.y);
            M();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        public final void T(NUlFixed nUl, vv0 vv0Var) throws Throwable {
            hu4 hu4Var;
            try {
                try {
                    S((hu4) hu4.H.b(nUl, vv0Var));
                } catch (InvalidProtocolBufferException e) {
                    hu4Var = (hu4) e.w;
                    try {
                        throw e.g();
                    } catch (Throwable th) {
                        th = th;
                        if (hu4Var != null) {
                            S(hu4Var);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                hu4Var = null;
                if (hu4Var != null) {
                    S(hu4Var);
                }
                throw th;
            }
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return hu4.G;
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
            return ub5.a;
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
            if (mw0tVar instanceof hu4) {
                S((hu4) mw0tVar);
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
            if (mw0tVar instanceof hu4) {
                S((hu4) mw0tVar);
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
            return hu4.G;
        }

        public CQf(lPt3Fixed.QnHx qnHx) {
            super(qnHx);
            this.C = lk.x;
            hu4 hu4Var = hu4.G;
        }
    }

    public class QnHx extends F1<hu4> {
        @Override // defpackage.oz2
        public final Object b(NUlFixed nUl, vv0 vv0Var) {
            hu4 hu4Var = new hu4();
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
                                    hu4Var.z = nUl.p();
                                } else if (iZ == 16) {
                                    hu4Var.A = nUl.p();
                                } else if (iZ == 26) {
                                    hu4Var.B = nUl.h();
                                } else if (iZ == 32) {
                                    hu4Var.C = nUl.o();
                                } else if (iZ == 40) {
                                    hu4Var.D = nUl.g();
                                } else if (iZ == 48) {
                                    hu4Var.E = nUl.p();
                                } else if (!qnHx.u(iZ, nUl)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            e.w = hu4Var;
                            throw e;
                        } catch (UninitializedMessageException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                            invalidProtocolBufferExceptionA.w = hu4Var;
                            throw invalidProtocolBufferExceptionA;
                        }
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                        invalidProtocolBufferException.w = hu4Var;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    hu4Var.y = qnHx.build();
                    throw th;
                }
            }
            hu4Var.y = qnHx.build();
            return hu4Var;
        }
    }

    public hu4(lPt3Fixed.CQf cQf) {
        super(cQf);
        this.F = (byte) -1;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final lPt3Fixed.YKK L() {
        lPt3Fixed.YKK ykk = ub5.b;
        ykk.c(hu4.class, CQf.class);
        return ykk;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
        return new CQf(qnHx);
    }

    @Override // com.google.protobuf.DzVS
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final CQf c() {
        if (this == G) {
            return new CQf();
        }
        CQf cQf = new CQf();
        cQf.S(this);
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
        if (!(obj instanceof hu4)) {
            return super.equals(obj);
        }
        hu4 hu4Var = (hu4) obj;
        return this.z == hu4Var.z && this.A == hu4Var.A && this.B.equals(hu4Var.B) && this.C == hu4Var.C && this.D == hu4Var.D && this.E == hu4Var.E && this.y.equals(hu4Var.y);
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
    public final void h(CodedOutputStream codedOutputStream) {
        long j = this.z;
        if (j != 0) {
            codedOutputStream.Q1(1, j);
        }
        long j2 = this.A;
        if (j2 != 0) {
            codedOutputStream.Q1(2, j2);
        }
        if (!(this.B.size() == 0)) {
            codedOutputStream.y1(3, this.B);
        }
        int i = this.C;
        if (i != 0) {
            codedOutputStream.E1(4, i);
        }
        boolean z = this.D;
        if (z) {
            codedOutputStream.w1(5, z);
        }
        long j3 = this.E;
        if (j3 != 0) {
            codedOutputStream.Q1(6, j3);
        }
        this.y.h(codedOutputStream);
    }

    @Override // com.google.protobuf.QnHx
    public final int hashCode() {
        int i = this.w;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.y.hashCode() + ((SjP.b(this.E) + ((((SjP.a(this.D) + ((((((((this.B.hashCode() + ((((SjP.b(this.A) + ((((SjP.b(this.z) + u40.a(ub5.a, 779, 37, 1, 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53) + this.C) * 37) + 5) * 53)) * 37) + 6) * 53)) * 29);
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
        long j = this.z;
        int iG1 = j != 0 ? CodedOutputStream.g1(1, j) + 0 : 0;
        long j2 = this.A;
        if (j2 != 0) {
            iG1 += CodedOutputStream.g1(2, j2);
        }
        if (!(this.B.size() == 0)) {
            iG1 += CodedOutputStream.W0(3, this.B);
        }
        int i2 = this.C;
        if (i2 != 0) {
            iG1 += CodedOutputStream.e1(4, i2);
        }
        if (this.D) {
            iG1 += CodedOutputStream.V0(5);
        }
        long j3 = this.E;
        if (j3 != 0) {
            iG1 += CodedOutputStream.g1(6, j3);
        }
        int iJ = this.y.j() + iG1;
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
    public final oz2<hu4> p() {
        return H;
    }

    @Override // defpackage.jd2
    public final DzVS a() {
        return G;
    }

    public hu4() {
        this.F = (byte) -1;
        this.B = lk.x;
    }
}
