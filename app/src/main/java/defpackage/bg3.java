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
public final class bg3 extends lPt3Fixed implements roZB {
    public static final bg3 B = new bg3();
    public static final QnHx C = new QnHx();
    public byte A;
    public yf3 z;

    public static final class CQf extends lPt3Fixed.CQf<CQf> implements roZB {
        public yf3 A;

        public CQf() {
            bg3 bg3Var = bg3.B;
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
            lPt3Fixed.YKK ykk = tb5.L;
            ykk.c(bg3.class, CQf.class);
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
        public final bg3 f() {
            bg3 bg3Var = new bg3(this);
            bg3Var.z = this.A;
            L();
            return bg3Var;
        }

        public final void R(bg3 bg3Var) {
            if (bg3Var == bg3.B) {
                return;
            }
            if (bg3Var.z != null) {
                yf3 yf3VarS = bg3Var.S();
                yf3 yf3Var = this.A;
                if (yf3Var != null) {
                    yf3.CQf cQfS = yf3.D.c();
                    cQfS.R(yf3Var);
                    cQfS.R(yf3VarS);
                    this.A = cQfS.f();
                } else {
                    this.A = yf3VarS;
                }
                M();
            }
            super.B(bg3Var.y);
            M();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        public final void S(NUlFixed nUl, vv0 vv0Var) throws Throwable {
            bg3 bg3Var;
            try {
                try {
                    R((bg3) bg3.C.b(nUl, vv0Var));
                } catch (InvalidProtocolBufferException e) {
                    bg3Var = (bg3) e.w;
                    try {
                        throw e.g();
                    } catch (Throwable th) {
                        th = th;
                        if (bg3Var != null) {
                            R(bg3Var);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bg3Var = null;
                if (bg3Var != null) {
                    R(bg3Var);
                }
                throw th;
            }
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return bg3.B;
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
        public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
            super.b(nUl, obj);
            return this;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final mw0t build() {
            bg3 bg3VarF = f();
            if (bg3VarF.isInitialized()) {
                return bg3VarF;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(bg3VarF);
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
        public final Object clone() {
            return (CQf) super.clone();
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
        public final Descriptors.QnHx e() {
            return tb5.K;
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
            if (mw0tVar instanceof bg3) {
                R((bg3) mw0tVar);
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
            if (mw0tVar instanceof bg3) {
                R((bg3) mw0tVar);
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
            return bg3.B;
        }

        public CQf(lPt3Fixed.QnHx qnHx) {
            super(qnHx);
            bg3 bg3Var = bg3.B;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final DzVS build() {
            bg3 bg3VarF = f();
            if (bg3VarF.isInitialized()) {
                return bg3VarF;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(bg3VarF);
        }
    }

    public class QnHx extends F1<bg3> {
        @Override // defpackage.oz2
        public final Object b(NUlFixed nUl, vv0 vv0Var) {
            bg3 bg3Var = new bg3();
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
                                    yf3 yf3Var = bg3Var.z;
                                    yf3.CQf cQfS = yf3Var != null ? yf3Var.c() : null;
                                    yf3 yf3Var2 = (yf3) nUl.q(yf3.E, vv0Var);
                                    bg3Var.z = yf3Var2;
                                    if (cQfS != null) {
                                        cQfS.R(yf3Var2);
                                        bg3Var.z = cQfS.f();
                                    }
                                } else if (!qnHx.u(iZ, nUl)) {
                                }
                            }
                            z = true;
                        } catch (UninitializedMessageException e) {
                            InvalidProtocolBufferException invalidProtocolBufferExceptionA = e.a();
                            invalidProtocolBufferExceptionA.w = bg3Var;
                            throw invalidProtocolBufferExceptionA;
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2);
                            invalidProtocolBufferException.w = bg3Var;
                            throw invalidProtocolBufferException;
                        }
                    } catch (InvalidProtocolBufferException e3) {
                        e3.w = bg3Var;
                        throw e3;
                    }
                } catch (Throwable th) {
                    bg3Var.y = qnHx.build();
                    throw th;
                }
            }
            bg3Var.y = qnHx.build();
            return bg3Var;
        }
    }

    public bg3(lPt3Fixed.CQf cQf) {
        super(cQf);
        this.A = (byte) -1;
    }

    public static QnHx T() {
        return C;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final lPt3Fixed.YKK L() {
        lPt3Fixed.YKK ykk = tb5.L;
        ykk.c(bg3.class, CQf.class);
        return ykk;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
        return new CQf(qnHx);
    }

    public final yf3 S() {
        yf3 yf3Var = this.z;
        return yf3Var == null ? yf3.D : yf3Var;
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
        if (!(obj instanceof bg3)) {
            return super.equals(obj);
        }
        bg3 bg3Var = (bg3) obj;
        yf3 yf3Var = this.z;
        if ((yf3Var != null) != (bg3Var.z != null)) {
            return false;
        }
        return (!(yf3Var != null) || S().equals(bg3Var.S())) && this.y.equals(bg3Var.y);
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
        int iHashCode = tb5.K.hashCode() + 779;
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
    public final oz2<bg3> p() {
        return C;
    }

    @Override // defpackage.jd2
    public final DzVS a() {
        return B;
    }

    public bg3() {
        this.A = (byte) -1;
    }
}
