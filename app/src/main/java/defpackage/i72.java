package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i72 {
    public final p72 a;
    public final kj1<k72> b;

    public i72() {
        this(0);
    }

    public i72(p72 p72Var, kj1<k72> kj1Var) {
        this.a = p72Var;
        this.b = kj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i72)) {
            return false;
        }
        i72 i72Var = (i72) obj;
        return this.a == i72Var.a && ur1.a(this.b, i72Var.b);
    }

    public final int hashCode() {
        p72 p72Var = this.a;
        return this.b.hashCode() + ((p72Var == null ? 0 : p72Var.hashCode()) * 31);
    }

    public final String toString() {
        return "State(initialDestination=" + this.a + ", destinations=" + this.b + ")";
    }

    public i72(int i) {
        this(null, new kj1(l72.a));
    }
}
