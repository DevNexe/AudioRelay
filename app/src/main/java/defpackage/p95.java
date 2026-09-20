package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p95 {
    public final Z7jl a;
    public final mt2 b;

    public p95(Z7jl z7jl, mt2 mt2Var) {
        this.a = z7jl;
        this.b = mt2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p95)) {
            return false;
        }
        p95 p95Var = (p95) obj;
        return ur1.a(this.a, p95Var.a) && ur1.a(this.b, p95Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ')';
    }
}
