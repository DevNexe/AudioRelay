package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c21 extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ j81<f31, sd5> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c21(j81<? super f31, sd5> j81Var) {
        super(3);
        this.w = j81Var;
    }

    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(-1741761824);
        g30Var2.e(-492369756);
        Object objF = g30Var2.f();
        if (objF == g30.QnHx.a) {
            objF = ps0.R(null);
            g30Var2.B(objF);
        }
        g30Var2.G();
        b21 b21Var = new b21((ri2) objF, this.w);
        mg3<i21> mg3Var = f21.a;
        c30 c30Var = new c30(wo1.a, new h21(b21Var));
        g30Var2.G();
        return c30Var;
    }
}
