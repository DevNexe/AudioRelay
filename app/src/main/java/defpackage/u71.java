package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.ads.ui.adsfragment.FullScreenAdsInputHandler$loadAd$3", f = "FullScreenAdsInputHandler.kt", l = {73}, m = "invokeSuspend")
public final class u71 extends px4 implements y81<nz0<? super d71>, Throwable, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ nz0 B;
    public /* synthetic */ Throwable C;

    public u71(z80<? super u71> z80Var) {
        super(3, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            nz0 nz0Var = this.B;
            Throwable th = this.C;
            a62 a62Var = a62.a;
            a62.a.d(th, true);
            d71.QnHx qnHx = new d71.QnHx(th);
            this.B = null;
            this.A = 1;
            if (nz0Var.f(qnHx, this) == va0Var) {
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
    public final Object invoke(nz0<? super d71> nz0Var, Throwable th, z80<? super sd5> z80Var) {
        u71 u71Var = new u71(z80Var);
        u71Var.B = nz0Var;
        u71Var.C = th;
        return u71Var.i(sd5.a);
    }
}
