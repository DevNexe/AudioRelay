package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class h73 implements bu0<f73, e73, g73> {
    public final bm2 a;

    public h73(bm2 bm2Var) {
        this.a = bm2Var;
    }

    @Override // defpackage.bu0
    public final Object a(du0 du0Var, Object obj, z80 z80Var) {
        e73 e73Var = (e73) obj;
        boolean zA = ur1.a(e73Var, e73.QnHx.a);
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        bm2 bm2Var = this.a;
        if (zA) {
            Object objB = bm2Var.b(ou3.QnHx.e, null, z80Var);
            return objB == va0Var ? objB : sd5.a;
        }
        if (ur1.a(e73Var, e73.CQf.a)) {
            Object objB2 = bm2Var.b(ou3.CQf.e, null, z80Var);
            return objB2 == va0Var ? objB2 : sd5.a;
        }
        if (ur1.a(e73Var, e73.F1.a)) {
            Object objB3 = bm2Var.b(ou3.F1.e, null, z80Var);
            return objB3 == va0Var ? objB3 : sd5.a;
        }
        if (!ur1.a(e73Var, e73.LPt8Fixed.a)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objB4 = bm2Var.b(ou3.LPt8Fixed.e, null, z80Var);
        return objB4 == va0Var ? objB4 : sd5.a;
    }
}
