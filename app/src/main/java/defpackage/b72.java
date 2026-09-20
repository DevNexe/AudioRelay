package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b72 extends cx1 implements h81<kt2> {
    public final /* synthetic */ ij0 w;
    public final /* synthetic */ is4<j81<ij0, kt2>> x;
    public final /* synthetic */ ri2<kt2> y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b72(ij0 ij0Var, ri2 ri2Var, ri2 ri2Var2) {
        super(0);
        this.w = ij0Var;
        this.x = ri2Var;
        this.y = ri2Var2;
    }

    @Override // defpackage.h81
    public final kt2 invoke() {
        long j = this.x.getValue().invoke(this.w).a;
        ri2<kt2> ri2Var = this.y;
        return new kt2((X.w(ri2Var.getValue().a) && X.w(j)) ? kt2.g(ri2Var.getValue().a, j) : kt2.d);
    }
}
