package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xy0 extends de3<Float, float[], wy0> {
    public static final xy0 c = new xy0();

    public xy0() {
        super(ii.serializer(yy0.a));
    }

    @Override // defpackage.T23
    public final int i(Object obj) {
        return ((float[]) obj).length;
    }

    @Override // defpackage.hu, defpackage.T23
    public final void k(g40 g40Var, int i, Object obj, boolean z) {
        wy0 wy0Var = (wy0) obj;
        float fV = g40Var.v(this.b, i);
        wy0Var.b(wy0Var.d() + 1);
        float[] fArr = wy0Var.a;
        int i2 = wy0Var.b;
        wy0Var.b = i2 + 1;
        fArr[i2] = fV;
    }

    @Override // defpackage.T23
    public final Object l(Object obj) {
        return new wy0((float[]) obj);
    }

    @Override // defpackage.de3
    public final float[] o() {
        return new float[0];
    }

    @Override // defpackage.de3
    public final void p(i40 i40Var, float[] fArr, int i) {
        float[] fArr2 = fArr;
        for (int i2 = 0; i2 < i; i2++) {
            i40Var.R(this.b, i2, fArr2[i2]);
        }
    }
}
