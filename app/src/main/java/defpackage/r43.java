package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r43 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ ab3 w;
    public final /* synthetic */ pg2 x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r43(ab3 ab3Var, pg2 pg2Var, int i, int i2) {
        super(2);
        this.w = ab3Var;
        this.x = pg2Var;
        this.y = i;
        this.z = i2;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.y | 1;
        s43.h(this.w, this.x, g30Var, i, this.z);
        return sd5.a;
    }
}
