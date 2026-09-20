package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rf extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ qf w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf(qf qfVar) {
        super(3);
        this.w = qfVar;
    }

    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(-852052847);
        WFia wFiaE0 = ps0.e0(g30Var2);
        g30Var2.e(1157296644);
        boolean zI = g30Var2.I(wFiaE0);
        Object objF = g30Var2.f();
        if (zI || objF == g30.QnHx.a) {
            objF = new sf(wFiaE0);
            g30Var2.B(objF);
        }
        g30Var2.G();
        sf sfVar = (sf) objF;
        sfVar.z = this.w;
        g30Var2.G();
        return sfVar;
    }
}
