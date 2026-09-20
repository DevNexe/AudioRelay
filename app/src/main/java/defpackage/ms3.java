package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ms3 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public ms3(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms3)) {
            return false;
        }
        ms3 ms3Var = (ms3) obj;
        if (!(this.a == ms3Var.a)) {
            return false;
        }
        if (!(this.b == ms3Var.b)) {
            return false;
        }
        if (this.c == ms3Var.c) {
            return (this.d > ms3Var.d ? 1 : (this.d == ms3Var.d ? 0 : -1)) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) + ry0.b(this.c, ry0.b(this.b, Float.floatToIntBits(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.a);
        sb.append(", focusedAlpha=");
        sb.append(this.b);
        sb.append(", hoveredAlpha=");
        sb.append(this.c);
        sb.append(", pressedAlpha=");
        return dj.b(sb, this.d, ')');
    }
}
