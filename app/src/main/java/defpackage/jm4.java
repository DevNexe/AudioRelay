package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jm4 extends cx1 implements x81<sp1, jy1, mp1> {
    public final /* synthetic */ One.CQf w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm4(da.QnHx qnHx) {
        super(2);
        this.w = qnHx;
    }

    @Override // defpackage.x81
    public final mp1 invoke(sp1 sp1Var, jy1 jy1Var) {
        int i = (int) (sp1Var.a >> 32);
        return new mp1(C0239D.d(this.w.a(0, i, jy1Var), 0));
    }
}
