package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v31 extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ ci2 w;
    public final /* synthetic */ boolean x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v31(ci2 ci2Var, boolean z) {
        super(3);
        this.w = ci2Var;
        this.x = z;
    }

    public static final boolean a(ri2<Boolean> ri2Var) {
        return ri2Var.getValue().booleanValue();
    }

    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        pg2 pg2Var2;
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(1871352361);
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
        g30Var2.e(-492369756);
        Object objF3 = g30Var2.f();
        if (objF3 == c0132QnHx) {
            objF3 = ps0.R(null);
            g30Var2.B(objF3);
        }
        g30Var2.G();
        ri2 ri2Var2 = (ri2) objF3;
        g30Var2.e(-492369756);
        Object objF4 = g30Var2.f();
        if (objF4 == c0132QnHx) {
            objF4 = ps0.R(Boolean.FALSE);
            g30Var2.B(objF4);
        }
        g30Var2.G();
        ri2 ri2Var3 = (ri2) objF4;
        g30Var2.e(-492369756);
        Object objF5 = g30Var2.f();
        if (objF5 == c0132QnHx) {
            objF5 = new b31();
            g30Var2.B(objF5);
        }
        g30Var2.G();
        b31 b31Var = (b31) objF5;
        g30Var2.e(-492369756);
        Object objF6 = g30Var2.f();
        if (objF6 == c0132QnHx) {
            objF6 = new kf();
            g30Var2.B(objF6);
        }
        g30Var2.G();
        Cif cif = (Cif) objF6;
        ci2 ci2Var = this.w;
        wq0.a(ci2Var, new k31(ri2Var, ci2Var), g30Var2);
        boolean z = this.x;
        wq0.a(Boolean.valueOf(z), new n31(z, ua0Var, ri2Var, ci2Var), g30Var2);
        pg2 pg2VarA = pg2.QnHx.w;
        if (z) {
            if (a(ri2Var3)) {
                g30Var2.e(-492369756);
                Object objF7 = g30Var2.f();
                if (objF7 == c0132QnHx) {
                    objF7 = new b41();
                    g30Var2.B(objF7);
                }
                g30Var2.G();
                pg2Var2 = (pg2) objF7;
            } else {
                pg2Var2 = pg2VarA;
            }
            pg2 pg2VarA2 = wo1.a(c94.a(pg2VarA, false, new p31(ri2Var3, b31Var)), new g33(new q31(ri2Var2)));
            wo1.QnHx qnHx = wo1.a;
            pg2 pg2VarA3 = f30.a(d31.a(f30.a(pg2VarA2, qnHx, new of(cif)), b31Var).y(pg2Var2), qnHx, new c21(new u31(ua0Var, ri2Var3, cif, ri2Var2, ri2Var, this.w)));
            mg3<r21> mg3Var = s21.a;
            pg2VarA = f30.a(pg2VarA3, qnHx, u21.w);
        }
        g30Var2.G();
        return pg2VarA;
    }
}
