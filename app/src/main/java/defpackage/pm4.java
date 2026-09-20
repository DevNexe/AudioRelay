package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pm4 {
    public final j81<sp1, mp1> a;
    public final lx0<mp1> b;

    public pm4(lx0 lx0Var, j81 j81Var) {
        this.a = j81Var;
        this.b = lx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm4)) {
            return false;
        }
        pm4 pm4Var = (pm4) obj;
        return ur1.a(this.a, pm4Var.a) && ur1.a(this.b, pm4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
