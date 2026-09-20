package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class wy3 implements bu0<sy3, ry3, uy3> {
    public final bm2 a;
    public final j81<mp2, sd5> b;

    /* JADX WARN: Multi-variable type inference failed */
    public wy3(bm2 bm2Var, j81<? super mp2, sd5> j81Var) {
        this.a = bm2Var;
        this.b = j81Var;
    }

    @Override // defpackage.bu0
    public final Object a(du0 du0Var, Object obj, z80 z80Var) {
        ry3 ry3Var = (ry3) obj;
        if (ur1.a(ry3Var, ry3.QnHx.a)) {
            Object objB = this.a.b(ou3.CQf.e, null, z80Var);
            return objB == va0.COROUTINE_SUSPENDED ? objB : sd5.a;
        }
        if (!(ry3Var instanceof ry3.CQf)) {
            throw new NoWhenBranchMatchedException();
        }
        this.b.invoke(((ry3.CQf) ry3Var).a);
        return sd5.a;
    }
}
