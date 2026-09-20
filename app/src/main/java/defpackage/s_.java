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
public final class s_ extends lPt3Fixed implements roZB {
    public static final s_ D = new s_();
    public static final QnHx E = new QnHx();
    public int A;
    public int B;
    public byte C;
    public int z;

    public static final class CQf extends lPt3Fixed.CQf<CQf> implements roZB {
        public int A;
        public int B;
        public int C;

        public CQf() {
            s_ s_Var = s_.D;
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
            lPt3Fixed.YKK ykk = tb5.p;
            ykk.c(s_.class, CQf.class);
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
        public final s_ f() {
            s_ s_Var = new s_(this);
            s_Var.z = this.A;
            s_Var.A = this.B;
            s_Var.B = this.C;
            L();
            return s_Var;
        }

        public final void R(s_ s_Var) {
            if (s_Var == s_.D) {
                return;
            }
            int i = s_Var.z;
            if (i != 0) {
                this.A = i;
                M();
            }
            int i2 = s_Var.A;
            if (i2 != 0) {
                this.B = i2;
                M();
            }
            int i3 = s_Var.B;
            if (i3 != 0) {
                this.C = i3;
                M();
            }
            super.B(s_Var.y);
            M();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        public final void S(NUlFixed nUl, vv0 vv0Var) throws Throwable {
            s_ s_Var;
            try {
                try {
                    R((s_) s_.E.b(nUl, vv0Var));
                } catch (InvalidProtocolBufferException e) {
                    s_Var = (s_) e.w;
                    try {
                        throw e.g();
                    } catch (Throwable th) {
                        th = th;
                        if (s_Var != null) {
                            R(s_Var);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                s_Var = null;
                if (s_Var != null) {
                    R(s_Var);
                }
                throw th;
            }
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return s_.D;
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
        public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
            super.b(nUl, obj);
            return this;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final mw0t build() {
            s_ s_VarF = f();
            if (s_VarF.isInitialized()) {
                return s_VarF;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(s_VarF);
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
        public final Object clone() {
            return (CQf) super.clone();
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
        public final Descriptors.QnHx e() {
            return tb5.o;
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
            if (mw0tVar instanceof s_) {
                R((s_) mw0tVar);
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
            if (mw0tVar instanceof s_) {
                R((s_) mw0tVar);
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
            return s_.D;
        }

        public CQf(lPt3Fixed.QnHx qnHx) {
            super(qnHx);
            s_ s_Var = s_.D;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final DzVS build() {
            s_ s_VarF = f();
            if (s_VarF.isInitialized()) {
                return s_VarF;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(s_VarF);
        }
    }

    public class QnHx extends F1<s_> {
        @Override // defpackage.oz2
        public final Object b(NUlFixed nUl, vv0 vv0Var) {
            s_ s_Var = new s_();
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
                                    s_Var.z = nUl.o();
                                } else if (iZ == 16) {
                                    s_Var.A = nUl.o();
                                } else if (iZ == 24) {
                                    s_Var.B = nUl.o();
                                } else if (!qnHx.u(iZ, nUl)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            e.w = s_Var;
                            throw e;
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2);
                            invalidProtocolBufferException.w = s_Var;
                            throw invalidProtocolBufferException;
                        }
                    } catch (UninitializedMessageException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferExceptionA = e3.a();
                        invalidProtocolBufferExceptionA.w = s_Var;
                        throw invalidProtocolBufferExceptionA;
                    }
                } catch (Throwable th) {
                    s_Var.y = qnHx.build();
                    throw th;
                }
            }
            s_Var.y = qnHx.build();
            return s_Var;
        }
    }

    public s_(lPt3Fixed.CQf cQf) {
        super(cQf);
        this.C = (byte) -1;
    }

    public static QnHx S() {
        return E;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final lPt3Fixed.YKK L() {
        lPt3Fixed.YKK ykk = tb5.p;
        ykk.c(s_.class, CQf.class);
        return ykk;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
        return new CQf(qnHx);
    }

    @Override // com.google.protobuf.DzVS
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
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
        if (!(obj instanceof s_)) {
            return super.equals(obj);
        }
        s_ s_Var = (s_) obj;
        return this.z == s_Var.z && this.A == s_Var.A && this.B == s_Var.B && this.y.equals(s_Var.y);
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
    public final void h(CodedOutputStream codedOutputStream) {
        int i = this.z;
        if (i != 0) {
            codedOutputStream.E1(1, i);
        }
        int i2 = this.A;
        if (i2 != 0) {
            codedOutputStream.E1(2, i2);
        }
        int i3 = this.B;
        if (i3 != 0) {
            codedOutputStream.E1(3, i3);
        }
        this.y.h(codedOutputStream);
    }

    @Override // com.google.protobuf.QnHx
    public final int hashCode() {
        int i = this.w;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.y.hashCode() + ((((((((((u40.a(tb5.o, 779, 37, 1, 53) + this.z) * 37) + 2) * 53) + this.A) * 37) + 3) * 53) + this.B) * 29);
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
        int i2 = this.z;
        int iE1 = i2 != 0 ? 0 + CodedOutputStream.e1(1, i2) : 0;
        int i3 = this.A;
        if (i3 != 0) {
            iE1 += CodedOutputStream.e1(2, i3);
        }
        int i4 = this.B;
        if (i4 != 0) {
            iE1 += CodedOutputStream.e1(3, i4);
        }
        int iJ = this.y.j() + iE1;
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
    public final oz2<s_> p() {
        return E;
    }

    @Override // defpackage.jd2
    public final DzVS a() {
        return D;
    }

    public s_() {
        this.C = (byte) -1;
    }
}
