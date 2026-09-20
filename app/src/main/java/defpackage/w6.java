package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.copperleaf.ballast.debugger.BallastDebuggerClientConnection$heartbeat$3", f = "BallastDebuggerClientConnection.kt", l = {221}, m = "invokeSuspend")
public final class w6 extends px4 implements x81<sd5, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ ig0 B;
    public final /* synthetic */ k6<hf1> C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(k6 k6Var, ig0 ig0Var, z80 z80Var) {
        super(2, z80Var);
        this.B = ig0Var;
        this.C = k6Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new w6(this.C, this.B, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            iu1 iu1Var = ju1.a;
            rv1<b7> rv1VarSerializer = b7.Companion.serializer();
            k6<hf1> k6Var = this.C;
            p61.YKK ykk = new p61.YKK(iu1Var.b(rv1VarSerializer, new b7.byN(k6Var.e, k6Var.d)));
            this.A = 1;
            if (this.B.i0(ykk, this) == va0Var) {
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
        return ((w6) a(sd5Var, z80Var)).i(sd5.a);
    }
}
