package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.ads.AdTimer$shouldHideStream$1", f = "AdTimer.kt", l = {40}, m = "invokeSuspend")
public final class nsBL extends px4 implements x81<nz0<? super sd5>, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;

    public nsBL(z80<? super nsBL> z80Var) {
        super(2, z80Var);
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        nsBL nsbl = new nsBL(z80Var);
        nsbl.B = obj;
        return nsbl;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            nz0 nz0Var = (nz0) this.B;
            sd5 sd5Var = sd5.a;
            this.A = 1;
            if (nz0Var.f(sd5Var, this) == va0Var) {
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
    public final Object invoke(nz0<? super sd5> nz0Var, z80<? super sd5> z80Var) {
        return ((nsBL) a(nz0Var, z80Var)).i(sd5.a);
    }
}
