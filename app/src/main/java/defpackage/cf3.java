package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cf3 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ int A;
    public final /* synthetic */ pg2 w;
    public final /* synthetic */ long x;
    public final /* synthetic */ float y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf3(pg2 pg2Var, long j, float f, int i, int i2) {
        super(2);
        this.w = pg2Var;
        this.x = j;
        this.y = f;
        this.z = i;
        this.A = i2;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        pg2 pg2Var = this.w;
        long j = this.x;
        ff3.a(this.y, this.z | 1, this.A, j, g30Var, pg2Var);
        return sd5.a;
    }
}
