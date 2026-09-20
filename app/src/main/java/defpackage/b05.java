package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b05 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ d05 w;
    public final /* synthetic */ pg2 x;
    public final /* synthetic */ float y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b05(d05 d05Var, pg2 pg2Var, float f, long j, int i, int i2) {
        super(2);
        this.w = d05Var;
        this.x = pg2Var;
        this.y = f;
        this.z = j;
        this.A = i;
        this.B = i2;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        d05 d05Var = this.w;
        pg2 pg2Var = this.x;
        float f = this.y;
        long j = this.z;
        d05Var.b(f, this.A | 1, this.B, j, g30Var, pg2Var);
        return sd5.a;
    }
}
