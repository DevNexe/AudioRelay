package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class am5 {
    public final float a;
    public final float b;

    public am5(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final float[] a() {
        float f = this.a;
        float f2 = this.b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am5)) {
            return false;
        }
        am5 am5Var = (am5) obj;
        return ur1.a(Float.valueOf(this.a), Float.valueOf(am5Var.a)) && ur1.a(Float.valueOf(this.b), Float.valueOf(am5Var.b));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.a);
        sb.append(", y=");
        return dj.b(sb, this.b, ')');
    }
}
