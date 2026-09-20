package defpackage;

import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class u00 {
    public static final sz a = X.n(-891386072, QnHx.w, false);

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
                zr1.c(v00.w, g30Var2, 6);
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
                j55.b(hH.x(R.string.intro_get_started_button, g30Var2), null, 0L, 0L, null, null, null, 0L, null, new q15(3), 0L, 0, false, 0, null, null, g30Var2, 0, 0, 65022);
            }
            return sd5.a;
        }
    }

    static {
        X.n(651927837, CQf.w, false);
    }
}
