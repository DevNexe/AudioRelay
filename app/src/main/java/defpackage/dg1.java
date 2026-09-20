package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.client.plugins.HttpRedirect$Plugin", f = "HttpRedirect.kt", l = {107}, m = "handleCall")
public final class dg1 extends b90 {
    public u94 A;
    public ue1 B;
    public jl3 C;
    public jl3 D;
    public cd5 E;
    public String F;
    public jl3 G;
    public boolean H;
    public /* synthetic */ Object I;
    public final /* synthetic */ cg1.CQf J;
    public int K;
    public cg1.CQf z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg1(cg1.CQf cQf, z80<? super dg1> z80Var) {
        super(z80Var);
        this.J = cQf;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return cg1.CQf.c(this.J, null, null, null, false, null, this);
    }
}
