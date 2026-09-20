package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.client.plugins.HttpRedirect$Plugin$install$1", f = "HttpRedirect.kt", l = {61, 66}, m = "invokeSuspend")
public final class eg1 extends px4 implements y81<u94, ig1, z80<? super ve1>, Object> {
    public int A;
    public /* synthetic */ u94 B;
    public /* synthetic */ ig1 C;
    public final /* synthetic */ cg1 D;
    public final /* synthetic */ ue1 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg1(cg1 cg1Var, ue1 ue1Var, z80<? super eg1> z80Var) {
        super(3, z80Var);
        this.D = cg1Var;
        this.E = ue1Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        u94 u94Var;
        ig1 ig1Var;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i != 0) {
            if (i == 1) {
                ig1 ig1Var2 = this.C;
                u94 u94Var2 = this.B;
                C0239D.H(obj);
                ig1Var = ig1Var2;
                u94Var = u94Var2;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
        }
        C0239D.H(obj);
        u94 u94Var3 = this.B;
        ig1 ig1Var3 = this.C;
        this.B = u94Var3;
        this.C = ig1Var3;
        this.A = 1;
        Object objA = u94Var3.a(ig1Var3, this);
        if (objA == va0Var) {
            return va0Var;
        }
        u94Var = u94Var3;
        ig1Var = ig1Var3;
        obj = objA;
        ve1 ve1Var = (ve1) obj;
        cg1 cg1Var = this.D;
        if (cg1Var.a && !fg1.a.contains(ve1Var.d().getMethod())) {
            return ve1Var;
        }
        cg1.CQf cQf = cg1.c;
        boolean z = cg1Var.b;
        ue1 ue1Var = this.E;
        this.B = null;
        this.C = null;
        this.A = 2;
        obj = cg1.CQf.c(cQf, u94Var, ig1Var, ve1Var, z, ue1Var, this);
        return obj == va0Var ? va0Var : obj;
    }

    @Override // defpackage.y81
    public final Object invoke(u94 u94Var, ig1 ig1Var, z80<? super ve1> z80Var) {
        eg1 eg1Var = new eg1(this.D, this.E, z80Var);
        eg1Var.B = u94Var;
        eg1Var.C = ig1Var;
        return eg1Var.i(sd5.a);
    }
}
