package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class H0 extends cx1 implements j81<lQ, fcT> {
    public final /* synthetic */ Context w;
    public final /* synthetic */ sn4 x;
    public final /* synthetic */ pi2<rPO> y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(Context context, sn4 sn4Var, pi2<rPO> pi2Var) {
        super(1);
        this.w = context;
        this.x = sn4Var;
        this.y = pi2Var;
    }

    @Override // defpackage.j81
    public final fcT invoke(lQ lQVar) {
        ks ksVar = ks.c;
        if (ksVar == null) {
            ur1.e("INSTANCE");
            throw null;
        }
        return (fcT) ((y81) ksVar.b.b).invoke(this.w, this.x, new eTM(this.y));
    }
}
