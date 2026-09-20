package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sy0 {
    public final float a;
    public final ij0 b;
    public final float c;

    public static final class QnHx {
        public final float a;
        public final float b;
        public final long c;

        public QnHx(float f, float f2, long j) {
            this.a = f;
            this.b = f2;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QnHx)) {
                return false;
            }
            QnHx qnHx = (QnHx) obj;
            return ur1.a(Float.valueOf(this.a), Float.valueOf(qnHx.a)) && ur1.a(Float.valueOf(this.b), Float.valueOf(qnHx.b)) && this.c == qnHx.c;
        }

        public final int hashCode() {
            int iB = ry0.b(this.b, Float.floatToIntBits(this.a) * 31, 31);
            long j = this.c;
            return iB + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            return "FlingInfo(initialVelocity=" + this.a + ", distance=" + this.b + ", duration=" + this.c + ')';
        }
    }

    public sy0(float f, ij0 ij0Var) {
        this.a = f;
        this.b = ij0Var;
        float density = ij0Var.getDensity();
        float f2 = ty0.a;
        this.c = density * 386.0878f * 160.0f * 0.84f;
    }

    public final QnHx a(float f) {
        double dB = b(f);
        double d = ty0.a;
        double d2 = d - 1.0d;
        return new QnHx(f, (float) (Math.exp((d / d2) * dB) * ((double) (this.a * this.c))), (long) (Math.exp(dB / d2) * 1000.0d));
    }

    public final double b(float f) {
        float[] fArr = dUh_.a;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.a * this.c)));
    }
}
