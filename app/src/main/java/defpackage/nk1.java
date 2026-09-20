package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nk1 extends cx1 implements h81<Ns> {
    public final /* synthetic */ jk1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk1(jk1 jk1Var) {
        super(0);
        this.w = jk1Var;
    }

    @Override // defpackage.h81
    public final Ns invoke() {
        jk1 jk1Var = this.w;
        return new Ns(jk1Var.g(), jk1Var.f());
    }
}
