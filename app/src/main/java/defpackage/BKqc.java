package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class BKqc extends cx1 implements j81<B2fJ, hEb> {
    public final /* synthetic */ Context w;
    public final /* synthetic */ sn4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BKqc(Context context, sn4 sn4Var) {
        super(1);
        this.w = context;
        this.x = sn4Var;
    }

    @Override // defpackage.j81
    public final hEb invoke(B2fJ b2fJ) {
        zg4 zg4Var = zg4.b;
        if (zg4Var != null) {
            return zg4Var.a.n.invoke(this.w, this.x);
        }
        ur1.e("INSTANCE");
        throw null;
    }
}
