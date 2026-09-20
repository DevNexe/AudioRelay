package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class mr extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ String A;
    public final /* synthetic */ zs3 B;
    public final /* synthetic */ h81<sd5> w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ ci2 y;
    public final /* synthetic */ uj1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr(uj1 uj1Var, ci2 ci2Var, zs3 zs3Var, String str, h81 h81Var, boolean z) {
        super(3);
        this.w = h81Var;
        this.x = z;
        this.y = ci2Var;
        this.z = uj1Var;
        this.A = str;
        this.B = zs3Var;
    }

    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(92076020);
        h81<sd5> h81Var = this.w;
        ri2 ri2VarF0 = ps0.f0(h81Var, g30Var2);
        g30Var2.e(-492369756);
        Object objF = g30Var2.f();
        g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
        if (objF == c0132QnHx) {
            objF = ps0.R(null);
            g30Var2.B(objF);
        }
        g30Var2.G();
        ri2 ri2Var = (ri2) objF;
        g30Var2.e(1841981204);
        boolean z = this.x;
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
        ri2 ri2VarF1 = ps0.f0(new kr(ri2Var2, yrVar), g30Var2);
        Boolean boolValueOf = Boolean.valueOf(z);
        lr lrVar = new lr(this.x, this.y, ri2Var, ri2VarF1, ri2VarF0, null);
        y83 y83Var = tx4.a;
        wo1.QnHx qnHx = wo1.a;
        c30 c30Var = new c30(qnHx, new vx4(ci2Var, boolValueOf, lrVar));
        g30Var2.e(-492369756);
        Object objF3 = g30Var2.f();
        if (objF3 == c0132QnHx) {
            objF3 = new jr(ri2Var2);
            g30Var2.B(objF3);
        }
        g30Var2.G();
        pg2 pg2VarA = f30.a(wj1.a(cw1.a(c94.a((pg2) objF3, true, new rr(this.B, this.A, z, h81Var)), new tr(z, h81Var)), ci2Var, this.z), qnHx, new qd1(ci2Var, z));
        vo1 vo1Var = y31.a;
        pg2 pg2VarY = f30.a(pg2VarA, qnHx, new x31(ci2Var, z)).y(c30Var);
        g30Var2.G();
        return pg2VarY;
    }
}
