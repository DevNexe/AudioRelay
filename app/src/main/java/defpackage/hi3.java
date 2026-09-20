package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hi3 extends cp4 {
    public final j81<Object, sd5> e;
    public int f;

    public hi3(int i, gp4 gp4Var, j81<Object, sd5> j81Var) {
        super(i, gp4Var);
        this.e = j81Var;
        this.f = 1;
    }

    @Override // defpackage.cp4
    public final void c() {
        if (this.c) {
            return;
        }
        k();
        super.c();
    }

    @Override // defpackage.cp4
    public final j81<Object, sd5> f() {
        return this.e;
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
        this.f++;
    }

    @Override // defpackage.cp4
    public final void k() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
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
    public final cp4 r(j81<Object, sd5> j81Var) {
        ip4.d(this);
        return new km2(this.b, this.a, j81Var, this);
    }
}
