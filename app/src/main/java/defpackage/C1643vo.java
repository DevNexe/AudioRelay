package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: v€o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1643vo implements bu0<wXc, G_W, QsF6> {
    public final bm2 a;

    public C1643vo(bm2 bm2Var) {
        this.a = bm2Var;
    }

    @Override // defpackage.bu0
    public final Object a(du0 du0Var, Object obj, z80 z80Var) {
        if (!ur1.a((G_W) obj, G_W.QnHx.a)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objB = this.a.b(ou3.FJCM.e, null, z80Var);
        return objB == va0.COROUTINE_SUSPENDED ? objB : sd5.a;
    }
}
