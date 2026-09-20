package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class je0 extends zv1 {
    public final float b;

    public je0() {
        super(0);
        this.b = -1.0f;
    }

    @Override // defpackage.zv1
    public final void a(float f, float f2, hj4 hj4Var) {
        hj4Var.e(f2 * f, 180.0f, 90.0f);
        double d = f2;
        double d2 = f;
        hj4Var.d((float) (Math.sin(Math.toRadians(90.0f)) * d * d2), (float) (Math.sin(Math.toRadians(0.0f)) * d * d2));
    }
}
