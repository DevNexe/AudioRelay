package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class t90 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ nk5 A;
    public final /* synthetic */ pg2 B;
    public final /* synthetic */ pg2 C;
    public final /* synthetic */ pg2 D;
    public final /* synthetic */ pg2 E;
    public final /* synthetic */ Cif F;
    public final /* synthetic */ u45 G;
    public final /* synthetic */ j45 H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ j81<o55, sd5> K;
    public final /* synthetic */ int w;
    public final /* synthetic */ w55 x;
    public final /* synthetic */ g45 y;
    public final /* synthetic */ x45 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t90(int i, w55 w55Var, g45 g45Var, x45 x45Var, nk5 nk5Var, pg2 pg2Var, pg2 pg2Var2, pg2 pg2Var3, pg2 pg2Var4, Cif cif, u45 u45Var, j45 j45Var, boolean z, boolean z2, j81<? super o55, sd5> j81Var) {
        super(2);
        this.w = i;
        this.x = w55Var;
        this.y = g45Var;
        this.z = x45Var;
        this.A = nk5Var;
        this.B = pg2Var;
        this.C = pg2Var2;
        this.D = pg2Var3;
        this.E = pg2Var4;
        this.F = cif;
        this.G = u45Var;
        this.H = j45Var;
        this.I = z;
        this.J = z2;
        this.K = j81Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        pg2 uh5Var;
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            wo1.QnHx qnHx = wo1.a;
            int i = this.w;
            w55 w55Var = this.x;
            c30 c30Var = new c30(qnHx, new wa2(i, w55Var));
            s90 s90Var = new s90(this.G);
            g45 g45Var = this.y;
            aw2 aw2Var = (aw2) g45Var.e.getValue();
            int i2 = s55.c;
            x45 x45Var = this.z;
            long j = x45Var.b;
            int iC = (int) (j >> 32);
            if (iC == ((int) (g45Var.d >> 32))) {
                iC = s55.c(j) != s55.c(g45Var.d) ? s55.c(j) : s55.e(j);
            }
            g45Var.d = j;
            ((mk5) this.A).getClass();
            p95 p95Var = new p95(x45Var.a, mt2.QnHx.a);
            int iOrdinal = aw2Var.ordinal();
            if (iOrdinal == 0) {
                uh5Var = new uh5(g45Var, iC, p95Var, s90Var);
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                uh5Var = new fd1(g45Var, iC, p95Var, s90Var);
            }
            sk4.a(f30.a(f30.a(fp1.L(c30Var).y(uh5Var).y(this.B).y(this.C), wo1.a, new t45(w55Var)).y(this.D).y(this.E), qnHx, new of(this.F)), X.m(g30Var2, 19580180, new r90(this.H, this.G, this.I, this.J, this.K)), g30Var2, 48, 0);
        }
        return sd5.a;
    }
}
