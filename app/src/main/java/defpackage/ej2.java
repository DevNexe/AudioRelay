package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ej2 {

    public static final class CQf extends ej2 {
        public static final CQf a = new CQf();
    }

    public static final class F1 extends ej2 {
        public final uj2 a;

        public F1(uj2 uj2Var) {
            this.a = uj2Var;
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
            return "SelectSuggestion(suggestion=" + this.a + ")";
        }
    }

    public static final class QnHx extends ej2 {
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
            return this.a.hashCode();
        }

        public final String toString() {
            return i5.b(new StringBuilder("ChangeName(name="), this.a, ")");
        }
    }
}
