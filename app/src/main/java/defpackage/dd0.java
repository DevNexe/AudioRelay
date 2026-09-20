package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dd0 {
    public final boolean a;
    public final ce0.CQf b;
    public final ce0.QnHx c;
    public final boolean d;

    public dd0() {
        this(0);
    }

    public /* synthetic */ dd0(int i) {
        this(false, null, null);
    }

    public static dd0 a(dd0 dd0Var, boolean z, ce0.CQf cQf, ce0.QnHx qnHx, int i) {
        if ((i & 1) != 0) {
            z = dd0Var.a;
        }
        if ((i & 2) != 0) {
            cQf = dd0Var.b;
        }
        if ((i & 4) != 0) {
            qnHx = dd0Var.c;
        }
        dd0Var.getClass();
        return new dd0(z, cQf, qnHx);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd0)) {
            return false;
        }
        dd0 dd0Var = (dd0) obj;
        return this.a == dd0Var.a && ur1.a(this.b, dd0Var.b) && ur1.a(this.c, dd0Var.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ce0.CQf cQf = this.b;
        int iHashCode = (i + (cQf == null ? 0 : cQf.hashCode())) * 31;
        ce0.QnHx qnHx = this.c;
        return iHashCode + (qnHx != null ? qnHx.hashCode() : 0);
    }

    public final String toString() {
        return "State(isEnabled=" + this.a + ", initialValues=" + this.b + ", formError=" + this.c + ")";
    }

    public dd0(boolean z, ce0.CQf cQf, ce0.QnHx qnHx) {
        this.a = z;
        this.b = cQf;
        this.c = qnHx;
        this.d = z && qnHx == null;
    }
}
