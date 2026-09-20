package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h21 extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ j81<f31, sd5> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h21(b21 b21Var) {
        super(3);
        this.w = b21Var;
    }

    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(607036704);
        g30Var2.e(1157296644);
        j81<f31, sd5> j81Var = this.w;
        boolean zI = g30Var2.I(j81Var);
        Object objF = g30Var2.f();
        if (zI || objF == g30.QnHx.a) {
            objF = new i21(j81Var);
            g30Var2.B(objF);
        }
        g30Var2.G();
        i21 i21Var = (i21) objF;
        wq0.h(new g21(i21Var), g30Var2);
        g30Var2.G();
        return i21Var;
    }
}
