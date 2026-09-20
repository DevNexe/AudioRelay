package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i45 implements g25 {
    public final /* synthetic */ j45 a;
    public final /* synthetic */ boolean b;

    public i45(j45 j45Var, boolean z) {
        this.a = j45Var;
        this.b = z;
    }

    @Override // defpackage.g25
    public final void a(long j) {
        j45 j45Var = this.a;
        boolean z = this.b;
        long jA = v74.a(j45Var.i(z));
        j45Var.k = jA;
        j45Var.o.setValue(new kt2(jA));
        j45Var.m = kt2.b;
        j45Var.n.setValue(z ? eb1.SelectionStart : eb1.SelectionEnd);
        u45 u45Var = j45Var.d;
        if (u45Var == null) {
            return;
        }
        u45Var.i = false;
    }

    @Override // defpackage.g25
    public final void b() {
        j45 j45Var = this.a;
        j45.b(j45Var, null);
        j45.a(j45Var, null);
    }

    @Override // defpackage.g25
    public final void c() {
        boolean z = this.b;
        eb1 eb1Var = z ? eb1.SelectionStart : eb1.SelectionEnd;
        j45 j45Var = this.a;
        j45.b(j45Var, eb1Var);
        j45Var.o.setValue(new kt2(v74.a(j45Var.i(z))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.g25
    public final void d(long j) {
        p55 p55VarC;
        o55 o55Var;
        int iB;
        j45 j45Var = this.a;
        j45Var.m = kt2.g(j45Var.m, j);
        u45 u45Var = j45Var.d;
        if (u45Var != null && (p55VarC = u45Var.c()) != null && (o55Var = p55VarC.a) != null) {
            boolean z = this.b;
            kt2 kt2Var = new kt2(kt2.g(j45Var.k, j45Var.m));
            kz2 kz2Var = j45Var.o;
            kz2Var.setValue(kt2Var);
            if (z) {
                iB = o55Var.l(((kt2) kz2Var.getValue()).a);
            } else {
                mt2 mt2Var = j45Var.b;
                long j2 = j45Var.j().b;
                int i = s55.c;
                iB = mt2Var.b((int) (j2 >> 32));
            }
            j45.c(j45Var, j45Var.j(), iB, z ? j45Var.b.b(s55.c(j45Var.j().b)) : o55Var.l(((kt2) kz2Var.getValue()).a), z, o74.QnHx.a);
        }
        u45 u45Var2 = j45Var.d;
        if (u45Var2 == null) {
            return;
        }
        u45Var2.i = false;
    }

    @Override // defpackage.g25
    public final void onCancel() {
    }

    @Override // defpackage.g25
    public final void onStop() {
        j45 j45Var = this.a;
        j45.b(j45Var, null);
        j45Var.o.setValue(null);
        u45 u45Var = j45Var.d;
        if (u45Var != null) {
            u45Var.i = true;
        }
        x55 x55Var = j45Var.g;
        if ((x55Var != null ? x55Var.c() : 0) == 2) {
            j45Var.n();
        }
    }
}
