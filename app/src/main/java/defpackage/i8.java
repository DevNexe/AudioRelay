package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.copperleaf.ballast.internal.BallastViewModelImpl$startInternal$4$notificationFlow$1", f = "BallastViewModelImpl.kt", l = {254}, m = "invokeSuspend")
public final class i8 extends px4 implements y81<nz0<? super n7<Object, Object, Object>>, n7<Object, Object, Object>, z80<? super Boolean>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public /* synthetic */ n7 C;

    public i8(z80<? super i8> z80Var) {
        super(3, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        n7 n7Var;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            nz0 nz0Var = (nz0) this.B;
            n7 n7Var2 = this.C;
            this.B = n7Var2;
            this.A = 1;
            if (nz0Var.f(n7Var2, this) == va0Var) {
                return va0Var;
            }
            n7Var = n7Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n7Var = (n7) this.B;
            C0239D.H(obj);
        }
        return Boolean.valueOf(!(n7Var instanceof n7.ck32));
    }

    @Override // defpackage.y81
    public final Object invoke(nz0<? super n7<Object, Object, Object>> nz0Var, n7<Object, Object, Object> n7Var, z80<? super Boolean> z80Var) {
        i8 i8Var = new i8(z80Var);
        i8Var.B = nz0Var;
        i8Var.C = n7Var;
        return i8Var.i(sd5.a);
    }
}
