package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class ae0 extends cx1 implements j81<dd0, dd0> {
    public final /* synthetic */ xq0<ce0.QnHx, ce0.F1> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ae0(xq0<? extends ce0.QnHx, ce0.F1> xq0Var) {
        super(1);
        this.w = xq0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.j81
    public final dd0 invoke(dd0 dd0Var) {
        ce0.QnHx qnHx;
        dd0 dd0Var2 = dd0Var;
        xq0<ce0.QnHx, ce0.F1> xq0Var = this.w;
        if (xq0Var instanceof xq0.CQf) {
            qnHx = null;
        } else {
            if (!(xq0Var instanceof xq0.QnHx)) {
                throw new NoWhenBranchMatchedException();
            }
            qnHx = (ce0.QnHx) ((xq0.QnHx) xq0Var).a;
        }
        return dd0.a(dd0Var2, false, null, qnHx, 3);
    }
}
