package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ir extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ boolean w;
    public final /* synthetic */ String x;
    public final /* synthetic */ zs3 y;
    public final /* synthetic */ h81<sd5> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir(boolean z, String str, zs3 zs3Var, h81<sd5> h81Var) {
        super(3);
        this.w = z;
        this.x = str;
        this.y = zs3Var;
        this.z = h81Var;
    }

    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(-756081143);
        uj1 uj1Var = (uj1) g30Var2.E(wj1.a);
        g30Var2.e(-492369756);
        Object objF = g30Var2.f();
        if (objF == g30.QnHx.a) {
            objF = new di2();
            g30Var2.B(objF);
        }
        g30Var2.G();
        boolean z = this.w;
        String str = this.x;
        c30 c30Var = new c30(wo1.a, new mr(uj1Var, (ci2) objF, this.y, str, this.z, z));
        g30Var2.G();
        return c30Var;
    }
}
