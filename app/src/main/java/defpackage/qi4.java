package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class qi4 extends cx1 implements j81<ri4, yg4> {
    public final /* synthetic */ Context w;
    public final /* synthetic */ bm2 x;
    public final /* synthetic */ sn4 y;
    public final /* synthetic */ yf z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi4(Context context, bm2 bm2Var, sn4 sn4Var, yf yfVar) {
        super(1);
        this.w = context;
        this.x = bm2Var;
        this.y = sn4Var;
        this.z = yfVar;
    }

    @Override // defpackage.j81
    public final yg4 invoke(ri4 ri4Var) {
        zg4 zg4Var = zg4.b;
        if (zg4Var == null) {
            ur1.e("INSTANCE");
            throw null;
        }
        a91<Context, bm2, sn4, j81<? super String, sd5>, yg4> a91Var = zg4Var.a.b;
        pi4 pi4Var = new pi4(this.z);
        return a91Var.I(this.w, this.x, this.y, pi4Var);
    }
}
