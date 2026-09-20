package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j34 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ y81<co4, g30, Integer, sd5> w;
    public final /* synthetic */ r34 x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j34(y81<? super co4, ? super g30, ? super Integer, sd5> y81Var, r34 r34Var, int i) {
        super(2);
        this.w = y81Var;
        this.x = r34Var;
        this.y = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            this.w.invoke(this.x.b, g30Var2, Integer.valueOf((this.y >> 9) & 112));
        }
        return sd5.a;
    }
}
