package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pf2 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ qe2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf2(qe2 qe2Var) {
        super(2);
        this.w = qe2Var;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e40.CQf cQf = e40.a;
            j55.b(hH.x(this.w.c, g30Var2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) g30Var2.E(sc5.a)).j, g30Var2, 0, 0, 32766);
        }
        return sd5.a;
    }
}
