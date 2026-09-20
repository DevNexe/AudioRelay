package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class peo extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ pg2 w;
    public final /* synthetic */ x81<g30, Integer, sd5> x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public peo(pg2 pg2Var, x81<? super g30, ? super Integer, sd5> x81Var, int i, int i2) {
        super(2);
        this.w = pg2Var;
        this.x = x81Var;
        this.y = i;
        this.z = i2;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.y | 1;
        vQgK.b(this.w, this.x, g30Var, i, this.z);
        return sd5.a;
    }
}
