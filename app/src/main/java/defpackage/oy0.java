package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oy0 implements m75 {
    public final float a;

    public oy0(float f) {
        this.a = f;
    }

    @Override // defpackage.m75
    public final float a(ij0 ij0Var, float f, float f2) {
        return (Math.signum(f2 - f) * ij0Var.b0(this.a)) + f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oy0) && wm0.a(this.a, ((oy0) obj).a);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "FixedThreshold(offset=" + ((Object) wm0.c(this.a)) + ')';
    }
}
