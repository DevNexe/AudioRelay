package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ee4 extends cx1 implements y81<wv, g30, Integer, sd5> {
    public final /* synthetic */ jf4 w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee4(jf4 jf4Var, int i) {
        super(3);
        this.w = jf4Var;
        this.x = i;
    }

    @Override // defpackage.y81
    public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 81) == 16 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e40.CQf cQf = e40.a;
            da.CQf cQf2 = One.QnHx.k;
            g30Var2.e(693286680);
            pg2.QnHx qnHx = pg2.QnHx.w;
            rb2 rb2VarA = uu3.a(CZ9P.a, cQf2, g30Var2);
            g30Var2.e(-1323940314);
            ij0 ij0Var = (ij0) g30Var2.E(r40.e);
            jy1 jy1Var = (jy1) g30Var2.E(r40.k);
            ti5 ti5Var = (ti5) g30Var2.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx2 = a30.QnHx.b;
            sz szVarJ = S12N.j(qnHx);
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
            qc0.c(0, szVarJ, bl2.b(g30Var2, ti5Var, a30.QnHx.g, g30Var2), g30Var2, 2058660585, -678309503);
            if (!(((double) 1.0f) > 0.0d)) {
                throw new IllegalArgumentException(("invalid weight 1.0; must be greater than zero").toString());
            }
            wo1.QnHx qnHx3 = wo1.a;
            lc4.a(this.w, new mz1(1.0f, true), g30Var2, this.x & 14, 0);
            hH.i(gm4.k(qnHx, rv0.a), g30Var2, 0);
            rh1.a(m21.b(), null, null, 0L, g30Var2, 48, 12);
            ex0.d(g30Var2);
        }
        return sd5.a;
    }
}
