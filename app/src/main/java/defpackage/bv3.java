package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class bv3 {

    public static final class CQf extends bv3 {
        public static final CQf a = new CQf();
    }

    public static final class F1 extends bv3 {
        public static final F1 a = new F1();
    }

    public static final class QnHx extends bv3 {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final String d;

        public QnHx(String str, boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = str;
        }

        public static QnHx a(QnHx qnHx, boolean z) {
            boolean z2 = qnHx.b;
            boolean z3 = qnHx.c;
            String str = qnHx.d;
            qnHx.getClass();
            return new QnHx(str, z, z2, z3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QnHx)) {
                return false;
            }
            QnHx qnHx = (QnHx) obj;
            return this.a == qnHx.a && this.b == qnHx.b && this.c == qnHx.c && ur1.a(this.d, qnHx.d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        public final int hashCode() {
            boolean z = this.a;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            int i = r1 * 31;
            boolean z2 = this.b;
            ?? r2 = z2;
            if (z2) {
                r2 = 1;
            }
            int i2 = (i + r2) * 31;
            boolean z3 = this.c;
            return this.d.hashCode() + ((i2 + (z3 ? 1 : z3)) * 31);
        }

        public final String toString() {
            return "ConnectedDevice(showDialog=" + this.a + ", isScoActivated=" + this.b + ", isScoLoading=" + this.c + ", connectedHeadsetName=" + this.d + ")";
        }
    }
}
