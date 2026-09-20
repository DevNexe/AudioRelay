package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class eb3 {

    public static final class CQf extends eb3 {
        public final ab3 a;

        public CQf(ab3 ab3Var) {
            this.a = ab3Var;
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
            return "Purchase(plan=" + this.a + ")";
        }
    }

    public static final class QnHx extends eb3 {
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
            return "ChangePlan(plan=" + this.a + ", oldPlanId=" + this.b + ")";
        }
    }
}
