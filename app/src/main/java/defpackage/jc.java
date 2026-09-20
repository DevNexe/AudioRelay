package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class jc {

    public static final class CQf extends jc {
        public final String a;
        public final boolean b;
        public final boolean c;

        public CQf(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CQf)) {
                return false;
            }
            CQf cQf = (CQf) obj;
            return ur1.a(this.a, cQf.a) && this.b == cQf.b && this.c == cQf.c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6, types: [int] */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
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
            StringBuilder sb = new StringBuilder("DeviceConnected(deviceName=");
            sb.append(this.a);
            sb.append(", isScoConnecting=");
            sb.append(this.b);
            sb.append(", hasScoError=");
            return Md5A.f(sb, this.c, ")");
        }
    }

    public static final class F1 extends jc {
        public static final F1 a = new F1();
    }

    public static final class LPt8Fixed extends jc {
        public static final LPt8Fixed a = new LPt8Fixed();
    }

    public static final class NUlFixed extends jc {
        public static final NUlFixed a = new NUlFixed();
    }

    public static final class QnHx extends jc {
        public final String a;

        public QnHx(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QnHx) && ur1.a(this.a, ((QnHx) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return i5.b(new StringBuilder("DeviceAudioConnected(deviceName="), this.a, ")");
        }
    }

    public static final class YKK extends jc {
        public static final YKK a = new YKK();
    }

    public static final class auxFixed extends jc {
        public static final auxFixed a = new auxFixed();
    }
}
