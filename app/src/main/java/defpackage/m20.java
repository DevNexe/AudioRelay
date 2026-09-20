package defpackage;

import android.content.Context;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class m20 {
    public static final sz a = X.n(337375090, QnHx.w, false);
    public static final sz b = X.n(370090233, CQf.w, false);

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
                qu4.QnHx qnHx = qu4.a;
                Context context = kd.w;
                if (context == null) {
                    ur1.e("context");
                    throw null;
                }
                qu4.a.getClass();
                j55.b(iZUl.b(qu4.QnHx.b, context, R.string.error_card_help_title), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) g30Var2.E(sc5.a)).j, g30Var2, 0, 0, 32766);
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
                ej1 ej1VarD = tt0.w;
                if (ej1VarD == null) {
                    ej1.QnHx qnHx = new ej1.QnHx("Outlined.ErrorOutline");
                    int i = sg5.a;
                    jq4 jq4Var = new jq4(yu.b);
                    le3 le3Var = new le3();
                    le3Var.i(11.0f, 15.0f);
                    le3Var.f(2.0f);
                    le3Var.n(2.0f);
                    le3Var.f(-2.0f);
                    le3Var.n(-2.0f);
                    le3Var.b();
                    le3Var.i(11.0f, 7.0f);
                    le3Var.f(2.0f);
                    le3Var.n(6.0f);
                    le3Var.f(-2.0f);
                    le3Var.g(11.0f, 7.0f);
                    le3Var.b();
                    le3Var.i(11.99f, 2.0f);
                    le3Var.c(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                    le3Var.k(4.47f, 10.0f, 9.99f, 10.0f);
                    le3Var.c(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
                    le3Var.j(17.52f, 2.0f, 11.99f, 2.0f);
                    le3Var.b();
                    le3Var.i(12.0f, 20.0f);
                    le3Var.d(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
                    le3Var.k(3.58f, -8.0f, 8.0f, -8.0f);
                    le3Var.k(8.0f, 3.58f, 8.0f, 8.0f);
                    le3Var.k(-3.58f, 8.0f, -8.0f, 8.0f);
                    le3Var.b();
                    qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
                    ej1VarD = qnHx.d();
                    tt0.w = ej1VarD;
                }
                rh1.a(ej1VarD, null, null, 0L, g30Var2, 48, 12);
            }
            return sd5.a;
        }
    }
}
