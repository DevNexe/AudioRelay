package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j64 extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ boolean w = true;
    public final /* synthetic */ m64 x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ qy0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j64(m64 m64Var, qy0 qy0Var, boolean z, boolean z2) {
        super(3);
        this.x = m64Var;
        this.y = z;
        this.z = qy0Var;
        this.A = z2;
    }

    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(1478351300);
        tw2 tw2VarF = qe0.f(g30Var2);
        g30Var2.e(773894976);
        g30Var2.e(-492369756);
        Object objF = g30Var2.f();
        if (objF == g30.QnHx.a) {
            s40 s40Var = new s40(wq0.i(g30Var2));
            g30Var2.B(s40Var);
            objF = s40Var;
        }
        g30Var2.G();
        ua0 ua0Var = ((s40) objF).w;
        g30Var2.G();
        pg2.QnHx qnHx = pg2.QnHx.w;
        pg2 pg2VarA = c94.a(qnHx, false, new i64(this.A, this.w, this.y, this.x, ua0Var));
        aw2 aw2Var = aw2.Vertical;
        boolean z = this.w;
        aw2 aw2Var2 = z ? aw2Var : aw2.Horizontal;
        boolean z2 = this.A;
        boolean z3 = !z2;
        boolean z4 = (!(g30Var2.E(r40.k) == jy1.Rtl) || z) ? z3 : !z3;
        m64 m64Var = this.x;
        pg2 pg2VarY = pg2VarA.y(aw2Var2 == aw2Var ? C1645xs.c : C1645xs.b).y(tw2VarF.c()).y(o64.b(qnHx, m64Var, aw2Var2, tw2VarF, this.y, z4, this.z, m64Var.b)).y(new y64(m64Var, z2, z, tw2VarF));
        g30Var2.G();
        return pg2VarY;
    }
}
