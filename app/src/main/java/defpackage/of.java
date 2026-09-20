package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class of extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ Cif w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of(Cif cif) {
        super(3);
        this.w = cif;
    }

    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(-992853993);
        WFia wFiaE0 = ps0.e0(g30Var2);
        g30Var2.e(1157296644);
        boolean zI = g30Var2.I(wFiaE0);
        Object objF = g30Var2.f();
        if (zI || objF == g30.QnHx.a) {
            objF = new pf(wFiaE0);
            g30Var2.B(objF);
        }
        g30Var2.G();
        pf pfVar = (pf) objF;
        Cif cif = this.w;
        if (cif instanceof kf) {
            wq0.a(cif, new nf(cif, pfVar), g30Var2);
        }
        g30Var2.G();
        return pfVar;
    }
}
