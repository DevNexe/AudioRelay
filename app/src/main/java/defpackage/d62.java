package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d62 extends de3<Long, long[], c62> {
    public static final d62 c = new d62();

    public d62() {
        super(ii.serializer(e62.a));
    }

    @Override // defpackage.T23
    public final int i(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // defpackage.hu, defpackage.T23
    public final void k(g40 g40Var, int i, Object obj, boolean z) {
        c62 c62Var = (c62) obj;
        long jP0 = g40Var.p0(this.b, i);
        c62Var.b(c62Var.d() + 1);
        long[] jArr = c62Var.a;
        int i2 = c62Var.b;
        c62Var.b = i2 + 1;
        jArr[i2] = jP0;
    }

    @Override // defpackage.T23
    public final Object l(Object obj) {
        return new c62((long[]) obj);
    }

    @Override // defpackage.de3
    public final long[] o() {
        return new long[0];
    }

    @Override // defpackage.de3
    public final void p(i40 i40Var, long[] jArr, int i) {
        long[] jArr2 = jArr;
        for (int i2 = 0; i2 < i; i2++) {
            i40Var.n(this.b, i2, jArr2[i2]);
        }
    }
}
