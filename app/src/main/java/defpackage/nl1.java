package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nl1 extends cx1 implements h81<E3F> {
    public final /* synthetic */ jl1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl1(jl1 jl1Var) {
        super(0);
        this.w = jl1Var;
    }

    @Override // defpackage.h81
    public final E3F invoke() {
        jl1 jl1Var = this.w;
        return new E3F(jl1Var.C.getContext(), (p32) jl1Var.E.a("p32", new ml1(jl1Var)), jl1Var.C());
    }
}
