package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.server.ui.running.RunningAndroidServerInputHandler$getInitializationFlows$12", f = "RunningAndroidServerInputHandler.kt", l = {}, m = "invokeSuspend")
public final class kw3 extends px4 implements y81<bf2, Boolean, z80<? super ev3.MZ>, Object> {
    public /* synthetic */ bf2 A;
    public /* synthetic */ Boolean B;

    public kw3(z80<? super kw3> z80Var) {
        super(3, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        bf2 bf2Var = this.A;
        Boolean bool = this.B;
        return new ev3.MZ(new te2(bf2Var.d, bf2Var.e, bf2Var.c, bf2Var.a, bf2Var.b, !bool.booleanValue()));
    }

    @Override // defpackage.y81
    public final Object invoke(bf2 bf2Var, Boolean bool, z80<? super ev3.MZ> z80Var) {
        kw3 kw3Var = new kw3(z80Var);
        kw3Var.A = bf2Var;
        kw3Var.B = bool;
        return kw3Var.i(sd5.a);
    }
}
