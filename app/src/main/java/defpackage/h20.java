package defpackage;

import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class h20 {
    public static final sz a = X.n(1296599924, QnHx.w, false);
    public static final sz b = X.n(1564276265, CQf.w, false);

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
                j55.b(hH.x(R.string.setup_card_get_link_button, g30Var2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, g30Var2, 0, 0, 65534);
            }
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements x81<g30, Integer, sd5> {
        public static final F1 w = new F1();

        public F1() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                ti4.a(null, i20.w, g30Var2, 48, 1);
            }
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements y81<wu3, g30, Integer, sd5> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(3);
        }

        @Override // defpackage.y81
        public final sd5 invoke(wu3 wu3Var, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 81) == 16 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                j55.b(hH.x(R.string.dismiss_button, g30Var2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, g30Var2, 0, 0, 65534);
            }
            return sd5.a;
        }
    }

    static {
        X.n(-1772699417, F1.w, false);
    }
}
