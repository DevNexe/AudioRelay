package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d31 {
    public static final mg3<e31> a = new mg3<>(QnHx.w);

    public static final class CQf extends cx1 implements y81<pg2, g30, Integer, pg2> {
        public final /* synthetic */ b31 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(b31 b31Var) {
            super(3);
            this.w = b31Var;
        }

        @Override // defpackage.y81
        public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            num.intValue();
            g30Var2.e(-307396750);
            g30Var2.e(1157296644);
            b31 b31Var = this.w;
            boolean zI = g30Var2.I(b31Var);
            Object objF = g30Var2.f();
            if (zI || objF == g30.QnHx.a) {
                objF = new e31(b31Var);
                g30Var2.B(objF);
            }
            g30Var2.G();
            e31 e31Var = (e31) objF;
            g30Var2.G();
            return e31Var;
        }
    }

    public static final class QnHx extends cx1 implements h81<e31> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final /* bridge */ /* synthetic */ e31 invoke() {
            return null;
        }
    }

    public static final pg2 a(pg2 pg2Var, b31 b31Var) {
        return f30.a(pg2Var, wo1.a, new CQf(b31Var));
    }
}
