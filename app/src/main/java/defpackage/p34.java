package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p34 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ x81<g30, Integer, sd5> A;
    public final /* synthetic */ x81<g30, Integer, sd5> B;
    public final /* synthetic */ x81<g30, Integer, sd5> C;
    public final /* synthetic */ int D;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ int x;
    public final /* synthetic */ x81<g30, Integer, sd5> y;
    public final /* synthetic */ y81<ay2, g30, Integer, sd5> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p34(int i, int i2, x81 x81Var, x81 x81Var2, x81 x81Var3, x81 x81Var4, y81 y81Var, boolean z) {
        super(2);
        this.w = z;
        this.x = i;
        this.y = x81Var;
        this.z = y81Var;
        this.A = x81Var2;
        this.B = x81Var3;
        this.C = x81Var4;
        this.D = i2;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        i34.b(this.w, this.x, this.y, this.z, this.A, this.B, this.C, g30Var, this.D | 1);
        return sd5.a;
    }
}
