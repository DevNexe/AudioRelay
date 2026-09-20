package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.player.ui.running.RunningPlayerInputHandler$getInitializationFlows$10$1", f = "RunningPlayerInputHandler.kt", l = {127, 128, 129}, m = "invokeSuspend")
public final class cz3 extends px4 implements x81<nz0<? super sy3>, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;

    public cz3(z80<? super cz3> z80Var) {
        super(2, z80Var);
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        cz3 cz3Var = new cz3(z80Var);
        cz3Var.B = obj;
        return cz3Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0061 A[RETURN] */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        nz0 nz0Var;
        sy3.PRnFixed pRn;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i != 0) {
            if (i == 1) {
                nz0Var = (nz0) this.B;
                C0239D.H(obj);
            } else if (i == 2) {
                nz0Var = (nz0) this.B;
                C0239D.H(obj);
                pRn = sy3.PRnFixed.a;
                this.B = null;
                this.A = 3;
                if (nz0Var.f(pRn, this) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }
        C0239D.H(obj);
        nz0 nz0Var2 = (nz0) this.B;
        sy3.byN byn = sy3.byN.a;
        this.B = nz0Var2;
        this.A = 1;
        if (nz0Var2.f(byn, this) == va0Var) {
            return va0Var;
        }
        nz0Var = nz0Var2;
        gq0.QnHx qnHx = gq0.x;
        long jO0 = ps0.o0(5, kq0.SECONDS);
        this.B = nz0Var;
        this.A = 2;
        if (S12N.f(jO0, this) == va0Var) {
            return va0Var;
        }
        pRn = sy3.PRnFixed.a;
        this.B = null;
        this.A = 3;
        if (nz0Var.f(pRn, this) == va0Var) {
            return va0Var;
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(nz0<? super sy3> nz0Var, z80<? super sd5> z80Var) {
        return ((cz3) a(nz0Var, z80Var)).i(sd5.a);
    }
}
