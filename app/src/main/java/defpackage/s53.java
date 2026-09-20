package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s53 {
    public final q53 a;
    public final n53 b;

    public s53(q53 q53Var, n53 n53Var) {
        this.a = q53Var;
        this.b = n53Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s53)) {
            return false;
        }
        s53 s53Var = (s53) obj;
        return ur1.a(this.b, s53Var.b) && ur1.a(this.a, s53Var.a);
    }

    public final int hashCode() {
        q53 q53Var = this.a;
        int iHashCode = (q53Var != null ? q53Var.hashCode() : 0) * 31;
        n53 n53Var = this.b;
        return iHashCode + (n53Var != null ? n53Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ')';
    }
}
