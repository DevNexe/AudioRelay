package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.ads.ui.adsfragment.FullScreenAdsInputHandler$loadButtons$1", f = "FullScreenAdsInputHandler.kt", l = {53, 54}, m = "invokeSuspend")
public final class v71 extends px4 implements x81<nz0<? super d71>, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;

    public v71(z80<? super v71> z80Var) {
        super(2, z80Var);
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        v71 v71Var = new v71(z80Var);
        v71Var.B = obj;
        return v71Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        nz0 nz0Var;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i != 0) {
            if (i == 1) {
                nz0Var = (nz0) this.B;
                C0239D.H(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }
        C0239D.H(obj);
        nz0Var = (nz0) this.B;
        this.B = nz0Var;
        this.A = 1;
        if (S12N.e(1000L, this) == va0Var) {
            return va0Var;
        }
        d71.YKK ykk = d71.YKK.a;
        this.B = null;
        this.A = 2;
        if (nz0Var.f(ykk, this) == va0Var) {
            return va0Var;
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(nz0<? super d71> nz0Var, z80<? super sd5> z80Var) {
        return ((v71) a(nz0Var, z80Var)).i(sd5.a);
    }
}
