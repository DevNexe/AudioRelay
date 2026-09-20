package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b81 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ JBK6 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b81(JBK6 jbk6) {
        super(2);
        this.w = jbk6;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e40.CQf cQf = e40.a;
            rG.a(new a81(this.w), null, null, g30Var2, 0, 6);
        }
        return sd5.a;
    }
}
