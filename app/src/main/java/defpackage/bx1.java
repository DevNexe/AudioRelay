package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bx1 extends fv {
    public bx1() {
        super("Generic L*a*b*", dv.c, 15);
    }

    @Override // defpackage.fv
    public final float[] a(float[] fArr) {
        float f = fArr[0];
        float[] fArr2 = CXJ.i;
        float f2 = f / fArr2[0];
        float f3 = fArr[1] / fArr2[1];
        float f4 = fArr[2] / fArr2[2];
        float fPow = f2 > 0.008856452f ? (float) Math.pow(f2, 0.33333334f) : (f2 * 7.787037f) + 0.13793103f;
        float fPow2 = f3 > 0.008856452f ? (float) Math.pow(f3, 0.33333334f) : (f3 * 7.787037f) + 0.13793103f;
        float fPow3 = f4 > 0.008856452f ? (float) Math.pow(f4, 0.33333334f) : (f4 * 7.787037f) + 0.13793103f;
        fArr[0] = AY.n((116.0f * fPow2) - 16.0f, 0.0f, 100.0f);
        fArr[1] = AY.n((fPow - fPow2) * 500.0f, -128.0f, 128.0f);
        fArr[2] = AY.n((fPow2 - fPow3) * 200.0f, -128.0f, 128.0f);
        return fArr;
    }

    @Override // defpackage.fv
    public final float b(int i) {
        return i == 0 ? 100.0f : 128.0f;
    }

    @Override // defpackage.fv
    public final float c(int i) {
        return i == 0 ? 0.0f : -128.0f;
    }

    @Override // defpackage.fv
    public final float[] e(float[] fArr) {
        fArr[0] = AY.n(fArr[0], 0.0f, 100.0f);
        fArr[1] = AY.n(fArr[1], -128.0f, 128.0f);
        float fN = AY.n(fArr[2], -128.0f, 128.0f);
        fArr[2] = fN;
        float f = (fArr[0] + 16.0f) / 116.0f;
        float f2 = (fArr[1] * 0.002f) + f;
        float f3 = f - (fN * 0.005f);
        float f4 = f2 > 0.20689656f ? f2 * f2 * f2 : (f2 - 0.13793103f) * 0.12841855f;
        float f5 = f > 0.20689656f ? f * f * f : (f - 0.13793103f) * 0.12841855f;
        float f6 = f3 > 0.20689656f ? f3 * f3 * f3 : (f3 - 0.13793103f) * 0.12841855f;
        float[] fArr2 = CXJ.i;
        fArr[0] = f4 * fArr2[0];
        fArr[1] = f5 * fArr2[1];
        fArr[2] = f6 * fArr2[2];
        return fArr;
    }
}
