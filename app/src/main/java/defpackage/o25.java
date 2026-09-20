package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o25 extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ cg w;
    public final /* synthetic */ u45 x;
    public final /* synthetic */ x45 y;
    public final /* synthetic */ mt2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o25(cg cgVar, u45 u45Var, x45 x45Var, mt2 mt2Var) {
        super(3);
        this.w = cgVar;
        this.x = u45Var;
        this.y = x45Var;
        this.z = mt2Var;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0086  */
    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        pg2 pg2VarY;
        pg2 pg2Var2 = pg2Var;
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(1634330012);
        g30Var2.e(-492369756);
        Object objF = g30Var2.f();
        if (objF == g30.QnHx.a) {
            objF = ps0.a(1.0f);
            g30Var2.B(objF);
        }
        g30Var2.G();
        OVbg oVbg = (OVbg) objF;
        cg cgVar = this.w;
        boolean z = true;
        if (cgVar instanceof jq4) {
            if (((jq4) cgVar).a == yu.h) {
                z = false;
            }
        }
        if (this.x.b()) {
            x45 x45Var = this.y;
            if (s55.b(x45Var.b) && z) {
                wq0.f(cgVar, x45Var.a, new s55(x45Var.b), new m25(oVbg, null), g30Var2);
                n25 n25Var = new n25(oVbg, this.z, this.y, this.x, this.w);
                wo1.QnHx qnHx = wo1.a;
                pg2VarY = pg2Var2.y(new so0(n25Var));
            } else {
                pg2VarY = pg2.QnHx.w;
            }
        } else {
            pg2VarY = pg2.QnHx.w;
        }
        g30Var2.G();
        return pg2VarY;
    }
}
