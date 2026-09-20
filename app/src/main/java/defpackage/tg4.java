package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class tg4 {

    public static final class CQf extends tg4 {
        public static final CQf a = new CQf();
    }

    public static final class EQ extends tg4 {
        public static final EQ a = new EQ();
    }

    public static final class F1 extends tg4 {
        public static final F1 a = new F1();
    }

    public static final class FJCM extends tg4 {
        public final String a;
        public final String b;

        public FJCM(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FJCM)) {
                return false;
            }
            FJCM fjcm = (FJCM) obj;
            return ur1.a(this.a, fjcm.a) && ur1.a(this.b, fjcm.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OpenUri(uri=" + this.a + ", eventName=" + this.b + ")";
        }
    }

    public static final class LPt6Fixed extends tg4 {
        public final boolean a;

        public LPt6Fixed(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LPt6Fixed) && this.a == ((LPt6Fixed) obj).a;
        }

        public final int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return "ToggleAnalytics(newValue=" + this.a + ")";
        }
    }

    public static final class LPt8Fixed extends tg4 {
        public static final LPt8Fixed a = new LPt8Fixed();
    }

    public static final class LPt9Fixed extends tg4 {
        public static final LPt9Fixed a = new LPt9Fixed();
    }

    public static final class MZ extends tg4 {
        public static final MZ a = new MZ();
    }

    public static final class NUlFixed extends tg4 {
        public final boolean a;

        public NUlFixed(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NUlFixed) && this.a == ((NUlFixed) obj).a;
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

    public static final class PRnFixed extends tg4 {
        public static final PRnFixed a = new PRnFixed();
    }

    public static final class QnHx extends tg4 {
        public static final QnHx a = new QnHx();
    }

    public static final class RBi extends tg4 {
        public static final RBi a = new RBi();
    }

    public static final class T23 extends tg4 {
        public static final T23 a = new T23();
    }

    public static final class Xn1 extends tg4 {
        public final boolean a;

        public Xn1(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Xn1) && this.a == ((Xn1) obj).a;
        }

        public final int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return "ToggleUsbCard(newValue=" + this.a + ")";
        }
    }

    public static final class YKK extends tg4 {
        public final ug4 a;

        public YKK(ug4 ug4Var) {
            this.a = ug4Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof YKK) && ur1.a(this.a, ((YKK) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Loaded(prefValues=" + this.a + ")";
        }
    }

    public static final class auxFixed extends tg4 {
        public static final auxFixed a = new auxFixed();
    }

    public static final class byN extends tg4 {
        public final String a = "settings";

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof byN) && ur1.a(this.a, ((byN) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return i5.b(new StringBuilder("NavigateToPremium(origin="), this.a, ")");
        }
    }

    public static final class ta extends tg4 {
        public final String a;

        public ta(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ta) && ur1.a(this.a, ((ta) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return i5.b(new StringBuilder("VersionLoaded(version="), this.a, ")");
        }
    }

    public static final class y extends tg4 {
        public static final y a = new y();
    }
}
