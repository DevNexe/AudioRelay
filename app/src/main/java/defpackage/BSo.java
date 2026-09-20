package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class BSo {

    public static final class CQf extends BSo {
        public static final CQf a = new CQf();
    }

    public static final class QnHx extends BSo {
        public final int a;
        public final int b = 2;

        public QnHx(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QnHx)) {
                return false;
            }
            QnHx qnHx = (QnHx) obj;
            return this.a == qnHx.a && this.b == qnHx.b;
        }

        public final int hashCode() {
            return O.h(this.b) + (this.a * 31);
        }

        public final String toString() {
            return "Opus(bitrate=" + this.a + ", application=" + O.i(this.b) + ")";
        }
    }
}
