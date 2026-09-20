package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class yv2 {

    public static final class CQf extends yv2 {
        public static final CQf a = new CQf();
    }

    public static final class QnHx extends yv2 {
        public final sj4 a;

        public QnHx(sj4 sj4Var) {
            this.a = sj4Var;
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
            return "HasError(error=" + this.a + ")";
        }
    }
}
