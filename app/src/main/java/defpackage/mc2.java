package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mc2 {
    public final String a;
    public final boolean b;

    public mc2(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mc2)) {
            return false;
        }
        mc2 mc2Var = (mc2) obj;
        return ur1.a(this.a, mc2Var.a) && this.b == mc2Var.b;
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
        return "MediaSessionState(title=" + this.a + ", isActive=" + this.b + ")";
    }
}
