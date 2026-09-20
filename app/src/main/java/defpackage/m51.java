package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class m51 {

    public static final class CQf extends m51 {
        public static final CQf a = new CQf();
    }

    public static final class QnHx extends m51 {
        public final int a;
        public final int b;

        public QnHx(int i, int i2) {
            this.a = i;
            this.b = i2;
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
            return (this.a * 31) + this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MultiPayload(maxElapsedTimeBetweenPayloads=");
            sb.append(this.a);
            sb.append(", maxPayloadSize=");
            return ex0.c(sb, this.b, ")");
        }
    }
}
