package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class FEQ {

    public static final class CQf extends FEQ {
        public final Throwable a;

        public CQf(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CQf) && ur1.a(this.a, ((CQf) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "FailedToOpenSettings(error=" + this.a + ")";
        }
    }

    public static final class F1 extends FEQ {
        public static final F1 a = new F1();
    }

    public static final class LPt8Fixed extends FEQ {
        public final rFi a;
        public final boolean b;
        public final boolean c;

        public LPt8Fixed(rFi rfi, boolean z, boolean z2) {
            this.a = rfi;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LPt8Fixed)) {
                return false;
            }
            LPt8Fixed lPt8 = (LPt8Fixed) obj;
            return this.a == lPt8.a && this.b == lPt8.b && this.c == lPt8.c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            boolean z = this.b;
            ?? r2 = z;
            if (z) {
                r2 = 1;
            }
            int i = (iHashCode + r2) * 31;
            boolean z2 = this.c;
            return i + (z2 ? 1 : z2);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(strategy=");
            sb.append(this.a);
            sb.append(", isPhoneStatePermissionRequired=");
            sb.append(this.b);
            sb.append(", isRestartingPlayer=");
            return Md5A.f(sb, this.c, ")");
        }
    }

    public static final class NUlFixed extends FEQ {
        public static final NUlFixed a = new NUlFixed();
    }

    public static final class QnHx extends FEQ {
        public final rFi a;

        public QnHx(rFi rfi) {
            this.a = rfi;
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
            return "ChangeAudioFocusStrategy(strategy=" + this.a + ")";
        }
    }
}
