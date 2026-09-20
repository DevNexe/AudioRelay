package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dd extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ float w;
    public final /* synthetic */ dj4 x;
    public final /* synthetic */ cg y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd(float f, cg cgVar, dj4 dj4Var) {
        super(3);
        this.w = f;
        this.x = dj4Var;
        this.y = cgVar;
    }

    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        pg2 pg2Var2 = pg2Var;
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(-1498088849);
        g30Var2.e(-492369756);
        Object objF = g30Var2.f();
        if (objF == g30.QnHx.a) {
            objF = new kl3();
            g30Var2.B(objF);
        }
        g30Var2.G();
        pg2 pg2VarY = pg2Var2.y(new c30(wo1.a, new no0(new cd(this.w, this.x, (kl3) objF, this.y))));
        g30Var2.G();
        return pg2VarY;
    }
}
