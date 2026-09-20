package defpackage;

import android.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class h00 {
    public static final sz a = X.n(1020327079, QnHx.w, false);

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
                j55.b(hH.x(R.string.cancel, g30Var2).toUpperCase(Locale.ROOT), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, g30Var2, 0, 0, 65534);
            }
            return sd5.a;
        }
    }
}
