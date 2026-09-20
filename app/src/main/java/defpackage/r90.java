package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r90 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ j81<o55, sd5> A;
    public final /* synthetic */ j45 w;
    public final /* synthetic */ u45 x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r90(j45 j45Var, u45 u45Var, boolean z, boolean z2, j81<? super o55, sd5> j81Var) {
        super(2);
        this.w = j45Var;
        this.x = u45Var;
        this.y = z;
        this.z = z2;
        this.A = j81Var;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        iy1 iy1Var;
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            j81<o55, sd5> j81Var = this.A;
            u45 u45Var = this.x;
            q90 q90Var = new q90(u45Var, j81Var);
            g30Var2.e(-1323940314);
            pg2.QnHx qnHx = pg2.QnHx.w;
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
            hH.u(g30Var2, q90Var, a30.QnHx.e);
            hH.u(g30Var2, ij0Var, a30.QnHx.d);
            hH.u(g30Var2, jy1Var, a30.QnHx.f);
            boolean z = false;
            szVarJ.invoke(bl2.b(g30Var2, ti5Var, a30.QnHx.g, g30Var2), g30Var2, 0);
            g30Var2.e(2058660585);
            g30Var2.e(1714611517);
            g30Var2.G();
            g30Var2.G();
            g30Var2.H();
            g30Var2.G();
            hb1 hb1VarA = u45Var.a();
            hb1 hb1Var = hb1.Selection;
            boolean z2 = this.y;
            if (hb1VarA == hb1Var && (iy1Var = u45Var.f) != null && iy1Var.q() && z2) {
                z = true;
            }
            j45 j45Var = this.w;
            m90.d(j45Var, z, g30Var2, 8);
            if (u45Var.a() == hb1.Cursor && !this.z && z2) {
                m90.c(j45Var, g30Var2, 8);
            }
        }
        return sd5.a;
    }
}
