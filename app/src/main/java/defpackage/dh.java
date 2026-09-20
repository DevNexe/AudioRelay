package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dh {
    public final wc3 a;
    public final un2 b;
    public final lKy3 c;

    public static final class QnHx {
        public final mg a;
        public final boolean b;
        public final boolean c;
        public final ad0 d;

        public QnHx(mg mgVar, boolean z, boolean z2, ad0 ad0Var) {
            this.a = mgVar;
            this.b = z;
            this.c = z2;
            this.d = ad0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QnHx)) {
                return false;
            }
            QnHx qnHx = (QnHx) obj;
            return this.a == qnHx.a && this.b == qnHx.b && this.c == qnHx.c && ur1.a(this.d, qnHx.d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            boolean z = this.b;
            ?? r2 = z;
            if (z) {
                r2 = 1;
            }
            int i = (iHashCode + r2) * 31;
            boolean z2 = this.c;
            return this.d.hashCode() + ((i + (z2 ? 1 : z2)) * 31);
        }

        public final String toString() {
            return "LoadResult(mode=" + this.a + ", isPremium=" + this.b + ", isPlayerRestarting=" + this.c + ", customBufferSize=" + this.d + ")";
        }
    }

    public dh(wc3 wc3Var, un2 un2Var, lKy3 lky3) {
        this.a = wc3Var;
        this.b = un2Var;
        this.c = lky3;
    }
}
