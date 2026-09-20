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
public final class ag3 extends lPt3Fixed implements roZB {
    public static final ag3 A = new ag3();
    public static final QnHx B = new QnHx();
    public byte z;

    public static final class CQf extends lPt3Fixed.CQf<CQf> implements roZB {
        public CQf() {
            ag3 ag3Var = ag3.A;
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
            lPt3Fixed.YKK ykk = tb5.J;
            ykk.c(ag3.class, CQf.class);
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

        public final void Q(ag3 ag3Var) {
            if (ag3Var == ag3.A) {
                return;
            }
            super.B(ag3Var.y);
            M();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        public final void R(NUlFixed nUl, vv0 vv0Var) throws Throwable {
            ag3 ag3Var;
            try {
                try {
                    Q((ag3) ag3.B.b(nUl, vv0Var));
                } catch (InvalidProtocolBufferException e) {
                    ag3Var = (ag3) e.w;
                    try {
                        throw e.g();
                    } catch (Throwable th) {
                        th = th;
                        if (ag3Var != null) {
                            Q(ag3Var);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                ag3Var = null;
                if (ag3Var != null) {
                    Q(ag3Var);
                }
                throw th;
            }
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return ag3.A;
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
        public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
            super.b(nUl, obj);
            return this;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final mw0t build() {
            ag3 ag3Var = new ag3(this);
            L();
            if (ag3Var.isInitialized()) {
                return ag3Var;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(ag3Var);
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
        public final Object clone() {
            return (CQf) super.clone();
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
        public final Descriptors.QnHx e() {
            return tb5.I;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final mw0t f() {
            ag3 ag3Var = new ag3(this);
            L();
            return ag3Var;
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
            if (mw0tVar instanceof ag3) {
                Q((ag3) mw0tVar);
            } else {
                super.s(mw0tVar);
            }
            return this;
        }

        @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.DzVS.QnHx
        public final /* bridge */ /* synthetic */ DzVS.QnHx v(NUlFixed nUl, vv0 vv0Var) throws Throwable {
            R(nUl, vv0Var);
            return this;
        }

        @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
        /* JADX INFO: renamed from: w */
        public final /* bridge */ /* synthetic */ com.google.protobuf.QnHx.AbstractC0099QnHx v(NUlFixed nUl, vv0 vv0Var) throws Throwable {
            R(nUl, vv0Var);
            return this;
        }

        @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
        /* JADX INFO: renamed from: x */
        public final com.google.protobuf.QnHx.AbstractC0099QnHx s(mw0t mw0tVar) {
            if (mw0tVar instanceof ag3) {
                Q((ag3) mw0tVar);
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
            return ag3.A;
        }

        public CQf(lPt3Fixed.QnHx qnHx) {
            super(qnHx);
            ag3 ag3Var = ag3.A;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final DzVS f() {
            ag3 ag3Var = new ag3(this);
            L();
            return ag3Var;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final DzVS build() {
            ag3 ag3Var = new ag3(this);
            L();
            if (ag3Var.isInitialized()) {
                return ag3Var;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(ag3Var);
        }
    }

    public class QnHx extends F1<ag3> {
        @Override // defpackage.oz2
        public final Object b(NUlFixed nUl, vv0 vv0Var) {
            ag3 ag3Var = new ag3();
            vv0Var.getClass();
            k kVar = k.x;
            k.QnHx qnHx = new k.QnHx();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            try {
                                int iZ = nUl.z();
                                if (iZ == 0 || !qnHx.u(iZ, nUl)) {
                                    z = true;
                                }
                            } catch (UninitializedMessageException e) {
                                InvalidProtocolBufferException invalidProtocolBufferExceptionA = e.a();
                                invalidProtocolBufferExceptionA.w = ag3Var;
                                throw invalidProtocolBufferExceptionA;
                            }
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2);
                            invalidProtocolBufferException.w = ag3Var;
                            throw invalidProtocolBufferException;
                        }
                    } catch (InvalidProtocolBufferException e3) {
                        e3.w = ag3Var;
                        throw e3;
                    }
                } catch (Throwable th) {
                    ag3Var.y = qnHx.build();
                    throw th;
                }
            }
            ag3Var.y = qnHx.build();
            return ag3Var;
        }
    }

    public ag3(lPt3Fixed.CQf cQf) {
        super(cQf);
        this.z = (byte) -1;
    }

    public static QnHx S() {
        return B;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final lPt3Fixed.YKK L() {
        lPt3Fixed.YKK ykk = tb5.J;
        ykk.c(ag3.class, CQf.class);
        return ykk;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
        return new CQf(qnHx);
    }

    @Override // com.google.protobuf.DzVS
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final CQf c() {
        if (this == A) {
            return new CQf();
        }
        CQf cQf = new CQf();
        cQf.Q(this);
        return cQf;
    }

    @Override // defpackage.jd2
    public final mw0t a() {
        return A;
    }

    @Override // com.google.protobuf.QnHx
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ag3) {
            return this.y.equals(((ag3) obj).y);
        }
        return super.equals(obj);
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
    public final void h(CodedOutputStream codedOutputStream) {
        this.y.h(codedOutputStream);
    }

    @Override // com.google.protobuf.QnHx
    public final int hashCode() {
        int i = this.w;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.y.hashCode() + ((tb5.I.hashCode() + 779) * 29);
        this.w = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
    public final boolean isInitialized() {
        byte b = this.z;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.z = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
    public final int j() {
        int i = this.x;
        if (i != -1) {
            return i;
        }
        int iJ = this.y.j() + 0;
        this.x = iJ;
        return iJ;
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
    public final k k() {
        return this.y;
    }

    @Override // com.google.protobuf.mw0t
    public final mw0t.QnHx n() {
        return A.c();
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
    public final oz2<ag3> p() {
        return B;
    }

    @Override // defpackage.jd2
    public final DzVS a() {
        return A;
    }

    public ag3() {
        this.z = (byte) -1;
    }
}
