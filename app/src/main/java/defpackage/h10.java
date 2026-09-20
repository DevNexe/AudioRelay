package defpackage;

import com.azefsw.audioconnect.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h10 {
    public static final sz a = X.n(-1979153382, QnHx.w, false);
    public static final sz b = X.n(-2069372687, CQf.w, false);

    public static final class CQf extends cx1 implements y81<wu3, g30, Integer, sd5> {
        public static final CQf w = new CQf();

        public CQf() {
            super(3);
        }

        @Override // defpackage.y81
        public final sd5 invoke(wu3 wu3Var, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 81) == 16 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                j55.b(hH.x(R.string.premium_retry_button, g30Var2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, g30Var2, 0, 0, 65534);
            }
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements y81<lcO, g30, Integer, sd5> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(3);
        }

        @Override // defpackage.y81
        public final sd5 invoke(lcO lco, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            num.intValue();
            e40.CQf cQf = e40.a;
            pg2.QnHx qnHx = pg2.QnHx.w;
            pg2 pg2VarK = fp1.K(qnHx, mu3.a);
            jt4 jt4Var = sv.a;
            pg2 pg2VarK2 = ps0.k(pg2VarK, ((rv) g30Var2.E(jt4Var)).g(), el3.a);
            g30Var2.e(733328855);
            rb2 rb2VarC = fe.c(One.QnHx.a, false, g30Var2);
            g30Var2.e(-1323940314);
            ij0 ij0Var = (ij0) g30Var2.E(r40.e);
            jy1 jy1Var = (jy1) g30Var2.E(r40.k);
            ti5 ti5Var = (ti5) g30Var2.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx2 = a30.QnHx.b;
            sz szVarJ = S12N.j(pg2VarK2);
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
            qc0.c(0, szVarJ, bl2.b(g30Var2, ti5Var, a30.QnHx.g, g30Var2), g30Var2, 2058660585, -2137368960);
            pg2 pg2VarT = ps0.T(gm4.h(qnHx, 24), 4);
            ej1 ej1VarD = ko6.w;
            if (ej1VarD == null) {
                ej1.QnHx qnHx3 = new ej1.QnHx("Outlined.Check");
                int i = sg5.a;
                jq4 jq4Var = new jq4(yu.b);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new uz2.YKK(9.0f, 16.17f));
                arrayList.add(new uz2.NUlFixed(4.83f, 12.0f));
                arrayList.add(new uz2.y(-1.42f, 1.41f));
                arrayList.add(new uz2.NUlFixed(9.0f, 19.0f));
                arrayList.add(new uz2.NUlFixed(21.0f, 7.0f));
                arrayList.add(new uz2.y(-1.41f, -1.41f));
                arrayList.add(new uz2.NUlFixed(9.0f, 16.17f));
                arrayList.add(uz2.CQf.c);
                qnHx3.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", arrayList);
                ej1VarD = qnHx3.d();
                ko6.w = ej1VarD;
            }
            rh1.a(ej1VarD, null, pg2VarT, ((rv) g30Var2.E(jt4Var)).d(), g30Var2, 432, 0);
            ex0.d(g30Var2);
            return sd5.a;
        }
    }
}
