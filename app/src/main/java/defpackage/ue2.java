package defpackage;

import com.azefsw.audioconnect.nativelibrary.audio.noise.NoiseJni;

/* JADX INFO: loaded from: classes.dex */
public final class ue2 extends cx1 implements j81<qk, sd5> {
    public final /* synthetic */ NoiseJni w;
    public final /* synthetic */ j81<qk, sd5> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ue2(NoiseJni noiseJni, j81<? super qk, sd5> j81Var) {
        super(1);
        this.w = noiseJni;
        this.x = j81Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(qk qkVar) {
        qk qkVar2 = qkVar;
        this.x.invoke(OW8.y(this.w.e(qkVar2.a, qkVar2.b, qkVar2.c), 0, 3));
        return sd5.a;
    }
}
