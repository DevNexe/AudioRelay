package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.player.ui.settings.PlayerSettingsInputHandler$initialize$1", f = "PlayerSettingsInputHandler.kt", l = {}, m = "invokeSuspend")
public final class k73 extends px4 implements y81<Boolean, Boolean, z80<? super f73.YKK>, Object> {
    public /* synthetic */ Boolean A;
    public /* synthetic */ Boolean B;

    public k73(z80<? super k73> z80Var) {
        super(3, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        return new f73.YKK(this.A.booleanValue(), this.B.booleanValue());
    }

    @Override // defpackage.y81
    public final Object invoke(Boolean bool, Boolean bool2, z80<? super f73.YKK> z80Var) {
        k73 k73Var = new k73(z80Var);
        k73Var.A = bool;
        k73Var.B = bool2;
        return k73Var.i(sd5.a);
    }
}
