package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o34 extends cx1 implements x81<bw4, g70, sb2> {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ x81<g30, Integer, sd5> B;
    public final /* synthetic */ int C;
    public final /* synthetic */ y81<ay2, g30, Integer, sd5> D;
    public final /* synthetic */ x81<g30, Integer, sd5> w;
    public final /* synthetic */ x81<g30, Integer, sd5> x;
    public final /* synthetic */ x81<g30, Integer, sd5> y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o34(int i, int i2, x81 x81Var, x81 x81Var2, x81 x81Var3, x81 x81Var4, y81 y81Var, boolean z) {
        super(2);
        this.w = x81Var;
        this.x = x81Var2;
        this.y = x81Var3;
        this.z = i;
        this.A = z;
        this.B = x81Var4;
        this.C = i2;
        this.D = y81Var;
    }

    @Override // defpackage.x81
    public final sb2 invoke(bw4 bw4Var, g70 g70Var) {
        bw4 bw4Var2 = bw4Var;
        long j = g70Var.a;
        int iH = g70.h(j);
        int iG = g70.g(j);
        return bw4Var2.K(iH, iG, ds0.w, new n34(bw4Var2, this.w, this.x, this.y, this.z, iH, this.A, iG, g70.a(j, 0, 0, 0, 0, 10), this.B, this.C, this.D));
    }
}
