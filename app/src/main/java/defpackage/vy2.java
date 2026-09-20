package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vy2<F, S> {
    public final F a;
    public final S b;

    public vy2(F f, S s) {
        this.a = f;
        this.b = s;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vy2)) {
            return false;
        }
        vy2 vy2Var = (vy2) obj;
        return uq2.a(vy2Var.a, this.a) && uq2.a(vy2Var.b, this.b);
    }

    public final int hashCode() {
        F f = this.a;
        int iHashCode = f == null ? 0 : f.hashCode();
        S s = this.b;
        return (s != null ? s.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
