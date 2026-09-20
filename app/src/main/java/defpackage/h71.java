package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class h71 implements bu0<d71, c71, e71> {
    public final bm2 a;

    public h71(bm2 bm2Var) {
        this.a = bm2Var;
    }

    @Override // defpackage.bu0
    public final Object a(du0 du0Var, Object obj, z80 z80Var) {
        c71 c71Var = (c71) obj;
        boolean z = c71Var instanceof c71.CQf;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        bm2 bm2Var = this.a;
        if (z) {
            Object objA = bm2Var.a(z80Var);
            return objA == va0Var ? objA : sd5.a;
        }
        if (!ur1.a(c71Var, c71.QnHx.a)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objB = bm2Var.b(ou3.FJCM.e, g71.w, z80Var);
        return objB == va0Var ? objB : sd5.a;
    }
}
