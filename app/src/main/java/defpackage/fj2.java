package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fj2 {
    public final String a;
    public final kj1<uj2> b;
    public final boolean c;

    public fj2() {
        this(0);
    }

    public fj2(String str, kj1<uj2> kj1Var) {
        this.a = str;
        this.b = kj1Var;
        this.c = str == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj2)) {
            return false;
        }
        fj2 fj2Var = (fj2) obj;
        return ur1.a(this.a, fj2Var.a) && ur1.a(this.b, fj2Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "State(initialOrSuggestionName=" + this.a + ", suggestions=" + this.b + ")";
    }

    public /* synthetic */ fj2(int i) {
        this(null, new kj1(cs0.w));
    }
}
