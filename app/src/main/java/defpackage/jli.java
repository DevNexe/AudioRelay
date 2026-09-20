package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.settings.ui.audiooutput.AudioOutputSettingsInputHandler$getAudioTrackOptionsStream$1", f = "AudioOutputSettingsInputHandler.kt", l = {}, m = "invokeSuspend")
public final class jli extends px4 implements y81<Boolean, Boolean, z80<? super q1>, Object> {
    public /* synthetic */ Boolean A;
    public /* synthetic */ Boolean B;

    public jli(z80<? super jli> z80Var) {
        super(3, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        return new q1(this.A.booleanValue(), this.B.booleanValue());
    }

    @Override // defpackage.y81
    public final Object invoke(Boolean bool, Boolean bool2, z80<? super q1> z80Var) {
        jli jliVar = new jli(z80Var);
        jliVar.A = bool;
        jliVar.B = bool2;
        return jliVar.i(sd5.a);
    }
}
