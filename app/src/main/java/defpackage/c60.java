package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class c60 {

    public static final class CQf extends c60 {
        public static final CQf a = new CQf();
    }

    public static final class F1 extends c60 {
        public static final F1 a = new F1();
    }

    public static final class QnHx extends c60 {
        public final boolean a;

        public QnHx(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QnHx) && this.a == ((QnHx) obj).a;
        }

        public final int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return "Connected(hasHighLatency=" + this.a + ")";
        }
    }
}
