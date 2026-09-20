package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n21 extends cx1 implements j81<f31, sd5> {
    public final /* synthetic */ ri2<Boolean> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n21(ri2<Boolean> ri2Var) {
        super(1);
        this.w = ri2Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(f31 f31Var) {
        this.w.setValue(Boolean.valueOf(f31Var.a()));
        return sd5.a;
    }
}
