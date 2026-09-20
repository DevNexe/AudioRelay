package defpackage;

import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class s00 {
    public static final sz a = X.n(1090891077, QnHx.w, false);
    public static final sz b = X.n(2134465529, CQf.w, false);
    public static final sz c = X.n(-1568830418, F1.w, false);

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
                j55.b(hH.x(R.string.ads_no_ads_error, g30Var2), null, 0L, 0L, null, x41.B, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) g30Var2.E(sc5.a)).j, g30Var2, 196608, 0, 32734);
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
                q70.a(s00.b, g30Var2, 6);
            }
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements y81<b71, g30, Integer, sd5> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(3);
        }

        @Override // defpackage.y81
        public final sd5 invoke(b71 b71Var, g30 g30Var, Integer num) {
            b71 b71Var2 = b71Var;
            g30 g30Var2 = g30Var;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= g30Var2.I(b71Var2) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                if (ur1.a(b71Var2, b71.QnHx.a)) {
                    g30Var2.e(1935263370);
                    x71.e(g30Var2, 0);
                    g30Var2.G();
                } else if (b71Var2 instanceof b71.CQf) {
                    g30Var2.e(1935263443);
                    x71.g(((b71.CQf) b71Var2).a, g30Var2, 8);
                    g30Var2.G();
                } else if (ur1.a(b71Var2, b71.F1.a)) {
                    g30Var2.e(1935263529);
                    x71.f(g30Var2, 0);
                    g30Var2.G();
                } else {
                    g30Var2.e(1935263555);
                    g30Var2.G();
                }
            }
            return sd5.a;
        }
    }
}
