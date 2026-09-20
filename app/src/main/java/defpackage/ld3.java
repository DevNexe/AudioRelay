package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ld3 extends cx1 implements j81<md3, hb3> {
    public final /* synthetic */ Context w;
    public final /* synthetic */ sn4 x;
    public final /* synthetic */ yf y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld3(Context context, sn4 sn4Var, yf yfVar) {
        super(1);
        this.w = context;
        this.x = sn4Var;
        this.y = yfVar;
    }

    @Override // defpackage.j81
    public final hb3 invoke(md3 md3Var) {
        md3 md3Var2 = md3Var;
        lb3 lb3Var = lb3.b;
        if (lb3Var == null) {
            ur1.e("INSTANCE");
            throw null;
        }
        return lb3Var.a.b.I(this.w, this.x, md3Var2, this.y);
    }
}
