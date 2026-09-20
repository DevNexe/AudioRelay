package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ju1 {
    public static final iu1 a = AY.f(QnHx.w);

    public static final class QnHx extends cx1 implements j81<kt1, sd5> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(kt1 kt1Var) {
            kt1Var.d = true;
            return sd5.a;
        }
    }

    public static final String a(Object obj) {
        String strA = nl3.a(obj.getClass()).a();
        return strA == null ? "" : strA;
    }
}
