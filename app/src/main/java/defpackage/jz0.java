package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jz0 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ x81<g30, Integer, sd5> w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz0(int i, x81 x81Var) {
        super(2);
        this.w = x81Var;
        this.x = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            j55.a(((rc5) g30Var2.E(sc5.a)).k, X.m(g30Var2, -1567914264, new iz0(this.x, this.w)), g30Var2, 48);
        }
        return sd5.a;
    }
}
