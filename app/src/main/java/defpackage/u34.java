package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u34 {
    public final float a;
    public final long b;
    public final lx0<Float> c;

    public u34() {
        throw null;
    }

    public u34(float f, long j, lx0 lx0Var) {
        this.a = f;
        this.b = j;
        this.c = lx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u34)) {
            return false;
        }
        u34 u34Var = (u34) obj;
        if (!ur1.a(Float.valueOf(this.a), Float.valueOf(u34Var.a))) {
            return false;
        }
        int i = m95.c;
        return ((this.b > u34Var.b ? 1 : (this.b == u34Var.b ? 0 : -1)) == 0) && ur1.a(this.c, u34Var.c);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.a) * 31;
        int i = m95.c;
        long j = this.b;
        return this.c.hashCode() + ((((int) (j ^ (j >>> 32))) + iFloatToIntBits) * 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + ((Object) m95.b(this.b)) + ", animationSpec=" + this.c + ')';
    }
}
