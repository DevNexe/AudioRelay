package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gi extends cx1 implements j81<ig1, sd5> {
    public final /* synthetic */ j81<ig1, sd5> A;
    public final /* synthetic */ uf1 w;
    public final /* synthetic */ String x;
    public final /* synthetic */ Integer y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gi(uf1 uf1Var, String str, Integer num, String str2, j81<? super ig1, sd5> j81Var) {
        super(1);
        this.w = uf1Var;
        this.x = str;
        this.y = num;
        this.z = str2;
        this.A = j81Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(ig1 ig1Var) {
        ig1 ig1Var2 = ig1Var;
        ig1Var2.b = this.w;
        hH.F(ig1Var2, "ws", this.x, this.y, this.z, kg1.w);
        this.A.invoke(ig1Var2);
        return sd5.a;
    }
}
