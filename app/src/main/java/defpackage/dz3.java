package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.player.ui.running.RunningPlayerInputHandler$getInitializationFlows$3", f = "RunningPlayerInputHandler.kt", l = {}, m = "invokeSuspend")
public final class dz3 extends px4 implements y81<vy3, vp, z80<? super sy3.EQ>, Object> {
    public /* synthetic */ vy3 A;
    public /* synthetic */ vp B;

    public dz3(z80<? super dz3> z80Var) {
        super(3, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        return new sy3.EQ(this.A, this.B);
    }

    @Override // defpackage.y81
    public final Object invoke(vy3 vy3Var, vp vpVar, z80<? super sy3.EQ> z80Var) {
        dz3 dz3Var = new dz3(z80Var);
        dz3Var.A = vy3Var;
        dz3Var.B = vpVar;
        return dz3Var.i(sd5.a);
    }
}
