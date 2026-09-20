package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y84 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class QnHx<T> extends cx1 implements h81<T> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final T invoke() {
            return null;
        }
    }

    public static final <T> T a(x84 x84Var, n94<T> n94Var) {
        T t = (T) x84Var.w.get(n94Var);
        if (t != null) {
            return t;
        }
        QnHx.w.getClass();
        return null;
    }
}
