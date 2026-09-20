package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.copperleaf.ballast.debugger.BallastDebuggerClientConnection$attemptConnection$2", f = "BallastDebuggerClientConnection.kt", l = {135}, m = "invokeSuspend")
public final class m6 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ k6<hf1> B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(k6<hf1> k6Var, z80<? super m6> z80Var) {
        super(2, z80Var);
        this.B = k6Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new m6(this.B, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            xw<sd5> xwVar = this.B.i;
            this.A = 1;
            if (xwVar.o0(this) == va0Var) {
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
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((m6) a(ua0Var, z80Var)).i(sd5.a);
    }
}
