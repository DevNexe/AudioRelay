package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class km2 extends cp4 {
    public final cp4 e;
    public final j81<Object, sd5> f;

    public static final class QnHx extends cx1 implements j81<Object, sd5> {
        public final /* synthetic */ j81<Object, sd5> w;
        public final /* synthetic */ j81<Object, sd5> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(j81<Object, sd5> j81Var, j81<Object, sd5> j81Var2) {
            super(1);
            this.w = j81Var;
            this.x = j81Var2;
        }

        @Override // defpackage.j81
        public final sd5 invoke(Object obj) {
            this.w.invoke(obj);
            this.x.invoke(obj);
            return sd5.a;
        }
    }

    public km2(int i, gp4 gp4Var, j81<Object, sd5> j81Var, cp4 cp4Var) {
        super(i, gp4Var);
        this.e = cp4Var;
        cp4Var.j();
        if (j81Var != null) {
            j81<Object, sd5> j81VarF = cp4Var.f();
            if (j81VarF != null) {
                j81Var = new QnHx(j81Var, j81VarF);
            }
        } else {
            j81Var = cp4Var.f();
        }
        this.f = j81Var;
    }

    @Override // defpackage.cp4
    public final void c() {
        if (this.c) {
            return;
        }
        int i = this.b;
        cp4 cp4Var = this.e;
        if (i != cp4Var.d()) {
            a();
        }
        cp4Var.k();
        super.c();
    }

    @Override // defpackage.cp4
    public final j81<Object, sd5> f() {
        return this.f;
    }

    @Override // defpackage.cp4
    public final boolean g() {
        return true;
    }

    @Override // defpackage.cp4
    public final j81<Object, sd5> h() {
        return null;
    }

    @Override // defpackage.cp4
    public final void j() {
        zp4.a();
        throw null;
    }

    @Override // defpackage.cp4
    public final void k() {
        zp4.a();
        throw null;
    }

    @Override // defpackage.cp4
    public final void l() {
    }

    @Override // defpackage.cp4
    public final void m(ws4 ws4Var) {
        ip4.QnHx qnHx = ip4.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    @Override // defpackage.cp4
    public final cp4 r(j81 j81Var) {
        return new km2(this.b, this.a, j81Var, this.e);
    }
}
