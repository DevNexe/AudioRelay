package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u43 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ int A;
    public final /* synthetic */ ab3 w;
    public final /* synthetic */ nj1<ed3> x;
    public final /* synthetic */ pg2 y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u43(ab3 ab3Var, nj1<ed3> nj1Var, pg2 pg2Var, int i, int i2) {
        super(2);
        this.w = ab3Var;
        this.x = nj1Var;
        this.y = pg2Var;
        this.z = i;
        this.A = i2;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        s43.i(this.w, this.x, this.y, g30Var, this.z | 1, this.A);
        return sd5.a;
    }
}
