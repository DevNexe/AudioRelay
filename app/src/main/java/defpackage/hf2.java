package defpackage;

import android.content.Context;
import com.azefsw.audioconnect.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class hf2 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ dg2 w;
        public final /* synthetic */ te2 x;
        public final /* synthetic */ j81<ev3, sd5> y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(dg2 dg2Var, te2 te2Var, j81<? super ev3, sd5> j81Var, int i) {
            super(2);
            this.w = dg2Var;
            this.x = te2Var;
            this.y = j81Var;
            this.z = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.z | 1;
            te2 te2Var = this.x;
            j81<ev3, sd5> j81Var = this.y;
            hf2.a(this.w, te2Var, j81Var, g30Var, i);
            return sd5.a;
        }
    }

    public static final class EQ extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ j81<ev3, sd5> A;
        public final /* synthetic */ int B;
        public final /* synthetic */ re2 w;
        public final /* synthetic */ dg2 x;
        public final /* synthetic */ te2 y;
        public final /* synthetic */ ne2 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public EQ(re2 re2Var, dg2 dg2Var, te2 te2Var, ne2 ne2Var, j81<? super ev3, sd5> j81Var, int i) {
            super(2);
            this.w = re2Var;
            this.x = dg2Var;
            this.y = te2Var;
            this.z = ne2Var;
            this.A = j81Var;
            this.B = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            hf2.f(this.w, this.x, this.y, this.z, this.A, g30Var, this.B | 1);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ float w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(float f, int i) {
            super(2);
            this.w = f;
            this.x = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            hf2.b(this.w, g30Var, i);
            return sd5.a;
        }
    }

    public static final class FJCM extends cx1 implements y81<wv, g30, Integer, sd5> {
        public final /* synthetic */ ne2 w;
        public final /* synthetic */ j81<ev3, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FJCM(ne2 ne2Var, j81<? super ev3, sd5> j81Var, int i) {
            super(3);
            this.w = ne2Var;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.y81
        public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
            wv wvVar2 = wvVar;
            g30 g30Var2 = g30Var;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= g30Var2.I(wvVar2) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                hf2.k(OW8.o(m21.P), OW8.o(m21.Q), g30Var2, 0);
                pq4.c(16, g30Var2, 6);
                ne2 ne2Var = this.w;
                boolean z = ne2Var.a;
                int i = this.y;
                j81<ev3, sd5> j81Var = this.x;
                if (z) {
                    g30Var2.e(-1228185313);
                    hf2.m(ne2Var, j81Var, g30Var2, (i & 14) | (i & 112));
                    g30Var2.G();
                } else {
                    g30Var2.e(-1228185232);
                    hf2.n(wvVar2, j81Var, g30Var2, (iIntValue & 14) | (i & 112));
                    g30Var2.G();
                }
            }
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements h81<sd5> {
        public final /* synthetic */ j81<ev3, sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public LPt8Fixed(j81<? super ev3, sd5> j81Var) {
            super(0);
            this.w = j81Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.invoke(ev3.byN.a);
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ kj1<qe2> w;
        public final /* synthetic */ j81<ev3, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NUlFixed(kj1<qe2> kj1Var, j81<? super ev3, sd5> j81Var, int i) {
            super(2);
            this.w = kj1Var;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                float f = 16;
                wo1.QnHx qnHx = wo1.a;
                zx2 zx2Var = new zx2(f, f, f, f);
                g30Var2.e(733328855);
                rb2 rb2VarC = fe.c(One.QnHx.a, false, g30Var2);
                g30Var2.e(-1323940314);
                ij0 ij0Var = (ij0) g30Var2.E(r40.e);
                jy1 jy1Var = (jy1) g30Var2.E(r40.k);
                ti5 ti5Var = (ti5) g30Var2.E(r40.o);
                a30.e.getClass();
                yy1.QnHx qnHx2 = a30.QnHx.b;
                sz szVarJ = S12N.j(zx2Var);
                if (!(g30Var2.v() instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                g30Var2.s();
                if (g30Var2.m()) {
                    g30Var2.l(qnHx2);
                } else {
                    g30Var2.A();
                }
                g30Var2.u();
                hH.u(g30Var2, rb2VarC, a30.QnHx.e);
                hH.u(g30Var2, ij0Var, a30.QnHx.d);
                hH.u(g30Var2, jy1Var, a30.QnHx.f);
                szVarJ.invoke(bl2.b(g30Var2, ti5Var, a30.QnHx.g, g30Var2), g30Var2, 0);
                g30Var2.e(2058660585);
                g30Var2.e(-2137368960);
                ix4.a(null, null, 0L, 0L, null, 0.0f, X.m(g30Var2, -822324678, new of2(this.w, this.x, this.y)), g30Var2, 1572864, 63);
                ex0.d(g30Var2);
            }
            return sd5.a;
        }
    }

    public static final class PRnFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ ne2 w;
        public final /* synthetic */ j81<ev3, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PRnFixed(ne2 ne2Var, j81<? super ev3, sd5> j81Var, int i) {
            super(2);
            this.w = ne2Var;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            hf2.g(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements y81<wv, g30, Integer, sd5> {
        public final /* synthetic */ dg2 w;
        public final /* synthetic */ te2 x;
        public final /* synthetic */ j81<ev3, sd5> y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(dg2 dg2Var, te2 te2Var, j81<? super ev3, sd5> j81Var, int i) {
            super(3);
            this.w = dg2Var;
            this.x = te2Var;
            this.y = j81Var;
            this.z = i;
        }

        @Override // defpackage.y81
        public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 81) == 16 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                hf2.k(OW8.o(m21.N), OW8.o(m21.O), g30Var2, 0);
                g30Var2.e(-1699221207);
                dg2 dg2Var = this.w;
                int i = this.z;
                if (dg2Var != null) {
                    j81<ev3, sd5> j81Var = this.y;
                    pq4.c(16, g30Var2, 6);
                    hf2.l((i & 896) | ((i << 3) & 112), 1, g30Var2, null, dg2Var, j81Var);
                    sd5 sd5Var = sd5.a;
                }
                g30Var2.G();
                te2 te2Var = this.x;
                if (te2Var != null) {
                    w94.a(null, g30Var2, 0, 1);
                    int i2 = i >> 3;
                    hf2.j(te2Var, this.y, g30Var2, (i2 & 112) | (i2 & 14));
                }
            }
            return sd5.a;
        }
    }

    public static final class T23 extends cx1 implements y81<wv, g30, Integer, sd5> {
        public final /* synthetic */ j81<ev3, sd5> w;
        public final /* synthetic */ re2 x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public T23(int i, re2 re2Var, j81 j81Var) {
            super(3);
            this.w = j81Var;
            this.x = re2Var;
        }

        @Override // defpackage.y81
        public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 81) == 16 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                sz szVarM = X.m(g30Var2, 546500788, new qf2(this.x));
                sz szVar = a10.d;
                sz szVar2 = a10.e;
                g30Var2.e(1157296644);
                j81<ev3, sd5> j81Var = this.w;
                boolean zI = g30Var2.I(j81Var);
                Object objF = g30Var2.f();
                if (zI || objF == g30.QnHx.a) {
                    objF = new rf2(j81Var);
                    g30Var2.B(objF);
                }
                g30Var2.G();
                q55.a(null, szVarM, szVar, szVar2, (h81) objF, g30Var2, 3504, 1);
            }
            return sd5.a;
        }
    }

    public static final class YKK extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ kj1<qe2> w;
        public final /* synthetic */ j81<ev3, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public YKK(kj1<qe2> kj1Var, j81<? super ev3, sd5> j81Var, int i) {
            super(2);
            this.w = kj1Var;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            hf2.d(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class auxFixed extends cx1 implements h81<sd5> {
        public final /* synthetic */ j81<ev3, sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public auxFixed(j81<? super ev3, sd5> j81Var) {
            super(0);
            this.w = j81Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.invoke(ev3.WE.a);
            return sd5.a;
        }
    }

    public static final class byN extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ re2 w;
        public final /* synthetic */ j81<ev3, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public byN(int i, re2 re2Var, j81 j81Var) {
            super(2);
            this.w = re2Var;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            hf2.e(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final void a(dg2 dg2Var, te2 te2Var, j81<? super ev3, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-1097950675);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(dg2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(te2Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 256 : 128;
        }
        if ((i2 & 731) == 146 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            a_.b(null, 0L, 0, null, 0.0f, X.m(j30VarQ, 1095760348, new QnHx(dg2Var, te2Var, j81Var, i2)), j30VarQ, 196992, 27);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(dg2Var, te2Var, j81Var, i);
    }

    public static final void b(float f, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(1377609765);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.g(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j55.b(kd.q(Th.j(m21.K, Integer.valueOf((int) f))), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).j, j30VarQ, 0, 0, 32766);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new F1(f, i);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:55:0x012a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0135  */
    /* JADX WARN: Code duplicated, block: B:61:0x0141  */
    /* JADX WARN: Code duplicated, block: B:63:0x0147  */
    /* JADX WARN: Code duplicated, block: B:67:0x014f  */
    /* JADX WARN: Code duplicated, block: B:72:0x015c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0199 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:75:0x019b  */
    /* JADX WARN: Code duplicated, block: B:81:0x01df  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public static final void c(int i, int i2, g30 g30Var, pg2 pg2Var, dg2 dg2Var, j81 j81Var) {
        int i3;
        pg2 pg2Var2;
        int i4;
        pg2.QnHx qnHx;
        pg2 pg2Var3;
        Object objB0;
        g30.QnHx.C0132QnHx c0132QnHx;
        ri2 ri2Var;
        int i5;
        rb2 rb2VarA;
        ij0 ij0Var;
        jy1 jy1Var;
        ti5 ti5Var;
        yy1.QnHx qnHx2;
        sz szVarJ;
        int i6;
        xu3 xu3Var;
        int i7;
        boolean zI;
        Object objB1;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(-1889794134);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(dg2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 112) == 0) {
                pg2Var2 = pg2Var;
                i3 |= j30VarQ.I(pg2Var2) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                if (j30VarQ.I(j81Var)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if ((i3 & 731) == 146 || !j30VarQ.t()) {
                qnHx = pg2.QnHx.w;
                if (i8 != 0) {
                    pg2Var3 = qnHx;
                } else {
                    pg2Var3 = pg2Var2;
                }
                e40.CQf cQf = e40.a;
                j30VarQ.e(-492369756);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (objB0 == c0132QnHx) {
                    objB0 = ps0.R(Float.valueOf(dg2Var.b));
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                ri2Var = (ri2) objB0;
                da.CQf cQf2 = One.QnHx.k;
                i5 = ((i3 >> 3) & 14) | 384;
                j30VarQ.e(693286680);
                rb2VarA = uu3.a(CZ9P.a, cQf2, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var = (ij0) j30VarQ.E(r40.e);
                jy1Var = (jy1) j30VarQ.E(r40.k);
                ti5Var = (ti5) j30VarQ.E(r40.o);
                a30.e.getClass();
                qnHx2 = a30.QnHx.b;
                szVarJ = S12N.j(pg2Var3);
                i6 = ((((i5 << 3) & 112) << 9) & 7168) | 6;
                if (!(j30VarQ.a instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx2);
                } else {
                    j30VarQ.A();
                }
                j30VarQ.x = false;
                hH.u(j30VarQ, rb2VarA, a30.QnHx.e);
                hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                szVarJ.invoke(sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, Integer.valueOf((i6 >> 3) & 112));
                j30VarQ.e(2058660585);
                j30VarQ.e(-678309503);
                if (((i6 >> 9) & 14 & 11) == 2 || !j30VarQ.t()) {
                    xu3Var = xu3.a;
                    i7 = ((i5 >> 6) & 112) | 6;
                    if ((i7 & 14) == 0) {
                        i7 |= j30VarQ.I(xu3Var) ? 4 : 2;
                    }
                    if ((i7 & 91) == 18 || !j30VarQ.t()) {
                        b(((Number) dg2Var.c.b()).floatValue(), j30VarQ, 0);
                        float f = 4;
                        pq4.a(f, j30VarQ, 6);
                        pg2 pg2VarA = xu3Var.a(qnHx, 1.0f, true);
                        float fFloatValue = ((Number) ri2Var.getValue()).floatValue();
                        pt ptVar = dg2Var.c;
                        j30VarQ.e(511388516);
                        zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var);
                        objB1 = j30VarQ.b0();
                        if (zI || objB1 == c0132QnHx) {
                            objB1 = new jf2(ri2Var, j81Var);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        cn4.a(fFloatValue, (j81) objB1, pg2VarA, false, ptVar, 0, null, null, null, j30VarQ, 0, 488);
                        pq4.a(f, j30VarQ, 6);
                        b(((Number) ptVar.e()).floatValue(), j30VarQ, 0);
                    } else {
                        j30VarQ.x();
                    }
                } else {
                    j30VarQ.x();
                }
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
            } else {
                j30VarQ.x();
                pg2Var3 = pg2Var2;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new kf2(i, i2, pg2Var3, dg2Var, j81Var);
        }
        i3 |= 48;
        pg2Var2 = pg2Var;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (j30VarQ.I(j81Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 731) == 146) {
            qnHx = pg2.QnHx.w;
            if (i8 != 0) {
                pg2Var3 = qnHx;
            } else {
                pg2Var3 = pg2Var2;
            }
            e40.CQf cQf3 = e40.a;
            j30VarQ.e(-492369756);
            objB0 = j30VarQ.b0();
            c0132QnHx = g30.QnHx.a;
            if (objB0 == c0132QnHx) {
                objB0 = ps0.R(Float.valueOf(dg2Var.b));
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            ri2Var = (ri2) objB0;
            da.CQf cQf4 = One.QnHx.k;
            i5 = ((i3 >> 3) & 14) | 384;
            j30VarQ.e(693286680);
            rb2VarA = uu3.a(CZ9P.a, cQf4, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            qnHx2 = a30.QnHx.b;
            szVarJ = S12N.j(pg2Var3);
            i6 = ((((i5 << 3) & 112) << 9) & 7168) | 6;
            if (!(j30VarQ.a instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx2);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            hH.u(j30VarQ, rb2VarA, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            szVarJ.invoke(sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, Integer.valueOf((i6 >> 3) & 112));
            j30VarQ.e(2058660585);
            j30VarQ.e(-678309503);
            if (((i6 >> 9) & 14 & 11) == 2) {
                xu3Var = xu3.a;
                i7 = ((i5 >> 6) & 112) | 6;
                if ((i7 & 14) == 0) {
                    i7 |= j30VarQ.I(xu3Var) ? 4 : 2;
                }
                if ((i7 & 91) == 18) {
                    b(((Number) dg2Var.c.b()).floatValue(), j30VarQ, 0);
                    float f2 = 4;
                    pq4.a(f2, j30VarQ, 6);
                    pg2 pg2VarA2 = xu3Var.a(qnHx, 1.0f, true);
                    float fFloatValue2 = ((Number) ri2Var.getValue()).floatValue();
                    pt ptVar2 = dg2Var.c;
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        objB1 = new jf2(ri2Var, j81Var);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new jf2(ri2Var, j81Var);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    cn4.a(fFloatValue2, (j81) objB1, pg2VarA2, false, ptVar2, 0, null, null, null, j30VarQ, 0, 488);
                    pq4.a(f2, j30VarQ, 6);
                    b(((Number) ptVar2.e()).floatValue(), j30VarQ, 0);
                } else {
                    b(((Number) dg2Var.c.b()).floatValue(), j30VarQ, 0);
                    float f3 = 4;
                    pq4.a(f3, j30VarQ, 6);
                    pg2 pg2VarA3 = xu3Var.a(qnHx, 1.0f, true);
                    float fFloatValue3 = ((Number) ri2Var.getValue()).floatValue();
                    pt ptVar3 = dg2Var.c;
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        objB1 = new jf2(ri2Var, j81Var);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new jf2(ri2Var, j81Var);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    cn4.a(fFloatValue3, (j81) objB1, pg2VarA3, false, ptVar3, 0, null, null, null, j30VarQ, 0, 488);
                    pq4.a(f3, j30VarQ, 6);
                    b(((Number) ptVar3.e()).floatValue(), j30VarQ, 0);
                }
            } else {
                xu3Var = xu3.a;
                i7 = ((i5 >> 6) & 112) | 6;
                if ((i7 & 14) == 0) {
                    i7 |= j30VarQ.I(xu3Var) ? 4 : 2;
                }
                if ((i7 & 91) == 18) {
                    b(((Number) dg2Var.c.b()).floatValue(), j30VarQ, 0);
                    float f4 = 4;
                    pq4.a(f4, j30VarQ, 6);
                    pg2 pg2VarA4 = xu3Var.a(qnHx, 1.0f, true);
                    float fFloatValue4 = ((Number) ri2Var.getValue()).floatValue();
                    pt ptVar4 = dg2Var.c;
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        objB1 = new jf2(ri2Var, j81Var);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new jf2(ri2Var, j81Var);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    cn4.a(fFloatValue4, (j81) objB1, pg2VarA4, false, ptVar4, 0, null, null, null, j30VarQ, 0, 488);
                    pq4.a(f4, j30VarQ, 6);
                    b(((Number) ptVar4.e()).floatValue(), j30VarQ, 0);
                } else {
                    b(((Number) dg2Var.c.b()).floatValue(), j30VarQ, 0);
                    float f5 = 4;
                    pq4.a(f5, j30VarQ, 6);
                    pg2 pg2VarA5 = xu3Var.a(qnHx, 1.0f, true);
                    float fFloatValue5 = ((Number) ri2Var.getValue()).floatValue();
                    pt ptVar5 = dg2Var.c;
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        objB1 = new jf2(ri2Var, j81Var);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new jf2(ri2Var, j81Var);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    cn4.a(fFloatValue5, (j81) objB1, pg2VarA5, false, ptVar5, 0, null, null, null, j30VarQ, 0, 488);
                    pq4.a(f5, j30VarQ, 6);
                    b(((Number) ptVar5.e()).floatValue(), j30VarQ, 0);
                }
            }
            O.g(j30VarQ, false, false, true, false);
            j30VarQ.R(false);
        } else {
            qnHx = pg2.QnHx.w;
            if (i8 != 0) {
                pg2Var3 = qnHx;
            } else {
                pg2Var3 = pg2Var2;
            }
            e40.CQf cQf5 = e40.a;
            j30VarQ.e(-492369756);
            objB0 = j30VarQ.b0();
            c0132QnHx = g30.QnHx.a;
            if (objB0 == c0132QnHx) {
                objB0 = ps0.R(Float.valueOf(dg2Var.b));
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            ri2Var = (ri2) objB0;
            da.CQf cQf6 = One.QnHx.k;
            i5 = ((i3 >> 3) & 14) | 384;
            j30VarQ.e(693286680);
            rb2VarA = uu3.a(CZ9P.a, cQf6, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            qnHx2 = a30.QnHx.b;
            szVarJ = S12N.j(pg2Var3);
            i6 = ((((i5 << 3) & 112) << 9) & 7168) | 6;
            if (!(j30VarQ.a instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx2);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            hH.u(j30VarQ, rb2VarA, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            szVarJ.invoke(sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, Integer.valueOf((i6 >> 3) & 112));
            j30VarQ.e(2058660585);
            j30VarQ.e(-678309503);
            if (((i6 >> 9) & 14 & 11) == 2) {
                xu3Var = xu3.a;
                i7 = ((i5 >> 6) & 112) | 6;
                if ((i7 & 14) == 0) {
                    i7 |= j30VarQ.I(xu3Var) ? 4 : 2;
                }
                if ((i7 & 91) == 18) {
                    b(((Number) dg2Var.c.b()).floatValue(), j30VarQ, 0);
                    float f6 = 4;
                    pq4.a(f6, j30VarQ, 6);
                    pg2 pg2VarA6 = xu3Var.a(qnHx, 1.0f, true);
                    float fFloatValue6 = ((Number) ri2Var.getValue()).floatValue();
                    pt ptVar6 = dg2Var.c;
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        objB1 = new jf2(ri2Var, j81Var);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new jf2(ri2Var, j81Var);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    cn4.a(fFloatValue6, (j81) objB1, pg2VarA6, false, ptVar6, 0, null, null, null, j30VarQ, 0, 488);
                    pq4.a(f6, j30VarQ, 6);
                    b(((Number) ptVar6.e()).floatValue(), j30VarQ, 0);
                } else {
                    b(((Number) dg2Var.c.b()).floatValue(), j30VarQ, 0);
                    float f7 = 4;
                    pq4.a(f7, j30VarQ, 6);
                    pg2 pg2VarA7 = xu3Var.a(qnHx, 1.0f, true);
                    float fFloatValue7 = ((Number) ri2Var.getValue()).floatValue();
                    pt ptVar7 = dg2Var.c;
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        objB1 = new jf2(ri2Var, j81Var);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new jf2(ri2Var, j81Var);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    cn4.a(fFloatValue7, (j81) objB1, pg2VarA7, false, ptVar7, 0, null, null, null, j30VarQ, 0, 488);
                    pq4.a(f7, j30VarQ, 6);
                    b(((Number) ptVar7.e()).floatValue(), j30VarQ, 0);
                }
            } else {
                xu3Var = xu3.a;
                i7 = ((i5 >> 6) & 112) | 6;
                if ((i7 & 14) == 0) {
                    i7 |= j30VarQ.I(xu3Var) ? 4 : 2;
                }
                if ((i7 & 91) == 18) {
                    b(((Number) dg2Var.c.b()).floatValue(), j30VarQ, 0);
                    float f8 = 4;
                    pq4.a(f8, j30VarQ, 6);
                    pg2 pg2VarA8 = xu3Var.a(qnHx, 1.0f, true);
                    float fFloatValue8 = ((Number) ri2Var.getValue()).floatValue();
                    pt ptVar8 = dg2Var.c;
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        objB1 = new jf2(ri2Var, j81Var);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new jf2(ri2Var, j81Var);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    cn4.a(fFloatValue8, (j81) objB1, pg2VarA8, false, ptVar8, 0, null, null, null, j30VarQ, 0, 488);
                    pq4.a(f8, j30VarQ, 6);
                    b(((Number) ptVar8.e()).floatValue(), j30VarQ, 0);
                } else {
                    b(((Number) dg2Var.c.b()).floatValue(), j30VarQ, 0);
                    float f9 = 4;
                    pq4.a(f9, j30VarQ, 6);
                    pg2 pg2VarA9 = xu3Var.a(qnHx, 1.0f, true);
                    float fFloatValue9 = ((Number) ri2Var.getValue()).floatValue();
                    pt ptVar9 = dg2Var.c;
                    j30VarQ.e(511388516);
                    zI = j30VarQ.I(ri2Var) | j30VarQ.I(j81Var);
                    objB1 = j30VarQ.b0();
                    if (zI) {
                        objB1 = new jf2(ri2Var, j81Var);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new jf2(ri2Var, j81Var);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    cn4.a(fFloatValue9, (j81) objB1, pg2VarA9, false, ptVar9, 0, null, null, null, j30VarQ, 0, 488);
                    pq4.a(f9, j30VarQ, 6);
                    b(((Number) ptVar9.e()).floatValue(), j30VarQ, 0);
                }
            }
            O.g(j30VarQ, false, false, true, false);
            j30VarQ.R(false);
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new kf2(i, i2, pg2Var3, dg2Var, j81Var);
    }

    public static final void d(kj1<qe2> kj1Var, j81<? super ev3, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-550232863);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(kj1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(j81Var);
            Object objB0 = j30VarQ.b0();
            if (zI || objB0 == g30.QnHx.a) {
                objB0 = new LPt8Fixed(j81Var);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            vQgK.a((h81) objB0, null, X.m(j30VarQ, 521903608, new NUlFixed(kj1Var, j81Var, i2)), j30VarQ, 384, 2);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new YKK(kj1Var, j81Var, i);
    }

    public static final void e(re2 re2Var, j81<? super ev3, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(1225085689);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(re2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            pg2.QnHx qnHx = pg2.QnHx.w;
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(j81Var);
            Object objB0 = j30VarQ.b0();
            if (zI || objB0 == g30.QnHx.a) {
                objB0 = new auxFixed(j81Var);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            a_.b(hr.c(qnHx, false, (h81) objB0, 7), 0L, 0, null, 0.0f, X.m(j30VarQ, 1535296618, new T23(i2, re2Var, j81Var)), j30VarQ, 196992, 26);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new byN(i, re2Var, j81Var);
    }

    public static final void f(re2 re2Var, dg2 dg2Var, te2 te2Var, ne2 ne2Var, j81<? super ev3, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(1146211040);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(re2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(dg2Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.I(te2Var) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= j30VarQ.I(ne2Var) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 16384 : 8192;
        }
        int i3 = i2;
        if ((46811 & i3) == 9362 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            pg2.QnHx qnHx = pg2.QnHx.w;
            float f = 16;
            pg2 pg2VarV = ps0.V(qnHx, f, 0.0f, 2);
            j30VarQ.e(-483455358);
            rb2 rb2VarA = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx2 = a30.QnHx.b;
            sz szVarJ = S12N.j(pg2VarV);
            if (!(j30VarQ.a instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx2);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            hH.u(j30VarQ, rb2VarA, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -1163856341);
            Uff4.a(R.string.server_microphone_settings_title, qnHx, j30VarQ, 48, 0);
            pq4.c(f, j30VarQ, 6);
            int i4 = i3 >> 3;
            a(dg2Var, te2Var, j81Var, j30VarQ, (i4 & 112) | (i4 & 14) | ((i3 >> 6) & 896));
            j30VarQ.e(-1049640650);
            if (re2Var != null) {
                pq4.c(24, j30VarQ, 6);
                e(re2Var, j81Var, j30VarQ, (i3 & 14) | ((i3 >> 9) & 112));
            }
            j30VarQ.R(false);
            if (ne2Var != null) {
                pq4.c(24, j30VarQ, 6);
                int i5 = i3 >> 9;
                g(ne2Var, j81Var, j30VarQ, (i5 & 112) | (i5 & 14));
            }
            O.g(j30VarQ, false, false, true, false);
            j30VarQ.R(false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new EQ(re2Var, dg2Var, te2Var, ne2Var, j81Var, i);
    }

    public static final void g(ne2 ne2Var, j81<? super ev3, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(245675097);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(ne2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            a_.b(null, 0L, 0, null, 0.0f, X.m(j30VarQ, 1800832074, new FJCM(ne2Var, j81Var, i2)), j30VarQ, 196992, 27);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new PRnFixed(ne2Var, j81Var, i);
    }

    public static final void h(g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(-1004922504);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            float f = 16;
            wo1.QnHx qnHx = wo1.a;
            zx2 zx2Var = new zx2(f, f, f, f);
            j30VarQ.e(-483455358);
            rb2 rb2VarA = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx2 = a30.QnHx.b;
            sz szVarJ = S12N.j(zx2Var);
            if (!(j30VarQ.a instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx2);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            hH.u(j30VarQ, rb2VarA, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -1163856341);
            Uff4.a(R.string.server_microphone_settings_mode_title, null, j30VarQ, 0, 2);
            j30VarQ.R(false);
            j30VarQ.R(false);
            j30VarQ.R(true);
            j30VarQ.R(false);
            j30VarQ.R(false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new if2(i);
    }

    public static final void i(qe2 qe2Var, j81 j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(1298239001);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(qe2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            pg2.QnHx qnHx = pg2.QnHx.w;
            j30VarQ.e(511388516);
            boolean zI = j30VarQ.I(j81Var) | j30VarQ.I(qe2Var);
            Object objB0 = j30VarQ.b0();
            if (zI || objB0 == g30.QnHx.a) {
                objB0 = new lf2(j81Var, qe2Var);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            float f = 16;
            pg2 pg2VarF = gm4.f(ps0.T(hr.c(qnHx, false, (h81) objB0, 7), f));
            da.CQf cQf2 = One.QnHx.k;
            j30VarQ.e(693286680);
            rb2 rb2VarA = uu3.a(CZ9P.a, cQf2, j30VarQ);
            j30VarQ.e(-1323940314);
            jt4 jt4Var = r40.e;
            ij0 ij0Var = (ij0) j30VarQ.E(jt4Var);
            jt4 jt4Var2 = r40.k;
            jy1 jy1Var = (jy1) j30VarQ.E(jt4Var2);
            jt4 jt4Var3 = r40.o;
            ti5 ti5Var = (ti5) j30VarQ.E(jt4Var3);
            a30.e.getClass();
            yy1.QnHx qnHx2 = a30.QnHx.b;
            sz szVarJ = S12N.j(pg2VarF);
            jE<?> jEVar = j30VarQ.a;
            if (!(jEVar instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx2);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            a30.QnHx.F1 f1 = a30.QnHx.e;
            hH.u(j30VarQ, rb2VarA, f1);
            a30.QnHx.C0012QnHx c0012QnHx = a30.QnHx.d;
            hH.u(j30VarQ, ij0Var, c0012QnHx);
            a30.QnHx.CQf cQf3 = a30.QnHx.f;
            hH.u(j30VarQ, jy1Var, cQf3);
            a30.QnHx.NUlFixed nUl = a30.QnHx.g;
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, 2058660585, -678309503);
            if (!(((double) 1.0f) > 0.0d)) {
                throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
            }
            wo1.QnHx qnHx3 = wo1.a;
            mz1 mz1Var = new mz1(1.0f, true);
            j30VarQ.e(-483455358);
            rb2 rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var2 = (ij0) j30VarQ.E(jt4Var);
            jy1 jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
            ti5 ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
            sz szVarJ2 = S12N.j(mz1Var);
            if (!(jEVar instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx2);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf3, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
            String strX = hH.x(qe2Var.b, j30VarQ);
            jt4 jt4Var4 = sc5.a;
            j55.b(strX, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, XTd3.d(((rc5) j30VarQ.E(jt4Var4)).j), j30VarQ, 0, 0, 32766);
            pq4.c(4, j30VarQ, 6);
            j55.b(hH.x(qe2Var.c, j30VarQ), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(jt4Var4)).l, j30VarQ, 0, 0, 32766);
            O.g(j30VarQ, false, false, true, false);
            j30VarQ.R(false);
            uh3.a(qe2Var.d, null, ps0.X(qnHx, f, 0.0f, 0.0f, 0.0f, 14), false, null, null, j30VarQ, 432, 56);
            O.g(j30VarQ, false, false, true, false);
            j30VarQ.R(false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new mf2(qe2Var, j81Var, i);
    }

    public static final void j(te2 te2Var, j81 j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(1919087222);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(te2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            pg2.QnHx qnHx = pg2.QnHx.w;
            j30VarQ.e(-483455358);
            rb2 rb2VarA = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx2 = a30.QnHx.b;
            sz szVarJ = S12N.j(qnHx);
            if (!(j30VarQ.a instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx2);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            hH.u(j30VarQ, rb2VarA, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -1163856341);
            qu4.QnHx qnHx3 = qu4.a;
            Context context = kd.w;
            if (context == null) {
                ur1.e("context");
                throw null;
            }
            qu4.a.getClass();
            String strB = iZUl.b(qu4.QnHx.b, context, R.string.mic_noise_suppression_title);
            sz szVar = a10.a;
            Boolean boolValueOf = Boolean.valueOf(te2Var.a);
            qu4.QnHx qnHx4 = qu4.a;
            Context context2 = kd.w;
            if (context2 == null) {
                ur1.e("context");
                throw null;
            }
            qu4.a.getClass();
            String strB2 = iZUl.b(qu4.QnHx.b, context2, R.string.mic_noise_suppression_description);
            boolean z = te2Var.f;
            bd3 bd3Var = bd3.Full;
            j30VarQ.e(511388516);
            boolean zI = j30VarQ.I(te2Var) | j30VarQ.I(j81Var);
            Object objB0 = j30VarQ.b0();
            if (zI || objB0 == g30.QnHx.a) {
                objB0 = new sf2(te2Var, j81Var);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            oy4.a(strB, null, szVar, boolValueOf, strB2, null, false, z, bd3Var, (j81) objB0, j30VarQ, 100663680, 98);
            O.g(j30VarQ, false, false, true, false);
            j30VarQ.R(false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new tf2(te2Var, j81Var, i);
    }

    public static final void k(String str, String str2, g30 g30Var, int i) {
        int i2;
        String str3;
        j30 j30VarQ = g30Var.q(-1215679960);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(str2) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
            str3 = str2;
        } else {
            e40.CQf cQf = e40.a;
            float f = 16;
            pg2 pg2VarV = ps0.V(pg2.QnHx.w, f, 0.0f, 2);
            j30VarQ.e(-483455358);
            rb2 rb2VarA = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx = a30.QnHx.b;
            sz szVarJ = S12N.j(pg2VarV);
            if (!(j30VarQ.a instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            hH.u(j30VarQ, rb2VarA, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -1163856341);
            pq4.c(f, j30VarQ, 6);
            j55.b(str, null, 0L, 0L, null, x41.B, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).j, j30VarQ, (i2 & 14) | 196608, 0, 32734);
            j30VarQ = j30VarQ;
            pq4.c(4, j30VarQ, 6);
            str3 = str2;
            q70.a(X.m(j30VarQ, -516872131, new uf2(str3, i2)), j30VarQ, 6);
            j30VarQ.R(false);
            j30VarQ.R(false);
            j30VarQ.R(true);
            j30VarQ.R(false);
            j30VarQ.R(false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new vf2(str, str3, i);
    }

    public static final void l(int i, int i2, g30 g30Var, pg2 pg2Var, dg2 dg2Var, j81 j81Var) {
        pg2 pg2Var2;
        int i3;
        boolean z;
        boolean z2;
        j30 j30VarQ = g30Var.q(1560590871);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            pg2Var2 = pg2Var;
        } else if ((i & 14) == 0) {
            pg2Var2 = pg2Var;
            i3 = (j30VarQ.I(pg2Var2) ? 4 : 2) | i;
        } else {
            pg2Var2 = pg2Var;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= j30VarQ.I(dg2Var) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= j30VarQ.I(j81Var) ? 256 : 128;
        }
        int i5 = i3;
        if ((i5 & 731) == 146 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            pg2 pg2Var3 = i4 != 0 ? pg2.QnHx.w : pg2Var2;
            e40.CQf cQf = e40.a;
            int i6 = i5 & 14;
            j30VarQ.e(-483455358);
            CZ9P.EQ eq = CZ9P.c;
            da.QnHx qnHx = One.QnHx.m;
            rb2 rb2VarA = tv.a(eq, qnHx, j30VarQ);
            j30VarQ.e(-1323940314);
            jt4 jt4Var = r40.e;
            ij0 ij0Var = (ij0) j30VarQ.E(jt4Var);
            jt4 jt4Var2 = r40.k;
            jy1 jy1Var = (jy1) j30VarQ.E(jt4Var2);
            jt4 jt4Var3 = r40.o;
            ti5 ti5Var = (ti5) j30VarQ.E(jt4Var3);
            a30.e.getClass();
            yy1.QnHx qnHx2 = a30.QnHx.b;
            sz szVarJ = S12N.j(pg2Var3);
            int i7 = ((((i6 << 3) & 112) << 9) & 7168) | 6;
            jE<?> jEVar = j30VarQ.a;
            if (!(jEVar instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx2);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            a30.QnHx.F1 f1 = a30.QnHx.e;
            hH.u(j30VarQ, rb2VarA, f1);
            a30.QnHx.C0012QnHx c0012QnHx = a30.QnHx.d;
            hH.u(j30VarQ, ij0Var, c0012QnHx);
            a30.QnHx.CQf cQf2 = a30.QnHx.f;
            hH.u(j30VarQ, jy1Var, cQf2);
            a30.QnHx.NUlFixed nUl = a30.QnHx.g;
            szVarJ.invoke(sN.a(j30VarQ, ti5Var, nUl, j30VarQ), j30VarQ, Integer.valueOf((i7 >> 3) & 112));
            j30VarQ.e(2058660585);
            j30VarQ.e(-1163856341);
            if (((i7 >> 9) & 14 & 11) == 2 && j30VarQ.t()) {
                j30VarQ.x();
            } else if (((((i6 >> 6) & 112) | 6) & 81) == 16 && j30VarQ.t()) {
                j30VarQ.x();
            } else {
                qu4.QnHx qnHx3 = qu4.a;
                Context context = kd.w;
                if (context == null) {
                    ur1.e("context");
                    throw null;
                }
                qu4.a.getClass();
                String strB = iZUl.b(qu4.QnHx.b, context, R.string.volume_boost_title);
                sz szVar = a10.b;
                Boolean boolValueOf = Boolean.valueOf(dg2Var.a);
                qu4.QnHx qnHx4 = qu4.a;
                Context context2 = kd.w;
                if (context2 == null) {
                    ur1.e("context");
                    throw null;
                }
                qu4.a.getClass();
                qu4.QnHx.b.getClass();
                String string = context2.getResources().getString(R.string.volume_boost_description);
                j30VarQ.e(1157296644);
                boolean zI = j30VarQ.I(j81Var);
                Object objB0 = j30VarQ.b0();
                if (zI || objB0 == g30.QnHx.a) {
                    objB0 = new wf2(j81Var);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                oy4.a(strB, null, szVar, boolValueOf, string, null, false, false, null, (j81) objB0, j30VarQ, 384, 482);
                if (dg2Var.a) {
                    float f = 16;
                    wo1.QnHx qnHx5 = wo1.a;
                    zx2 zx2Var = new zx2(56, f, f, f);
                    j30VarQ.e(-483455358);
                    rb2 rb2VarA2 = tv.a(eq, qnHx, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0 ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1 jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    ti5 ti5Var2 = (ti5) j30VarQ.E(jt4Var3);
                    sz szVarJ2 = S12N.j(zx2Var);
                    if (!(jEVar instanceof jE)) {
                        fp1.c0();
                        throw null;
                    }
                    j30VarQ.s();
                    if (j30VarQ.K) {
                        j30VarQ.l(qnHx2);
                    } else {
                        j30VarQ.A();
                    }
                    j30VarQ.x = false;
                    Xs.c(0, szVarJ2, u40.b(j30VarQ, rb2VarA2, f1, j30VarQ, ij0Var2, c0012QnHx, j30VarQ, jy1Var2, cQf2, j30VarQ, ti5Var2, nUl, j30VarQ), j30VarQ, 2058660585, -1163856341);
                    q70.a(a10.c, j30VarQ, 6);
                    c(((i5 >> 3) & 14) | (i5 & 896), 2, j30VarQ, null, dg2Var, j81Var);
                    z = true;
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                    z2 = false;
                }
                O.g(j30VarQ, z2, z2, z, z2);
                j30VarQ.R(z2);
                pg2Var2 = pg2Var3;
            }
            z2 = false;
            z = true;
            O.g(j30VarQ, z2, z2, z, z2);
            j30VarQ.R(z2);
            pg2Var2 = pg2Var3;
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new xf2(i, i2, pg2Var2, dg2Var, j81Var);
    }

    public static final void m(ne2 ne2Var, j81 j81Var, g30 g30Var, int i) {
        int i2;
        String strB;
        j30 j30VarQ = g30Var.q(1001226876);
        int i3 = 2;
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(ne2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            kj1<le2> kj1Var = ne2Var.b;
            int size = kj1Var.size();
            boolean z = false;
            int i4 = 0;
            while (i4 < size) {
                le2 le2Var = kj1Var.get(i4);
                int iH = O.h(le2Var.a);
                String strB2 = null;
                if (iH == 0) {
                    qu4.QnHx qnHx = qu4.a;
                    Context context = kd.w;
                    if (context == null) {
                        ur1.e("context");
                        throw null;
                    }
                    qu4.a.getClass();
                    strB = iZUl.b(qu4.QnHx.b, context, R.string.automatic_gain_control_effect);
                } else if (iH == 1) {
                    qu4.QnHx qnHx2 = qu4.a;
                    Context context2 = kd.w;
                    if (context2 == null) {
                        ur1.e("context");
                        throw null;
                    }
                    qu4.a.getClass();
                    strB = iZUl.b(qu4.QnHx.b, context2, R.string.echo_cancellation_effect);
                } else {
                    if (iH != i3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    qu4.QnHx qnHx3 = qu4.a;
                    Context context3 = kd.w;
                    if (context3 == null) {
                        ur1.e("context");
                        throw null;
                    }
                    qu4.a.getClass();
                    strB = iZUl.b(qu4.QnHx.b, context3, R.string.noise_suppression_effect);
                }
                if (!le2Var.c) {
                    qu4.QnHx qnHx4 = qu4.a;
                    Context context4 = kd.w;
                    if (context4 == null) {
                        ur1.e("context");
                        throw null;
                    }
                    qu4.a.getClass();
                    strB2 = iZUl.b(qu4.QnHx.b, context4, R.string.not_available_effect);
                }
                boolean z2 = le2Var.c;
                boolean z3 = z2 && le2Var.b;
                sz szVarM = X.m(j30VarQ, 651872671, new yf2(le2Var));
                Boolean boolValueOf = Boolean.valueOf(z3);
                j30VarQ.e(511388516);
                boolean zI = j30VarQ.I(j81Var) | j30VarQ.I(le2Var);
                Object objB0 = j30VarQ.b0();
                if (zI || objB0 == g30.QnHx.a) {
                    objB0 = new zf2(j81Var, le2Var);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(z);
                int i5 = i4;
                int i6 = size;
                kj1<le2> kj1Var2 = kj1Var;
                oy4.a(strB, null, szVarM, boolValueOf, null, strB2, z2, false, null, (j81) objB0, j30VarQ, 384, 402);
                if (!ur1.a(wu.N0(ne2Var.b), le2Var)) {
                    w94.a(null, j30VarQ, 0, 1);
                }
                i4 = i5 + 1;
                z = false;
                i3 = 2;
                size = i6;
                kj1Var = kj1Var2;
            }
            e40.CQf cQf2 = e40.a;
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new ag2(ne2Var, j81Var, i);
    }

    public static final void n(wv wvVar, j81 j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-174094915);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(wvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            String strX = hH.x(R.string.server_microphone_settings_voice_communication_mode_title, j30VarQ);
            float f = 16;
            j55.b(kd.q(Th.j(m21.L, strX)), ps0.V(pg2.QnHx.w, f, 0.0f, 2), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) j30VarQ.E(sc5.a)).j, j30VarQ, 48, 0, 32764);
            pq4.c(8, j30VarQ, 6);
            pg2 pg2VarA = wvVar.a(One.QnHx.n);
            String strQ = kd.q(Th.j(m21.M, strX));
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(j81Var);
            Object objB0 = j30VarQ.b0();
            if (zI || objB0 == g30.QnHx.a) {
                objB0 = new bg2(j81Var);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            ti.b((h81) objB0, strQ, false, pg2VarA, j30VarQ, 0, 4);
            pq4.c(f, j30VarQ, 6);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new cg2(wvVar, j81Var, i);
    }
}
