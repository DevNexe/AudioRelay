package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class vz4 {

    public static final class CQf extends vz4 {
        public static final CQf a = new CQf();
    }

    public static final class F1 extends vz4 {
        public static final F1 a = new F1();
    }

    public static final class LPt8Fixed extends vz4 {
        public static final LPt8Fixed a = new LPt8Fixed();
    }

    public static final class QnHx extends vz4 {
        public final uy4 a;
        public final String b;

        public QnHx(uy4 uy4Var, String str) {
            this.a = uy4Var;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QnHx)) {
                return false;
            }
            QnHx qnHx = (QnHx) obj;
            return ur1.a(this.a, qnHx.a) && ur1.a(this.b, qnHx.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "Error(error=" + this.a + ", message=" + this.b + ")";
        }
    }

    public vz4() {
        int i = zs.d;
        zs.QnHx.a.c();
    }
}
