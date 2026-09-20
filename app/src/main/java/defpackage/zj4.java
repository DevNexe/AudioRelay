package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zj4 extends de3<Short, short[], yj4> {
    public static final zj4 c = new zj4();

    public zj4() {
        super(ii.serializer(ak4.a));
    }

    @Override // defpackage.T23
    public final int i(Object obj) {
        return ((short[]) obj).length;
    }

    @Override // defpackage.hu, defpackage.T23
    public final void k(g40 g40Var, int i, Object obj, boolean z) {
        yj4 yj4Var = (yj4) obj;
        short sD = g40Var.D(this.b, i);
        yj4Var.b(yj4Var.d() + 1);
        short[] sArr = yj4Var.a;
        int i2 = yj4Var.b;
        yj4Var.b = i2 + 1;
        sArr[i2] = sD;
    }

    @Override // defpackage.T23
    public final Object l(Object obj) {
        return new yj4((short[]) obj);
    }

    @Override // defpackage.de3
    public final short[] o() {
        return new short[0];
    }

    @Override // defpackage.de3
    public final void p(i40 i40Var, short[] sArr, int i) {
        short[] sArr2 = sArr;
        for (int i2 = 0; i2 < i; i2++) {
            i40Var.Z(this.b, i2, sArr2[i2]);
        }
    }
}
