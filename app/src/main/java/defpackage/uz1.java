package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uz1 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ zz1 w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz1(zz1 zz1Var, int i) {
        super(2);
        this.w = zz1Var;
        this.x = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            this.w.d(this.x, g30Var2, 0);
        }
        return sd5.a;
    }
}
