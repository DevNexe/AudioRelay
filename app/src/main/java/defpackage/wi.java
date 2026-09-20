package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wi extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ h81<sd5> w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ pg2 y;
    public final /* synthetic */ y81<wu3, g30, Integer, sd5> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi(int i, int i2, pg2 pg2Var, h81 h81Var, y81 y81Var, boolean z) {
        super(2);
        this.w = h81Var;
        this.x = z;
        this.y = pg2Var;
        this.z = y81Var;
        this.A = i;
        this.B = i2;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        h81<sd5> h81Var = this.w;
        boolean z = this.x;
        ti.a(this.A | 1, this.B, g30Var, this.y, h81Var, this.z, z);
        return sd5.a;
    }
}
