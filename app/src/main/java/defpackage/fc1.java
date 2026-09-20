package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fc1 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ ci2 w;
    public final /* synthetic */ x81<g30, Integer, sd5> x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fc1(ci2 ci2Var, x81<? super g30, ? super Integer, sd5> x81Var, int i) {
        super(2);
        this.w = ci2Var;
        this.x = x81Var;
        this.y = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e40.CQf cQf = e40.a;
            j55.a(((rc5) g30Var2.E(sc5.a)).k, X.m(g30Var2, 823806292, new ec1(this.w, this.x, this.y)), g30Var2, 48);
        }
        return sd5.a;
    }
}
