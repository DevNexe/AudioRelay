package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m34 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ gw0 w;
    public final /* synthetic */ x81<g30, Integer, sd5> x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m34(gw0 gw0Var, x81<? super g30, ? super Integer, sd5> x81Var, int i) {
        super(2);
        this.w = gw0Var;
        this.x = x81Var;
        this.y = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            q40.a(new ng3[]{i34.a.b(this.w)}, this.x, g30Var2, ((this.y >> 15) & 112) | 8);
        }
        return sd5.a;
    }
}
