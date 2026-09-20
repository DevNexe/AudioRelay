package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class px1 extends cx1 implements j81<lx1, lx1> {
    public final /* synthetic */ kx1.QnHx w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px1(kx1.QnHx qnHx) {
        super(1);
        this.w = qnHx;
    }

    @Override // defpackage.j81
    public final lx1 invoke(lx1 lx1Var) {
        return new lx1(lx1Var.a, this.w.a);
    }
}
