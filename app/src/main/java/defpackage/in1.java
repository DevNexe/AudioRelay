package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class in1 extends cx1 implements j81<xb4, fw0> {
    public final /* synthetic */ vi3 w;
    public final /* synthetic */ W x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in1(jl1 jl1Var, cl1 cl1Var) {
        super(1);
        this.w = jl1Var;
        this.x = cl1Var;
    }

    @Override // defpackage.j81
    public final fw0 invoke(xb4 xb4Var) {
        nl3.a(ti3.class);
        return new gl1(this.w, xb4Var, this.x);
    }
}
