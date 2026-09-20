package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rC extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ x81<sp1, sp1, sd5> w;
    public final /* synthetic */ lx0<sp1> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rC(lx0 lx0Var, x81 x81Var) {
        super(3);
        this.w = x81Var;
        this.x = lx0Var;
    }

    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        pg2 pg2Var2 = pg2Var;
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(-843180607);
        g30Var2.e(773894976);
        g30Var2.e(-492369756);
        Object objF = g30Var2.f();
        g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
        if (objF == c0132QnHx) {
            s40 s40Var = new s40(wq0.i(g30Var2));
            g30Var2.B(s40Var);
            objF = s40Var;
        }
        g30Var2.G();
        ua0 ua0Var = ((s40) objF).w;
        g30Var2.G();
        g30Var2.e(1157296644);
        boolean zI = g30Var2.I(ua0Var);
        Object objF2 = g30Var2.f();
        if (zI || objF2 == c0132QnHx) {
            objF2 = new dm4(this.x, ua0Var);
            g30Var2.B(objF2);
        }
        g30Var2.G();
        dm4 dm4Var = (dm4) objF2;
        dm4Var.y = this.w;
        pg2 pg2VarY = fp1.L(pg2Var2).y(dm4Var);
        g30Var2.G();
        return pg2VarY;
    }
}
