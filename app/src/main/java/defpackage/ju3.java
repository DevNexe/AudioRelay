package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ju3 implements z11 {
    public final float a;
    public final float b;
    public final long c;

    public ju3(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ju3)) {
            return false;
        }
        ju3 ju3Var = (ju3) obj;
        if (ju3Var.a == this.a) {
            return ((ju3Var.b > this.b ? 1 : (ju3Var.b == this.b ? 0 : -1)) == 0) && ju3Var.c == this.c;
        }
        return false;
    }

    public final int hashCode() {
        int iB = ry0.b(this.b, ry0.b(this.a, 0, 31), 31);
        long j = this.c;
        return iB + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.a + ",horizontalScrollPixels=" + this.b + ",uptimeMillis=" + this.c + ')';
    }
}
