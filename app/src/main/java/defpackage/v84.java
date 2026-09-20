package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v84 {
    public static final ry4 a = new ry4(QnHx.w);

    public static final class QnHx extends cx1 implements h81<pl3> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final pl3 invoke() {
            return new pl3("[0-9]+\\.[0-9]+\\.[0-9]+");
        }
    }

    public static final boolean a(String str, String str2) {
        ry4 ry4Var = a;
        if (!((pl3) ry4Var.getValue()).w.matcher(str).matches()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((pl3) ry4Var.getValue()).w.matcher(str2).matches()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        List listP = mv4.P(str, new char[]{'.'});
        List listP2 = mv4.P(str2, new char[]{'.'});
        for (int i = 0; i < 3; i++) {
            int i2 = Integer.parseInt((String) listP.get(i));
            int i3 = Integer.parseInt((String) listP2.get(i));
            if (i2 != i3) {
                return i2 > i3;
            }
        }
        return true;
    }
}
