package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pi1 extends cx1 implements y81<lcO, g30, Integer, sd5> {
    public final /* synthetic */ j81<bi1, sd5> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi1(int i, j81 j81Var) {
        super(3);
        this.w = j81Var;
    }

    @Override // defpackage.y81
    public final sd5 invoke(lcO lco, g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        num.intValue();
        e40.CQf cQf = e40.a;
        pg2 pg2VarX = ps0.X(pg2.QnHx.w, 0.0f, 0.0f, 0.0f, 16, 7);
        g30Var2.e(1157296644);
        j81<bi1, sd5> j81Var = this.w;
        boolean zI = g30Var2.I(j81Var);
        Object objF = g30Var2.f();
        if (zI || objF == g30.QnHx.a) {
            objF = new oi1(j81Var);
            g30Var2.B(objF);
        }
        g30Var2.G();
        ti4.a(pg2VarX, (h81) objF, g30Var2, 6, 0);
        return sd5.a;
    }
}
