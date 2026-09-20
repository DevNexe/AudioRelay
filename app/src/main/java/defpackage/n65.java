package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n65 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ x81<g30, Integer, sd5> w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n65(int i, x81 x81Var) {
        super(2);
        this.w = x81Var;
        this.x = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e40.CQf cQf = e40.a;
            p42.a(this.w, g30Var2, (this.x >> 3) & 14);
        }
        return sd5.a;
    }
}
