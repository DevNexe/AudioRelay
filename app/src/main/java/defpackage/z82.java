package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z82 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ j81<k82, sd5> A;
    public final /* synthetic */ int B;
    public final /* synthetic */ pg2 w;
    public final /* synthetic */ l82 x;
    public final /* synthetic */ x45 y;
    public final /* synthetic */ j81<x45, sd5> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z82(pg2 pg2Var, l82 l82Var, x45 x45Var, j81<? super x45, sd5> j81Var, j81<? super k82, sd5> j81Var2, int i) {
        super(2);
        this.w = pg2Var;
        this.x = l82Var;
        this.y = x45Var;
        this.z = j81Var;
        this.A = j81Var2;
        this.B = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        f92.d(this.w, this.x, this.y, this.z, this.A, g30Var, this.B | 1);
        return sd5.a;
    }
}
