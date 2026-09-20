package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.player.ui.idle.IdlePlayerInputHandler$initialize$2", f = "IdlePlayerInputHandler.kt", l = {}, m = "invokeSuspend")
public final class hi1 extends px4 implements a91<Boolean, Boolean, Boolean, z80<? super bi1.YKK>, Object> {
    public /* synthetic */ Boolean A;
    public /* synthetic */ Boolean B;
    public /* synthetic */ Boolean C;

    public hi1(z80<? super hi1> z80Var) {
        super(4, z80Var);
    }

    @Override // defpackage.a91
    public final Object I(Boolean bool, Boolean bool2, Boolean bool3, z80<? super bi1.YKK> z80Var) {
        hi1 hi1Var = new hi1(z80Var);
        hi1Var.A = bool;
        hi1Var.B = bool2;
        hi1Var.C = bool3;
        return hi1Var.i(sd5.a);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        return new bi1.YKK(this.A.booleanValue(), this.B.booleanValue(), this.C.booleanValue());
    }
}
