package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class nx1 implements bu0<kx1, jx1, lx1> {
    public final cOm3Fixed a;

    public nx1(cOm3Fixed com3) {
        this.a = com3;
    }

    @Override // defpackage.bu0
    public final Object a(du0 du0Var, Object obj, z80 z80Var) {
        if (!ur1.a((jx1) obj, jx1.QnHx.a)) {
            throw new NoWhenBranchMatchedException();
        }
        qh0 qh0Var = rl0.a;
        Object objD0 = fp1.D0(n72.a, new mx1(this, null), z80Var);
        return objD0 == va0.COROUTINE_SUSPENDED ? objD0 : sd5.a;
    }
}
