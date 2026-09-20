package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r35 extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ mt2 B;
    public final /* synthetic */ qd5 C;
    public final /* synthetic */ j81<x45, sd5> D;
    public final /* synthetic */ u45 w;
    public final /* synthetic */ j45 x;
    public final /* synthetic */ x45 y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r35(u45 u45Var, j45 j45Var, x45 x45Var, boolean z, boolean z2, mt2 mt2Var, qd5 qd5Var, u45.CQf cQf) {
        super(3);
        this.w = u45Var;
        this.x = j45Var;
        this.y = x45Var;
        this.z = z;
        this.A = z2;
        this.B = mt2Var;
        this.C = qd5Var;
        this.D = cQf;
    }

    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(58482146);
        g30Var2.e(-492369756);
        Object objF = g30Var2.f();
        if (objF == g30.QnHx.a) {
            objF = new r55();
            g30Var2.B(objF);
        }
        g30Var2.G();
        pg2 pg2VarA = cw1.a(pg2.QnHx.w, new q35(new p35(this.w, this.x, this.y, this.z, this.A, (r55) objF, this.B, this.C, this.D)));
        g30Var2.G();
        return pg2VarA;
    }
}
