package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h50 {
    public final yb4 a;
    public final m63 b;
    public final e51 c;

    public h50(yb4 yb4Var, m63 m63Var, e51 e51Var) {
        this.a = yb4Var;
        this.b = m63Var;
        this.c = e51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h50)) {
            return false;
        }
        h50 h50Var = (h50) obj;
        return ur1.a(this.a, h50Var.a) && ur1.a(this.b, h50Var.b) && ur1.a(this.c, h50Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        e51 e51Var = this.c;
        return iHashCode + (e51Var == null ? 0 : e51Var.hashCode());
    }

    public final String toString() {
        return "ConfigExchangeResult(serverConfig=" + this.a + ", features=" + this.b + ", forcedOptions=" + this.c + ")";
    }
}
