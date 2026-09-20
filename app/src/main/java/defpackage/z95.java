package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z95 extends cx1 implements j81<zl0, yl0> {
    public final /* synthetic */ t95<Object> w;
    public final /* synthetic */ t95<Object>.QnHx<Object, Object> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z95(t95<Object> t95Var, t95<Object>.QnHx<Object, Object> qnHx) {
        super(1);
        this.w = t95Var;
        this.x = qnHx;
    }

    @Override // defpackage.j81
    public final yl0 invoke(zl0 zl0Var) {
        return new y95(this.w, this.x);
    }
}
