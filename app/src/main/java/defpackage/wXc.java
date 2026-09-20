package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class wXc {

    public static final class CQf extends wXc {
        public final bLBI a;

        public CQf(bLBI blbi) {
            this.a = blbi;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CQf) && this.a == ((CQf) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ChangeQuality(value=" + this.a + ")";
        }
    }

    public static final class F1 extends wXc {
        public static final F1 a = new F1();
    }

    public static final class LPt8Fixed extends wXc {
        public final boolean a;

        public LPt8Fixed(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LPt8Fixed) && this.a == ((LPt8Fixed) obj).a;
        }

        public final int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return "IsPremiumLoaded(isPremium=" + this.a + ")";
        }
    }

    public static final class NUlFixed extends wXc {
        public final String a;

        public NUlFixed(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NUlFixed) && ur1.a(this.a, ((NUlFixed) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return i5.b(new StringBuilder("NavigateToPremium(origin="), this.a, ")");
        }
    }

    public static final class QnHx extends wXc {
        public final wv2 a;

        public QnHx(wv2 wv2Var) {
            this.a = wv2Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QnHx) && ur1.a(this.a, ((QnHx) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ChangeBitrate(value=" + this.a + ")";
        }
    }

    public static final class YKK extends wXc {
        public final bLBI a;
        public final wv2 b;
        public final boolean c;

        public YKK(bLBI blbi, wv2 wv2Var, boolean z) {
            this.a = blbi;
            this.b = wv2Var;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof YKK)) {
                return false;
            }
            YKK ykk = (YKK) obj;
            return this.a == ykk.a && ur1.a(this.b, ykk.b) && this.c == ykk.c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r1v4, types: [int] */
        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            boolean z = this.c;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return iHashCode + r0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnLoaded(audioQuality=");
            sb.append(this.a);
            sb.append(", selectedBitrate=");
            sb.append(this.b);
            sb.append(", isRestartingPlayer=");
            return Md5A.f(sb, this.c, ")");
        }
    }
}
