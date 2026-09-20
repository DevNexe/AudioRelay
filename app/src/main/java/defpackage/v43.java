package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v43 extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v43(boolean z) {
        super(3);
        this.w = z;
    }

    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        pg2 pg2VarA = pg2Var;
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(1922472092);
        e40.CQf cQf = e40.a;
        boolean z = this.w;
        AOdm aOdmA = WDjj.a(z ? 2 : 0, null, g30Var2, 0, 6);
        if (z) {
            pg2VarA = f30.a(pg2VarA, wo1.a, new dd(((wm0) aOdmA.getValue()).w, new jq4(((rv) g30Var2.E(sv.a)).g()), ((jj4) g30Var2.E(kj4.a)).b));
        }
        g30Var2.G();
        return pg2VarA;
    }
}
