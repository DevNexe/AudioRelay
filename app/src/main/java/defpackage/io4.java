package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class io4 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ x81<g30, Integer, sd5> w;
    public final /* synthetic */ x81<g30, Integer, sd5> x;
    public final /* synthetic */ int y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public io4(x81<? super g30, ? super Integer, sd5> x81Var, x81<? super g30, ? super Integer, sd5> x81Var2, int i, boolean z) {
        super(2);
        this.w = x81Var;
        this.x = x81Var2;
        this.y = i;
        this.z = z;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            j55.a(((rc5) g30Var2.E(sc5.a)).j, X.m(g30Var2, 225114541, new ho4(this.w, this.x, this.y, this.z)), g30Var2, 48);
        }
        return sd5.a;
    }
}
