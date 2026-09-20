package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qd4 {

    public static final class CQf extends qd4 {
        public static final CQf a = new CQf();
    }

    public static final class F1 extends qd4 {
        public final mc4.QnHx a;

        public F1(mc4.QnHx qnHx) {
            this.a = qnHx;
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
            return "SearchResult(searchResult=" + this.a + ")";
        }
    }

    public static final class QnHx extends qd4 {
        public final jf4 a;

        public QnHx(jf4 jf4Var) {
            this.a = jf4Var;
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
            return "Connect(server=" + this.a + ")";
        }
    }
}
