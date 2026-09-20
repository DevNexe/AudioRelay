package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class cv3 {

    public static final class CQf extends cv3 {
        public static final CQf a = new CQf();
    }

    public static final class F1 extends cv3 {
        public static final F1 a = new F1();
    }

    public static final class QnHx extends cv3 {
        public final long a;

        public QnHx(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QnHx) && this.a == ((QnHx) obj).a;
        }

        public final int hashCode() {
            long j = this.a;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            return "Latencies(max=" + this.a + ")";
        }
    }
}
