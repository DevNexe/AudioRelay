package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class za3 {

    public static final class CQf extends za3 {
        public final boolean a;

        public CQf(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CQf) && this.a == ((CQf) obj).a;
        }

        public final int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return "LoadedPendingPurchases(hasPendingPurchase=" + this.a + ")";
        }
    }

    public static final class EQ extends za3 {
        public static final EQ a = new EQ();
    }

    public static final class F1 extends za3 {
        public final q43 a;

        public F1(q43 q43Var) {
            this.a = q43Var;
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
            return "LoadedPlans(plans=" + this.a + ")";
        }
    }

    public static final class FJCM extends za3 {
        public final boolean a;

        public FJCM(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FJCM) && this.a == ((FJCM) obj).a;
        }

        public final int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return "ReloadPlans(shouldDelay=" + this.a + ")";
        }
    }

    public static final class LPt6Fixed extends za3 {
        public static final LPt6Fixed a = new LPt6Fixed();
    }

    public static final class LPt8Fixed extends za3 {
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
            return i5.b(new StringBuilder("LoadedWarnings(warning="), this.a, ")");
        }
    }

    public static final class MZ extends za3 {
        public final ab3 a;

        public MZ(ab3 ab3Var) {
            this.a = ab3Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MZ) && ur1.a(this.a, ((MZ) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SelectPlan(planToSelect=" + this.a + ")";
        }
    }

    public static final class NUlFixed extends za3 {
        public final Throwable a;

        public NUlFixed(Throwable th) {
            this.a = th;
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
            return "LoadingPlansFailed(error=" + this.a + ")";
        }
    }

    public static final class PRnFixed extends za3 {
        public static final PRnFixed a = new PRnFixed();
    }

    public static final class QnHx extends za3 {
        public static final QnHx a = new QnHx();
    }

    public static final class RBi extends za3 {
        public static final RBi a = new RBi();
    }

    public static final class T23 extends za3 {
        public static final T23 a = new T23();
    }

    public static final class YKK extends za3 {
        public final eb3 a;

        public YKK(eb3 eb3Var) {
            this.a = eb3Var;
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
            return "MakePurchase(purchaseType=" + this.a + ")";
        }
    }

    public static final class auxFixed extends za3 {
        public static final auxFixed a = new auxFixed();
    }

    public static final class byN extends za3 {
        public final String a;

        public byN(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof byN) && ur1.a(this.a, ((byN) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return i5.b(new StringBuilder("PurchaseFailed(message="), this.a, ")");
        }
    }

    public static final class y extends za3 {
        public static final y a = new y();
    }
}
