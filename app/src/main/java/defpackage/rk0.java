package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rk0 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ vk0.QnHx w;
    public final /* synthetic */ kk2 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk0(vk0.QnHx qnHx, kk2 kk2Var) {
        super(2);
        this.w = qnHx;
        this.x = kk2Var;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            this.w.G.invoke(this.x, g30Var2, 8);
        }
        return sd5.a;
    }
}
