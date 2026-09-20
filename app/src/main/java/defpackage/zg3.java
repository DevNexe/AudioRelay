package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zg3 {
    public final n43 a;
    public final boolean b;

    public zg3(n43 n43Var, boolean z) {
        this.a = n43Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg3)) {
            return false;
        }
        zg3 zg3Var = (zg3) obj;
        return ur1.a(this.a, zg3Var.a) && this.b == zg3Var.b;
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
        return "PurchasedPlan(plan=" + this.a + ", isCanceled=" + this.b + ")";
    }
}
