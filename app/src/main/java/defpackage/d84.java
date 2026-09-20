package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d84 implements g25 {
    public final /* synthetic */ b84 a;
    public final /* synthetic */ boolean b;

    public d84(b84 b84Var, boolean z) {
        this.a = b84Var;
        this.b = z;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x003d  */
    @Override // defpackage.g25
    public final void a(long j) {
        iy1 iy1VarF;
        b84 b84Var = this.a;
        b84Var.e();
        n74 n74VarD = b84Var.d();
        s84 s84Var = b84Var.a;
        k74 k74Var = (k74) s84Var.c.get(Long.valueOf(n74VarD.a.c));
        k74 k74Var2 = (k74) s84Var.c.get(Long.valueOf(n74VarD.b.c));
        boolean z = this.b;
        if (z) {
            if (k74Var != null) {
                iy1VarF = k74Var.f();
            } else {
                iy1VarF = null;
            }
        } else if (k74Var2 != null) {
            iy1VarF = k74Var2.f();
        } else {
            iy1VarF = null;
        }
        b84Var.k.setValue(new kt2(b84Var.g().L(iy1VarF, v74.a(z ? k74Var.c(n74VarD, true) : k74Var2.c(n74VarD, false)))));
        b84Var.l.setValue(new kt2(kt2.b));
    }

    @Override // defpackage.g25
    public final void b() {
        b84 b84Var = this.a;
        b84Var.i(null);
        b84Var.h(null);
    }

    @Override // defpackage.g25
    public final void c() {
        iy1 iy1VarF;
        b84 b84Var = this.a;
        n74 n74VarD = b84Var.d();
        if (n74VarD == null) {
            return;
        }
        boolean z = this.b;
        k74 k74VarB = b84Var.b(z ? n74VarD.a : n74VarD.b);
        if (k74VarB == null || (iy1VarF = k74VarB.f()) == null) {
            return;
        }
        b84Var.h(new kt2(b84Var.g().L(iy1VarF, v74.a(k74VarB.c(n74VarD, z)))));
        b84Var.i(z ? eb1.SelectionStart : eb1.SelectionEnd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.g25
    public final void d(long j) {
        b84 b84Var = this.a;
        kt2 kt2Var = new kt2(kt2.g(((kt2) b84Var.l.getValue()).a, j));
        kz2 kz2Var = b84Var.l;
        kz2Var.setValue(kt2Var);
        kz2 kz2Var2 = b84Var.k;
        long jG = kt2.g(((kt2) kz2Var2.getValue()).a, ((kt2) kz2Var.getValue()).a);
        if (b84Var.m(new kt2(jG), new kt2(((kt2) kz2Var2.getValue()).a), this.b, o74.QnHx.c)) {
            kz2Var2.setValue(new kt2(jG));
            kz2Var.setValue(new kt2(kt2.b));
        }
    }

    @Override // defpackage.g25
    public final void onCancel() {
        b84 b84Var = this.a;
        b84Var.j();
        b84Var.i(null);
        b84Var.h(null);
    }

    @Override // defpackage.g25
    public final void onStop() {
        b84 b84Var = this.a;
        b84Var.j();
        b84Var.i(null);
        b84Var.h(null);
    }
}
