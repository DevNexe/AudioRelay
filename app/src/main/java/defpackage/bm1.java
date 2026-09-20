package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class bm1 extends cx1 implements h81<pa> {
    public final /* synthetic */ dm1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm1(dm1 dm1Var) {
        super(0);
        this.w = dm1Var;
    }

    @Override // defpackage.h81
    public final pa invoke() {
        dm1 dm1Var = this.w;
        Context context = dm1Var.a.getContext();
        fXUx fxux = new fXUx();
        Ld ld = dm1Var.a;
        return new pa(new ws(context, fxux, new pf4(ld.getContext(), 1)), new fXUx(), new pf4(ld.getContext(), 1));
    }
}
