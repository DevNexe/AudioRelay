package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class uw3 extends cx1 implements j81<fv3, fv3> {
    public final /* synthetic */ gx3 w;
    public final /* synthetic */ ev3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw3(gx3 gx3Var, ev3 ev3Var) {
        super(1);
        this.w = gx3Var;
        this.x = ev3Var;
    }

    @Override // defpackage.j81
    public final fv3 invoke(fv3 fv3Var) {
        bv3 bv3Var;
        bv3 qnHx;
        boolean z;
        fv3 fv3Var2 = fv3Var;
        pb.QnHx qnHx2 = ((ev3.CQf) this.x).a;
        this.w.getClass();
        if (qnHx2 instanceof pb.QnHx.CQf) {
            bv3 bv3Var2 = fv3Var2.l;
            if (bv3Var2 instanceof bv3.QnHx) {
                z = ((bv3.QnHx) bv3Var2).a;
            } else {
                if (!ur1.a(bv3Var2, bv3.CQf.a) && !ur1.a(bv3Var2, bv3.F1.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                z = false;
            }
            pb.QnHx.CQf cQf = (pb.QnHx.CQf) qnHx2;
            qnHx = new bv3.QnHx(cQf.a, z, cQf.c, cQf.d);
        } else {
            if (ur1.a(qnHx2, pb.QnHx.F1.a)) {
                bv3Var = bv3.CQf.a;
            } else {
                if (!ur1.a(qnHx2, pb.QnHx.C0181QnHx.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bv3Var = bv3.F1.a;
            }
            qnHx = bv3Var;
        }
        return fv3.a(fv3Var2, null, null, null, null, null, null, null, null, null, qnHx, false, null, null, null, 63487);
    }
}
