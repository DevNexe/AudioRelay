package defpackage;

import android.content.Context;
import com.azefsw.audioconnect.R;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: loaded from: classes.dex */
public final class x71 {
    public static final lt0 a = us0.b(hH.E(RCHTTPStatusCodes.ERROR, 0, null, 6), 2).b(new lt0(new v95(null, new pm4(hH.E(RCHTTPStatusCodes.ERROR, 0, null, 6), new it0(F1.w)), null, null, 13)));

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ JBK6 w;
        public final /* synthetic */ x81<g30, Integer, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(JBK6 jbk6, x81<? super g30, ? super Integer, sd5> x81Var, int i) {
            super(2);
            this.w = jbk6;
            this.x = x81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            x71.a(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements j81<Integer, Integer> {
        public static final F1 w = new F1();

        public F1() {
            super(1);
        }

        @Override // defpackage.j81
        public final Integer invoke(Integer num) {
            return Integer.valueOf(num.intValue() / 2);
        }
    }

    public static final class LPt8Fixed extends cx1 implements j81<d71, sd5> {
        public final /* synthetic */ g81 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(g81 g81Var) {
            super(1);
            this.w = g81Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.j81
        public final sd5 invoke(d71 d71Var) {
            this.w.a.q((Inputs) d71Var);
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(int i) {
            super(2);
            this.w = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            x71.b(g30Var, this.w | 1);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements y81<wv, g30, Integer, sd5> {
        public final /* synthetic */ x81<g30, Integer, sd5> w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(int i, x81 x81Var) {
            super(3);
            this.w = x81Var;
            this.x = i;
        }

        @Override // defpackage.y81
        public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 81) == 16 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                this.w.invoke(g30Var2, Integer.valueOf((this.x >> 3) & 14));
            }
            return sd5.a;
        }
    }

    public static final class T23 extends cx1 implements y81<lcO, g30, Integer, sd5> {
        public final /* synthetic */ e71 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public T23(e71 e71Var) {
            super(3);
            this.w = e71Var;
        }

        @Override // defpackage.y81
        public final sd5 invoke(lcO lco, g30 g30Var, Integer num) {
            num.intValue();
            e40.CQf cQf = e40.a;
            pc0.b(this.w.a, null, hH.E(RCHTTPStatusCodes.ERROR, 0, null, 6), s00.a, g30Var, 3456, 2);
            return sd5.a;
        }
    }

    public static final class YKK extends cx1 implements y81<lcO, g30, Integer, sd5> {
        public final /* synthetic */ j81<d71, sd5> w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public YKK(int i, j81 j81Var) {
            super(3);
            this.w = j81Var;
            this.x = i;
        }

        @Override // defpackage.y81
        public final sd5 invoke(lcO lco, g30 g30Var, Integer num) {
            num.intValue();
            e40.CQf cQf = e40.a;
            int i = (this.x >> 3) & 14;
            x71.h(this.w, g30Var, i);
            return sd5.a;
        }
    }

    public static final class auxFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ e71 w;
        public final /* synthetic */ j81<d71, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public auxFixed(e71 e71Var, j81<? super d71, sd5> j81Var, int i) {
            super(2);
            this.w = e71Var;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            x71.c(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class byN extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ e71 w;
        public final /* synthetic */ pg2 x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public byN(e71 e71Var, pg2 pg2Var, int i) {
            super(2);
            this.w = e71Var;
            this.x = pg2Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            x71.d(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final void a(JBK6 jbk6, x81<? super g30, ? super Integer, sd5> x81Var, g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(-677264451);
        e40.CQf cQf = e40.a;
        int iH = O.h(jbk6.b);
        if (iH == 0) {
            j30VarQ.e(1973657727);
            j30VarQ.e(733328855);
            pg2.QnHx qnHx = pg2.QnHx.w;
            rb2 rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
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
            hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -2137368960);
            fc2.b((i >> 3) & 14, x81Var, j30VarQ, false, false, true);
            j30VarQ.R(false);
            j30VarQ.R(false);
            j30VarQ.R(false);
        } else if (iH != 1) {
            j30VarQ.e(1973657809);
            j30VarQ.R(false);
        } else {
            j30VarQ.e(1973657782);
            a_.b(null, 0L, 0.0f, null, 0.0f, X.m(j30VarQ, 408794347, new QnHx(i, x81Var)), j30VarQ, 196608, 31);
            j30VarQ.R(false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(jbk6, x81Var, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(1845324025);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(773894976);
            j30VarQ.e(-492369756);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (objB0 == c0132QnHx) {
                s40 s40Var = new s40(wq0.i(j30VarQ));
                j30VarQ.F0(s40Var);
                objB0 = s40Var;
            }
            j30VarQ.R(false);
            ua0 ua0Var = ((s40) objB0).w;
            j30VarQ.R(false);
            Context context = (Context) j30VarQ.E(Ll.b);
            bm2 bm2Var = (bm2) j30VarQ.E(u42.a);
            j30VarQ.e(511388516);
            boolean zI = j30VarQ.I(ua0Var) | j30VarQ.I(context);
            Object objB1 = j30VarQ.b0();
            if (zI || objB1 == c0132QnHx) {
                Wu5C wu5C = Wu5C.b;
                if (wu5C == null) {
                    ur1.e("INSTANCE");
                    throw null;
                }
                objB1 = (g81) ((y81) wu5C.a.c).invoke(context, bm2Var, ua0Var);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            g81 g81Var = (g81) objB1;
            e71 e71Var = (e71) ps0.t(g81Var.a.o(), j30VarQ).getValue();
            j30VarQ.e(1157296644);
            boolean zI2 = j30VarQ.I(g81Var);
            Object objB2 = j30VarQ.b0();
            if (zI2 || objB2 == c0132QnHx) {
                objB2 = new LPt8Fixed(g81Var);
                j30VarQ.F0(objB2);
            }
            j30VarQ.R(false);
            c(e71Var, (j81) objB2, j30VarQ, 0);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new NUlFixed(i);
    }

    public static final void c(e71 e71Var, j81<? super d71, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(814842815);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(e71Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            pg2.QnHx qnHx = pg2.QnHx.w;
            pg2 pg2VarX = ob.x(gm4.c, ob.w(0, j30VarQ, 1));
            da.QnHx qnHx2 = One.QnHx.n;
            j30VarQ.e(-483455358);
            rb2 rb2VarA = tv.a(CZ9P.c, qnHx2, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx3 = a30.QnHx.b;
            sz szVarJ = S12N.j(pg2VarX);
            if (!(j30VarQ.a instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx3);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            hH.u(j30VarQ, rb2VarA, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -1163856341);
            zv zvVar = zv.a;
            float f = 48;
            hH.i(gm4.g(qnHx, f), j30VarQ, 6);
            float f2 = RCHTTPStatusCodes.UNSUCCESSFUL;
            d(e71Var, gm4.j(qnHx, 0.0f, 0.0f, f2, 0.0f, 11), j30VarQ, 48 | (i3 & 14));
            hH.i(gm4.g(qnHx, 24), j30VarQ, 6);
            hH.i(zvVar.b(true), j30VarQ, 0);
            CO.b(zvVar, e71Var.b, gm4.j(qnHx, 0.0f, 0.0f, f2, 0.0f, 11), a, null, null, X.m(j30VarQ, -1998174067, new YKK(i3, j81Var)), j30VarQ, 1576326, 24);
            hH.i(gm4.g(qnHx, f), j30VarQ, 6);
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
        tk3VarU.d = new auxFixed(e71Var, j81Var, i);
    }

    public static final void d(e71 e71Var, pg2 pg2Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-1343174754);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(e71Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(pg2Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            CO.c(true, pg2Var, a, null, null, X.m(j30VarQ, -2028396938, new T23(e71Var)), j30VarQ, (i2 & 112) | 196998, 24);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new byN(e71Var, pg2Var, i);
    }

    public static final void e(g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(657856445);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            float f = 100;
            wo1.QnHx qnHx = wo1.a;
            a_.b(new lm4(0.0f, f, 0.0f, f, 5), 0L, 0.0f, null, 0.0f, s00.c, j30VarQ, 196614, 30);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new y71(i);
    }

    public static final void f(g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(1707236811);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(-483455358);
            pg2.QnHx qnHx = pg2.QnHx.w;
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
            xj4.a(gm4.j(gm4.a, 0.0f, 100, 0.0f, 0.0f, 13), j30VarQ, 6, 0);
            hH.i(gm4.g(qnHx, 16), j30VarQ, 6);
            float f = 10;
            xj4.b(null, f, 140, j30VarQ, 432, 1);
            hH.i(gm4.g(qnHx, 8), j30VarQ, 6);
            xj4.b(null, f, 80, j30VarQ, 432, 1);
            O.g(j30VarQ, false, false, true, false);
            j30VarQ.R(false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new z71(i);
    }

    public static final void g(JBK6 jbk6, g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(1804975155);
        e40.CQf cQf = e40.a;
        a(jbk6, X.m(j30VarQ, -1028421292, new b81(jbk6)), j30VarQ, 56);
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new c81(jbk6, i);
    }

    public static final void h(j81 j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(893086945);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(j81Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(-483455358);
            pg2.QnHx qnHx = pg2.QnHx.w;
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
            hx0 hx0Var = gm4.a;
            String strX = hH.x(R.string.ads_remove_button, j30VarQ);
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(j81Var);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                objB0 = new d81(j81Var);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            ti.d((h81) objB0, strX, false, hx0Var, j30VarQ, 3072, 4);
            hH.i(gm4.g(qnHx, 8), j30VarQ, 6);
            String strX2 = hH.x(R.string.ads_close_button, j30VarQ);
            j30VarQ.e(1157296644);
            boolean zI2 = j30VarQ.I(j81Var);
            Object objB1 = j30VarQ.b0();
            if (zI2 || objB1 == c0132QnHx) {
                objB1 = new e81(j81Var);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            ti.b((h81) objB1, strX2, false, hx0Var, j30VarQ, 3072, 4);
            O.g(j30VarQ, false, false, true, false);
            j30VarQ.R(false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new f81(i, j81Var);
    }
}
