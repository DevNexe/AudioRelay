package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fu2 extends fv {
    public static final float[] d;
    public static final float[] e;
    public static final float[] f;
    public static final float[] g;

    static {
        float[] fArrM0 = fp1.m0(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, fp1.J(KWBB.b.a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        d = fArrM0;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        e = fArr;
        f = fp1.d0(fArrM0);
        g = fp1.d0(fArr);
    }

    public fu2() {
        super("Oklab", dv.c, 17);
    }

    @Override // defpackage.fv
    public final float[] a(float[] fArr) {
        fp1.o0(d, fArr);
        double d2 = 0.33333334f;
        fArr[0] = Math.signum(fArr[0]) * ((float) Math.pow(Math.abs(fArr[0]), d2));
        fArr[1] = Math.signum(fArr[1]) * ((float) Math.pow(Math.abs(fArr[1]), d2));
        fArr[2] = Math.signum(fArr[2]) * ((float) Math.pow(Math.abs(fArr[2]), d2));
        fp1.o0(e, fArr);
        return fArr;
    }

    @Override // defpackage.fv
    public final float b(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    @Override // defpackage.fv
    public final float c(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    @Override // defpackage.fv
    public final float[] e(float[] fArr) {
        fArr[0] = AY.n(fArr[0], 0.0f, 1.0f);
        fArr[1] = AY.n(fArr[1], -0.5f, 0.5f);
        fArr[2] = AY.n(fArr[2], -0.5f, 0.5f);
        fp1.o0(g, fArr);
        float f2 = fArr[0];
        fArr[0] = f2 * f2 * f2;
        float f3 = fArr[1];
        fArr[1] = f3 * f3 * f3;
        float f4 = fArr[2];
        fArr[2] = f4 * f4 * f4;
        fp1.o0(f, fArr);
        return fArr;
    }
}
