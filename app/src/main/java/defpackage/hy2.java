package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hy2 {
    public static final QnHx a = QnHx.w;

    public static final class QnHx extends cx1 implements y81<zo4, Integer, Integer, Integer> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(3);
        }

        @Override // defpackage.y81
        public final Integer invoke(zo4 zo4Var, Integer num, Integer num2) {
            int iIntValue = num.intValue();
            return Integer.valueOf(AY.o(AY.o(num2.intValue(), iIntValue - 1, iIntValue + 1), 0, zo4Var.h() - 1));
        }
    }
}
