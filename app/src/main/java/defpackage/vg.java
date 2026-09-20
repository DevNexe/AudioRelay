package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class vg implements bu0<sg, qg, ug> {
    public final bm2 a;

    public vg(bm2 bm2Var) {
        this.a = bm2Var;
    }

    @Override // defpackage.bu0
    public final Object a(du0 du0Var, Object obj, z80 z80Var) {
        qg qgVar = (qg) obj;
        boolean zA = ur1.a(qgVar, qg.CQf.a);
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        bm2 bm2Var = this.a;
        if (zA) {
            Object objB = bm2Var.b(ou3.FJCM.e, null, z80Var);
            return objB == va0Var ? objB : sd5.a;
        }
        if (!ur1.a(qgVar, qg.QnHx.a)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objB2 = bm2Var.b(ou3.YKK.e, null, z80Var);
        return objB2 == va0Var ? objB2 : sd5.a;
    }
}
