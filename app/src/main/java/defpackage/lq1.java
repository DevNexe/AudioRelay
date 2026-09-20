package defpackage;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public final class lq1 extends cx1 implements j81<sd5, sd5> {
    public final /* synthetic */ nq1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq1(nq1 nq1Var) {
        super(1);
        this.w = nq1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.j81
    public final sd5 invoke(sd5 sd5Var) {
        nq1 nq1Var = this.w;
        nq1Var.getClass();
        a62 a62Var = a62.a;
        nq1Var.g = true;
        rv2<? extends Activity> rv2Var = nq1Var.h;
        if (nq1Var.g && (rv2Var instanceof mq4)) {
            nq1Var.a.b((Activity) ((mq4) rv2Var).a);
        }
        return sd5.a;
    }
}
