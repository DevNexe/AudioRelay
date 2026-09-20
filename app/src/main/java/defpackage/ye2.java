package defpackage;

import com.azefsw.audioconnect.nativelibrary.audio.noise.NoiseJni;

/* JADX INFO: loaded from: classes.dex */
public final class ye2 implements nz0<bf2> {
    public final /* synthetic */ NoiseJni w;

    public ye2(NoiseJni noiseJni) {
        this.w = noiseJni;
    }

    @Override // defpackage.nz0
    public final Object f(bf2 bf2Var, z80 z80Var) {
        bf2 bf2Var2 = bf2Var;
        boolean z = bf2Var2.b;
        NoiseJni noiseJni = this.w;
        if (z) {
            noiseJni.c(bf2Var2.d, bf2Var2.e, bf2Var2.c);
        } else {
            noiseJni.b();
        }
        return sd5.a;
    }
}
