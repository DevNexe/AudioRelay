package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class b71 {

    public static final class CQf extends b71 {
        public final JBK6 a;

        public CQf(JBK6 jbk6) {
            this.a = jbk6;
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
            return "Loaded(result=" + this.a + ")";
        }
    }

    public static final class F1 extends b71 {
        public static final F1 a = new F1();
    }

    public static final class QnHx extends b71 {
        public static final QnHx a = new QnHx();
    }
}
