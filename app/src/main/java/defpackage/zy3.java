package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.player.ui.running.RunningPlayerInputHandler$getInitializationFlows$$inlined$flatMapLatest$1", f = "RunningPlayerInputHandler.kt", l = {216}, m = "invokeSuspend")
public final class zy3 extends px4 implements y81<nz0<? super sy3>, Boolean, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ nz0 B;
    public /* synthetic */ Object C;

    public zy3(z80 z80Var) {
        super(3, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            nz0 nz0Var = this.B;
            ((Boolean) this.C).booleanValue();
            d24 d24Var = new d24(new cz3(null));
            this.A = 1;
            if (kd.j(this, d24Var, nz0Var) == va0Var) {
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
    public final Object invoke(nz0<? super sy3> nz0Var, Boolean bool, z80<? super sd5> z80Var) {
        zy3 zy3Var = new zy3(z80Var);
        zy3Var.B = nz0Var;
        zy3Var.C = bool;
        return zy3Var.i(sd5.a);
    }
}
