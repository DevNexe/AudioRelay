package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wl extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ int A;
    public final /* synthetic */ xa3.LPt8Fixed w;
    public final /* synthetic */ j81<za3, sd5> x;
    public final /* synthetic */ pg2 y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wl(xa3.LPt8Fixed lPt8, j81<? super za3, sd5> j81Var, pg2 pg2Var, int i, int i2) {
        super(2);
        this.w = lPt8;
        this.x = j81Var;
        this.y = pg2Var;
        this.z = i;
        this.A = i2;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        jl.f(this.w, this.x, this.y, g30Var, this.z | 1, this.A);
        return sd5.a;
    }
}
