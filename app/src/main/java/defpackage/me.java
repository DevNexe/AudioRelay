package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class me extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ y81<se, g30, Integer, sd5> w;
    public final /* synthetic */ ue x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public me(y81<? super se, ? super g30, ? super Integer, sd5> y81Var, ue ueVar, int i) {
        super(2);
        this.w = y81Var;
        this.x = ueVar;
        this.y = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            this.w.invoke(this.x, g30Var2, Integer.valueOf((this.y >> 6) & 112));
        }
        return sd5.a;
    }
}
