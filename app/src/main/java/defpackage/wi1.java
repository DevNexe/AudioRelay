package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class wi1 extends cx1 implements j81<ji1, ei1> {
    public final /* synthetic */ Context w;
    public final /* synthetic */ sn4 x;
    public final /* synthetic */ yf y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi1(Context context, sn4 sn4Var, yf yfVar) {
        super(1);
        this.w = context;
        this.x = sn4Var;
        this.y = yfVar;
    }

    @Override // defpackage.j81
    public final ei1 invoke(ji1 ji1Var) {
        zouF zouf = zouF.b;
        if (zouf == null) {
            ur1.e("INSTANCE");
            throw null;
        }
        return (ei1) ((y81) zouf.a().g).invoke(this.w, this.x, new vi1(this.y));
    }
}
