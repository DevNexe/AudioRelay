package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class no5 {
    public final je4 a;
    public final bs b;

    public no5(je4 je4Var, bs bsVar) {
        this.a = je4Var;
        this.b = bsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no5)) {
            return false;
        }
        no5 no5Var = (no5) obj;
        return ur1.a(this.a, no5Var.a) && ur1.a(this.b, no5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WrappedServerSession(serverSession=" + this.a + ", clientConfig=" + this.b + ")";
    }
}
