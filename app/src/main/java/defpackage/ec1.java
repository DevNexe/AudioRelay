package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ec1 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ ci2 w;
    public final /* synthetic */ x81<g30, Integer, sd5> x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ec1(ci2 ci2Var, x81<? super g30, ? super Integer, sd5> x81Var, int i) {
        super(2);
        this.w = ci2Var;
        this.x = x81Var;
        this.y = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e40.CQf cQf = e40.a;
            float f = gc1.a;
            wo1.QnHx qnHx = wo1.a;
            pg2 pg2VarA = wj1.a(new ee5(f, f), this.w, vs3.a(false, 0.0f, 0L, g30Var2, 0, 7));
            da daVar = One.QnHx.e;
            g30Var2.e(733328855);
            rb2 rb2VarC = fe.c(daVar, false, g30Var2);
            g30Var2.e(-1323940314);
            ij0 ij0Var = (ij0) g30Var2.E(r40.e);
            jy1 jy1Var = (jy1) g30Var2.E(r40.k);
            ti5 ti5Var = (ti5) g30Var2.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx2 = a30.QnHx.b;
            sz szVarJ = S12N.j(pg2VarA);
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
            hH.u(g30Var2, rb2VarC, a30.QnHx.e);
            hH.u(g30Var2, ij0Var, a30.QnHx.d);
            hH.u(g30Var2, jy1Var, a30.QnHx.f);
            qc0.c(0, szVarJ, bl2.b(g30Var2, ti5Var, a30.QnHx.g, g30Var2), g30Var2, 2058660585, -2137368960);
            this.x.invoke(g30Var2, Integer.valueOf((this.y >> 21) & 14));
            g30Var2.G();
            g30Var2.G();
            g30Var2.H();
            g30Var2.G();
            g30Var2.G();
        }
        return sd5.a;
    }
}
