package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rm0 extends de3<Double, double[], qm0> {
    public static final rm0 c = new rm0();

    public rm0() {
        super(ii.serializer(tm0.a));
    }

    @Override // defpackage.T23
    public final int i(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // defpackage.hu, defpackage.T23
    public final void k(g40 g40Var, int i, Object obj, boolean z) {
        qm0 qm0Var = (qm0) obj;
        double dS = g40Var.s(this.b, i);
        qm0Var.b(qm0Var.d() + 1);
        double[] dArr = qm0Var.a;
        int i2 = qm0Var.b;
        qm0Var.b = i2 + 1;
        dArr[i2] = dS;
    }

    @Override // defpackage.T23
    public final Object l(Object obj) {
        return new qm0((double[]) obj);
    }

    @Override // defpackage.de3
    public final double[] o() {
        return new double[0];
    }

    @Override // defpackage.de3
    public final void p(i40 i40Var, double[] dArr, int i) {
        double[] dArr2 = dArr;
        for (int i2 = 0; i2 < i; i2++) {
            i40Var.f(this.b, i2, dArr2[i2]);
        }
    }
}
