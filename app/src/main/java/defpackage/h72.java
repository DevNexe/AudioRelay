package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class h72 {

    public static final class CQf extends h72 {
        public final p72 a;

        public CQf(p72 p72Var) {
            this.a = p72Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CQf) && this.a == ((CQf) obj).a;
        }

        public final int hashCode() {
            p72 p72Var = this.a;
            if (p72Var == null) {
                return 0;
            }
            return p72Var.hashCode();
        }

        public final String toString() {
            return "Initialize(navDestination=" + this.a + ")";
        }
    }

    public static final class F1 extends h72 {
        public final int a;

        public F1(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof F1) && this.a == ((F1) obj).a;
        }

        public final int hashCode() {
            return this.a;
        }

        public final String toString() {
            return ex0.c(new StringBuilder("OnChangedPosition(position="), this.a, ")");
        }
    }

    public static final class QnHx extends h72 {
        public final p72 a;

        public QnHx(p72 p72Var) {
            this.a = p72Var;
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
            return "InitialDestinationLoaded(destination=" + this.a + ")";
        }
    }
}
