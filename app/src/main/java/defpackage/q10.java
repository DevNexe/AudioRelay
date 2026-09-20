package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q10 {
    public static final sz a = X.n(1639436282, QnHx.w, false);
    public static final sz b = X.n(-1008500670, CQf.w, false);

    public static final class CQf extends cx1 implements y81<x81<? super g30, ? super Integer, ? extends sd5>, g30, Integer, sd5> {
        public static final CQf w = new CQf();

        public CQf() {
            super(3);
        }

        @Override // defpackage.y81
        public final sd5 invoke(x81<? super g30, ? super Integer, ? extends sd5> x81Var, g30 g30Var, Integer num) {
            x81<? super g30, ? super Integer, ? extends sd5> x81Var2 = x81Var;
            g30 g30Var2 = g30Var;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= g30Var2.I(x81Var2) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                q70.a(x81Var2, g30Var2, iIntValue & 14);
            }
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements y81<x81<? super g30, ? super Integer, ? extends sd5>, g30, Integer, sd5> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(3);
        }

        @Override // defpackage.y81
        public final sd5 invoke(x81<? super g30, ? super Integer, ? extends sd5> x81Var, g30 g30Var, Integer num) {
            x81<? super g30, ? super Integer, ? extends sd5> x81Var2 = x81Var;
            g30 g30Var2 = g30Var;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= g30Var2.I(x81Var2) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                q70.a(x81Var2, g30Var2, iIntValue & 14);
            }
            return sd5.a;
        }
    }
}
