package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class nf2 extends cx1 implements y81<m64, g30, Integer, sd5> {
    public final /* synthetic */ kj1<qe2> w;
    public final /* synthetic */ j81<ev3, sd5> x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public nf2(kj1<qe2> kj1Var, j81<? super ev3, sd5> j81Var, int i) {
        super(3);
        this.w = kj1Var;
        this.x = j81Var;
        this.y = i;
    }

    @Override // defpackage.y81
    public final sd5 invoke(m64 m64Var, g30 g30Var, Integer num) {
        m64 m64Var2 = m64Var;
        g30 g30Var2 = g30Var;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= g30Var2.I(m64Var2) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e40.CQf cQf = e40.a;
            pg2 pg2VarX = ob.x(pg2.QnHx.w, m64Var2);
            g30Var2.e(-483455358);
            rb2 rb2VarA = tv.a(CZ9P.c, One.QnHx.m, g30Var2);
            g30Var2.e(-1323940314);
            ij0 ij0Var = (ij0) g30Var2.E(r40.e);
            jy1 jy1Var = (jy1) g30Var2.E(r40.k);
            ti5 ti5Var = (ti5) g30Var2.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx = a30.QnHx.b;
            sz szVarJ = S12N.j(pg2VarX);
            if (!(g30Var2.v() instanceof jE)) {
                fp1.c0();
                throw null;
            }
            g30Var2.s();
            if (g30Var2.m()) {
                g30Var2.l(qnHx);
            } else {
                g30Var2.A();
            }
            g30Var2.u();
            hH.u(g30Var2, rb2VarA, a30.QnHx.e);
            hH.u(g30Var2, ij0Var, a30.QnHx.d);
            hH.u(g30Var2, jy1Var, a30.QnHx.f);
            qc0.c(0, szVarJ, bl2.b(g30Var2, ti5Var, a30.QnHx.g, g30Var2), g30Var2, 2058660585, -1163856341);
            Iterator<qe2> it = this.w.iterator();
            while (it.hasNext()) {
                hf2.i(it.next(), this.x, g30Var2, this.y & 112);
            }
            ex0.d(g30Var2);
            e40.CQf cQf2 = e40.a;
        }
        return sd5.a;
    }
}
