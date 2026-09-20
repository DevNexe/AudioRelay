package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nm2 extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ mm2 w;
    public final /* synthetic */ lm2 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm2(lm2 lm2Var, mm2 mm2Var) {
        super(3);
        this.w = mm2Var;
        this.x = lm2Var;
    }

    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(410346167);
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
        g30Var2.e(100475938);
        mm2 mm2Var = this.w;
        if (mm2Var == null) {
            g30Var2.e(-492369756);
            Object objF2 = g30Var2.f();
            if (objF2 == c0132QnHx) {
                objF2 = new mm2();
                g30Var2.B(objF2);
            }
            g30Var2.G();
            mm2Var = (mm2) objF2;
        }
        g30Var2.G();
        g30Var2.e(1618982084);
        lm2 lm2Var = this.x;
        boolean zI = g30Var2.I(lm2Var) | g30Var2.I(mm2Var) | g30Var2.I(ua0Var);
        Object objF3 = g30Var2.f();
        if (zI || objF3 == c0132QnHx) {
            mm2Var.b = ua0Var;
            objF3 = new pm2(lm2Var, mm2Var);
            g30Var2.B(objF3);
        }
        g30Var2.G();
        pm2 pm2Var = (pm2) objF3;
        g30Var2.G();
        return pm2Var;
    }
}
