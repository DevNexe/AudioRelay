package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xe4 {
    public final je4 a;
    public final ad2 b;

    public xe4(je4 je4Var, ad2 ad2Var) {
        this.a = je4Var;
        this.b = ad2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe4)) {
            return false;
        }
        xe4 xe4Var = (xe4) obj;
        return ur1.a(this.a, xe4Var.a) && ur1.a(this.b, xe4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ServerSessionMessage(session=" + this.a + ", message=" + this.b + ")";
    }
}
