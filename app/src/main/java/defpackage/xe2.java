package defpackage;

import com.azefsw.audioconnect.nativelibrary.audio.noise.NoiseJni;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.server.audio.capture.noise.MicNoiseRemover$observeSettingsImpl$2", f = "MicNoiseRemover.kt", l = {}, m = "invokeSuspend")
public final class xe2 extends px4 implements y81<nz0<? super bf2>, Throwable, z80<? super sd5>, Object> {
    public final /* synthetic */ NoiseJni A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe2(NoiseJni noiseJni, z80<? super xe2> z80Var) {
        super(3, z80Var);
        this.A = noiseJni;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        this.A.a();
        return sd5.a;
    }

    @Override // defpackage.y81
    public final Object invoke(nz0<? super bf2> nz0Var, Throwable th, z80<? super sd5> z80Var) {
        return new xe2(this.A, z80Var).i(sd5.a);
    }
}
