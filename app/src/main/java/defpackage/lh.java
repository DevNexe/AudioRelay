package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lh extends cx1 implements y81<lcO, g30, Integer, sd5> {
    public final /* synthetic */ Boolean w;
    public final /* synthetic */ j81<sg, sd5> x;
    public final /* synthetic */ int y;
    public final /* synthetic */ ad0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh(int i, ad0 ad0Var, Boolean bool, j81 j81Var) {
        super(3);
        this.w = bool;
        this.x = j81Var;
        this.y = i;
        this.z = ad0Var;
    }

    @Override // defpackage.y81
    public final sd5 invoke(lcO lco, g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        num.intValue();
        e40.CQf cQf = e40.a;
        om0.a(null, 0L, 0.0f, 0.0f, g30Var2, 0, 15);
        Boolean bool = this.w;
        boolean z = !bool.booleanValue();
        int i = this.y;
        j81<sg, sd5> j81Var = this.x;
        io5.a(z, X.m(g30Var2, -983741412, new jh(i, j81Var)), X.m(g30Var2, -2098000039, new kh(i, this.z, bool, j81Var)), g30Var2, 432);
        return sd5.a;
    }
}
