package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ab3 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final nj1<p43> d;
    public final nj1<n43> e;
    public final o43 f = a().a;
    public final String g = a().b;
    public final boolean h;

    public ab3(boolean z, boolean z2, boolean z3, nj1<p43> nj1Var, nj1<n43> nj1Var2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = nj1Var;
        this.e = nj1Var2;
        n43 n43VarA = a();
        n43.CQf cQf = n43VarA instanceof n43.CQf ? (n43.CQf) n43VarA : null;
        boolean z4 = false;
        if (cQf != null && cQf.e != null) {
            z4 = true;
        }
        this.h = z4;
    }

    public final n43 a() {
        return this.e.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab3)) {
            return false;
        }
        ab3 ab3Var = (ab3) obj;
        return this.a == ab3Var.a && this.b == ab3Var.b && this.c == ab3Var.c && ur1.a(this.d, ab3Var.d) && ur1.a(this.e, ab3Var.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = r1 * 31;
        boolean z2 = this.b;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((i2 + (z3 ? 1 : z3)) * 31)) * 31);
    }

    public final String toString() {
        return "PlanUi(isActive=" + this.a + ", isActiveButCanceled=" + this.b + ", isSelected=" + this.c + ", wrappedPeriod=" + this.d + ", wrappedPlan=" + this.e + ")";
    }
}
