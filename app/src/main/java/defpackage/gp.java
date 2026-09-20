package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gp extends de3<Character, char[], dp> {
    public static final gp c = new gp();

    public gp() {
        super(ii.serializer(ip.a));
    }

    @Override // defpackage.T23
    public final int i(Object obj) {
        return ((char[]) obj).length;
    }

    @Override // defpackage.hu, defpackage.T23
    public final void k(g40 g40Var, int i, Object obj, boolean z) {
        dp dpVar = (dp) obj;
        char cT = g40Var.t(this.b, i);
        dpVar.b(dpVar.d() + 1);
        char[] cArr = dpVar.a;
        int i2 = dpVar.b;
        dpVar.b = i2 + 1;
        cArr[i2] = cT;
    }

    @Override // defpackage.T23
    public final Object l(Object obj) {
        return new dp((char[]) obj);
    }

    @Override // defpackage.de3
    public final char[] o() {
        return new char[0];
    }

    @Override // defpackage.de3
    public final void p(i40 i40Var, char[] cArr, int i) {
        char[] cArr2 = cArr;
        for (int i2 = 0; i2 < i; i2++) {
            i40Var.d0(this.b, i2, cArr2[i2]);
        }
    }
}
