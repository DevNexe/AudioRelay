package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g74 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public g74 f;
    public g74 g;

    public g74() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final g74 a() {
        g74 g74Var = this.f;
        g74 g74Var2 = g74Var != this ? g74Var : null;
        g74 g74Var3 = this.g;
        g74Var3.f = g74Var;
        this.f.g = g74Var3;
        this.f = null;
        this.g = null;
        return g74Var2;
    }

    public final void b(g74 g74Var) {
        g74Var.g = this;
        g74Var.f = this.f;
        this.f.g = g74Var;
        this.f = g74Var;
    }

    public final g74 c() {
        this.d = true;
        return new g74(this.a, this.b, this.c, true, false);
    }

    public final void d(g74 g74Var, int i) {
        if (!g74Var.e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i2 = g74Var.c;
        int i3 = i2 + i;
        byte[] bArr = g74Var.a;
        if (i3 > 8192) {
            if (g74Var.d) {
                throw new IllegalArgumentException();
            }
            int i4 = g74Var.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
            g74Var.c -= g74Var.b;
            g74Var.b = 0;
        }
        int i5 = g74Var.c;
        int i6 = this.b;
        System.arraycopy(this.a, i6, bArr, i5, (i6 + i) - i6);
        g74Var.c += i;
        this.b += i;
    }

    public g74(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }
}
