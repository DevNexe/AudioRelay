package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ey3 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ ej1 w;
    public final /* synthetic */ String x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey3(ej1 ej1Var, String str, int i) {
        super(2);
        this.w = ej1Var;
        this.x = str;
        this.y = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e40.CQf cQf = e40.a;
            float f = 16;
            wo1.QnHx qnHx = wo1.a;
            lm4 lm4Var = new lm4(f, f, f, f, true);
            da.CQf cQf2 = One.QnHx.k;
            rh1.a(this.w, null, hj0.b(lm4Var, new th5(cQf2)), 0L, g30Var2, 48, 8);
            pq4.a(4, g30Var2, 6);
            j55.b(this.x, new th5(cQf2), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) g30Var2.E(sc5.a)).l, g30Var2, (this.y >> 3) & 14, 0, 32764);
        }
        return sd5.a;
    }
}
