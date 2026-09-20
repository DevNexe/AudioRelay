package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.settings.ui.audiooutput.AudioOutputSettingsInputHandler$initialize$1", f = "AudioOutputSettingsInputHandler.kt", l = {}, m = "invokeSuspend")
public final class p_59 extends px4 implements a91<A$Y4, q1, jv2, z80<? super If$.LPt8Fixed>, Object> {
    public /* synthetic */ A$Y4 A;
    public /* synthetic */ q1 B;
    public /* synthetic */ jv2 C;

    public p_59(z80<? super p_59> z80Var) {
        super(4, z80Var);
    }

    @Override // defpackage.a91
    public final Object I(A$Y4 a$y4, q1 q1Var, jv2 jv2Var, z80<? super If$.LPt8Fixed> z80Var) {
        p_59 p_59Var = new p_59(z80Var);
        p_59Var.A = a$y4;
        p_59Var.B = q1Var;
        p_59Var.C = jv2Var;
        return p_59Var.i(sd5.a);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        return new If$.LPt8Fixed(this.A, this.B, this.C);
    }
}
