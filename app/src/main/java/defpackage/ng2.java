package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ng2 {
    public final mg a;
    public final int b;
    public final int c;
    public final boolean d;

    public ng2(mg mgVar, int i, int i2, boolean z) {
        this.a = mgVar;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng2)) {
            return false;
        }
        ng2 ng2Var = (ng2) obj;
        return this.a == ng2Var.a && this.b == ng2Var.b && this.c == ng2Var.c && this.d == ng2Var.d;
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
        StringBuilder sb = new StringBuilder("ModeDescriptions(bufferSizeMode=");
        sb.append(this.a);
        sb.append(", titleRes=");
        sb.append(this.b);
        sb.append(", descriptionRes=");
        sb.append(this.c);
        sb.append(", premiumNecessary=");
        return Md5A.f(sb, this.d, ")");
    }
}
