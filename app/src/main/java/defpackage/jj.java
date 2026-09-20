package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jj extends de3<Byte, byte[], cj> {
    public static final jj c = new jj();

    public jj() {
        super(ii.serializer(dk.a));
    }

    @Override // defpackage.T23
    public final int i(Object obj) {
        return ((byte[]) obj).length;
    }

    @Override // defpackage.hu, defpackage.T23
    public final void k(g40 g40Var, int i, Object obj, boolean z) {
        cj cjVar = (cj) obj;
        byte bZ = g40Var.z(this.b, i);
        cjVar.b(cjVar.d() + 1);
        byte[] bArr = cjVar.a;
        int i2 = cjVar.b;
        cjVar.b = i2 + 1;
        bArr[i2] = bZ;
    }

    @Override // defpackage.T23
    public final Object l(Object obj) {
        return new cj((byte[]) obj);
    }

    @Override // defpackage.de3
    public final byte[] o() {
        return new byte[0];
    }

    @Override // defpackage.de3
    public final void p(i40 i40Var, byte[] bArr, int i) {
        byte[] bArr2 = bArr;
        for (int i2 = 0; i2 < i; i2++) {
            i40Var.I(this.b, i2, bArr2[i2]);
        }
    }
}
