package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f30 {
    public static final QnHx a = QnHx.w;
    public static final CQf b = CQf.w;

    public static final class CQf extends cx1 implements y81<c31, g30, Integer, e31> {
        public static final CQf w = new CQf();

        public CQf() {
            super(3);
        }

        @Override // defpackage.y81
        public final e31 invoke(c31 c31Var, g30 g30Var, Integer num) {
            c31 c31Var2 = c31Var;
            g30 g30Var2 = g30Var;
            num.intValue();
            g30Var2.e(945678692);
            g30Var2.e(1157296644);
            boolean zI = g30Var2.I(c31Var2);
            Object objF = g30Var2.f();
            if (zI || objF == g30.QnHx.a) {
                objF = new e31(c31Var2.L());
                g30Var2.B(objF);
            }
            g30Var2.G();
            e31 e31Var = (e31) objF;
            g30Var2.G();
            return e31Var;
        }
    }

    public static final class F1 extends cx1 implements j81<pg2.CQf, Boolean> {
        public static final F1 w = new F1();

        public F1() {
            super(1);
        }

        @Override // defpackage.j81
        public final Boolean invoke(pg2.CQf cQf) {
            pg2.CQf cQf2 = cQf;
            return Boolean.valueOf(((cQf2 instanceof c30) || (cQf2 instanceof e21) || (cQf2 instanceof c31)) ? false : true);
        }
    }

    public static final class LPt8Fixed extends cx1 implements x81<pg2, pg2.CQf, pg2> {
        public final /* synthetic */ g30 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(g30 g30Var) {
            super(2);
            this.w = g30Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.x81
        public final pg2 invoke(pg2 pg2Var, pg2.CQf cQf) {
            pg2 pg2VarY;
            pg2 pg2VarY2;
            pg2 pg2Var2 = pg2Var;
            pg2.CQf cQf2 = cQf;
            boolean z = cQf2 instanceof c30;
            g30 g30Var = this.w;
            if (z) {
                y81<pg2, g30, Integer, pg2> y81Var = ((c30) cQf2).x;
                sb5.d(3, y81Var);
                pg2VarY2 = f30.c(g30Var, y81Var.invoke(pg2.QnHx.w, g30Var, 0));
            } else {
                if (cQf2 instanceof e21) {
                    QnHx qnHx = f30.a;
                    sb5.d(3, qnHx);
                    pg2VarY = cQf2.y((pg2) qnHx.invoke(cQf2, g30Var, 0));
                } else {
                    pg2VarY = cQf2;
                }
                if (cQf2 instanceof c31) {
                    CQf cQf3 = f30.b;
                    sb5.d(3, cQf3);
                    pg2VarY2 = pg2VarY.y((pg2) cQf3.invoke(cQf2, g30Var, 0));
                } else {
                    pg2VarY2 = pg2VarY;
                }
            }
            return pg2Var2.y(pg2VarY2);
        }
    }

    public static final class QnHx extends cx1 implements y81<e21, g30, Integer, i21> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(3);
        }

        @Override // defpackage.y81
        public final i21 invoke(e21 e21Var, g30 g30Var, Integer num) {
            e21 e21Var2 = e21Var;
            g30 g30Var2 = g30Var;
            num.intValue();
            g30Var2.e(-1790596922);
            g30Var2.e(1157296644);
            boolean zI = g30Var2.I(e21Var2);
            Object objF = g30Var2.f();
            if (zI || objF == g30.QnHx.a) {
                objF = new i21(new e30(e21Var2));
                g30Var2.B(objF);
            }
            g30Var2.G();
            i21 i21Var = (i21) objF;
            wq0.h(new d30(i21Var), g30Var2);
            g30Var2.G();
            return i21Var;
        }
    }

    public static final pg2 a(pg2 pg2Var, j81<? super yo1, sd5> j81Var, y81<? super pg2, ? super g30, ? super Integer, ? extends pg2> y81Var) {
        return pg2Var.y(new c30(j81Var, y81Var));
    }

    public static final pg2 c(g30 g30Var, pg2 pg2Var) {
        if (pg2Var.B(F1.w)) {
            return pg2Var;
        }
        g30Var.e(1219399079);
        pg2 pg2Var2 = (pg2) pg2Var.m0(pg2.QnHx.w, new LPt8Fixed(g30Var));
        g30Var.G();
        return pg2Var2;
    }
}
