package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x50 {
    public final yb4 a;
    public final m63 b;
    public final e51 c;

    public x50(yb4 yb4Var, m63 m63Var, e51 e51Var) {
        this.a = yb4Var;
        this.b = m63Var;
        this.c = e51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x50)) {
            return false;
        }
        x50 x50Var = (x50) obj;
        return ur1.a(this.a, x50Var.a) && ur1.a(this.b, x50Var.b) && ur1.a(this.c, x50Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        e51 e51Var = this.c;
        return iHashCode + (e51Var == null ? 0 : e51Var.hashCode());
    }

    public final String toString() {
        return "ConnectionConfig(serverConfig=" + this.a + ", features=" + this.b + ", forcedOptions=" + this.c + ")";
    }
}
