package defpackage;

import android.content.Context;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class o10 {
    public static final sz a = X.n(344218154, QnHx.w, false);
    public static final sz b = X.n(-2084211738, CQf.w, false);
    public static final sz c = X.n(-2135971409, F1.w, false);
    public static final sz d = X.n(-905614257, LPt8Fixed.w, false);
    public static final sz e = X.n(697144821, NUlFixed.w, false);

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public static final CQf w = new CQf();

        public CQf() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                ix4.a(null, null, 0L, 0L, null, 0.0f, o10.a, g30Var2, 1572864, 63);
            }
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements y81<wv, g30, Integer, sd5> {
        public static final F1 w = new F1();

        public F1() {
            super(3);
        }

        @Override // defpackage.y81
        public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 81) == 16 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                da.CQf cQf2 = One.QnHx.k;
                g30Var2.e(693286680);
                pg2.QnHx qnHx = pg2.QnHx.w;
                rb2 rb2VarA = uu3.a(CZ9P.a, cQf2, g30Var2);
                g30Var2.e(-1323940314);
                ij0 ij0Var = (ij0) g30Var2.E(r40.e);
                jy1 jy1Var = (jy1) g30Var2.E(r40.k);
                ti5 ti5Var = (ti5) g30Var2.E(r40.o);
                a30.e.getClass();
                yy1.QnHx qnHx2 = a30.QnHx.b;
                sz szVarJ = S12N.j(qnHx);
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
                hH.u(g30Var2, rb2VarA, a30.QnHx.e);
                hH.u(g30Var2, ij0Var, a30.QnHx.d);
                hH.u(g30Var2, jy1Var, a30.QnHx.f);
                szVarJ.invoke(bl2.b(g30Var2, ti5Var, a30.QnHx.g, g30Var2), g30Var2, 0);
                g30Var2.e(2058660585);
                g30Var2.e(-678309503);
                rh1.a(Th.k(), null, null, 0L, g30Var2, 48, 12);
                hH.i(gm4.k(qnHx, 16), g30Var2, 6);
                j55.b(hH.x(R.string.premium_pending_purchase_warning, g30Var2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) g30Var2.E(sc5.a)).j, g30Var2, 0, 0, 32766);
                ex0.d(g30Var2);
            }
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements y81<wv, g30, Integer, sd5> {
        public static final LPt8Fixed w = new LPt8Fixed();

        public LPt8Fixed() {
            super(3);
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
                j55.b(hH.x(R.string.premium_is_premium_congratulations, g30Var2), wvVar2.a(One.QnHx.n), 0L, 0L, null, null, null, 0L, null, new q15(3), 0L, 0, false, 0, null, ((rc5) g30Var2.E(sc5.a)).h, g30Var2, 0, 0, 32252);
            }
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements y81<wv, g30, Integer, sd5> {
        public static final NUlFixed w = new NUlFixed();

        public NUlFixed() {
            super(3);
        }

        @Override // defpackage.y81
        public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 81) == 16 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                j55.b(hH.x(R.string.premium_subscription_disclaimer, g30Var2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) g30Var2.E(sc5.a)).j, g30Var2, 0, 0, 32766);
            }
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(2);
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
                g30Var2.e(693286680);
                rb2 rb2VarA = uu3.a(CZ9P.a, One.QnHx.j, g30Var2);
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
                hH.u(g30Var2, rb2VarA, a30.QnHx.e);
                hH.u(g30Var2, ij0Var, a30.QnHx.d);
                hH.u(g30Var2, jy1Var, a30.QnHx.f);
                qc0.c(0, szVarJ, bl2.b(g30Var2, ti5Var, a30.QnHx.g, g30Var2), g30Var2, 2058660585, -678309503);
                float f2 = 24;
                ff3.a(2, 390, 2, 0L, g30Var2, new lm4(f2, f2, f2, f2, true));
                hH.i(new lm4(f, 0.0f, f, 0.0f, 10), g30Var2, 6);
                th5 th5Var = new th5(One.QnHx.k);
                qu4.QnHx qnHx3 = qu4.a;
                Context context = kd.w;
                if (context == null) {
                    ur1.e("context");
                    throw null;
                }
                qu4.a.getClass();
                j55.b(iZUl.b(qu4.QnHx.b, context, R.string.generic_loading), th5Var, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) g30Var2.E(sc5.a)).j, g30Var2, 0, 0, 32764);
                ex0.d(g30Var2);
            }
            return sd5.a;
        }
    }
}
