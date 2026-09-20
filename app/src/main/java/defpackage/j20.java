package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j20 {
    public static final sz a = X.n(996639038, QnHx.w, false);

    public static final class QnHx extends cx1 implements y81<rn4, g30, Integer, sd5> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(3);
        }

        @Override // defpackage.y81
        public final sd5 invoke(rn4 rn4Var, g30 g30Var, Integer num) {
            rn4 rn4Var2 = rn4Var;
            g30 g30Var2 = g30Var;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= g30Var2.I(rn4Var2) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && g30Var2.t()) {
                g30Var2.x();
            } else {
                jo4.b(rn4Var2, null, false, null, 0L, 0L, 0L, 0.0f, g30Var2, iIntValue & 14, 254);
            }
            return sd5.a;
        }
    }
}
