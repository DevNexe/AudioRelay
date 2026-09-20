package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class UqBn extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ is4<x81<g30, Integer, sd5>> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UqBn(is4<? extends x81<? super g30, ? super Integer, sd5>> is4Var) {
        super(2);
        this.w = is4Var;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            lq0 lq0Var = thju.a;
            this.w.getValue().invoke(g30Var2, 0);
        }
        return sd5.a;
    }
}
