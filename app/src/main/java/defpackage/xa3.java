package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class xa3 {

    public static final class CQf extends xa3 {
        public static final CQf a = new CQf();
    }

    public static final class F1 extends xa3 {
        public final ab3 a;

        public F1(ab3 ab3Var) {
            this.a = ab3Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof F1) && ur1.a(this.a, ((F1) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Purchase(plan=" + this.a + ")";
        }
    }

    public static final class LPt8Fixed extends xa3 {
        public final ab3 a;

        public LPt8Fixed(ab3 ab3Var) {
            this.a = ab3Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LPt8Fixed) && ur1.a(this.a, ((LPt8Fixed) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Subscribe(plan=" + this.a + ")";
        }
    }

    public static final class NUlFixed extends xa3 {
        public final ab3 a;

        public NUlFixed(ab3 ab3Var) {
            this.a = ab3Var;
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
            return "UpgradeToLifetime(plan=" + this.a + ")";
        }
    }

    public static final class QnHx extends xa3 {
        public final ab3 a;
        public final o43 b;

        public QnHx(ab3 ab3Var, o43 o43Var) {
            this.a = ab3Var;
            this.b = o43Var;
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
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ChangeSubscription(plan=" + this.a + ", oldPlanId=" + this.b + ")";
        }
    }
}
