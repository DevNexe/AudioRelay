package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a35 extends cx1 implements y81<pg2, g30, Integer, sd5> {
    public final /* synthetic */ x81<g30, Integer, sd5> A;
    public final /* synthetic */ float w;
    public final /* synthetic */ k25 x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a35(float f, k25 k25Var, boolean z, int i, int i2, x81<? super g30, ? super Integer, sd5> x81Var) {
        super(3);
        this.w = f;
        this.x = k25Var;
        this.y = z;
        this.z = i;
        this.A = x81Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.y81
    public final sd5 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        pg2 pg2Var2 = pg2Var;
        g30 g30Var2 = g30Var;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= g30Var2.I(pg2Var2) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && g30Var2.t()) {
            g30Var2.x();
        } else {
            pg2 pg2VarK = hH.k(pg2Var2, this.w);
            x81<g30, Integer, sd5> x81Var = this.A;
            g30Var2.e(733328855);
            rb2 rb2VarC = fe.c(One.QnHx.a, false, g30Var2);
            g30Var2.e(-1323940314);
            ij0 ij0Var = (ij0) g30Var2.E(r40.e);
            jy1 jy1Var = (jy1) g30Var2.E(r40.k);
            ti5 ti5Var = (ti5) g30Var2.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx = a30.QnHx.b;
            sz szVarJ = S12N.j(pg2VarK);
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
            g30Var2.e(1188063364);
            e35.b(((yu) this.x.j(this.y, g30Var2).getValue()).a, ((rc5) g30Var2.E(sc5.a)).g, null, x81Var, g30Var2, (this.z >> 6) & 7168, 4);
            g30Var2.G();
            g30Var2.G();
            g30Var2.G();
            g30Var2.H();
            g30Var2.G();
            g30Var2.G();
        }
        return sd5.a;
    }
}
