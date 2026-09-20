package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qv4 extends B8C {
    public final float w;
    public final float x;
    public final int y;
    public final int z;

    public qv4(float f, float f2, int i, int i2, int i3) {
        f = (i3 & 1) != 0 ? 0.0f : f;
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.w = f;
        this.x = f2;
        this.y = i;
        this.z = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv4)) {
            return false;
        }
        qv4 qv4Var = (qv4) obj;
        if (!(this.w == qv4Var.w)) {
            return false;
        }
        if (!(this.x == qv4Var.x)) {
            return false;
        }
        if (!(this.y == qv4Var.y)) {
            return false;
        }
        if (!(this.z == qv4Var.z)) {
            return false;
        }
        qv4Var.getClass();
        return ur1.a(null, null);
    }

    public final int hashCode() {
        return ((((ry0.b(this.x, Float.floatToIntBits(this.w) * 31, 31) + this.y) * 31) + this.z) * 31) + 0;
    }

    public final String toString() {
        return "Stroke(width=" + this.w + ", miter=" + this.x + ", cap=" + ((Object) rv4.a(this.y)) + ", join=" + ((Object) sv4.a(this.z)) + ", pathEffect=" + ((Object) null) + ')';
    }
}
