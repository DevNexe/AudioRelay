package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class cf4 {

    public static final class CQf extends cf4 {
        public static final CQf a = new CQf();
    }

    public static final class QnHx extends cf4 {
        public final int a;
        public final int b;
        public final int c;

        public QnHx(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QnHx)) {
                return false;
            }
            QnHx qnHx = (QnHx) obj;
            return this.a == qnHx.a && this.b == qnHx.b && this.c == qnHx.c;
        }

        public final int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(value=");
            sb.append(this.a);
            sb.append(", min=");
            sb.append(this.b);
            sb.append(", max=");
            return ex0.c(sb, this.c, ")");
        }
    }
}
