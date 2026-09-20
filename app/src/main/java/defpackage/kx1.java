package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class kx1 {

    public static final class CQf extends kx1 {
        public static final CQf a = new CQf();
    }

    public static final class QnHx extends kx1 {
        public final zx1 a;

        public QnHx(zx1 zx1Var) {
            this.a = zx1Var;
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
            return "ChangeLanguage(selection=" + this.a + ")";
        }
    }
}
