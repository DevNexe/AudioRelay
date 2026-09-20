package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ht0 extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ t95<ts0> w;
    public final /* synthetic */ is4<pm4> x;
    public final /* synthetic */ is4<pm4> y;
    public final /* synthetic */ String z = "Built-in";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht0(t95 t95Var, ri2 ri2Var, ri2 ri2Var2) {
        super(3);
        this.w = t95Var;
        this.x = ri2Var;
        this.y = ri2Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        pg2 pg2VarY = pg2Var;
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(158379472);
        g30Var2.e(1157296644);
        t95<ts0> t95Var = this.w;
        boolean zI = g30Var2.I(t95Var);
        Object objF = g30Var2.f();
        g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
        if (zI || objF == c0132QnHx) {
            objF = ps0.R(Boolean.FALSE);
            g30Var2.B(objF);
        }
        g30Var2.G();
        ri2 ri2Var = (ri2) objF;
        ts0 ts0VarB = t95Var.b();
        ts0 ts0VarD = t95Var.d();
        is4<pm4> is4Var = this.y;
        is4<pm4> is4Var2 = this.x;
        if (ts0VarB == ts0VarD && !t95Var.e()) {
            ri2Var.setValue(Boolean.FALSE);
        } else if (is4Var2.getValue() != null || is4Var.getValue() != null) {
            ri2Var.setValue(Boolean.TRUE);
        }
        if (((Boolean) ri2Var.getValue()).booleanValue()) {
            int i = mp1.c;
            qb5 qb5Var = mg5.g;
            g30Var2.e(-492369756);
            Object objF2 = g30Var2.f();
            if (objF2 == c0132QnHx) {
                objF2 = this.z + " slide";
                g30Var2.B(objF2);
            }
            g30Var2.G();
            t95.QnHx qnHxA = da5.a(t95Var, qb5Var, (String) objF2, g30Var2);
            g30Var2.e(1157296644);
            boolean zI2 = g30Var2.I(t95Var);
            Object objF3 = g30Var2.f();
            if (zI2 || objF3 == c0132QnHx) {
                objF3 = new rm4(qnHxA, is4Var2, is4Var);
                g30Var2.B(objF3);
            }
            g30Var2.G();
            pg2VarY = pg2VarY.y((rm4) objF3);
        }
        g30Var2.G();
        return pg2VarY;
    }
}
