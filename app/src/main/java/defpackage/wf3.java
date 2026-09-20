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
public final class wf3 extends lPt3Fixed implements roZB {
    public static final wf3 C = new wf3();
    public static final QnHx D = new QnHx();
    public boolean A;
    public byte B;
    public volatile Object z;

    public static final class CQf extends lPt3Fixed.CQf<CQf> implements roZB {
        public Object A;
        public boolean B;

        public CQf() {
            this.A = "";
            wf3 wf3Var = wf3.C;
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
            lPt3Fixed.YKK ykk = wb5.b;
            ykk.c(wf3.class, CQf.class);
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
        public final wf3 f() {
            wf3 wf3Var = new wf3(this);
            wf3Var.z = this.A;
            wf3Var.A = this.B;
            L();
            return wf3Var;
        }

        public final void R(wf3 wf3Var) {
            if (wf3Var == wf3.C) {
                return;
            }
            if (!wf3Var.S().isEmpty()) {
                this.A = wf3Var.z;
                M();
            }
            boolean z = wf3Var.A;
            if (z) {
                this.B = z;
                M();
            }
            super.B(wf3Var.y);
            M();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        public final void S(NUlFixed nUl, vv0 vv0Var) throws Throwable {
            wf3 wf3Var;
            try {
                try {
                    R((wf3) wf3.D.b(nUl, vv0Var));
                } catch (InvalidProtocolBufferException e) {
                    wf3Var = (wf3) e.w;
                    try {
                        throw e.g();
                    } catch (Throwable th) {
                        th = th;
                        if (wf3Var != null) {
                            R(wf3Var);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                wf3Var = null;
                if (wf3Var != null) {
                    R(wf3Var);
                }
                throw th;
            }
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return wf3.C;
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
        public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
            super.b(nUl, obj);
            return this;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final mw0t build() {
            wf3 wf3VarF = f();
            if (wf3VarF.isInitialized()) {
                return wf3VarF;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(wf3VarF);
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
        public final Object clone() {
            return (CQf) super.clone();
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
        public final Descriptors.QnHx e() {
            return wb5.a;
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
            if (mw0tVar instanceof wf3) {
                R((wf3) mw0tVar);
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
            if (mw0tVar instanceof wf3) {
                R((wf3) mw0tVar);
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
            return wf3.C;
        }

        public CQf(lPt3Fixed.QnHx qnHx) {
            super(qnHx);
            this.A = "";
            wf3 wf3Var = wf3.C;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final DzVS build() {
            wf3 wf3VarF = f();
            if (wf3VarF.isInitialized()) {
                return wf3VarF;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(wf3VarF);
        }
    }

    public class QnHx extends F1<wf3> {
        @Override // defpackage.oz2
        public final Object b(NUlFixed nUl, vv0 vv0Var) {
            wf3 wf3Var = new wf3();
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
                                    wf3Var.z = nUl.y();
                                } else if (iZ == 16) {
                                    wf3Var.A = nUl.g();
                                } else if (!qnHx.u(iZ, nUl)) {
                                }
                            }
                            z = true;
                        } catch (UninitializedMessageException e) {
                            InvalidProtocolBufferException invalidProtocolBufferExceptionA = e.a();
                            invalidProtocolBufferExceptionA.w = wf3Var;
                            throw invalidProtocolBufferExceptionA;
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2);
                            invalidProtocolBufferException.w = wf3Var;
                            throw invalidProtocolBufferException;
                        }
                    } catch (InvalidProtocolBufferException e3) {
                        e3.w = wf3Var;
                        throw e3;
                    }
                } catch (Throwable th) {
                    wf3Var.y = qnHx.build();
                    throw th;
                }
            }
            wf3Var.y = qnHx.build();
            return wf3Var;
        }
    }

    public wf3(lPt3Fixed.CQf cQf) {
        super(cQf);
        this.B = (byte) -1;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final lPt3Fixed.YKK L() {
        lPt3Fixed.YKK ykk = wb5.b;
        ykk.c(wf3.class, CQf.class);
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

    @Override // com.google.protobuf.DzVS
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final CQf c() {
        if (this == C) {
            return new CQf();
        }
        CQf cQf = new CQf();
        cQf.R(this);
        return cQf;
    }

    @Override // defpackage.jd2
    public final mw0t a() {
        return C;
    }

    @Override // com.google.protobuf.QnHx
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wf3)) {
            return super.equals(obj);
        }
        wf3 wf3Var = (wf3) obj;
        return S().equals(wf3Var.S()) && this.A == wf3Var.A && this.y.equals(wf3Var.y);
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
    public final void h(CodedOutputStream codedOutputStream) {
        if (!lPt3Fixed.M(this.z)) {
            lPt3Fixed.R(codedOutputStream, 1, this.z);
        }
        boolean z = this.A;
        if (z) {
            codedOutputStream.w1(2, z);
        }
        this.y.h(codedOutputStream);
    }

    @Override // com.google.protobuf.QnHx
    public final int hashCode() {
        int i = this.w;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.y.hashCode() + ((SjP.a(this.A) + ((((S().hashCode() + u40.a(wb5.a, 779, 37, 1, 53)) * 37) + 2) * 53)) * 29);
        this.w = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
    public final boolean isInitialized() {
        byte b = this.B;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.B = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
    public final int j() {
        int i = this.x;
        if (i != -1) {
            return i;
        }
        int iH = lPt3Fixed.M(this.z) ? 0 : 0 + lPt3Fixed.H(1, this.z);
        if (this.A) {
            iH += CodedOutputStream.V0(2);
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
        return C.c();
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
    public final oz2<wf3> p() {
        return D;
    }

    @Override // defpackage.jd2
    public final DzVS a() {
        return C;
    }

    public wf3() {
        this.B = (byte) -1;
        this.z = "";
    }
}
