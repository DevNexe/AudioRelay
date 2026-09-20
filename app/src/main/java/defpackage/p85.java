package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class p85 extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ zs3 A;
    public final /* synthetic */ q85 B;
    public final /* synthetic */ h81<sd5> w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ ci2 y;
    public final /* synthetic */ uj1 z = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p85(j85 j85Var, boolean z, ci2 ci2Var, zs3 zs3Var, q85 q85Var) {
        super(3);
        this.w = j85Var;
        this.x = z;
        this.y = ci2Var;
        this.A = zs3Var;
        this.B = q85Var;
    }

    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        pg2 pg2Var2 = pg2Var;
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(2121285826);
        g30Var2.e(-492369756);
        Object objF = g30Var2.f();
        g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
        if (objF == c0132QnHx) {
            objF = ps0.R(null);
            g30Var2.B(objF);
        }
        g30Var2.G();
        ri2 ri2Var = (ri2) objF;
        pg2.QnHx qnHx = pg2.QnHx.w;
        zs3 zs3Var = this.A;
        q85 q85Var = this.B;
        boolean z = this.x;
        h81<sd5> h81Var = this.w;
        pg2 pg2VarA = c94.a(qnHx, true, new o85(zs3Var, q85Var, z, h81Var));
        ri2 ri2VarF0 = ps0.f0(h81Var, g30Var2);
        g30Var2.e(-2134919160);
        ci2 ci2Var = this.y;
        if (z) {
            hr.a(ci2Var, ri2Var, g30Var2, 48);
        }
        g30Var2.G();
        int i = zr.b;
        g30Var2.e(-1990508712);
        yr yrVar = new yr((View) g30Var2.E(Ll.f));
        g30Var2.G();
        g30Var2.e(-492369756);
        Object objF2 = g30Var2.f();
        if (objF2 == c0132QnHx) {
            objF2 = ps0.R(Boolean.TRUE);
            g30Var2.B(objF2);
        }
        g30Var2.G();
        ri2 ri2Var2 = (ri2) objF2;
        ri2 ri2VarF1 = ps0.f0(new l85(ri2Var2, yrVar), g30Var2);
        Boolean boolValueOf = Boolean.valueOf(z);
        m85 m85Var = new m85(this.x, this.y, ri2Var, ri2VarF1, ri2VarF0, null);
        y83 y83Var = tx4.a;
        wo1.QnHx qnHx2 = wo1.a;
        pg2 pg2VarA2 = f30.a(qnHx, qnHx2, new vx4(ci2Var, boolValueOf, m85Var));
        g30Var2.e(-492369756);
        Object objF3 = g30Var2.f();
        if (objF3 == c0132QnHx) {
            objF3 = new k85(ri2Var2);
            g30Var2.B(objF3);
        }
        g30Var2.G();
        pg2 pg2VarA3 = f30.a(wj1.a(pg2Var2.y((pg2) objF3).y(pg2VarA), ci2Var, this.z), qnHx2, new qd1(ci2Var, z));
        vo1 vo1Var = y31.a;
        pg2 pg2VarY = f30.a(pg2VarA3, qnHx2, new x31(ci2Var, z)).y(pg2VarA2);
        g30Var2.G();
        return pg2VarY;
    }
}
