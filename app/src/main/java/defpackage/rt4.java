package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class rt4 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ kj1<gs4> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt4(kj1<gs4> kj1Var) {
        super(2);
        this.w = kj1Var;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        vu4 vu4Var;
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e40.CQf cQf = e40.a;
            kj1<gs4> kj1Var = this.w;
            int size = kj1Var.size();
            int i = 0;
            while (i < size) {
                gs4 gs4Var = kj1Var.get(i);
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
                szVarJ.invoke(bl2.b(g30Var2, ti5Var, a30.QnHx.g, g30Var2), g30Var2, 0);
                g30Var2.e(2058660585);
                g30Var2.e(-678309503);
                rh1.a(ob.v(), null, null, 0L, g30Var2, 48, 12);
                hH.i(gm4.k(qnHx, 16), g30Var2, 6);
                if (ur1.a(gs4Var, gs4.F1.a)) {
                    vu4Var = m21.E;
                } else if (ur1.a(gs4Var, gs4.NUlFixed.a)) {
                    vu4Var = m21.F;
                } else if (ur1.a(gs4Var, gs4.LPt8Fixed.a)) {
                    vu4Var = m21.G;
                } else if (ur1.a(gs4Var, gs4.CQf.a)) {
                    vu4Var = m21.H;
                } else {
                    if (!ur1.a(gs4Var, gs4.QnHx.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vu4Var = m21.I;
                }
                g30 g30Var3 = g30Var2;
                j55.b(OW8.o(vu4Var), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) g30Var3.E(sc5.a)).j, g30Var3, 0, 0, 32766);
                ex0.d(g30Var3);
                hH.i(gm4.g(qnHx, 8), g30Var3, 6);
                i++;
                g30Var2 = g30Var3;
                size = size;
                kj1Var = kj1Var;
            }
            e40.CQf cQf3 = e40.a;
        }
        return sd5.a;
    }
}
