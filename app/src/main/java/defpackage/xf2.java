package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xf2 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ int A;
    public final /* synthetic */ pg2 w;
    public final /* synthetic */ dg2 x;
    public final /* synthetic */ j81<ev3, sd5> y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf2(int i, int i2, pg2 pg2Var, dg2 dg2Var, j81 j81Var) {
        super(2);
        this.w = pg2Var;
        this.x = dg2Var;
        this.y = j81Var;
        this.z = i;
        this.A = i2;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        hf2.l(this.z | 1, this.A, g30Var, this.w, this.x, this.y);
        return sd5.a;
    }
}
