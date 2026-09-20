package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ry3 {

    public static final class CQf extends ry3 {
        public final mp2 a;

        public CQf(mp2 mp2Var) {
            this.a = mp2Var;
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
            return "ShowHelp(notice=" + this.a + ")";
        }
    }

    public static final class QnHx extends ry3 {
        public static final QnHx a = new QnHx();
    }
}
