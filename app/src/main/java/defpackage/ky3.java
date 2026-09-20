package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ky3 extends cx1 implements j81<ly3, gv3> {
    public final /* synthetic */ Context w;
    public final /* synthetic */ sn4 x;
    public final /* synthetic */ bm2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky3(Context context, sn4 sn4Var, bm2 bm2Var) {
        super(1);
        this.w = context;
        this.x = sn4Var;
        this.y = bm2Var;
    }

    @Override // defpackage.j81
    public final gv3 invoke(ly3 ly3Var) {
        ks ksVar = ks.c;
        if (ksVar == null) {
            ur1.e("INSTANCE");
            throw null;
        }
        return (gv3) ((y81) ksVar.b.d).invoke(this.w, this.x, this.y);
    }
}
