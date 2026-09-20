package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d45 extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ j81<kt2, sd5> w;
    public final /* synthetic */ ci2 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d45(m90.FJCM fjcm, ci2 ci2Var) {
        super(3);
        this.w = fjcm;
        this.x = ci2Var;
    }

    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(-102778667);
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
        g30Var2.e(-492369756);
        Object objF2 = g30Var2.f();
        if (objF2 == c0132QnHx) {
            objF2 = ps0.R(null);
            g30Var2.B(objF2);
        }
        g30Var2.G();
        ri2 ri2Var = (ri2) objF2;
        ri2 ri2VarF0 = ps0.f0(this.w, g30Var2);
        ci2 ci2Var = this.x;
        wq0.a(ci2Var, new b45(ri2Var, ci2Var), g30Var2);
        pg2.QnHx qnHx = pg2.QnHx.w;
        ci2 ci2Var2 = this.x;
        pg2 pg2VarA = tx4.a(qnHx, ci2Var2, new c45(ua0Var, ri2Var, ci2Var2, ri2VarF0, null));
        g30Var2.G();
        return pg2VarA;
    }
}
