package defpackage;

import androidx.activity.result.QnHx;

/* JADX INFO: loaded from: classes.dex */
public final class lrBU extends cx1 implements j81<zl0, yl0> {
    public final /* synthetic */ is4<j81<Object, sd5>> A;
    public final /* synthetic */ lpT1Fixed<Object> w;
    public final /* synthetic */ QnHx x;
    public final /* synthetic */ String y;
    public final /* synthetic */ FLr<Object, Object> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lrBU(lpT1Fixed lpt1, QnHx qnHx, String str, FLr fLr, ri2 ri2Var) {
        super(1);
        this.w = lpt1;
        this.x = qnHx;
        this.y = str;
        this.z = fLr;
        this.A = ri2Var;
    }

    @Override // defpackage.j81
    public final yl0 invoke(zl0 zl0Var) {
        vK0u vk0u = new vK0u(this.A, 0);
        g9D g9dC = this.x.c(this.y, this.z, vk0u);
        lpT1Fixed<Object> lpt1 = this.w;
        lpt1.a = g9dC;
        return new YXrn(lpt1);
    }
}
