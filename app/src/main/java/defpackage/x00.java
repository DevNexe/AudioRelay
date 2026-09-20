package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x00 {
    public static final sz a = X.n(-863115410, QnHx.w, false);

    public static final class QnHx extends cx1 implements y81<m64, g30, Integer, sd5> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(3);
        }

        @Override // defpackage.y81
        public final sd5 invoke(m64 m64Var, g30 g30Var, Integer num) {
            m64 m64Var2 = m64Var;
            g30 g30Var2 = g30Var;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= g30Var2.I(m64Var2) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                g30Var2.e(-492369756);
                Object objF = g30Var2.f();
                if (objF == g30.QnHx.a) {
                    objF = new b31();
                    g30Var2.B(objF);
                }
                g30Var2.G();
                b31 b31Var = (b31) objF;
                pg2 pg2VarT = ps0.T(y31.a(d31.a(f30.a(ob.x(pg2.QnHx.w, m64Var2), wo1.a, new pw1(m64Var2)), b31Var)), 16);
                g30Var2.e(-483455358);
                rb2 rb2VarA = tv.a(CZ9P.c, One.QnHx.m, g30Var2);
                g30Var2.e(-1323940314);
                ij0 ij0Var = (ij0) g30Var2.E(r40.e);
                jy1 jy1Var = (jy1) g30Var2.E(r40.k);
                ti5 ti5Var = (ti5) g30Var2.E(r40.o);
                a30.e.getClass();
                yy1.QnHx qnHx = a30.QnHx.b;
                sz szVarJ = S12N.j(pg2VarT);
                if (!(g30Var2.v() instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                g30Var2.s();
                if (g30Var2.m()) {
                    g30Var2.l(qnHx);
                } else {
                    g30Var2.A();
                }
                g30Var2.u();
                hH.u(g30Var2, rb2VarA, a30.QnHx.e);
                hH.u(g30Var2, ij0Var, a30.QnHx.d);
                hH.u(g30Var2, jy1Var, a30.QnHx.f);
                qc0.c(0, szVarJ, bl2.b(g30Var2, ti5Var, a30.QnHx.g, g30Var2), g30Var2, 2058660585, -1163856341);
                wq0.d(sd5.a, new w00(b31Var, null), g30Var2);
                List list = (List) r22.a.getValue();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    n22 n22Var = (n22) list.get(i);
                    r22.c(n22Var, g30Var2, 0);
                    if (!ur1.a(n22Var, wu.N0((List) r22.a.getValue()))) {
                        float f = 24;
                        wo1.QnHx qnHx2 = wo1.a;
                        hH.i(new lm4(0.0f, f, 0.0f, f, 5), g30Var2, 6);
                    }
                }
                ex0.d(g30Var2);
                e40.CQf cQf2 = e40.a;
            }
            return sd5.a;
        }
    }
}
