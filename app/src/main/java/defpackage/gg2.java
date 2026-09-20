package defpackage;

import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: loaded from: classes.dex */
public final class gg2 extends cx1 implements j81<n52, sd5> {
    public final /* synthetic */ me2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg2(me2 me2Var) {
        super(1);
        this.w = me2Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(n52 n52Var) {
        n52Var.b(MediationMetaData.KEY_NAME, he2.a(this.w.a));
        return sd5.a;
    }
}
