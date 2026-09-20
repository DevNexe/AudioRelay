package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fy2 extends cx1 implements a91<sz1, Integer, g30, Integer, sd5> {
    public final /* synthetic */ j70 w;
    public final /* synthetic */ a91<iy2, Integer, g30, Integer, sd5> x;
    public final /* synthetic */ jy2 y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fy2(j70 j70Var, a91<? super iy2, ? super Integer, ? super g30, ? super Integer, sd5> a91Var, jy2 jy2Var, int i) {
        super(4);
        this.w = j70Var;
        this.x = a91Var;
        this.y = jy2Var;
        this.z = i;
    }

    @Override // defpackage.a91
    public final sd5 I(sz1 sz1Var, Integer num, g30 g30Var, Integer num2) {
        int i;
        sz1 sz1Var2 = sz1Var;
        int iIntValue = num.intValue();
        g30 g30Var2 = g30Var;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 14) == 0) {
            i = (g30Var2.I(sz1Var2) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 112) == 0) {
            i |= g30Var2.i(iIntValue) ? 32 : 16;
        }
        int i2 = i;
        if ((i2 & 731) == 146 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e40.CQf cQf = e40.a;
            pg2 pg2VarL = gm4.l(sz1Var2.b(new c30(wo1.a, new nm2(this.w, null)), 1.0f), null, 3);
            g30Var2.e(733328855);
            rb2 rb2VarC = fe.c(One.QnHx.a, false, g30Var2);
            g30Var2.e(-1323940314);
            ij0 ij0Var = (ij0) g30Var2.E(r40.e);
            jy1 jy1Var = (jy1) g30Var2.E(r40.k);
            ti5 ti5Var = (ti5) g30Var2.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx = a30.QnHx.b;
            sz szVarJ = S12N.j(pg2VarL);
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
            hH.u(g30Var2, rb2VarC, a30.QnHx.e);
            hH.u(g30Var2, ij0Var, a30.QnHx.d);
            hH.u(g30Var2, jy1Var, a30.QnHx.f);
            qc0.c(0, szVarJ, bl2.b(g30Var2, ti5Var, a30.QnHx.g, g30Var2), g30Var2, 2058660585, -2137368960);
            this.x.I(this.y, Integer.valueOf(iIntValue), g30Var2, Integer.valueOf((i2 & 112) | (this.z & 896)));
            g30Var2.G();
            g30Var2.G();
            g30Var2.H();
            g30Var2.G();
            g30Var2.G();
        }
        return sd5.a;
    }
}
