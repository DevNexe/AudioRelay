package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nw0<T> {
    public final T a;
    public final y81<x81<? super g30, ? super Integer, sd5>, g30, Integer, sd5> b;

    /* JADX WARN: Multi-variable type inference failed */
    public nw0(rn4 rn4Var, sz szVar) {
        this.a = rn4Var;
        this.b = szVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw0)) {
            return false;
        }
        nw0 nw0Var = (nw0) obj;
        return ur1.a(this.a, nw0Var.a) && ur1.a(this.b, nw0Var.b);
    }

    public final int hashCode() {
        T t = this.a;
        return this.b.hashCode() + ((t == null ? 0 : t.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.a + ", transition=" + this.b + ')';
    }
}
