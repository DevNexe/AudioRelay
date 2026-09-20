package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gy1 implements yl3 {
    public final x81<ua0, z80<? super sd5>, Object> w;
    public final w80 x;
    public qr4 y;

    /* JADX WARN: Multi-variable type inference failed */
    public gy1(la0 la0Var, x81<? super ua0, ? super z80<? super sd5>, ? extends Object> x81Var) {
        this.w = x81Var;
        this.x = fp1.j(la0Var);
    }

    @Override // defpackage.yl3
    public final void a() {
        qr4 qr4Var = this.y;
        if (qr4Var != null) {
            qr4Var.m(null);
        }
        this.y = null;
    }

    @Override // defpackage.yl3
    public final void c() {
        qr4 qr4Var = this.y;
        if (qr4Var != null) {
            qr4Var.m(null);
        }
        this.y = null;
    }

    @Override // defpackage.yl3
    public final void d() {
        qr4 qr4Var = this.y;
        if (qr4Var != null) {
            qr4Var.m(ps0.b("Old job was still running!", null));
        }
        this.y = fp1.k0(this.x, null, 0, this.w, 3);
    }
}
