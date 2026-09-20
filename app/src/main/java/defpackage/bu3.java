package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bu3 extends cx1 implements y81<ay2, g30, Integer, sd5> {
    public final /* synthetic */ il2 w;
    public final /* synthetic */ xv0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu3(il2 il2Var, xv0 xv0Var) {
        super(3);
        this.w = il2Var;
        this.x = xv0Var;
    }

    @Override // defpackage.y81
    public final sd5 invoke(ay2 ay2Var, g30 g30Var, Integer num) {
        ay2 ay2Var2 = ay2Var;
        g30 g30Var2 = g30Var;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= g30Var2.I(ay2Var2) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e40.CQf cQf = e40.a;
            ge5.a(g30Var2, 0);
            hx0 hx0Var = gm4.b;
            wo1.QnHx qnHx = wo1.a;
            pg2 pg2VarY = hx0Var.y(new cy2(ay2Var2));
            g30Var2.e(-483455358);
            rb2 rb2VarA = tv.a(CZ9P.c, One.QnHx.m, g30Var2);
            g30Var2.e(-1323940314);
            ij0 ij0Var = (ij0) g30Var2.E(r40.e);
            jy1 jy1Var = (jy1) g30Var2.E(r40.k);
            ti5 ti5Var = (ti5) g30Var2.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx2 = a30.QnHx.b;
            sz szVarJ = S12N.j(pg2VarY);
            if (!(g30Var2.v() instanceof jE)) {
                fp1.c0();
                throw null;
            }
            g30Var2.s();
            if (g30Var2.m()) {
                g30Var2.l(qnHx2);
            } else {
                g30Var2.A();
            }
            g30Var2.u();
            hH.u(g30Var2, rb2VarA, a30.QnHx.e);
            hH.u(g30Var2, ij0Var, a30.QnHx.d);
            hH.u(g30Var2, jy1Var, a30.QnHx.f);
            qc0.c(0, szVarJ, bl2.b(g30Var2, ti5Var, a30.QnHx.g, g30Var2), g30Var2, 2058660585, -1163856341);
            if (!(((double) 1.0f) > 0.0d)) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
            }
            wo1.QnHx qnHx3 = wo1.a;
            mz1 mz1Var = new mz1(1.0f, true);
            il2 il2Var = this.w;
            xv0 xv0Var = this.x;
            yt3.b(mz1Var, il2Var, xv0Var, g30Var2, 64);
            xv0Var.a.a.invoke(g30Var2, 0);
            g30Var2.G();
            g30Var2.G();
            g30Var2.H();
            g30Var2.G();
            g30Var2.G();
        }
        return sd5.a;
    }
}
