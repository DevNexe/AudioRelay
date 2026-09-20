package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class uk2 extends cx1 implements j81<ul2, sd5> {
    public final /* synthetic */ dl2 w;
    public final /* synthetic */ rk2 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk2(dl2 dl2Var, rk2 rk2Var) {
        super(1);
        this.w = dl2Var;
        this.x = rk2Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    @Override // defpackage.j81
    public final sd5 invoke(ul2 ul2Var) {
        boolean z;
        boolean z2;
        ul2 ul2Var2 = ul2Var;
        C1642uS c1642uS = new C1642uS();
        sk2.w.invoke(c1642uS);
        int i = c1642uS.a;
        sl2.QnHx qnHx = ul2Var2.a;
        qnHx.e = i;
        qnHx.f = c1642uS.b;
        qnHx.g = c1642uS.c;
        qnHx.h = c1642uS.d;
        dl2 dl2Var = this.w;
        boolean z3 = dl2Var instanceof fl2;
        rk2 rk2Var = this.x;
        if (z3) {
            int i2 = dl2.E;
            Iterator it = ba4.G0(dl2Var, cl2.w).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = true;
                    break;
                }
                dl2 dl2Var2 = (dl2) it.next();
                dl2 dl2VarE = rk2Var.e();
                if (ur1.a(dl2Var2, dl2VarE != null ? dl2VarE.x : null)) {
                    z2 = false;
                    break;
                }
            }
            if (z2) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (z) {
            int i3 = fl2.J;
            fl2 fl2Var = rk2Var.c;
            if (fl2Var == null) {
                throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
            }
            ul2Var2.c = ((dl2) na4.J0(ba4.G0(fl2Var.g(fl2Var.G, true), el2.w))).C;
            ul2Var2.e = false;
            z93 z93Var = new z93();
            tk2.w.invoke(z93Var);
            ul2Var2.e = z93Var.a;
            ul2Var2.f = z93Var.b;
        }
        return sd5.a;
    }
}
