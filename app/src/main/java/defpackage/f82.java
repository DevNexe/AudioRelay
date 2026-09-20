package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f82 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ j81<za3, sd5> w;
    public final /* synthetic */ pg2 x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f82(int i, int i2, pg2 pg2Var, j81 j81Var) {
        super(2);
        this.w = j81Var;
        this.x = pg2Var;
        this.y = i;
        this.z = i2;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.y | 1;
        pg2 pg2Var = this.x;
        j81<za3, sd5> j81Var = this.w;
        C0239D.f(i, this.z, g30Var, pg2Var, j81Var);
        return sd5.a;
    }
}
