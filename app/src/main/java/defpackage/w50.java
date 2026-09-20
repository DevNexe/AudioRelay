package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w50 {
    public final bs a;
    public final gc4 b;

    public w50(bs bsVar, gc4 gc4Var) {
        this.a = bsVar;
        this.b = gc4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w50)) {
            return false;
        }
        w50 w50Var = (w50) obj;
        return ur1.a(this.a, w50Var.a) && ur1.a(this.b, w50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ConnectionConfig(clientConfig=" + this.a + ", features=" + this.b + ")";
    }
}
