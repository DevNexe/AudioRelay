package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a41 extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ j81<iy1, sd5> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a41(x70.QnHx qnHx) {
        super(3);
        this.w = qnHx;
    }

    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(1176407768);
        g30Var2.e(1157296644);
        j81<iy1, sd5> j81Var = this.w;
        boolean zI = g30Var2.I(j81Var);
        Object objF = g30Var2.f();
        if (zI || objF == g30.QnHx.a) {
            objF = new c41(j81Var);
            g30Var2.B(objF);
        }
        g30Var2.G();
        c41 c41Var = (c41) objF;
        g30Var2.G();
        return c41Var;
    }
}
