package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rd4 {
    public final kj1<pd4> a;
    public final boolean b;

    public rd4() {
        this(0);
    }

    public rd4(kj1<pd4> kj1Var, boolean z) {
        this.a = kj1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd4)) {
            return false;
        }
        rd4 rd4Var = (rd4) obj;
        return ur1.a(this.a, rd4Var.a) && this.b == rd4Var.b;
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
        return "State(servers=" + this.a + ", searchFailed=" + this.b + ")";
    }

    public /* synthetic */ rd4(int i) {
        this(new kj1(cs0.w), false);
    }
}
