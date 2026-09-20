package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class c8e {

    public static final class CQf extends c8e {
        public static final CQf a = new CQf();
    }

    public static final class F1 extends c8e {
        public static final F1 a = new F1();
    }

    public static final class LPt8Fixed extends c8e {
        public static final LPt8Fixed a = new LPt8Fixed();
    }

    public static final class NUlFixed extends c8e {
        public final wb4 a;

        public NUlFixed(wb4 wb4Var) {
            this.a = wb4Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NUlFixed) && this.a == ((NUlFixed) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "StartServerService(type=" + this.a + ")";
        }
    }

    public static final class QnHx extends c8e {
        public static final QnHx a = new QnHx();
    }
}
