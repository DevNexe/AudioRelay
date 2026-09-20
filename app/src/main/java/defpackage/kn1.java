package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kn1 extends cx1 implements x81<xb4, f04, dw0> {
    public final /* synthetic */ vi3 w;
    public final /* synthetic */ W x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn1(jl1 jl1Var, cl1 cl1Var) {
        super(2);
        this.w = jl1Var;
        this.x = cl1Var;
    }

    @Override // defpackage.x81
    public final dw0 invoke(xb4 xb4Var, f04 f04Var) {
        nl3.a(ri3.class);
        return new bl1(this.w, xb4Var, this.x);
    }
}
