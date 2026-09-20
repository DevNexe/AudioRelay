package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s22 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ n22 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s22(n22 n22Var) {
        super(2);
        this.w = n22Var;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e40.CQf cQf = e40.a;
            n22 n22Var = this.w;
            r22.a(n22Var.c, n22Var.d, ((rc5) g30Var2.E(sc5.a)).j, null, g30Var2, 0, 8);
        }
        return sd5.a;
    }
}
