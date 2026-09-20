package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.copperleaf.ballast.debugger.BallastDebuggerClientConnection$heartbeat$2", f = "BallastDebuggerClientConnection.kt", l = {219}, m = "invokeSuspend")
public final class v6 extends px4 implements x81<sd5, z80<? super sd5>, Object> {
    public int A;

    public v6(z80<? super v6> z80Var) {
        super(2, z80Var);
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new v6(z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            this.A = 1;
            if (S12N.e(5000L, this) == va0Var) {
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
    public final Object invoke(sd5 sd5Var, z80<? super sd5> z80Var) {
        return new v6(z80Var).i(sd5.a);
    }
}
