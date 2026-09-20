package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class au3 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ ri2<ou3> w;
    public final /* synthetic */ is4<String> x;
    public final /* synthetic */ il2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au3(ri2<ou3> ri2Var, is4<String> is4Var, il2 il2Var) {
        super(2);
        this.w = ri2Var;
        this.x = is4Var;
        this.y = il2Var;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e40.CQf cQf = e40.a;
            ou3 value = this.w.getValue();
            if (value != null) {
                String value2 = this.x.getValue();
                zt3 zt3Var = new zt3(this.y);
                ry4 ry4Var = ou3.d;
                e95.a(value, value2, zt3Var, g30Var2, 0);
            }
        }
        return sd5.a;
    }
}
