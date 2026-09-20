package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class u63 implements eo1<g63, f63, h63> {
    public final ln2 a;
    public final y50 b;
    public final LHM c;
    public final a71 d;

    public u63(ln2 ln2Var, y50 y50Var, LHM lhm, a71 a71Var) {
        this.a = ln2Var;
        this.b = y50Var;
        this.c = lhm;
        this.d = a71Var;
    }

    @Override // defpackage.eo1
    public final Object a(go1 go1Var, Object obj, z80 z80Var) {
        g63 g63Var = (g63) obj;
        if (g63Var instanceof g63.QnHx) {
            go1Var.p("initialize", new s63(this, null));
            return sd5.a;
        }
        if (!(g63Var instanceof g63.CQf)) {
            throw new NoWhenBranchMatchedException();
        }
        sd5 sd5VarS = go1Var.s(new t63(g63Var));
        return sd5VarS == va0.COROUTINE_SUSPENDED ? sd5VarS : sd5.a;
    }
}
