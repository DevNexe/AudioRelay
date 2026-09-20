package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e71 {
    public final b71 a;
    public final boolean b;

    public e71() {
        this(0);
    }

    public e71(b71 b71Var, boolean z) {
        this.a = b71Var;
        this.b = z;
    }

    public static e71 a(e71 e71Var, b71 b71Var, boolean z, int i) {
        if ((i & 1) != 0) {
            b71Var = e71Var.a;
        }
        if ((i & 2) != 0) {
            z = e71Var.b;
        }
        e71Var.getClass();
        return new e71(b71Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e71)) {
            return false;
        }
        e71 e71Var = (e71) obj;
        return ur1.a(this.a, e71Var.a) && this.b == e71Var.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final String toString() {
        return "State(adsState=" + this.a + ", shouldShowButtons=" + this.b + ")";
    }

    public /* synthetic */ e71(int i) {
        this(b71.F1.a, false);
    }
}
