package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y74 extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ h81<kt2> w;
    public final /* synthetic */ j81<h81<kt2>, pg2> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y74(h81<kt2> h81Var, j81<? super h81<kt2>, ? extends pg2> j81Var) {
        super(3);
        this.w = h81Var;
        this.x = j81Var;
    }

    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(759876635);
        g30Var2.e(-1589795249);
        g30Var2.e(-492369756);
        Object objF = g30Var2.f();
        g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
        if (objF == c0132QnHx) {
            objF = ps0.x(this.w);
            g30Var2.B(objF);
        }
        g30Var2.G();
        is4 is4Var = (is4) objF;
        g30Var2.e(-492369756);
        Object objF2 = g30Var2.f();
        if (objF2 == c0132QnHx) {
            objF2 = new OVbg(new kt2(((kt2) is4Var.getValue()).a), w74.b, new kt2(w74.c));
            g30Var2.B(objF2);
        }
        g30Var2.G();
        OVbg oVbg = (OVbg) objF2;
        wq0.d(sd5.a, new z74(is4Var, oVbg, null), g30Var2);
        AOdm<T, V> aOdm = oVbg.c;
        g30Var2.G();
        pg2 pg2VarInvoke = this.x.invoke(new x74(aOdm));
        g30Var2.G();
        return pg2VarInvoke;
    }
}
