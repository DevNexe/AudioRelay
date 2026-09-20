package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y85 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ h81<sd5> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y85(h81<sd5> h81Var, int i) {
        super(2);
        this.w = h81Var;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e40.CQf cQf = e40.a;
            g30Var2.e(1157296644);
            h81<sd5> h81Var = this.w;
            boolean zI = g30Var2.I(h81Var);
            Object objF = g30Var2.f();
            if (zI || objF == g30.QnHx.a) {
                objF = new x85(h81Var);
                g30Var2.B(objF);
            }
            g30Var2.G();
            oh1.a((h81) objF, null, false, null, o20.c, g30Var2, 24576, 14);
        }
        return sd5.a;
    }
}
