package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ef2 implements nz0<Boolean> {
    public final /* synthetic */ gf2 w;

    public ef2(gf2 gf2Var) {
        this.w = gf2Var;
    }

    @Override // defpackage.nz0
    public final Object f(Boolean bool, z80 z80Var) {
        if (bool.booleanValue()) {
            this.w.a.d("mic_noise_removal_enabled", false);
        }
        return sd5.a;
    }
}
