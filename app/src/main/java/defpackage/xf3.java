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
public final class xf3 extends lPt3Fixed implements roZB {
    public static final xf3 B = new xf3();
    public static final QnHx C = new QnHx();
    public byte A;
    public wf3 z;

    public static final class CQf extends lPt3Fixed.CQf<CQf> implements roZB {
        public wf3 A;

        public CQf() {
            xf3 xf3Var = xf3.B;
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
            lPt3Fixed.YKK ykk = tb5.d;
            ykk.c(xf3.class, CQf.class);
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
        public final xf3 build() {
            xf3 xf3VarF = f();
            if (xf3VarF.isInitialized()) {
                return xf3VarF;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(xf3VarF);
        }

        @Override // com.google.protobuf.DzVS.QnHx
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public final xf3 f() {
            xf3 xf3Var = new xf3(this);
            xf3Var.z = this.A;
            L();
            return xf3Var;
        }

        public final void S(xf3 xf3Var) {
            if (xf3Var == xf3.B) {
                return;
            }
            if (xf3Var.z != null) {
                wf3 wf3VarS = xf3Var.S();
                wf3 wf3Var = this.A;
                if (wf3Var != null) {
                    wf3.CQf cQfT = wf3.C.c();
                    cQfT.R(wf3Var);
                    cQfT.R(wf3VarS);
                    this.A = cQfT.f();
                } else {
                    this.A = wf3VarS;
                }
                M();
            }
            super.B(xf3Var.y);
            M();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        public final void T(NUlFixed nUl, vv0 vv0Var) throws Throwable {
            xf3 xf3Var;
            try {
                try {
                    S((xf3) xf3.C.b(nUl, vv0Var));
                } catch (InvalidProtocolBufferException e) {
                    xf3Var = (xf3) e.w;
                    try {
                        throw e.g();
                    } catch (Throwable th) {
                        th = th;
                        if (xf3Var != null) {
                            S(xf3Var);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                xf3Var = null;
                if (xf3Var != null) {
                    S(xf3Var);
                }
                throw th;
            }
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return xf3.B;
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
            return tb5.c;
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
            if (mw0tVar instanceof xf3) {
                S((xf3) mw0tVar);
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
            if (mw0tVar instanceof xf3) {
                S((xf3) mw0tVar);
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
            return xf3.B;
        }

        public CQf(lPt3Fixed.QnHx qnHx) {
            super(qnHx);
            xf3 xf3Var = xf3.B;
        }
    }

    public class QnHx extends F1<xf3> {
        @Override // defpackage.oz2
        public final Object b(NUlFixed nUl, vv0 vv0Var) {
            xf3 xf3Var = new xf3();
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
                                    wf3 wf3Var = xf3Var.z;
                                    wf3.CQf cQfT = wf3Var != null ? wf3Var.c() : null;
                                    wf3 wf3Var2 = (wf3) nUl.q(wf3.D, vv0Var);
                                    xf3Var.z = wf3Var2;
                                    if (cQfT != null) {
                                        cQfT.R(wf3Var2);
                                        xf3Var.z = cQfT.f();
                                    }
                                } else if (!qnHx.u(iZ, nUl)) {
                                }
                            }
                            z = true;
                        } catch (UninitializedMessageException e) {
                            InvalidProtocolBufferException invalidProtocolBufferExceptionA = e.a();
                            invalidProtocolBufferExceptionA.w = xf3Var;
                            throw invalidProtocolBufferExceptionA;
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2);
                            invalidProtocolBufferException.w = xf3Var;
                            throw invalidProtocolBufferException;
                        }
                    } catch (InvalidProtocolBufferException e3) {
                        e3.w = xf3Var;
                        throw e3;
                    }
                } catch (Throwable th) {
                    xf3Var.y = qnHx.build();
                    throw th;
                }
            }
            xf3Var.y = qnHx.build();
            return xf3Var;
        }
    }

    public xf3(lPt3Fixed.CQf cQf) {
        super(cQf);
        this.A = (byte) -1;
    }

    public static QnHx T() {
        return C;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final lPt3Fixed.YKK L() {
        lPt3Fixed.YKK ykk = tb5.d;
        ykk.c(xf3.class, CQf.class);
        return ykk;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
        return new CQf(qnHx);
    }

    public final wf3 S() {
        wf3 wf3Var = this.z;
        return wf3Var == null ? wf3.C : wf3Var;
    }

    @Override // com.google.protobuf.DzVS
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final CQf c() {
        if (this == B) {
            return new CQf();
        }
        CQf cQf = new CQf();
        cQf.S(this);
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
        if (!(obj instanceof xf3)) {
            return super.equals(obj);
        }
        xf3 xf3Var = (xf3) obj;
        wf3 wf3Var = this.z;
        if ((wf3Var != null) != (xf3Var.z != null)) {
            return false;
        }
        return (!(wf3Var != null) || S().equals(xf3Var.S())) && this.y.equals(xf3Var.y);
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
        int iHashCode = tb5.c.hashCode() + 779;
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
    public final oz2<xf3> p() {
        return C;
    }

    @Override // defpackage.jd2
    public final DzVS a() {
        return B;
    }

    public xf3() {
        this.A = (byte) -1;
    }
}
