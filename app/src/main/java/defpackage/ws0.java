package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ws0 extends cx1 implements j81<ta1, sd5> {
    public final /* synthetic */ is4<Float> w;
    public final /* synthetic */ is4<Float> x;
    public final /* synthetic */ is4<m95> y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws0(is4 is4Var, t95.LPt8Fixed lPt8, t95.LPt8Fixed lPt9) {
        super(1);
        this.w = is4Var;
        this.x = lPt8;
        this.y = lPt9;
    }

    @Override // defpackage.j81
    public final sd5 invoke(ta1 ta1Var) {
        ta1 ta1Var2 = ta1Var;
        ta1Var2.b(this.w.getValue().floatValue());
        is4<Float> is4Var = this.x;
        ta1Var2.k(is4Var.getValue().floatValue());
        ta1Var2.i(is4Var.getValue().floatValue());
        ta1Var2.q0(this.y.getValue().a);
        return sd5.a;
    }
}
