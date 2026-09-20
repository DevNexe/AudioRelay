package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gn1 extends cx1 implements j81<e63, aw0> {
    public final /* synthetic */ ki3 w;
    public final /* synthetic */ vi3 x;
    public final /* synthetic */ j04 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn1(pk1 pk1Var, jl1 jl1Var, dm1 dm1Var) {
        super(1);
        this.w = pk1Var;
        this.x = jl1Var;
        this.y = dm1Var;
    }

    @Override // defpackage.j81
    public final aw0 invoke(e63 e63Var) {
        nl3.a(oi3.class);
        j04 j04Var = this.y;
        return new uk1(this.w, this.x, e63Var, j04Var);
    }
}
