package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vc0 implements mq0 {
    public final float c;
    public final float a = 0.4f;
    public final float b = 0.0f;
    public final float d = 1.0f;

    public vc0(float f) {
        this.c = f;
    }

    @Override // defpackage.mq0
    public final float a(float f) {
        float f2 = 0.0f;
        if (f > 0.0f) {
            float f3 = 1.0f;
            if (f < 1.0f) {
                while (true) {
                    float f4 = (f2 + f3) / 2;
                    float f5 = 3;
                    float f6 = 1 - f4;
                    float f7 = f4 * f4 * f4;
                    float f8 = (this.c * f5 * f6 * f4 * f4) + (this.a * f5 * f6 * f6 * f4) + f7;
                    if (Math.abs(f - f8) < 0.001f) {
                        return (f5 * this.d * f6 * f4 * f4) + (this.b * f5 * f6 * f6 * f4) + f7;
                    }
                    if (f8 < f) {
                        f2 = f4;
                    } else {
                        f3 = f4;
                    }
                }
            }
        }
        return f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vc0)) {
            return false;
        }
        vc0 vc0Var = (vc0) obj;
        if (!(this.a == vc0Var.a)) {
            return false;
        }
        if (!(this.b == vc0Var.b)) {
            return false;
        }
        if (this.c == vc0Var.c) {
            return (this.d > vc0Var.d ? 1 : (this.d == vc0Var.d ? 0 : -1)) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) + ry0.b(this.c, ry0.b(this.b, Float.floatToIntBits(this.a) * 31, 31), 31);
    }
}
