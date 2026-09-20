package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kd0 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ int A;
    public final /* synthetic */ pg2 w;
    public final /* synthetic */ dd0 x;
    public final /* synthetic */ j81<cd0, sd5> y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kd0(pg2 pg2Var, dd0 dd0Var, j81<? super cd0, sd5> j81Var, int i, int i2) {
        super(2);
        this.w = pg2Var;
        this.x = dd0Var;
        this.y = j81Var;
        this.z = i;
        this.A = i2;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        hd0.d(this.w, this.x, this.y, g30Var, this.z | 1, this.A);
        return sd5.a;
    }
}
