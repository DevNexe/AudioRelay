package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dUh_ {
    public static final float[] a;

    public static final class QnHx {
        public final float a;
        public final float b;

        public QnHx(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QnHx)) {
                return false;
            }
            QnHx qnHx = (QnHx) obj;
            return ur1.a(Float.valueOf(this.a), Float.valueOf(qnHx.a)) && ur1.a(Float.valueOf(this.b), Float.valueOf(qnHx.b));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
            sb.append(this.a);
            sb.append(", velocityCoefficient=");
            return dj.b(sb, this.b, ')');
        }
    }

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float[] fArr = new float[101];
        a = fArr;
        float[] fArr2 = new float[101];
        float f11 = 0.0f;
        float f12 = 0.0f;
        int i = 0;
        while (true) {
            float f13 = 1.0f;
            if (i >= 100) {
                fArr[100] = 1.0f;
                return;
            }
            float f14 = i / 100;
            float f15 = 1.0f;
            while (true) {
                f = 2.0f;
                f2 = ((f15 - f11) / 2.0f) + f11;
                f3 = 3.0f;
                f4 = f13 - f2;
                f5 = f2 * 3.0f * f4;
                f6 = f2 * f2 * f2;
                float f16 = (((f2 * 0.35000002f) + (f4 * 0.175f)) * f5) + f6;
                float f17 = f15;
                if (Math.abs(f16 - f14) < 1.0E-5d) {
                    break;
                }
                if (f16 > f14) {
                    f15 = f2;
                } else {
                    f11 = f2;
                    f15 = f17;
                }
                f13 = 1.0f;
            }
            float f18 = 0.5f;
            fArr[i] = (((f4 * 0.5f) + f2) * f5) + f6;
            float f19 = 1.0f;
            while (true) {
                f7 = ((f19 - f12) / f) + f12;
                f8 = 1.0f - f7;
                f9 = f7 * f3 * f8;
                f10 = f7 * f7 * f7;
                float f20 = (((f8 * f18) + f7) * f9) + f10;
                if (Math.abs(f20 - f14) >= 1.0E-5d) {
                    if (f20 > f14) {
                        f19 = f7;
                    } else {
                        f12 = f7;
                    }
                    f18 = 0.5f;
                    f = 2.0f;
                    f3 = 3.0f;
                }
            }
            fArr2[i] = (((f7 * 0.35000002f) + (f8 * 0.175f)) * f9) + f10;
            i++;
        }
    }

    public static QnHx a(float f) {
        float f2;
        float f3;
        float f4 = 100;
        int i = (int) (f4 * f);
        if (i < 100) {
            float f5 = i / f4;
            int i2 = i + 1;
            float f6 = i2 / f4;
            float[] fArr = a;
            float f7 = fArr[i];
            f3 = (fArr[i2] - f7) / (f6 - f5);
            f2 = ((f - f5) * f3) + f7;
        } else {
            f2 = 1.0f;
            f3 = 0.0f;
        }
        return new QnHx(f2, f3);
    }
}
