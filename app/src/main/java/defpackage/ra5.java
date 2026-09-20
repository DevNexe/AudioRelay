package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ra5 extends cp4 {
    public final cp4 e;
    public final boolean f;
    public final boolean g;
    public final j81<Object, sd5> h;

    public ra5(cp4 cp4Var, j81 j81Var, boolean z) {
        j81<Object, sd5> j81VarF;
        super(0, gp4.A);
        this.e = cp4Var;
        this.f = false;
        this.g = z;
        this.h = ip4.i(j81Var, (cp4Var == null || (j81VarF = cp4Var.f()) == null) ? ip4.i.get().e : j81VarF, false);
    }

    @Override // defpackage.cp4
    public final void c() {
        cp4 cp4Var;
        this.c = true;
        if (!this.g || (cp4Var = this.e) == null) {
            return;
        }
        cp4Var.c();
    }

    @Override // defpackage.cp4
    public final int d() {
        return s().d();
    }

    @Override // defpackage.cp4
    public final gp4 e() {
        return s().e();
    }

    @Override // defpackage.cp4
    public final j81<Object, sd5> f() {
        return this.h;
    }

    @Override // defpackage.cp4
    public final boolean g() {
        return s().g();
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
        s().l();
    }

    @Override // defpackage.cp4
    public final void m(ws4 ws4Var) {
        s().m(ws4Var);
    }

    @Override // defpackage.cp4
    public final cp4 r(j81<Object, sd5> j81Var) {
        j81<Object, sd5> j81VarI = ip4.i(j81Var, this.h, true);
        return !this.f ? ip4.f(s().r(null), j81VarI, true) : s().r(j81VarI);
    }

    public final cp4 s() {
        cp4 cp4Var = this.e;
        return cp4Var == null ? ip4.i.get() : cp4Var;
    }
}
