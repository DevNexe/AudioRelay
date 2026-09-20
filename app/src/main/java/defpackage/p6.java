package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.copperleaf.ballast.debugger.BallastDebuggerClientConnection$attemptConnection$4", f = "BallastDebuggerClientConnection.kt", l = {150}, m = "invokeSuspend")
public final class p6 extends px4 implements x81<ig0, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ h81<sd5> C;
    public final /* synthetic */ k6<hf1> D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(h81<sd5> h81Var, k6<hf1> k6Var, z80<? super p6> z80Var) {
        super(2, z80Var);
        this.C = h81Var;
        this.D = k6Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        p6 p6Var = new p6(this.C, this.D, z80Var);
        p6Var.B = obj;
        return p6Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            ig0 ig0Var = (ig0) this.B;
            this.C.invoke();
            k6<hf1> k6Var = this.D;
            k6Var.getClass();
            ms1[] ms1VarArr = {kd.r(new r01(new w6(k6Var, ig0Var, null), new r01(new v6(null), new d24(new u6(null)))), ig0Var), kd.r(new r01(new a7(k6Var, ig0Var, null), kd.t(k6Var.g)), ig0Var), kd.r(new r01(new y6(k6Var, null), new x6(kd.t(ig0Var.v()))), ig0Var)};
            this.A = 1;
            if (y4.a(ms1VarArr, this) == va0Var) {
                return va0Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(ig0 ig0Var, z80<? super sd5> z80Var) {
        return ((p6) a(ig0Var, z80Var)).i(sd5.a);
    }
}
