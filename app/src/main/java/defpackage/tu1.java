package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tu1 implements rv1<su1> {
    public static final tu1 a = new tu1();
    public static final ra4 b = FWT.r("su1", ee3.byN.a, new pa4[0], ua4.w);

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return b;
    }

    @Override // defpackage.zj0
    public final Object c(pf0 pf0Var) {
        vt1 vt1VarY = qe0.c(pf0Var).y();
        if (vt1VarY instanceof su1) {
            return (su1) vt1VarY;
        }
        throw AY.h("Unexpected JSON element, expected JsonPrimitive, had " + nl3.a(vt1VarY.getClass()), vt1VarY.toString(), -1);
    }

    @Override // defpackage.db4
    public final void e(ls0 ls0Var, Object obj) {
        su1 su1Var = (su1) obj;
        qe0.b(ls0Var);
        if (su1Var instanceof nu1) {
            ls0Var.F(ou1.a, nu1.INSTANCE);
        } else {
            ls0Var.F(lu1.a, (ku1) su1Var);
        }
    }
}
