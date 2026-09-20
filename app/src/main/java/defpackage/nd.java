package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nd {
    public final float a;
    public final cg b;

    public nd(float f, jq4 jq4Var) {
        this.a = f;
        this.b = jq4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nd)) {
            return false;
        }
        nd ndVar = (nd) obj;
        return wm0.a(this.a, ndVar.a) && ur1.a(this.b, ndVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) wm0.c(this.a)) + ", brush=" + this.b + ')';
    }
}
