package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n45 extends cx1 implements j81<zm0, sd5> {
    public final /* synthetic */ ij0 w;
    public final /* synthetic */ ri2<sp1> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n45(ij0 ij0Var, ri2<sp1> ri2Var) {
        super(1);
        this.w = ij0Var;
        this.x = ri2Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(zm0 zm0Var) {
        long j = zm0Var.a;
        float fB = zm0.b(j);
        ij0 ij0Var = this.w;
        this.x.setValue(new sp1(C0239D.e(ij0Var.p0(fB), ij0Var.p0(zm0.a(j)))));
        return sd5.a;
    }
}
