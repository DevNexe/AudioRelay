package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nh5 {
    public static final nh5 e;
    public final long a;
    public final float b;
    public final long c;
    public final long d;

    static {
        long j = kt2.b;
        e = new nh5(j, 1.0f, 0L, j);
    }

    public nh5(long j, float f, long j2, long j3) {
        this.a = j;
        this.b = f;
        this.c = j2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh5)) {
            return false;
        }
        nh5 nh5Var = (nh5) obj;
        return kt2.a(this.a, nh5Var.a) && ur1.a(Float.valueOf(this.b), Float.valueOf(nh5Var.b)) && this.c == nh5Var.c && kt2.a(this.d, nh5Var.d);
    }

    public final int hashCode() {
        int iB = ry0.b(this.b, kt2.e(this.a) * 31, 31);
        long j = this.c;
        return kt2.e(this.d) + ((iB + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        return "VelocityEstimate(pixelsPerSecond=" + ((Object) kt2.i(this.a)) + ", confidence=" + this.b + ", durationMillis=" + this.c + ", offset=" + ((Object) kt2.i(this.d)) + ')';
    }
}
