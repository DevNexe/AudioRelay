package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l82 {
    public final String a;
    public final boolean b;
    public final i82 c;
    public final boolean d;
    public final boolean e;

    public l82() {
        this(0);
    }

    public l82(String str, boolean z, i82 i82Var) {
        this.a = str;
        this.b = z;
        this.c = i82Var;
        this.d = str != null;
        this.e = (str == null || z || ur1.a(i82Var, i82.QnHx.a)) ? false : true;
    }

    public static l82 a(l82 l82Var, String str, i82 i82Var, int i) {
        if ((i & 1) != 0) {
            str = l82Var.a;
        }
        boolean z = (i & 2) != 0 ? l82Var.b : false;
        if ((i & 4) != 0) {
            i82Var = l82Var.c;
        }
        l82Var.getClass();
        return new l82(str, z, i82Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l82)) {
            return false;
        }
        l82 l82Var = (l82) obj;
        return ur1.a(this.a, l82Var.a) && this.b == l82Var.b && ur1.a(this.c, l82Var.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.b;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return this.c.hashCode() + ((iHashCode + r1) * 31);
    }

    public final String toString() {
        return "State(initialAddress=" + this.a + ", isConnecting=" + this.b + ", addressError=" + this.c + ")";
    }

    public /* synthetic */ l82(int i) {
        this(null, false, i82.F1.a);
    }
}
