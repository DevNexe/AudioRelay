package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vc extends de3<Boolean, boolean[], sc> {
    public static final vc c = new vc();

    public vc() {
        super(ii.serializer(wc.a));
    }

    @Override // defpackage.T23
    public final int i(Object obj) {
        return ((boolean[]) obj).length;
    }

    @Override // defpackage.hu, defpackage.T23
    public final void k(g40 g40Var, int i, Object obj, boolean z) {
        sc scVar = (sc) obj;
        boolean zI0 = g40Var.i0(this.b, i);
        scVar.b(scVar.d() + 1);
        boolean[] zArr = scVar.a;
        int i2 = scVar.b;
        scVar.b = i2 + 1;
        zArr[i2] = zI0;
    }

    @Override // defpackage.T23
    public final Object l(Object obj) {
        return new sc((boolean[]) obj);
    }

    @Override // defpackage.de3
    public final boolean[] o() {
        return new boolean[0];
    }

    @Override // defpackage.de3
    public final void p(i40 i40Var, boolean[] zArr, int i) {
        boolean[] zArr2 = zArr;
        for (int i2 = 0; i2 < i; i2++) {
            i40Var.a0(this.b, i2, zArr2[i2]);
        }
    }
}
