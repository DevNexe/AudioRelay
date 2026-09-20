package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kk1 extends cx1 implements h81<sq1> {
    public final /* synthetic */ jk1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk1(jk1 jk1Var) {
        super(0);
        this.w = jk1Var;
    }

    @Override // defpackage.h81
    public final sq1 invoke() {
        jk1 jk1Var = this.w;
        return new sq1(new xq1(jk1Var.f()), jk1Var.f());
    }
}
