package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class ud0 implements bu0<cd0, bd0, dd0> {
    public final bm2 a;

    public ud0(bm2 bm2Var) {
        this.a = bm2Var;
    }

    @Override // defpackage.bu0
    public final Object a(du0 du0Var, Object obj, z80 z80Var) {
        if (!ur1.a((bd0) obj, bd0.QnHx.a)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objA = this.a.a(z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
