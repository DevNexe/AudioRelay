package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class af4 {
    public final c60 a;
    public final yv2 b;

    public af4() {
        this(0);
    }

    public af4(c60 c60Var, yv2 yv2Var) {
        this.a = c60Var;
        this.b = yv2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af4)) {
            return false;
        }
        af4 af4Var = (af4) obj;
        return ur1.a(this.a, af4Var.a) && ur1.a(this.b, af4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ServerSessionStatus(connectionStatus=" + this.a + ", opusEncoder=" + this.b + ")";
    }

    public /* synthetic */ af4(int i) {
        this(c60.F1.a, yv2.CQf.a);
    }
}
