package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class ae4 implements eo1<qd4, od4, rd4> {
    public final mc4 a;
    public final y50 b;

    public ae4(mc4 mc4Var, y50 y50Var) {
        this.a = mc4Var;
        this.b = y50Var;
    }

    @Override // defpackage.eo1
    public final Object a(go1 go1Var, Object obj, z80 z80Var) {
        qd4 qd4Var = (qd4) obj;
        if (qd4Var instanceof qd4.CQf) {
            go1Var.p("initialize", new td4(this, null));
            go1Var.p("search", new vd4(this, null));
            return sd5.a;
        }
        if (!(qd4Var instanceof qd4.QnHx)) {
            if (!(qd4Var instanceof qd4.F1)) {
                throw new NoWhenBranchMatchedException();
            }
            sd5 sd5VarS = go1Var.s(new sd4(qd4Var, this));
            return sd5VarS == va0.COROUTINE_SUSPENDED ? sd5VarS : sd5.a;
        }
        a62 a62Var = a62.a;
        a62.a.g("clicked_on_server", null);
        a62Var.j("last_connection_attempt", "server");
        this.b.a(new t50(((qd4.QnHx) qd4Var).a.b));
        go1Var.q();
        return sd5.a;
    }
}
