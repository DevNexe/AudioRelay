package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y63 {
    public final boolean a;
    public final long b;
    public final int c;

    public y63(boolean z, long j, int i) {
        this.a = z;
        this.b = j;
        this.c = i;
        int i2 = i / 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y63)) {
            return false;
        }
        y63 y63Var = (y63) obj;
        return this.a == y63Var.a && gq0.e(this.b, y63Var.b) && this.c == y63Var.c;
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
        return ((gq0.m(this.b) + (r0 * 31)) * 31) + this.c;
    }

    public final String toString() {
        String strQ = gq0.q(this.b);
        StringBuilder sb = new StringBuilder("PlayerOptions(retryOnConnectionLoss=");
        sb.append(this.a);
        sb.append(", retryDuration=");
        sb.append(strQ);
        sb.append(", bufferSize=");
        return ex0.c(sb, this.c, ")");
    }
}
