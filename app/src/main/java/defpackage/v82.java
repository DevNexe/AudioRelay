package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v82 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ int A;
    public final /* synthetic */ pg2 w;
    public final /* synthetic */ l82 x;
    public final /* synthetic */ h81<sd5> y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v82(pg2 pg2Var, l82 l82Var, h81<sd5> h81Var, int i, int i2) {
        super(2);
        this.w = pg2Var;
        this.x = l82Var;
        this.y = h81Var;
        this.z = i;
        this.A = i2;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        f92.c(this.w, this.x, this.y, g30Var, this.z | 1, this.A);
        return sd5.a;
    }
}
