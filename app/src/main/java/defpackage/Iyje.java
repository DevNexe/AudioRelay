package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class Iyje {
    public final String a;

    public static final class CQf extends Iyje {
        public static final CQf b = new CQf();

        public CQf() {
            super("loading");
        }
    }

    public static final class F1 extends Iyje {
        public static final F1 b = new F1();

        public F1() {
            super("running");
        }
    }

    public static final class LPt8Fixed extends Iyje {
        public final boolean b;
        public final wb4 c;

        public LPt8Fixed(boolean z, wb4 wb4Var) {
            super("showRationale");
            this.b = z;
            this.c = wb4Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LPt8Fixed)) {
                return false;
            }
            LPt8Fixed lPt8 = (LPt8Fixed) obj;
            return this.b == lPt8.b && this.c == lPt8.c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        public final int hashCode() {
            boolean z = this.b;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return this.c.hashCode() + (r0 * 31);
        }

        public final String toString() {
            return "ShowRationale(showSettings=" + this.b + ", captureType=" + this.c + ")";
        }
    }

    public static final class QnHx extends Iyje {
        public static final QnHx b = new QnHx();

        public QnHx() {
            super("idle");
        }
    }

    public Iyje(String str) {
        this.a = str;
    }
}
