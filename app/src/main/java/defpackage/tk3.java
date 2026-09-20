package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tk3 implements rk3 {
    public int a;
    public n40 b;
    public Z1 c;
    public x81<? super g30, ? super Integer, sd5> d;
    public int e;
    public uh1 f;
    public vh1 g;

    public tk3(n40 n40Var) {
        this.b = n40Var;
    }

    @Override // defpackage.rk3
    public final void invalidate() {
        n40 n40Var = this.b;
        if (n40Var != null) {
            n40Var.z(this, null);
        }
    }
}
