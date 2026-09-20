package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class oc0 {
    public static final /* synthetic */ int a = 0;

    public static final class CQf extends oc0 {
        public static final /* synthetic */ int b = 0;

        static {
            new CQf();
        }

        @Override // defpackage.oc0
        public final int a(int i, jy1 jy1Var) {
            if (jy1Var == jy1.Ltr) {
                return i;
            }
            return 0;
        }
    }

    public static final class F1 extends oc0 {
        public final One.CQf b;

        public F1(One.CQf cQf) {
            this.b = cQf;
        }

        @Override // defpackage.oc0
        public final int a(int i, jy1 jy1Var) {
            return this.b.a(0, i, jy1Var);
        }
    }

    public static final class LPt8Fixed extends oc0 {
        public static final /* synthetic */ int b = 0;

        static {
            new LPt8Fixed();
        }

        @Override // defpackage.oc0
        public final int a(int i, jy1 jy1Var) {
            if (jy1Var == jy1.Ltr) {
                return 0;
            }
            return i;
        }
    }

    public static final class NUlFixed extends oc0 {
        public final One.F1 b;

        public NUlFixed(One.F1 f1) {
            this.b = f1;
        }

        @Override // defpackage.oc0
        public final int a(int i, jy1 jy1Var) {
            return this.b.a(0, i);
        }
    }

    public static final class QnHx extends oc0 {
        public static final /* synthetic */ int b = 0;

        static {
            new QnHx();
        }

        @Override // defpackage.oc0
        public final int a(int i, jy1 jy1Var) {
            return i / 2;
        }
    }

    static {
        int i = QnHx.b;
        int i2 = LPt8Fixed.b;
        int i3 = CQf.b;
    }

    public abstract int a(int i, jy1 jy1Var);
}
