package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gd0 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ int A;
    public final /* synthetic */ pg2 w;
    public final /* synthetic */ ce0.CQf x;
    public final /* synthetic */ dd0 y;
    public final /* synthetic */ j81<cd0, sd5> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gd0(pg2 pg2Var, ce0.CQf cQf, dd0 dd0Var, j81<? super cd0, sd5> j81Var, int i) {
        super(2);
        this.w = pg2Var;
        this.x = cQf;
        this.y = dd0Var;
        this.z = j81Var;
        this.A = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        hd0.c(this.w, this.x, this.y, this.z, g30Var, this.A | 1);
        return sd5.a;
    }
}
