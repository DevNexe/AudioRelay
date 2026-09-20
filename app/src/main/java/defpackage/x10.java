package defpackage;

import com.azefsw.audioconnect.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class x10 {
    public static final sz a = X.n(-2078033056, QnHx.w, false);
    public static final sz b = X.n(-47416693, CQf.w, false);
    public static final sz c = X.n(-385397469, F1.w, false);
    public static final sz d = X.n(334616922, LPt8Fixed.w, false);

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
                q70.a(x10.a, g30Var2, 6);
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
                j55.b(hH.x(R.string.server_no_connections, g30Var2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) g30Var2.E(sc5.a)).j, g30Var2, 0, 0, 32766);
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
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 81) == 16 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                g30Var2.e(693286680);
                pg2.QnHx qnHx = pg2.QnHx.w;
                rb2 rb2VarA = uu3.a(CZ9P.a, One.QnHx.j, g30Var2);
                g30Var2.e(-1323940314);
                jt4 jt4Var = r40.e;
                ij0 ij0Var = (ij0) g30Var2.E(jt4Var);
                jt4 jt4Var2 = r40.k;
                jy1 jy1Var = (jy1) g30Var2.E(jt4Var2);
                jt4 jt4Var3 = r40.o;
                ti5 ti5Var = (ti5) g30Var2.E(jt4Var3);
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
                a30.QnHx.F1 f1 = a30.QnHx.e;
                hH.u(g30Var2, rb2VarA, f1);
                a30.QnHx.C0012QnHx c0012QnHx = a30.QnHx.d;
                hH.u(g30Var2, ij0Var, c0012QnHx);
                a30.QnHx.CQf cQf2 = a30.QnHx.f;
                hH.u(g30Var2, jy1Var, cQf2);
                a30.QnHx.NUlFixed nUl = a30.QnHx.g;
                qc0.c(0, szVarJ, bl2.b(g30Var2, ti5Var, nUl, g30Var2), g30Var2, 2058660585, -678309503);
                if (!(((double) 1.0f) > 0.0d)) {
                    throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
                }
                wo1.QnHx qnHx3 = wo1.a;
                mz1 mz1Var = new mz1(1.0f, true);
                g30Var2.e(-483455358);
                rb2 rb2VarA2 = tv.a(CZ9P.c, One.QnHx.m, g30Var2);
                g30Var2.e(-1323940314);
                ij0 ij0Var2 = (ij0) g30Var2.E(jt4Var);
                jy1 jy1Var2 = (jy1) g30Var2.E(jt4Var2);
                ti5 ti5Var2 = (ti5) g30Var2.E(jt4Var3);
                sz szVarJ2 = S12N.j(mz1Var);
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
                qc0.c(0, szVarJ2, Xs.b(g30Var2, g30Var2, rb2VarA2, f1, g30Var2, ij0Var2, c0012QnHx, g30Var2, jy1Var2, cQf2, g30Var2, ti5Var2, nUl, g30Var2), g30Var2, 2058660585, -1163856341);
                j55.b(hH.x(R.string.server_upgrade_title, g30Var2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, XTd3.d(((rc5) g30Var2.E(sc5.a)).g), g30Var2, 0, 0, 32766);
                float f = 16;
                pq4.c(f, g30Var2, 6);
                ix3.p(iE.h(), R.string.server_upgrade_feature_no_timer, g30Var2, 0);
                float f2 = 8;
                pq4.c(f2, g30Var2, 6);
                ix3.p(qLd.f(), R.string.server_upgrade_feature_multi_devices, g30Var2, 0);
                pq4.c(f2, g30Var2, 6);
                ix3.p(g7.c(), R.string.server_upgrade_feature_more, g30Var2, 0);
                g30Var2.G();
                g30Var2.G();
                g30Var2.H();
                g30Var2.G();
                g30Var2.G();
                da.CQf cQf3 = One.QnHx.k;
                wo1.QnHx qnHx4 = wo1.a;
                rh1.a(m21.b(), null, ps0.X(new th5(cQf3), 0.0f, 0.0f, f, 0.0f, 11), 0L, g30Var2, 48, 8);
                ex0.d(g30Var2);
            }
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements x81<g30, Integer, sd5> {
        public static final NUlFixed w = new NUlFixed();

        public NUlFixed() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
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
                float f = 24;
                wo1.QnHx qnHx = wo1.a;
                lm4 lm4Var = new lm4(f, f, f, f, true);
                ej1 ej1VarD = NRt.x;
                if (ej1VarD == null) {
                    ej1.QnHx qnHx2 = new ej1.QnHx("Filled.Stop");
                    int i = sg5.a;
                    jq4 jq4Var = new jq4(yu.b);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new uz2.YKK(6.0f, 6.0f));
                    arrayList.add(new uz2.PRnFixed(12.0f));
                    arrayList.add(new uz2.ta(12.0f));
                    arrayList.add(new uz2.LPt8Fixed(6.0f));
                    arrayList.add(uz2.CQf.c);
                    qnHx2.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", arrayList);
                    ej1VarD = qnHx2.d();
                    NRt.x = ej1VarD;
                }
                rh1.a(ej1VarD, hH.x(R.string.stop_button_description, g30Var2), lm4Var, 0L, g30Var2, 384, 8);
            }
            return sd5.a;
        }
    }

    public static final class YKK extends cx1 implements x81<g30, Integer, sd5> {
        public static final YKK w = new YKK();

        public YKK() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                g30Var2.e(-483455358);
                pg2.QnHx qnHx = pg2.QnHx.w;
                rb2 rb2VarA = tv.a(CZ9P.c, One.QnHx.m, g30Var2);
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
                g30Var2.e(-1163856341);
                ix3.l(new bv3.QnHx("My headset", true, true, false), y10.w, g30Var2, 48);
                g30Var2.G();
                g30Var2.G();
                g30Var2.H();
                g30Var2.G();
                g30Var2.G();
            }
            return sd5.a;
        }
    }

    static {
        X.n(-49553204, NUlFixed.w, false);
        X.n(-1303762274, YKK.w, false);
    }
}
