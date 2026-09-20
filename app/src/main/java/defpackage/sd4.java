package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class sd4 extends cx1 implements j81<rd4, rd4> {
    public final /* synthetic */ qd4 w;
    public final /* synthetic */ ae4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd4(qd4 qd4Var, ae4 ae4Var) {
        super(1);
        this.w = qd4Var;
        this.x = ae4Var;
    }

    @Override // defpackage.j81
    public final rd4 invoke(rd4 rd4Var) {
        py0 py0Var;
        mc4.QnHx qnHx = ((qd4.F1) this.w).a;
        boolean z = qnHx instanceof mc4.QnHx.C0168QnHx;
        kj1<pd4> kj1Var = rd4Var.a;
        if (z) {
            return new rd4(kj1Var, true);
        }
        if (!(qnHx instanceof mc4.QnHx.CQf)) {
            throw new NoWhenBranchMatchedException();
        }
        this.x.getClass();
        List<mc4.CQf> list = ((mc4.QnHx.CQf) qnHx).a;
        ArrayList arrayList = new ArrayList(mu.w0(list, 10));
        for (mc4.CQf cQf : list) {
            long j = cQf.c;
            yb4 yb4Var = cQf.b;
            arrayList.add(new pd4(j, new jf4(yb4Var.y0(), cQf.a, yb4Var.x)));
        }
        x94 x94VarH0 = ba4.H0(new uu(arrayList), na4.I0(new uu(kj1Var), new zd4(arrayList)));
        boolean z2 = x94VarH0 instanceof q95;
        ca4 ca4Var = ca4.w;
        if (z2) {
            q95 q95Var = (q95) x94VarH0;
            py0Var = new py0(q95Var.a, q95Var.b, ca4Var);
        } else {
            py0Var = new py0(x94VarH0, da4.w, ca4Var);
        }
        return new rd4(new kj1(na4.L0(new ma4(na4.I0(py0Var, wd4.w), new lw(new j81[]{xd4.w, yd4.w})))), false);
    }
}
