package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yt0 {
    public final h81<sd5> a;
    public final h81<sd5> b;

    public yt0(h81<sd5> h81Var, h81<sd5> h81Var2) {
        this.a = h81Var;
        this.b = h81Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt0)) {
            return false;
        }
        yt0 yt0Var = (yt0) obj;
        return ur1.a(this.a, yt0Var.a) && ur1.a(this.b, yt0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Event(onInit=" + this.a + ", onEnd=" + this.b + ")";
    }
}
