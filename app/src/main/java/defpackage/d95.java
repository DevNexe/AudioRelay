package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d95 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ h81<sd5> w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d95(h81<sd5> h81Var, int i) {
        super(2);
        this.w = h81Var;
        this.x = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e40.CQf cQf = e40.a;
            oh1.a(this.w, null, false, null, o20.a, g30Var2, ((this.x >> 6) & 14) | 24576, 14);
        }
        return sd5.a;
    }
}
