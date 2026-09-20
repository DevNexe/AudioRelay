package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kh extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ ad0 w;
    public final /* synthetic */ Boolean x;
    public final /* synthetic */ j81<sg, sd5> y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh(int i, ad0 ad0Var, Boolean bool, j81 j81Var) {
        super(2);
        this.w = ad0Var;
        this.x = bool;
        this.y = j81Var;
        this.z = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e40.CQf cQf = e40.a;
            fh.e(this.w, this.x.booleanValue(), this.y, g30Var2, ((this.z << 3) & 896) | 0);
        }
        return sd5.a;
    }
}
