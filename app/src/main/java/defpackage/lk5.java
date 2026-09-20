package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lk5 {
    public final float a = 0.0f;
    public final float b;

    public lk5(float f) {
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk5)) {
            return false;
        }
        lk5 lk5Var = (lk5) obj;
        return ur1.a(Float.valueOf(this.a), Float.valueOf(lk5Var.a)) && ur1.a(Float.valueOf(this.b), Float.valueOf(lk5Var.b));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        return "VisibleYRange(min=" + this.a + ", max=" + this.b + ")";
    }
}
