package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.server.audio.capture.noise.MicNoiseRemoverStore$getConfigStream$1", f = "MicNoiseRemoverStore.kt", l = {}, m = "invokeSuspend")
public final class ff2 extends px4 implements e91<Boolean, Boolean, Integer, Float, Float, z80<? super bf2>, Object> {
    public /* synthetic */ boolean A;
    public /* synthetic */ boolean B;
    public /* synthetic */ int C;
    public /* synthetic */ float D;
    public /* synthetic */ float E;

    public ff2(z80<? super ff2> z80Var) {
        super(6, z80Var);
    }

    @Override // defpackage.e91
    public final Object Z(Boolean bool, Boolean bool2, Integer num, Float f, Float f2, z80<? super bf2> z80Var) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        int iIntValue = num.intValue();
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        ff2 ff2Var = new ff2(z80Var);
        ff2Var.A = zBooleanValue;
        ff2Var.B = zBooleanValue2;
        ff2Var.C = iIntValue;
        ff2Var.D = fFloatValue;
        ff2Var.E = fFloatValue2;
        return ff2Var.i(sd5.a);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        return new bf2(this.D, this.E, this.C, this.A, this.B);
    }
}
