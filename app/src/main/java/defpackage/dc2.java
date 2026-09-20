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
public final class dc2 extends lPt3Fixed implements roZB {
    public static final dc2 B = new dc2();
    public static final QnHx C = new QnHx();
    public byte A;
    public int z;

    public static final class CQf extends lPt3Fixed.CQf<CQf> implements roZB {
        public int A;

        public CQf() {
            this.A = 0;
            dc2 dc2Var = dc2.B;
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
            lPt3Fixed.YKK ykk = tb5.j;
            ykk.c(dc2.class, CQf.class);
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
        public final dc2 f() {
            dc2 dc2Var = new dc2(this);
            dc2Var.z = this.A;
            L();
            return dc2Var;
        }

        public final void R(dc2 dc2Var) {
            if (dc2Var == dc2.B) {
                return;
            }
            int i = dc2Var.z;
            if (i != 0) {
                this.A = i;
                M();
            }
            super.B(dc2Var.y);
            M();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        public final void S(NUlFixed nUl, vv0 vv0Var) throws Throwable {
            dc2 dc2Var;
            try {
                try {
                    R((dc2) dc2.C.b(nUl, vv0Var));
                } catch (InvalidProtocolBufferException e) {
                    dc2Var = (dc2) e.w;
                    try {
                        throw e.g();
                    } catch (Throwable th) {
                        th = th;
                        if (dc2Var != null) {
                            R(dc2Var);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                dc2Var = null;
                if (dc2Var != null) {
                    R(dc2Var);
                }
                throw th;
            }
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return dc2.B;
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
        public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
            super.b(nUl, obj);
            return this;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final mw0t build() {
            dc2 dc2VarF = f();
            if (dc2VarF.isInitialized()) {
                return dc2VarF;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(dc2VarF);
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
        public final Object clone() {
            return (CQf) super.clone();
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
        public final Descriptors.QnHx e() {
            return tb5.i;
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
            if (mw0tVar instanceof dc2) {
                R((dc2) mw0tVar);
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
            if (mw0tVar instanceof dc2) {
                R((dc2) mw0tVar);
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
            return dc2.B;
        }

        public CQf(lPt3Fixed.QnHx qnHx) {
            super(qnHx);
            this.A = 0;
            dc2 dc2Var = dc2.B;
        }

        @Override // com.google.protobuf.DzVS.QnHx
        public final DzVS build() {
            dc2 dc2VarF = f();
            if (dc2VarF.isInitialized()) {
                return dc2VarF;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(dc2VarF);
        }
    }

    public enum F1 implements SjP.QnHx {
        VOLUME_MUTE(0),
        /* JADX INFO: Fake field, exist only in values array */
        VOLUME_UP(1),
        /* JADX INFO: Fake field, exist only in values array */
        VOLUME_DOWN(2),
        /* JADX INFO: Fake field, exist only in values array */
        MEDIA_NEXT_TRACK(3),
        /* JADX INFO: Fake field, exist only in values array */
        MEDIA_PREV_TRACK(4),
        /* JADX INFO: Fake field, exist only in values array */
        MEDIA_STOP(7),
        /* JADX INFO: Fake field, exist only in values array */
        MEDIA_PLAY_PAUSE(8),
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

    public class QnHx extends com.google.protobuf.F1<dc2> {
        @Override // defpackage.oz2
        public final Object b(NUlFixed nUl, vv0 vv0Var) {
            dc2 dc2Var = new dc2();
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
                                    dc2Var.z = nUl.j();
                                } else if (!qnHx.u(iZ, nUl)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            e.w = dc2Var;
                            throw e;
                        } catch (UninitializedMessageException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                            invalidProtocolBufferExceptionA.w = dc2Var;
                            throw invalidProtocolBufferExceptionA;
                        }
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                        invalidProtocolBufferException.w = dc2Var;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    dc2Var.y = qnHx.build();
                    throw th;
                }
            }
            dc2Var.y = qnHx.build();
            return dc2Var;
        }
    }

    public dc2(lPt3Fixed.CQf cQf) {
        super(cQf);
        this.A = (byte) -1;
    }

    public static QnHx S() {
        return C;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final lPt3Fixed.YKK L() {
        lPt3Fixed.YKK ykk = tb5.j;
        ykk.c(dc2.class, CQf.class);
        return ykk;
    }

    @Override // com.google.protobuf.lPt3Fixed
    public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
        return new CQf(qnHx);
    }

    @Override // com.google.protobuf.DzVS
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
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
        if (!(obj instanceof dc2)) {
            return super.equals(obj);
        }
        dc2 dc2Var = (dc2) obj;
        return this.z == dc2Var.z && this.y.equals(dc2Var.y);
    }

    @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
    public final void h(CodedOutputStream codedOutputStream) {
        if (this.z != F1.VOLUME_MUTE.b()) {
            codedOutputStream.E1(1, this.z);
        }
        this.y.h(codedOutputStream);
    }

    @Override // com.google.protobuf.QnHx
    public final int hashCode() {
        int i = this.w;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.y.hashCode() + ((u40.a(tb5.i, 779, 37, 1, 53) + this.z) * 29);
        this.w = iHashCode;
        return iHashCode;
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
        int iJ = this.y.j() + (this.z != F1.VOLUME_MUTE.b() ? 0 + CodedOutputStream.Z0(1, this.z) : 0);
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
    public final oz2<dc2> p() {
        return C;
    }

    @Override // defpackage.jd2
    public final DzVS a() {
        return B;
    }

    public dc2() {
        this.A = (byte) -1;
        this.z = 0;
    }
}
