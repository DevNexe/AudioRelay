package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wj1 {
    public static final jt4 a = new jt4(QnHx.w);

    public static final class CQf extends cx1 implements y81<pg2, g30, Integer, pg2> {
        public final /* synthetic */ uj1 w;
        public final /* synthetic */ wp1 x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(uj1 uj1Var, wp1 wp1Var) {
            super(3);
            this.w = uj1Var;
            this.x = wp1Var;
        }

        @Override // defpackage.y81
        public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            num.intValue();
            g30Var2.e(-353972293);
            uj1 uj1Var = this.w;
            if (uj1Var == null) {
                uj1Var = mo2.a;
            }
            vj1 vj1VarA = uj1Var.a(this.x, g30Var2);
            g30Var2.e(1157296644);
            boolean zI = g30Var2.I(vj1VarA);
            Object objF = g30Var2.f();
            if (zI || objF == g30.QnHx.a) {
                objF = new xj1(vj1VarA);
                g30Var2.B(objF);
            }
            g30Var2.G();
            xj1 xj1Var = (xj1) objF;
            g30Var2.G();
            return xj1Var;
        }
    }

    public static final class QnHx extends cx1 implements h81<uj1> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final /* bridge */ /* synthetic */ uj1 invoke() {
            return lg0.a;
        }
    }

    public static final pg2 a(pg2 pg2Var, wp1 wp1Var, uj1 uj1Var) {
        return f30.a(pg2Var, wo1.a, new CQf(uj1Var, wp1Var));
    }
}
