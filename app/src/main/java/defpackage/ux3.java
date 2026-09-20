package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ux3 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ ej1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux3(ej1 ej1Var) {
        super(2);
        this.w = ej1Var;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e40.CQf cQf = e40.a;
            q70.a(X.m(g30Var2, -1936982212, new tx3(this.w)), g30Var2, 6);
        }
        return sd5.a;
    }
}
