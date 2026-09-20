package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n74 {
    public final QnHx a;
    public final QnHx b;
    public final boolean c;

    public static final class QnHx {
        public final np3 a;
        public final int b;
        public final long c;

        public QnHx(np3 np3Var, int i, long j) {
            this.a = np3Var;
            this.b = i;
            this.c = j;
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
            int iHashCode = ((this.a.hashCode() * 31) + this.b) * 31;
            long j = this.c;
            return iHashCode + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            return "AnchorInfo(direction=" + this.a + ", offset=" + this.b + ", selectableId=" + this.c + ')';
        }
    }

    public n74(QnHx qnHx, QnHx qnHx2, boolean z) {
        this.a = qnHx;
        this.b = qnHx2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n74)) {
            return false;
        }
        n74 n74Var = (n74) obj;
        return ur1.a(this.a, n74Var.a) && ur1.a(this.b, n74Var.b) && this.c == n74Var.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        boolean z = this.c;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return iHashCode + r0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", handlesCrossed=");
        return dj.c(sb, this.c, ')');
    }
}
