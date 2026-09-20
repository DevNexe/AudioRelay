package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o21 extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ long w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o21(long j) {
        super(3);
        this.w = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        pg2 pg2Var2 = pg2Var;
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(247098542);
        e40.CQf cQf = e40.a;
        g30Var2.e(-492369756);
        Object objF = g30Var2.f();
        g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
        if (objF == c0132QnHx) {
            objF = ps0.R(Boolean.FALSE);
            g30Var2.B(objF);
        }
        g30Var2.G();
        ri2 ri2Var = (ri2) objF;
        g30Var2.e(1157296644);
        boolean zI = g30Var2.I(ri2Var);
        Object objF2 = g30Var2.f();
        if (zI || objF2 == c0132QnHx) {
            objF2 = new n21(ri2Var);
            g30Var2.B(objF2);
        }
        g30Var2.G();
        wo1.QnHx qnHx = wo1.a;
        pg2 pg2VarA = f30.a(pg2Var2, qnHx, new c21((j81) objF2));
        if (((Boolean) ri2Var.getValue()).booleanValue()) {
            pg2VarA = f30.a(pg2VarA, qnHx, new dd(2, new jq4(this.w), el3.a));
        }
        g30Var2.G();
        return pg2VarA;
    }
}
