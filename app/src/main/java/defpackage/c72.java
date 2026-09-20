package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class c72 extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ h53 A;
    public final /* synthetic */ e72 B;
    public final /* synthetic */ j81<ij0, kt2> w;
    public final /* synthetic */ j81<ij0, kt2> x;
    public final /* synthetic */ float y;
    public final /* synthetic */ j81<zm0, sd5> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c72(j81<? super ij0, kt2> j81Var, j81<? super ij0, kt2> j81Var2, float f, j81<? super zm0, sd5> j81Var3, h53 h53Var, e72 e72Var) {
        super(3);
        this.w = j81Var;
        this.x = j81Var2;
        this.y = f;
        this.z = j81Var3;
        this.A = h53Var;
        this.B = e72Var;
    }

    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        pg2 pg2Var2 = pg2Var;
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(-454877003);
        View view = (View) g30Var2.E(Ll.f);
        ij0 ij0Var = (ij0) g30Var2.E(r40.e);
        g30Var2.e(-492369756);
        Object objF = g30Var2.f();
        g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
        if (objF == c0132QnHx) {
            objF = ps0.R(new kt2(kt2.d));
            g30Var2.B(objF);
        }
        g30Var2.G();
        ri2 ri2Var = (ri2) objF;
        ri2 ri2VarF0 = ps0.f0(this.w, g30Var2);
        ri2 ri2VarF1 = ps0.f0(this.x, g30Var2);
        float f = this.y;
        ri2 ri2VarF2 = ps0.f0(Float.valueOf(f), g30Var2);
        ri2 ri2VarF3 = ps0.f0(this.z, g30Var2);
        g30Var2.e(-492369756);
        Object objF2 = g30Var2.f();
        if (objF2 == c0132QnHx) {
            objF2 = ps0.x(new b72(ij0Var, ri2VarF0, ri2Var));
            g30Var2.B(objF2);
        }
        g30Var2.G();
        is4 is4Var = (is4) objF2;
        g30Var2.e(-492369756);
        Object objF3 = g30Var2.f();
        if (objF3 == c0132QnHx) {
            objF3 = ps0.x(new a72(is4Var));
            g30Var2.B(objF3);
        }
        g30Var2.G();
        is4 is4Var2 = (is4) objF3;
        g30Var2.e(-492369756);
        Object objF4 = g30Var2.f();
        if (objF4 == c0132QnHx) {
            objF4 = OW8.c(1, 0, lg.DROP_OLDEST, 2);
            g30Var2.B(objF4);
        }
        g30Var2.G();
        pi2 pi2Var = (pi2) objF4;
        if (this.A.a()) {
            f = 0.0f;
        }
        e72 e72Var = this.B;
        wq0.g(new Object[]{view, ij0Var, Float.valueOf(f), e72Var, Boolean.valueOf(ur1.a(e72Var, e72.h))}, new v62(this.A, this.B, view, ij0Var, this.y, pi2Var, ri2VarF3, is4Var2, is4Var, ri2VarF1, ri2Var, ri2VarF2, null), g30Var2);
        pg2 pg2VarA = c94.a(fp1.V(fp1.p0(pg2Var2, new w62(ri2Var)), new x62(pi2Var)), false, new z62(is4Var));
        g30Var2.G();
        return pg2VarA;
    }
}
