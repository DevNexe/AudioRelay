package defpackage;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public final class nq1 implements iq1 {
    public final oq1 a;
    public final EWe b;
    public final wc3 c;
    public final ln2 d;
    public final gR2r e;
    public final ar8 f;
    public volatile boolean g;
    public volatile rv2<? extends Activity> h = gp2.a;

    public nq1(sq1 sq1Var, EWe eWe, wc3 wc3Var, ln2 ln2Var, gR2r gr2r, ar8 ar8Var) {
        this.a = sq1Var;
        this.b = eWe;
        this.c = wc3Var;
        this.d = ln2Var;
        this.e = gr2r;
        this.f = ar8Var;
    }

    @Override // defpackage.iq1
    public final void initialize() {
        c54 c54Var = j54.c;
        vq2<dd3> vq2VarH = this.c.h(c54Var);
        int i = 1;
        k71 k71Var = new k71(i);
        vq2VarH.getClass();
        vq2 vq2VarN = new hr2(new cs2(vq2VarH, k71Var)).n(new NFo7(this, 2)).n(new D(this, i));
        c54 c54Var2 = j54.b;
        ln2 ln2Var = this.d;
        ds2 ds2VarF = ln2Var.f(c54Var2);
        fXUx fxux = fXUx.y;
        ds2VarF.getClass();
        jw4.b(vq2.k(vq2VarN, new pr2(ds2VarF, fxux).B(new d83(ln2Var, c54Var2)), xnX3.z).u(c54Var).B(new Ot0r(this, i)).A(c54Var), kq1.w, new lq1(this), 2);
        jw4.b(FWT.I(ln2Var, c54Var2), null, new mq1(this), 3);
        fp1.k0(ha1.w, null, 0, new jq1(this, null), 3);
    }
}
