package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jp1 extends de3<Integer, int[], ip1> {
    public static final jp1 c = new jp1();

    public jp1() {
        super(ii.serializer(kp1.a));
    }

    @Override // defpackage.T23
    public final int i(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // defpackage.hu, defpackage.T23
    public final void k(g40 g40Var, int i, Object obj, boolean z) {
        ip1 ip1Var = (ip1) obj;
        int iW = g40Var.W(this.b, i);
        ip1Var.b(ip1Var.d() + 1);
        int[] iArr = ip1Var.a;
        int i2 = ip1Var.b;
        ip1Var.b = i2 + 1;
        iArr[i2] = iW;
    }

    @Override // defpackage.T23
    public final Object l(Object obj) {
        return new ip1((int[]) obj);
    }

    @Override // defpackage.de3
    public final int[] o() {
        return new int[0];
    }

    @Override // defpackage.de3
    public final void p(i40 i40Var, int[] iArr, int i) {
        int[] iArr2 = iArr;
        for (int i2 = 0; i2 < i; i2++) {
            i40Var.g(i2, iArr2[i2], this.b);
        }
    }
}
