package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class js3 extends fv {
    public static final auxFixed p = auxFixed.w;
    public final am5 d;
    public final float e;
    public final float f;
    public final l95 g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final j81<Double, Double> k;
    public final EQ l;
    public final j81<Double, Double> m;
    public final byN n;
    public final boolean o;

    public static final class CQf extends cx1 implements j81<Double, Double> {
        public final /* synthetic */ l95 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(l95 l95Var) {
            super(1);
            this.w = l95Var;
        }

        @Override // defpackage.j81
        public final Double invoke(Double d) {
            double dDoubleValue = d.doubleValue();
            l95 l95Var = this.w;
            double d2 = l95Var.b;
            double d3 = l95Var.e;
            double d4 = l95Var.d;
            return Double.valueOf(dDoubleValue >= d3 * d4 ? (Math.pow(dDoubleValue - l95Var.f, 1.0d / l95Var.a) - l95Var.c) / d2 : (dDoubleValue - l95Var.g) / d4);
        }
    }

    public static final class EQ extends cx1 implements j81<Double, Double> {
        public EQ() {
            super(1);
        }

        @Override // defpackage.j81
        public final Double invoke(Double d) {
            double dDoubleValue = d.doubleValue();
            js3 js3Var = js3.this;
            return Double.valueOf(AY.m(js3Var.k.invoke(Double.valueOf(dDoubleValue)).doubleValue(), js3Var.e, js3Var.f));
        }
    }

    public static final class F1 extends cx1 implements j81<Double, Double> {
        public final /* synthetic */ l95 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(l95 l95Var) {
            super(1);
            this.w = l95Var;
        }

        @Override // defpackage.j81
        public final Double invoke(Double d) {
            double dDoubleValue = d.doubleValue();
            l95 l95Var = this.w;
            return Double.valueOf(dDoubleValue >= l95Var.e ? Math.pow((l95Var.b * dDoubleValue) + l95Var.c, l95Var.a) : dDoubleValue * l95Var.d);
        }
    }

    public static final class LPt8Fixed extends cx1 implements j81<Double, Double> {
        public final /* synthetic */ l95 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(l95 l95Var) {
            super(1);
            this.w = l95Var;
        }

        @Override // defpackage.j81
        public final Double invoke(Double d) {
            double dPow;
            double dDoubleValue = d.doubleValue();
            l95 l95Var = this.w;
            double d2 = l95Var.b;
            if (dDoubleValue >= l95Var.e) {
                dPow = Math.pow((d2 * dDoubleValue) + l95Var.c, l95Var.a) + l95Var.f;
            } else {
                dPow = l95Var.g + (l95Var.d * dDoubleValue);
            }
            return Double.valueOf(dPow);
        }
    }

    public static final class NUlFixed extends cx1 implements j81<Double, Double> {
        public final /* synthetic */ double w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(double d) {
            super(1);
            this.w = d;
        }

        @Override // defpackage.j81
        public final Double invoke(Double d) {
            double dDoubleValue = d.doubleValue();
            if (dDoubleValue < 0.0d) {
                dDoubleValue = 0.0d;
            }
            return Double.valueOf(Math.pow(dDoubleValue, 1.0d / this.w));
        }
    }

    public static final class QnHx extends cx1 implements j81<Double, Double> {
        public final /* synthetic */ l95 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(l95 l95Var) {
            super(1);
            this.w = l95Var;
        }

        @Override // defpackage.j81
        public final Double invoke(Double d) {
            double dDoubleValue = d.doubleValue();
            l95 l95Var = this.w;
            double d2 = l95Var.b;
            double d3 = l95Var.e;
            double d4 = l95Var.d;
            return Double.valueOf(dDoubleValue >= d3 * d4 ? (Math.pow(dDoubleValue, 1.0d / l95Var.a) - l95Var.c) / d2 : dDoubleValue / d4);
        }
    }

    public static final class T23 {
        public static float a(float[] fArr) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            return f7 < 0.0f ? -f7 : f7;
        }

        public static boolean b(double d, j81 j81Var, j81 j81Var2) {
            return Math.abs(((Number) j81Var.invoke(Double.valueOf(d))).doubleValue() - ((Number) j81Var2.invoke(Double.valueOf(d))).doubleValue()) <= 0.001d;
        }
    }

    public static final class YKK extends cx1 implements j81<Double, Double> {
        public final /* synthetic */ double w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public YKK(double d) {
            super(1);
            this.w = d;
        }

        @Override // defpackage.j81
        public final Double invoke(Double d) {
            double dDoubleValue = d.doubleValue();
            if (dDoubleValue < 0.0d) {
                dDoubleValue = 0.0d;
            }
            return Double.valueOf(Math.pow(dDoubleValue, this.w));
        }
    }

    public static final class auxFixed extends cx1 implements j81<Double, Double> {
        public static final auxFixed w = new auxFixed();

        public auxFixed() {
            super(1);
        }

        @Override // defpackage.j81
        public final Double invoke(Double d) {
            return Double.valueOf(d.doubleValue());
        }
    }

    public static final class byN extends cx1 implements j81<Double, Double> {
        public byN() {
            super(1);
        }

        @Override // defpackage.j81
        public final Double invoke(Double d) {
            double dDoubleValue = d.doubleValue();
            js3 js3Var = js3.this;
            return js3Var.m.invoke(Double.valueOf(AY.m(dDoubleValue, js3Var.e, js3Var.f)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public js3(String str, float[] fArr, am5 am5Var, float[] fArr2, j81<? super Double, Double> j81Var, j81<? super Double, Double> j81Var2, float f, float f2, l95 l95Var, int i) {
        boolean z;
        super(str, dv.a, i);
        this.d = am5Var;
        this.e = f;
        this.f = f2;
        this.g = l95Var;
        this.k = j81Var;
        this.l = new EQ();
        this.m = j81Var2;
        this.n = new byN();
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f >= f2) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
        float[] fArr3 = new float[6];
        boolean z2 = false;
        if (fArr.length == 9) {
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = f3 + f4 + fArr[2];
            fArr3[0] = f3 / f5;
            fArr3[1] = f4 / f5;
            float f6 = fArr[3];
            float f7 = fArr[4];
            float f8 = f6 + f7 + fArr[5];
            fArr3[2] = f6 / f8;
            fArr3[3] = f7 / f8;
            float f9 = fArr[6];
            float f10 = fArr[7];
            float f11 = f9 + f10 + fArr[8];
            fArr3[4] = f9 / f11;
            fArr3[5] = f10 / f11;
        } else {
            System.arraycopy(fArr, 0, fArr3, 0, 6);
        }
        this.h = fArr3;
        if (fArr2 == null) {
            float f12 = fArr3[0];
            float f13 = fArr3[1];
            float f14 = fArr3[2];
            float f15 = fArr3[3];
            float f16 = fArr3[4];
            float f17 = fArr3[5];
            float f18 = 1;
            float f19 = (f18 - f12) / f13;
            float f20 = (f18 - f14) / f15;
            float f21 = (f18 - f16) / f17;
            float f22 = am5Var.a;
            float f23 = am5Var.b;
            float f24 = (f18 - f22) / f23;
            float f25 = f12 / f13;
            float f26 = (f14 / f15) - f25;
            float f27 = (f22 / f23) - f25;
            float f28 = f20 - f19;
            float f29 = (f16 / f17) - f25;
            float f30 = (((f24 - f19) * f26) - (f27 * f28)) / (((f21 - f19) * f26) - (f28 * f29));
            float f31 = (f27 - (f29 * f30)) / f26;
            float f32 = (1.0f - f31) - f30;
            float f33 = f32 / f13;
            float f34 = f31 / f15;
            float f35 = f30 / f17;
            this.i = new float[]{f33 * f12, f32, ((1.0f - f12) - f13) * f33, f34 * f14, f31, ((1.0f - f14) - f15) * f34, f35 * f16, f30, ((1.0f - f16) - f17) * f35};
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.i = fArr2;
        }
        this.j = fp1.d0(this.i);
        float fA = T23.a(fArr3);
        float[] fArr4 = hv.a;
        if (fA / T23.a(hv.b) > 0.9f) {
            float[] fArr5 = hv.a;
            float f36 = fArr3[0];
            float f37 = fArr5[0];
            float f38 = f36 - f37;
            float f39 = fArr3[1];
            float f40 = fArr5[1];
            float f41 = f39 - f40;
            float f42 = fArr3[2];
            float f43 = fArr5[2];
            float f44 = f42 - f43;
            float f45 = fArr3[3];
            float f46 = fArr5[3];
            float f47 = f45 - f46;
            float f48 = fArr3[4];
            float f49 = fArr5[4];
            float f50 = f48 - f49;
            float f51 = fArr3[5];
            float f52 = fArr5[5];
            float f53 = f51 - f52;
            if (((f40 - f52) * f38) - ((f37 - f49) * f41) < 0.0f || ((f37 - f43) * f41) - ((f40 - f46) * f38) < 0.0f || ((f46 - f40) * f44) - ((f43 - f37) * f47) < 0.0f || ((f43 - f49) * f47) - ((f46 - f52) * f44) < 0.0f || ((f52 - f46) * f50) - ((f49 - f43) * f53) < 0.0f || ((f49 - f37) * f53) - ((f52 - f40) * f50) >= 0.0f) {
            }
        }
        if (i != 0) {
            float[] fArr6 = hv.a;
            if (fArr3 == fArr6) {
                z = true;
                break;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= 6) {
                    z = true;
                    break;
                } else {
                    if (Float.compare(fArr3[i2], fArr6[i2]) != 0 && Math.abs(fArr3[i2] - fArr6[i2]) > 0.001f) {
                        z = false;
                        break;
                    }
                    i2++;
                }
            }
            if (z && fp1.M(am5Var, CXJ.h)) {
                if (f == 0.0f) {
                    if (f2 == 1.0f) {
                        float[] fArr7 = hv.a;
                        js3 js3Var = hv.c;
                        for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                            if (T23.b(d, j81Var, js3Var.k) && T23.b(d, j81Var2, js3Var.m)) {
                            }
                        }
                        z2 = true;
                    }
                }
            }
        } else {
            z2 = true;
        }
        this.o = z2;
    }

    @Override // defpackage.fv
    public final float[] a(float[] fArr) {
        fp1.o0(this.j, fArr);
        Double dValueOf = Double.valueOf(fArr[0]);
        EQ eq = this.l;
        fArr[0] = (float) ((Number) eq.invoke(dValueOf)).doubleValue();
        fArr[1] = (float) ((Number) eq.invoke(Double.valueOf(fArr[1]))).doubleValue();
        fArr[2] = (float) ((Number) eq.invoke(Double.valueOf(fArr[2]))).doubleValue();
        return fArr;
    }

    @Override // defpackage.fv
    public final float b(int i) {
        return this.f;
    }

    @Override // defpackage.fv
    public final float c(int i) {
        return this.e;
    }

    @Override // defpackage.fv
    public final boolean d() {
        return this.o;
    }

    @Override // defpackage.fv
    public final float[] e(float[] fArr) {
        Double dValueOf = Double.valueOf(fArr[0]);
        byN byn = this.n;
        fArr[0] = (float) ((Number) byn.invoke(dValueOf)).doubleValue();
        fArr[1] = (float) ((Number) byn.invoke(Double.valueOf(fArr[1]))).doubleValue();
        fArr[2] = (float) ((Number) byn.invoke(Double.valueOf(fArr[2]))).doubleValue();
        fp1.o0(this.i, fArr);
        return fArr;
    }

    @Override // defpackage.fv
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ur1.a(nl3.a(js3.class), nl3.a(obj.getClass())) || !super.equals(obj)) {
            return false;
        }
        js3 js3Var = (js3) obj;
        if (Float.compare(js3Var.e, this.e) != 0 || Float.compare(js3Var.f, this.f) != 0 || !ur1.a(this.d, js3Var.d) || !Arrays.equals(this.h, js3Var.h)) {
            return false;
        }
        l95 l95Var = js3Var.g;
        l95 l95Var2 = this.g;
        if (l95Var2 != null) {
            return ur1.a(l95Var2, l95Var);
        }
        if (l95Var == null) {
            return true;
        }
        if (ur1.a(this.k, js3Var.k)) {
            return ur1.a(this.m, js3Var.m);
        }
        return false;
    }

    @Override // defpackage.fv
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int iFloatToIntBits = (iHashCode + (!((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) == 0) ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.f;
        int iFloatToIntBits2 = (iFloatToIntBits + (!(f2 == 0.0f) ? Float.floatToIntBits(f2) : 0)) * 31;
        l95 l95Var = this.g;
        int iHashCode2 = iFloatToIntBits2 + (l95Var != null ? l95Var.hashCode() : 0);
        if (l95Var == null) {
            return this.m.hashCode() + ((this.k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    /* JADX WARN: Code duplicated, block: B:25:0x003d  */
    public js3(String str, float[] fArr, am5 am5Var, l95 l95Var, int i) {
        j81 cQf;
        j81 lPt8;
        double d = l95Var.f;
        boolean z = d == 0.0d;
        double d2 = l95Var.g;
        if (z) {
            if (d2 == 0.0d) {
                cQf = new QnHx(l95Var);
            } else {
                cQf = new CQf(l95Var);
            }
        } else {
            cQf = new CQf(l95Var);
        }
        j81 j81Var = cQf;
        if (d == 0.0d) {
            if (d2 == 0.0d) {
                lPt8 = new F1(l95Var);
            } else {
                lPt8 = new LPt8Fixed(l95Var);
            }
        } else {
            lPt8 = new LPt8Fixed(l95Var);
        }
        this(str, fArr, am5Var, null, j81Var, lPt8, 0.0f, 1.0f, l95Var, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public js3(String str, float[] fArr, am5 am5Var, double d, float f, float f2, int i) {
        boolean z = d == 1.0d;
        auxFixed auxVar = p;
        this(str, fArr, am5Var, null, z ? auxVar : new NUlFixed(d), d == 1.0d ? auxVar : new YKK(d), f, f2, new l95(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
