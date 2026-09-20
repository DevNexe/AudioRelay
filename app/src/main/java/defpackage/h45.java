package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h45 implements g25 {
    public final /* synthetic */ j45 a;

    public h45(j45 j45Var) {
        this.a = j45Var;
    }

    @Override // defpackage.g25
    public final void a(long j) {
        j45 j45Var = this.a;
        long jA = v74.a(j45Var.i(true));
        j45Var.k = jA;
        j45Var.o.setValue(new kt2(jA));
        j45Var.m = kt2.b;
        j45Var.n.setValue(eb1.Cursor);
    }

    @Override // defpackage.g25
    public final void b() {
        j45 j45Var = this.a;
        j45.b(j45Var, null);
        j45.a(j45Var, null);
    }

    @Override // defpackage.g25
    public final void c() {
        eb1 eb1Var = eb1.Cursor;
        j45 j45Var = this.a;
        j45.b(j45Var, eb1Var);
        j45Var.o.setValue(new kt2(v74.a(j45Var.i(true))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.g25
    public final void d(long j) {
        p55 p55VarC;
        o55 o55Var;
        j45 j45Var = this.a;
        j45Var.m = kt2.g(j45Var.m, j);
        u45 u45Var = j45Var.d;
        if (u45Var == null || (p55VarC = u45Var.c()) == null || (o55Var = p55VarC.a) == null) {
            return;
        }
        kt2 kt2Var = new kt2(kt2.g(j45Var.k, j45Var.m));
        kz2 kz2Var = j45Var.o;
        kz2Var.setValue(kt2Var);
        int iL = o55Var.l(((kt2) kz2Var.getValue()).a);
        long jA = Cz.a(iL, iL);
        if (s55.a(jA, j45Var.j().b)) {
            return;
        }
        vb1 vb1Var = j45Var.h;
        if (vb1Var != null) {
            vb1Var.a();
        }
        j45Var.c.invoke(j45.e(j45Var.j().a, jA));
    }

    @Override // defpackage.g25
    public final void onCancel() {
    }

    @Override // defpackage.g25
    public final void onStop() {
        j45 j45Var = this.a;
        j45.b(j45Var, null);
        j45.a(j45Var, null);
    }
}
