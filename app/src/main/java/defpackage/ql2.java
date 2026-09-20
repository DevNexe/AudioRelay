package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ql2 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ kk2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql2(kk2 kk2Var) {
        super(2);
        this.w = kk2Var;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            kk2 kk2Var = this.w;
            ((z20.QnHx) kk2Var.x).F.invoke(kk2Var, g30Var2, 8);
        }
        return sd5.a;
    }
}
