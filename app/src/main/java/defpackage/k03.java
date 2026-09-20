package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k03 implements ja0 {
    public final float a;

    public k03(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.ja0
    public final float a(long j, ij0 ij0Var) {
        return (this.a / 100.0f) * cm4.d(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k03) && ur1.a(Float.valueOf(this.a), Float.valueOf(((k03) obj).a));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
