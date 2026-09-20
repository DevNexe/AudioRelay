package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x3 extends gn2 {
    public final gn2.CQf a;
    public final gn2.QnHx b;

    public x3(gn2.CQf cQf, gn2.QnHx qnHx) {
        this.a = cQf;
        this.b = qnHx;
    }

    @Override // defpackage.gn2
    public final gn2.QnHx a() {
        return this.b;
    }

    @Override // defpackage.gn2
    public final gn2.CQf b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gn2)) {
            return false;
        }
        gn2 gn2Var = (gn2) obj;
        gn2.CQf cQf = this.a;
        if (cQf != null ? cQf.equals(gn2Var.b()) : gn2Var.b() == null) {
            gn2.QnHx qnHx = this.b;
            if (qnHx == null) {
                if (gn2Var.a() == null) {
                    return true;
                }
            } else if (qnHx.equals(gn2Var.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        gn2.CQf cQf = this.a;
        int iHashCode = ((cQf == null ? 0 : cQf.hashCode()) ^ 1000003) * 1000003;
        gn2.QnHx qnHx = this.b;
        return (qnHx != null ? qnHx.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
