package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class l45 extends cx1 implements h81<kt2> {
    public final /* synthetic */ j45 w;
    public final /* synthetic */ ri2<sp1> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l45(j45 j45Var, ri2<sp1> ri2Var) {
        super(0);
        this.w = j45Var;
        this.x = ri2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.h81
    public final kt2 invoke() {
        long jL;
        int iC;
        p55 p55VarC;
        o55 o55Var;
        iy1 iy1Var;
        p55 p55VarC2;
        iy1 iy1Var2;
        kt2 kt2Var;
        long j = this.x.getValue().a;
        j45 j45Var = this.w;
        if (j45Var.j().a.w.length() == 0) {
            jL = kt2.d;
        } else {
            eb1 eb1Var = (eb1) j45Var.n.getValue();
            int i = eb1Var == null ? -1 : k45.F1.a[eb1Var.ordinal()];
            if (i != -1) {
                if (i == 1 || i == 2) {
                    long j2 = j45Var.j().b;
                    int i2 = s55.c;
                    iC = (int) (j2 >> 32);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iC = s55.c(j45Var.j().b);
                }
                int iB = j45Var.b.b(iC);
                pp1 pp1Var = new pp1(0, j45Var.j().a.w.length() - 1);
                if (pp1Var instanceof rt) {
                    iB = ((Number) AY.r(Integer.valueOf(iB), (rt) pp1Var)).intValue();
                } else {
                    if (pp1Var.isEmpty()) {
                        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + pp1Var + '.');
                    }
                    if (iB < ((Number) pp1Var.b()).intValue()) {
                        iB = ((Number) pp1Var.b()).intValue();
                    } else if (iB > ((Number) pp1Var.e()).intValue()) {
                        iB = ((Number) pp1Var.e()).intValue();
                    }
                }
                u45 u45Var = j45Var.d;
                if (u45Var == null || (p55VarC = u45Var.c()) == null || (o55Var = p55VarC.a) == null) {
                    jL = kt2.d;
                } else {
                    long jB = o55Var.b(iB).b();
                    u45 u45Var2 = j45Var.d;
                    if (u45Var2 == null || (iy1Var = u45Var2.f) == null || (p55VarC2 = u45Var2.c()) == null || (iy1Var2 = p55VarC2.b) == null || (kt2Var = (kt2) j45Var.o.getValue()) == null) {
                        jL = kt2.d;
                    } else {
                        float fC = kt2.c(iy1Var2.L(iy1Var, kt2Var.a));
                        int iF = o55Var.f(iB);
                        int iJ = o55Var.j(iF);
                        int iE = o55Var.e(iF, true);
                        boolean z = ((int) (j45Var.j().b >> 32)) > s55.c(j45Var.j().b);
                        float fU = X.u(o55Var, iJ, true, z);
                        float fU2 = X.u(o55Var, iE, false, z);
                        float fN = AY.n(fC, Math.min(fU, fU2), Math.max(fU, fU2));
                        jL = Math.abs(fC - fN) > ((float) (((int) (j >> 32)) / 2)) ? kt2.d : iy1Var.L(iy1Var2, X.a(fN, kt2.d(jB)));
                    }
                }
            } else {
                jL = kt2.d;
            }
        }
        return new kt2(jL);
    }
}
