package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.settings.ui.audiofocus.AudioFocusSettingsInputHandler$initialize$1", f = "AudioFocusSettingsInputHandler.kt", l = {}, m = "invokeSuspend")
public final class LB extends px4 implements a91<rFi, p23, Boolean, z80<? super FEQ.LPt8Fixed>, Object> {
    public /* synthetic */ rFi A;
    public /* synthetic */ p23 B;
    public /* synthetic */ Boolean C;

    public LB(z80<? super LB> z80Var) {
        super(4, z80Var);
    }

    @Override // defpackage.a91
    public final Object I(rFi rfi, p23 p23Var, Boolean bool, z80<? super FEQ.LPt8Fixed> z80Var) {
        LB lb = new LB(z80Var);
        lb.A = rfi;
        lb.B = p23Var;
        lb.C = bool;
        return lb.i(sd5.a);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        rFi rfi = this.A;
        p23 p23Var = this.B;
        return new FEQ.LPt8Fixed(rfi, p23Var.a, this.C.booleanValue());
    }
}
