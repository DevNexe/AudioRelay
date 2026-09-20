package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lx1 {
    public final kj1<gx1> a;
    public final zx1 b;

    public lx1() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx1)) {
            return false;
        }
        lx1 lx1Var = (lx1) obj;
        return ur1.a(this.a, lx1Var.a) && ur1.a(this.b, lx1Var.b);
    }

    public final int hashCode() {
        kj1<gx1> kj1Var = this.a;
        int iHashCode = (kj1Var == null ? 0 : kj1Var.hashCode()) * 31;
        zx1 zx1Var = this.b;
        return iHashCode + (zx1Var != null ? zx1Var.hashCode() : 0);
    }

    public final String toString() {
        return "State(sortedLanguages=" + this.a + ", selectedLanguage=" + this.b + ")";
    }

    public lx1(kj1<gx1> kj1Var, zx1 zx1Var) {
        this.a = kj1Var;
        this.b = zx1Var;
    }
}
