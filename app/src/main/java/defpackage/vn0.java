package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vn0 extends cx1 implements x81<g30, Integer, x83> {
    public final /* synthetic */ eo0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn0(eo0 eo0Var) {
        super(2);
        this.w = eo0Var;
    }

    @Override // defpackage.x81
    public final x83 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(830271906);
        g30Var2.e(1157296644);
        eo0 eo0Var = this.w;
        boolean zI = g30Var2.I(eo0Var);
        Object objF = g30Var2.f();
        if (zI || objF == g30.QnHx.a) {
            objF = new zi1(eo0Var);
            g30Var2.B(objF);
        }
        g30Var2.G();
        zi1 zi1Var = (zi1) objF;
        g30Var2.G();
        return zi1Var;
    }
}
