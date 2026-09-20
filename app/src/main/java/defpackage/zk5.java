package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zk5 {
    public final boolean a;
    public final QnHx b;
    public final int c;

    public static abstract class QnHx {

        public static final class CQf extends QnHx {
            public static final CQf a = new CQf();
        }

        /* JADX INFO: renamed from: zk5$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0234QnHx extends QnHx {
            public static final C0234QnHx a = new C0234QnHx();
        }
    }

    public zk5(boolean z, QnHx qnHx, int i) {
        this.a = z;
        this.b = qnHx;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk5)) {
            return false;
        }
        zk5 zk5Var = (zk5) obj;
        if (this.a == zk5Var.a && ur1.a(this.b, zk5Var.b)) {
            return this.c == zk5Var.c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return ((this.b.hashCode() + (r0 * 31)) * 31) + this.c;
    }

    public final String toString() {
        return "VolumeShaperConfig(isEnabled=" + this.a + ", strategy=" + this.b + ", gain=" + ex0.c(new StringBuilder("Db(value="), this.c, ")") + ")";
    }
}
