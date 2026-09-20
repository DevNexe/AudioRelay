package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xm0 implements ja0 {
    public final float a;

    public xm0(float f) {
        this.a = f;
    }

    @Override // defpackage.ja0
    public final float a(long j, ij0 ij0Var) {
        return ij0Var.b0(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xm0) && wm0.a(this.a, ((xm0) obj).a);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
