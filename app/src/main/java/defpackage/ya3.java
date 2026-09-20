package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ya3 {

    public static final class CQf extends ya3 {
        public final ab3 a;
        public final o43 b;

        public CQf(ab3 ab3Var, o43 o43Var) {
            this.a = ab3Var;
            this.b = o43Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CQf)) {
                return false;
            }
            CQf cQf = (CQf) obj;
            return ur1.a(this.a, cQf.a) && ur1.a(this.b, cQf.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            o43 o43Var = this.b;
            return iHashCode + (o43Var == null ? 0 : o43Var.hashCode());
        }

        public final String toString() {
            return "Purchase(plan=" + this.a + ", upgradeFrom=" + this.b + ")";
        }
    }

    public static final class F1 extends ya3 {
        public static final F1 a = new F1();
    }

    public static final class LPt8Fixed extends ya3 {
        public final String a;

        public LPt8Fixed(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LPt8Fixed) && ur1.a(this.a, ((LPt8Fixed) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return i5.b(new StringBuilder("ShowPurchaseFailed(message="), this.a, ")");
        }
    }

    public static final class NUlFixed extends ya3 {
        public static final NUlFixed a = new NUlFixed();
    }

    public static final class QnHx extends ya3 {
        public static final QnHx a = new QnHx();
    }

    public static final class YKK extends ya3 {
        public static final YKK a = new YKK();
    }
}
