package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fj extends dw2.QnHx {
    public final byte[] a;
    public final n80 b;

    public fj(byte[] bArr, n80 n80Var) {
        this.a = bArr;
        this.b = n80Var;
    }

    @Override // defpackage.dw2
    public final Long a() {
        return Long.valueOf(this.a.length);
    }

    @Override // defpackage.dw2
    public final n80 b() {
        return this.b;
    }

    @Override // dw2.QnHx
    public final byte[] d() {
        return this.a;
    }
}
