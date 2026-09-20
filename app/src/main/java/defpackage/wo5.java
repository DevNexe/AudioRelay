package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wo5 extends fv {
    public wo5() {
        super("Generic XYZ", dv.b, 14);
    }

    public static float f(float f) {
        return AY.n(f, -2.0f, 2.0f);
    }

    @Override // defpackage.fv
    public final float[] a(float[] fArr) {
        fArr[0] = f(fArr[0]);
        fArr[1] = f(fArr[1]);
        fArr[2] = f(fArr[2]);
        return fArr;
    }

    @Override // defpackage.fv
    public final float b(int i) {
        return 2.0f;
    }

    @Override // defpackage.fv
    public final float c(int i) {
        return -2.0f;
    }

    @Override // defpackage.fv
    public final float[] e(float[] fArr) {
        fArr[0] = f(fArr[0]);
        fArr[1] = f(fArr[1]);
        fArr[2] = f(fArr[2]);
        return fArr;
    }
}
