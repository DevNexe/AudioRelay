package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ek1 extends cx1 implements j81<zl0, yl0> {
    public final /* synthetic */ bk1 w;
    public final /* synthetic */ bk1.QnHx<Object, Object> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek1(bk1 bk1Var, bk1.QnHx<Object, Object> qnHx) {
        super(1);
        this.w = bk1Var;
        this.x = qnHx;
    }

    @Override // defpackage.j81
    public final yl0 invoke(zl0 zl0Var) {
        bk1 bk1Var = this.w;
        ui2<bk1.QnHx<?, ?>> ui2Var = bk1Var.a;
        bk1.QnHx<Object, Object> qnHx = this.x;
        ui2Var.b(qnHx);
        bk1Var.b.setValue(Boolean.TRUE);
        return new dk1(bk1Var, qnHx);
    }
}
