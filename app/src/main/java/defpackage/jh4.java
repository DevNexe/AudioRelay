package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.settings.ui.SettingsInputHandler$initialize$1", f = "SettingsInputHandler.kt", l = {}, m = "invokeSuspend")
public final class jh4 extends px4 implements y81<dk4, Boolean, z80<? super tg4.YKK>, Object> {
    public /* synthetic */ dk4 A;
    public /* synthetic */ Boolean B;

    public jh4(z80<? super jh4> z80Var) {
        super(3, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        return new tg4.YKK(new ug4(this.A == dk4.Yes, this.B.booleanValue()));
    }

    @Override // defpackage.y81
    public final Object invoke(dk4 dk4Var, Boolean bool, z80<? super tg4.YKK> z80Var) {
        jh4 jh4Var = new jh4(z80Var);
        jh4Var.A = dk4Var;
        jh4Var.B = bool;
        return jh4Var.i(sd5.a);
    }
}
