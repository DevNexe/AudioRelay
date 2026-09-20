package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cz1 extends cx1 implements x81<ug2, pg2.CQf, ug2> {
    public final /* synthetic */ yy1 w;
    public final /* synthetic */ ui2<sg2> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz1(yy1 yy1Var, ui2<sg2> ui2Var) {
        super(2);
        this.w = yy1Var;
        this.x = ui2Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    @Override // defpackage.x81
    public final ug2 invoke(ug2 ug2Var, pg2.CQf cQf) {
        sg2 sg2Var;
        boolean z;
        ug2 ug2VarJ = ug2Var;
        pg2.CQf cQf2 = cQf;
        boolean z2 = cQf2 instanceof v21;
        ui2<sg2> ui2Var = this.x;
        yy1 yy1Var = this.w;
        if (z2) {
            v21 v21Var = (v21) cQf2;
            yy1Var.getClass();
            int i = ui2Var.y;
            if (i <= 0) {
                sg2Var = null;
                break;
            }
            sg2[] sg2VarArr = ui2Var.w;
            int i2 = 0;
            while (true) {
                sg2Var = sg2VarArr[i2];
                rg2 rg2Var = sg2Var.x;
                if (rg2Var instanceof a31) {
                    j81<x21, sd5> j81Var = ((a31) rg2Var).x;
                    if ((j81Var instanceof w21) && ((w21) j81Var).w == v21Var) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i2++;
                if (i2 >= i) {
                    sg2Var = null;
                    break;
                }
            }
            sg2 sg2Var2 = sg2Var;
            rg2 rg2Var2 = sg2Var2 != null ? sg2Var2.x : null;
            a31 a31Var = rg2Var2 instanceof a31 ? (a31) rg2Var2 : null;
            if (a31Var == null) {
                w21 w21Var = new w21(v21Var);
                wo1.QnHx qnHx = wo1.a;
                a31Var = new a31(w21Var);
            }
            yy1.i(yy1Var, a31Var, ug2VarJ, ui2Var);
            ug2VarJ = yy1.j(yy1Var, a31Var, ug2VarJ);
        }
        if (cQf2 instanceof rg2) {
            yy1.i(yy1Var, (rg2) cQf2, ug2VarJ, ui2Var);
        }
        return cQf2 instanceof tg2 ? yy1.j(yy1Var, (tg2) cQf2, ug2VarJ) : ug2VarJ;
    }
}
