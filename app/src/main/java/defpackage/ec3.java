package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.premium.ui.PremiumInputHandler$initialize$4", f = "PremiumInputHandler.kt", l = {144}, m = "invokeSuspend")
public final class ec3 extends px4 implements y81<nz0<? super za3>, Throwable, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ nz0 B;
    public /* synthetic */ Throwable C;

    public ec3(z80<? super ec3> z80Var) {
        super(3, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            nz0 nz0Var = this.B;
            za3.NUlFixed nUl = new za3.NUlFixed(this.C);
            this.B = null;
            this.A = 1;
            if (nz0Var.f(nUl, this) == va0Var) {
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

    @Override // defpackage.y81
    public final Object invoke(nz0<? super za3> nz0Var, Throwable th, z80<? super sd5> z80Var) {
        ec3 ec3Var = new ec3(z80Var);
        ec3Var.B = nz0Var;
        ec3Var.C = th;
        return ec3Var.i(sd5.a);
    }
}
