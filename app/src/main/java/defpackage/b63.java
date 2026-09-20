package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class b63 {

    public static final class CQf extends b63 {
        public final Sb1 a;

        public CQf(Sb1 sb1) {
            this.a = sb1;
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
            return "Received(config=" + this.a + ")";
        }
    }

    public static final class F1 extends b63 {
        public static final F1 a = new F1();
    }

    public static final class QnHx extends b63 {
        public static final QnHx a = new QnHx();
    }
}
