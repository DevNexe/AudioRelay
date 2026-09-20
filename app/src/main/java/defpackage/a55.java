package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a55 {
    public static final a55 c = new a55(1.0f, 0.0f);
    public final float a;
    public final float b;

    public a55(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a55)) {
            return false;
        }
        a55 a55Var = (a55) obj;
        if (this.a == a55Var.a) {
            return (this.b > a55Var.b ? 1 : (this.b == a55Var.b ? 0 : -1)) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.a);
        sb.append(", skewX=");
        return dj.b(sb, this.b, ')');
    }

    public a55() {
        this(1.0f, 0.0f);
    }
}
