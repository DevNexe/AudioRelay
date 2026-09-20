package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hd3 extends cx1 implements j81<sp1, sd5> {
    public final /* synthetic */ ij0 w;
    public final /* synthetic */ ri2<wm0> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd3(ij0 ij0Var, ri2<wm0> ri2Var) {
        super(1);
        this.w = ij0Var;
        this.x = ri2Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(sp1 sp1Var) {
        this.x.setValue(new wm0(this.w.j((int) (sp1Var.a >> 32))));
        return sd5.a;
    }
}
