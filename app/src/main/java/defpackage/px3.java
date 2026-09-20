package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class px3 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ ej1 w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px3(ej1 ej1Var, int i) {
        super(2);
        this.w = ej1Var;
        this.x = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e40.CQf cQf = e40.a;
            rh1.a(this.w, null, null, 0L, g30Var2, ((this.x >> 3) & 14) | 48, 12);
        }
        return sd5.a;
    }
}
