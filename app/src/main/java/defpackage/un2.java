package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class un2 {
    public final ln2 a;
    public final qg3<zt4> b;
    public final v9<Boolean> c;

    public un2(rn2 rn2Var) {
        this.a = rn2Var;
        qg3<zt4> qg3Var = new qg3<>();
        this.b = qg3Var;
        Boolean bool = Boolean.FALSE;
        v9<Boolean> v9Var = new v9<>();
        if (bool == null) {
            throw new NullPointerException("defaultValue == null");
        }
        v9Var.w.lazySet(bool);
        this.c = v9Var;
        int i = 7;
        us2 us2VarB = qg3Var.B(new Ot0r(this, i));
        sn2 sn2Var = new sn2(0);
        m91.byN byn = m91.d;
        m91.T23 t23 = m91.c;
        us2VarB.getClass();
        new sr2(new jr2(us2VarB, sn2Var, byn, t23).u(j54.c), new D(this, i)).g();
    }

    public final void a() {
        this.b.accept(new zt4.F1());
    }
}
