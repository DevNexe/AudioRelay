package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cu3 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ xv0 A;
    public final /* synthetic */ r34 w;
    public final /* synthetic */ ri2<ou3> x;
    public final /* synthetic */ is4<String> y;
    public final /* synthetic */ il2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu3(r34 r34Var, ri2<ou3> ri2Var, is4<String> is4Var, il2 il2Var, xv0 xv0Var) {
        super(2);
        this.w = r34Var;
        this.x = ri2Var;
        this.y = is4Var;
        this.z = il2Var;
        this.A = xv0Var;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e40.CQf cQf = e40.a;
            r34 r34Var = this.w;
            ri2<ou3> ri2Var = this.x;
            is4<String> is4Var = this.y;
            il2 il2Var = this.z;
            i34.a(null, r34Var, X.m(g30Var2, -1775296128, new au3(ri2Var, is4Var, il2Var)), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, X.m(g30Var2, 755006009, new bu3(il2Var, this.A)), g30Var2, 384, 12582912, 131065);
        }
        return sd5.a;
    }
}
