package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class le2 {
    public final int a;
    public final boolean b;
    public final boolean c;

    public le2(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le2)) {
            return false;
        }
        le2 le2Var = (le2) obj;
        return this.a == le2Var.a && this.b == le2Var.b && this.c == le2Var.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        int iH = O.h(this.a) * 31;
        boolean z = this.b;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iH + r2) * 31;
        boolean z2 = this.c;
        return i + (z2 ? 1 : z2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MicEffect(type=");
        sb.append(he2.b(this.a));
        sb.append(", enabled=");
        sb.append(this.b);
        sb.append(", isAvailable=");
        return Md5A.f(sb, this.c, ")");
    }
}
