package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b21 extends cx1 implements j81<f31, sd5> {
    public final /* synthetic */ ri2<f31> w;
    public final /* synthetic */ j81<f31, sd5> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b21(ri2<f31> ri2Var, j81<? super f31, sd5> j81Var) {
        super(1);
        this.w = ri2Var;
        this.x = j81Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(f31 f31Var) {
        f31 f31Var2 = f31Var;
        ri2<f31> ri2Var = this.w;
        if (!ur1.a(ri2Var.getValue(), f31Var2)) {
            ri2Var.setValue(f31Var2);
            this.x.invoke(f31Var2);
        }
        return sd5.a;
    }
}
