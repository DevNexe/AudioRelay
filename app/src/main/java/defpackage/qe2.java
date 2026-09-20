package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qe2 {
    public final oe2 a;
    public final int b;
    public final int c;
    public final boolean d;

    public qe2(oe2 oe2Var, int i, int i2, boolean z) {
        this.a = oe2Var;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe2)) {
            return false;
        }
        qe2 qe2Var = (qe2) obj;
        return ur1.a(this.a, qe2Var.a) && this.b == qe2Var.b && this.c == qe2Var.c && this.d == qe2Var.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31;
        boolean z = this.d;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final String toString() {
        return "MicModeSetting(mode=" + this.a + ", title=" + this.b + ", description=" + this.c + ", isSelected=" + this.d + ")";
    }
}
