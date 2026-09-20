package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ec4 implements fd2, c73 {
    public final i60 a;
    public final zb4 b;
    public final rg3<h04> c = new rg3<>();

    public ec4(n60 n60Var, zb4 zb4Var) {
        this.a = n60Var;
        this.b = zb4Var;
    }

    @Override // defpackage.fd2
    public final Object a(ad2 ad2Var, md2.QnHx qnHx) {
        if (!ad2Var.t0()) {
            return sd5.a;
        }
        wf3 wf3VarS = ad2Var.f0().S();
        this.c.g(new h04(wf3VarS.S(), wf3VarS.A));
        return sd5.a;
    }

    @Override // defpackage.c73
    public final qw b(e61 e61Var) {
        w9 w9VarB = this.a.b();
        tn2 tn2Var = new tn2(1);
        w9VarB.getClass();
        vq2<R> vq2VarB = new cs2(new pr2(w9VarB, tn2Var), new Acr(8)).B(new Ot0r(this, 11));
        vq2VarB.getClass();
        return new ax(new zr2(vq2VarB), new w52(this, 3));
    }
}
