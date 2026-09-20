package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.copperleaf.ballast.internal.BallastViewModelImpl$startInternal$4$interceptorScope$1", f = "BallastViewModelImpl.kt", l = {266}, m = "invokeSuspend")
public final class h8 extends px4 implements x81<ph3<Object, Object, Object>, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ v7<Object, Object, Object> C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(v7<Object, Object, Object> v7Var, z80<? super h8> z80Var) {
        super(2, z80Var);
        this.C = v7Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        h8 h8Var = new h8(this.C, z80Var);
        h8Var.B = obj;
        return h8Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            ph3<Object, Object, Object> ph3Var = (ph3) this.B;
            jo<ph3<Object, Object, Object>> joVar = this.C.f;
            this.A = 1;
            if (joVar.p(ph3Var, this) == va0Var) {
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
    public final Object invoke(ph3<Object, Object, Object> ph3Var, z80<? super sd5> z80Var) {
        return ((h8) a(ph3Var, z80Var)).i(sd5.a);
    }
}
