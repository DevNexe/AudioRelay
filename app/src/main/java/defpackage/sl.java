package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sl extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ pg2 w;
    public final /* synthetic */ y81<wv, g30, Integer, sd5> x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public sl(pg2 pg2Var, y81<? super wv, ? super g30, ? super Integer, sd5> y81Var, int i) {
        super(2);
        this.w = pg2Var;
        this.x = y81Var;
        this.y = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.y | 1;
        jl.d(this.w, this.x, g30Var, i);
        return sd5.a;
    }
}
