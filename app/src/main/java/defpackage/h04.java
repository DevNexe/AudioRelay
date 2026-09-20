package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h04 {
    public final String a;
    public final boolean b;

    public h04(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h04)) {
            return false;
        }
        h04 h04Var = (h04) obj;
        return ur1.a(this.a, h04Var.a) && this.b == h04Var.b;
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
        return "RuntimeProperties(name=" + this.a + ", isMobilePremium=" + this.b + ")";
    }
}
