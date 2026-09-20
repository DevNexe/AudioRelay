package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.copperleaf.ballast.debugger.BallastDebuggerClientConnection$heartbeat$1", f = "BallastDebuggerClientConnection.kt", l = {216}, m = "invokeSuspend")
public final class u6 extends px4 implements x81<nz0<? super sd5>, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;

    public u6(z80<? super u6> z80Var) {
        super(2, z80Var);
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        u6 u6Var = new u6(z80Var);
        u6Var.B = obj;
        return u6Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        nz0 nz0Var;
        sd5 sd5Var;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            nz0Var = (nz0) this.B;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nz0Var = (nz0) this.B;
            C0239D.H(obj);
        }
        do {
            sd5Var = sd5.a;
            this.B = nz0Var;
            this.A = 1;
        } while (nz0Var.f(sd5Var, this) != va0Var);
        return va0Var;
    }

    @Override // defpackage.x81
    public final Object invoke(nz0<? super sd5> nz0Var, z80<? super sd5> z80Var) {
        return ((u6) a(nz0Var, z80Var)).i(sd5.a);
    }
}
