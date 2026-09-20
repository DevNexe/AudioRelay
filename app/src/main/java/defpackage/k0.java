package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ h81<sd5> A;
    public final /* synthetic */ int B;
    public final /* synthetic */ wv2 w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(wv2 wv2Var, boolean z, boolean z2, boolean z3, h81<sd5> h81Var, int i) {
        super(2);
        this.w = wv2Var;
        this.x = z;
        this.y = z2;
        this.z = z3;
        this.A = h81Var;
        this.B = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        j0.d(this.w, this.x, this.y, this.z, this.A, g30Var, this.B | 1);
        return sd5.a;
    }
}
