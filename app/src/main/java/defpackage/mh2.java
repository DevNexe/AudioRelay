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
public final class mh2 extends lPt3Fixed implements roZB {
    public static final mh2 D = new mh2();
    public static final QnHx E = new QnHx();
    public int A;
    public int B;
    public byte C;
    public boolean z;

    public static final class CQf extends lPt3Fixed.CQf<CQf> implements roZB {
        public boolean A;
        public int B;
        public int C;

        public CQf() {
            mh2 mh2Var = mh2.D;
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
            lPt3Fixed.YKK ykk = wb5.j;
            ykk.c(mh2.class, CQf.class);
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
        public final mh2 f() {
            mh2 mh2Var = new mh2(this);
            mh2Var.z = this.A;
            mh2Var.A = this.B;
            mh2Var.B = this.C;
            L();
            return mh2Var;
        }

        public final void R(mh2 mh2Var) {
            if (mh2Var == mh2.D) {
                return;
            }
            boolean z = mh2Var.z;
            if (z) {
                this.A = z;
                M();
            }
            int i = mh2Var.A;
            if (i != 0) {
                this.B = i;
                M();
            }
            int i2 = mh2Var.B;
            if (i2 != 0) {
                this.C = i2;
                M();
            }
            super.B(mh2Var.y);
            M();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        public final void S(NUlFixed nUl, vv0 vv0Var) throws Throwable {
            mh2 mh2Var;
            try {
                try {
                    R((mh2) mh2.E.b(nUl, vv0Var));
                } catch (InvalidProtocolBufferException e) {
                    mh2Var = (mh2) e.w;
                    try {
                        throw e.g();
                    } catch (Throwable th) {
                        th = th;
                        if (mh2Var != null) {
                            R(mh2Var);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                mh2Var = null;
                if (mh2Var != null) {
                    R(mh2Var);
                }
                throw th;
            }
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return mh2.D;
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
        public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
            super.b(nUl, obj);
            return this;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final mw0t build() {
            mh2 mh2VarF = f();
            if (mh2VarF.isInitialized()) {
                return mh2VarF;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(mh2VarF);
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
        public final Object clone() {
            return (CQf) super.clone();
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
        public final Descriptors.QnHx e() {
            return wb5.i;
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
            if (mw0tVar instanceof mh2) {
                R((mh2) mw0tVar);
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
            if (mw0tVar instanceof mh2) {
                R((mh2) mw0tVar);
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
            return mh2.D;
        }

        public CQf(lPt3Fixed.QnHx qnHx) {
            super(qnHx);
            mh2 mh2Var = mh2.D;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final DzVS build() {
            mh2 mh2VarF = f();
            if (mh2VarF.isInitialized()) {
                return mh2VarF;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(mh2VarF);
        }
    }

    public class QnHx extends F1<mh2> {
        @Override // defpackage.oz2
        public final Object b(NUlFixed nUl, vv0 vv0Var) {
            mh2 mh2Var = new mh2();
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
                                    mh2Var.z = nUl.g();
                                } else if (iZ == 16) {
                                    mh2Var.A = nUl.o();
                                } else if (iZ == 24) {
                                    mh2Var.B = nUl.o();
                                } else if (!qnHx.u(iZ, nUl)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            e.w = mh2Var;
                            throw e;
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2);
                            invalidProtocolBufferException.w = mh2Var;
                            throw invalidProtocolBufferException;
                        }
                    } catch (UninitializedMessageException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferExceptionA = e3.a();
                        invalidProtocolBufferExceptionA.w = mh2Var;
                        throw invalidProtocolBufferExceptionA;
                    }
                } catch (Throwable th) {
                    mh2Var.y = qnHx.build();
                    throw th;
                }
            }
            mh2Var.y = qnHx.build();
            return mh2Var;
        }
    }

    public mh2(lPt3Fixed.CQf cQf) {
        super(cQf);
        this.C = (byte) -1;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final lPt3Fixed.YKK L() {
        lPt3Fixed.YKK ykk = wb5.j;
        ykk.c(mh2.class, CQf.class);
        return ykk;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
        return new CQf(qnHx);
    }

    @Override // com.google.protobuf.DzVS
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
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
        if (!(obj instanceof mh2)) {
            return super.equals(obj);
        }
        mh2 mh2Var = (mh2) obj;
        return this.z == mh2Var.z && this.A == mh2Var.A && this.B == mh2Var.B && this.y.equals(mh2Var.y);
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
    public final void h(CodedOutputStream codedOutputStream) {
        boolean z = this.z;
        if (z) {
            codedOutputStream.w1(1, z);
        }
        int i = this.A;
        if (i != 0) {
            codedOutputStream.E1(2, i);
        }
        int i2 = this.B;
        if (i2 != 0) {
            codedOutputStream.E1(3, i2);
        }
        this.y.h(codedOutputStream);
    }

    @Override // com.google.protobuf.QnHx
    public final int hashCode() {
        int i = this.w;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.y.hashCode() + ((((((((((SjP.a(this.z) + u40.a(wb5.i, 779, 37, 1, 53)) * 37) + 2) * 53) + this.A) * 37) + 3) * 53) + this.B) * 29);
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
        int i2 = this.A;
        if (i2 != 0) {
            iV0 += CodedOutputStream.e1(2, i2);
        }
        int i3 = this.B;
        if (i3 != 0) {
            iV0 += CodedOutputStream.e1(3, i3);
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
    public final oz2<mh2> p() {
        return E;
    }

    @Override // defpackage.jd2
    public final DzVS a() {
        return D;
    }

    public mh2() {
        this.C = (byte) -1;
    }
}
