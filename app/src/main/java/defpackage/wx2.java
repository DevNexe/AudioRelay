package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wx2 implements c73 {
    public final i60 a;
    public final px2 b;
    public final uq3 c;
    public final b03 d;
    public final qx2 e;

    public wx2(i60 i60Var, px2 px2Var, uq3 uq3Var, b03 b03Var, qx2 qx2Var) {
        this.a = i60Var;
        this.b = px2Var;
        this.c = uq3Var;
        this.d = b03Var;
        this.e = qx2Var;
    }

    @Override // defpackage.c73
    public final qw b(e61 e61Var) {
        w9 w9VarB = this.a.b();
        HqGb hqGb = new HqGb(4, this, e61Var);
        w9VarB.getClass();
        return new xs2(w9VarB, hqGb);
    }
}
