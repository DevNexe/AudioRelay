package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ri extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ ay2 w;
    public final /* synthetic */ y81<wu3, g30, Integer, sd5> x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ri(ay2 ay2Var, y81<? super wu3, ? super g30, ? super Integer, sd5> y81Var, int i) {
        super(2);
        this.w = ay2Var;
        this.x = y81Var;
        this.y = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            j55.a(((rc5) g30Var2.E(sc5.a)).k, X.m(g30Var2, -630330208, new qi(this.w, this.x, this.y)), g30Var2, 48);
        }
        return sd5.a;
    }
}
