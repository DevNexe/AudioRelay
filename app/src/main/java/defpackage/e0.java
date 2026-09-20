package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.settings.ui.audioquality.AudioQualitySettingsInputHandler$initialize$3", f = "AudioQualitySettingsInputHandler.kt", l = {}, m = "invokeSuspend")
public final class e0 extends px4 implements a91<bLBI, wv2, Boolean, z80<? super wXc.YKK>, Object> {
    public /* synthetic */ bLBI A;
    public /* synthetic */ wv2 B;
    public /* synthetic */ boolean C;

    public e0(z80<? super e0> z80Var) {
        super(4, z80Var);
    }

    @Override // defpackage.a91
    public final Object I(bLBI blbi, wv2 wv2Var, Boolean bool, z80<? super wXc.YKK> z80Var) {
        boolean zBooleanValue = bool.booleanValue();
        e0 e0Var = new e0(z80Var);
        e0Var.A = blbi;
        e0Var.B = wv2Var;
        e0Var.C = zBooleanValue;
        return e0Var.i(sd5.a);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        return new wXc.YKK(this.A, this.B, this.C);
    }
}
