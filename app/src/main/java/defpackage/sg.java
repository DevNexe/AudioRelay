package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class sg {

    public static final class CQf extends sg {
        public static final CQf a = new CQf();
    }

    public static final class F1 extends sg {
        public static final F1 a = new F1();
    }

    public static final class LPt8Fixed extends sg {
        public static final LPt8Fixed a = new LPt8Fixed();
    }

    public static final class NUlFixed extends sg {
        public static final NUlFixed a = new NUlFixed();
    }

    public static final class QnHx extends sg {
        public final mg a;

        public QnHx(mg mgVar) {
            this.a = mgVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QnHx) && this.a == ((QnHx) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ChangeMode(mode=" + this.a + ")";
        }
    }

    public static final class YKK extends sg {
        public final dh.QnHx a;

        public YKK(dh.QnHx qnHx) {
            this.a = qnHx;
        }
    }
}
