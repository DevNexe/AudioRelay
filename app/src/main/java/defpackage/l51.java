package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l51 {
    public final boolean a;
    public final m51 b;

    public l51(boolean z, m51 m51Var) {
        this.a = z;
        this.b = m51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l51)) {
            return false;
        }
        l51 l51Var = (l51) obj;
        return this.a == l51Var.a && ur1.a(this.b, l51Var.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.b.hashCode() + (r0 * 31);
    }

    public final String toString() {
        return "FormatterConfig(streamData=" + this.a + ", type=" + this.b + ")";
    }
}
