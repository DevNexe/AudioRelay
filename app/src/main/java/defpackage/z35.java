package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z35 extends r8<z35> {
    public final x45 h;
    public final p55 i;

    public z35(x45 x45Var, mt2 mt2Var, p55 p55Var, r55 r55Var) {
        super(x45Var.a, x45Var.b, p55Var != null ? p55Var.a : null, mt2Var, r55Var);
        this.h = x45Var;
        this.i = p55Var;
    }

    public final List<qq0> x(j81<? super z35, ? extends qq0> j81Var) {
        if (!s55.b(this.f)) {
            return ps0.M(new dw("", 0), new ng4(s55.e(this.f), s55.e(this.f)));
        }
        qq0 qq0VarInvoke = j81Var.invoke(this);
        if (qq0VarInvoke != null) {
            return Collections.singletonList(qq0VarInvoke);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    public final int y(p55 p55Var, int i) {
        dl3 dl3VarN;
        iy1 iy1Var = p55Var.b;
        if (iy1Var == null) {
            dl3VarN = dl3.e;
        } else {
            iy1 iy1Var2 = p55Var.c;
            dl3VarN = iy1Var2 != null ? iy1Var2.N(iy1Var, true) : null;
            if (dl3VarN == null) {
                dl3VarN = dl3.e;
            }
        }
        int iC = s55.c(this.h.b);
        mt2 mt2Var = this.d;
        int iB = mt2Var.b(iC);
        o55 o55Var = p55Var.a;
        dl3 dl3VarC = o55Var.c(iB);
        return mt2Var.a(o55Var.l(X.a(dl3VarC.a, (cm4.c(ps0.e(dl3VarN.c - dl3VarN.a, dl3VarN.d - dl3VarN.b)) * i) + dl3VarC.b)));
    }
}
