package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gr4 {
    public boolean c;
    public double d;
    public double e;
    public double f;
    public float a = 1.0f;
    public double b = Math.sqrt(50.0d);
    public float g = 1.0f;

    public final long a(float f, float f2, long j) {
        double dCos;
        double dExp;
        if (!this.c) {
            if (this.a == Float.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            float f3 = this.g;
            double d = f3;
            double d2 = d * d;
            if (f3 > 1.0f) {
                double d3 = this.b;
                double d4 = d2 - ((double) 1);
                this.d = (Math.sqrt(d4) * d3) + (((double) (-f3)) * d3);
                double d5 = -this.g;
                double d6 = this.b;
                this.e = (d5 * d6) - (Math.sqrt(d4) * d6);
            } else if (f3 >= 0.0f && f3 < 1.0f) {
                this.f = Math.sqrt(((double) 1) - d2) * this.b;
            }
            this.c = true;
        }
        float f4 = f - this.a;
        double d7 = j / 1000.0d;
        float f5 = this.g;
        if (f5 > 1.0f) {
            double d8 = f4;
            double d9 = this.e;
            double d10 = f2;
            double d11 = this.d;
            double d12 = d8 - (((d9 * d8) - d10) / (d9 - d11));
            double d13 = ((d8 * d9) - d10) / (d9 - d11);
            dExp = (Math.exp(this.d * d7) * d13) + (Math.exp(d9 * d7) * d12);
            double d14 = this.e;
            double dExp2 = Math.exp(d14 * d7) * d12 * d14;
            double d15 = this.d;
            dCos = (Math.exp(d15 * d7) * d13 * d15) + dExp2;
        } else {
            if (f5 == 1.0f) {
                double d16 = this.b;
                double d17 = f4;
                double d18 = (d16 * d17) + ((double) f2);
                double d19 = (d18 * d7) + d17;
                double dExp3 = Math.exp((-d16) * d7) * d19;
                double dExp4 = Math.exp((-this.b) * d7) * d19;
                double d20 = this.b;
                dCos = (Math.exp((-d20) * d7) * d18) + (dExp4 * (-d20));
                dExp = dExp3;
            } else {
                double d21 = ((double) 1) / this.f;
                double d22 = this.b;
                double d23 = f4;
                double d24 = ((((double) f5) * d22 * d23) + ((double) f2)) * d21;
                double dExp5 = Math.exp(((double) (-f5)) * d22 * d7) * ((Math.sin(this.f * d7) * d24) + (Math.cos(this.f * d7) * d23));
                double d25 = this.b;
                float f6 = this.g;
                double d26 = (-d25) * dExp5 * ((double) f6);
                double dExp6 = Math.exp(((double) (-f6)) * d25 * d7);
                double d27 = this.f;
                double dSin = Math.sin(d27 * d7) * (-d27) * d23;
                double d28 = this.f;
                dCos = (((Math.cos(d28 * d7) * d24 * d28) + dSin) * dExp6) + d26;
                dExp = dExp5;
            }
        }
        return (((long) Float.floatToIntBits((float) dCos)) & 4294967295L) | (((long) Float.floatToIntBits((float) (dExp + ((double) this.a)))) << 32);
    }
}
