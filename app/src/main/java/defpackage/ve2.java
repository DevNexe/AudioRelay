package defpackage;

import com.azefsw.audioconnect.nativelibrary.audio.noise.NoiseJni;

/* JADX INFO: loaded from: classes.dex */
public final class ve2 extends cx1 implements x81<qk, j81<? super qk, ? extends sd5>, sd5> {
    public final /* synthetic */ e8 w;
    public final /* synthetic */ NoiseJni x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve2(e8 e8Var, NoiseJni noiseJni) {
        super(2);
        this.w = e8Var;
        this.x = noiseJni;
    }

    @Override // defpackage.x81
    public final sd5 invoke(qk qkVar, j81<? super qk, ? extends sd5> j81Var) {
        ue2 ue2Var = new ue2(this.x, j81Var);
        this.w.a(qkVar, false, ue2Var);
        return sd5.a;
    }
}
