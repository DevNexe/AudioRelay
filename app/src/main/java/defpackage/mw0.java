package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mw0 {
    public final float a;
    public final lx0<Float> b;

    public mw0(float f, lx0<Float> lx0Var) {
        this.a = f;
        this.b = lx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw0)) {
            return false;
        }
        mw0 mw0Var = (mw0) obj;
        return ur1.a(Float.valueOf(this.a), Float.valueOf(mw0Var.a)) && ur1.a(this.b, mw0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
