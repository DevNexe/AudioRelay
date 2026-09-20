package defpackage;

import com.azefsw.audioconnect.nativelibrary.audio.noise.NoiseJni;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.server.audio.capture.noise.MicNoiseRemover$observeSettingsUntilCancellation$2", f = "MicNoiseRemover.kt", l = {31}, m = "invokeSuspend")
public final class ze2 extends px4 implements x81<Boolean, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ boolean B;
    public final /* synthetic */ af2 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze2(af2 af2Var, z80<? super ze2> z80Var) {
        super(2, z80Var);
        this.C = af2Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        ze2 ze2Var = new ze2(this.C, z80Var);
        ze2Var.B = ((Boolean) obj).booleanValue();
        return ze2Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            if (this.B) {
                af2 af2Var = this.C;
                this.A = 1;
                af2Var.getClass();
                NoiseJni noiseJni = new NoiseJni();
                int iD = noiseJni.d();
                Sb1 sb1 = af2Var.b.a;
                int i2 = (int) (((long) iD) * ((long) ((sb1.b / 8) * sb1.c)));
                e8 e8Var = new e8(i2);
                a62.a.c(bj0.a("Noise remover: ", iD, " frames, ", i2, " B"));
                af2Var.c = new ve2(e8Var, noiseJni);
                Object objA = new vz0(af2Var.a.a(), new xe2(noiseJni, null)).a(new ye2(noiseJni), this);
                if (objA != va0Var) {
                    objA = sd5.a;
                }
                if (objA == va0Var) {
                    return va0Var;
                }
            } else {
                this.C.c = cf2.a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(Boolean bool, z80<? super sd5> z80Var) {
        return ((ze2) a(Boolean.valueOf(bool.booleanValue()), z80Var)).i(sd5.a);
    }
}
