package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pb4 implements bf4 {
    public final nb4 a;
    public final ad4 b;

    public pb4(nb4 nb4Var, ad4 ad4Var) {
        this.a = nb4Var;
        this.b = ad4Var;
    }

    @Override // defpackage.bf4
    public final boolean a(se4 se4Var) {
        return se4Var.a.m().e;
    }

    @Override // defpackage.bf4
    public final qw b(se4 se4Var) {
        us2 us2Var = this.a.a;
        fc fcVar = new fc(3, this, se4Var);
        m91.byN byn = m91.d;
        m91.T23 t23 = m91.c;
        us2Var.getClass();
        return new zr2(new jr2(us2Var, fcVar, byn, t23));
    }
}
