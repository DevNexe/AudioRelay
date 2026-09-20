package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sh extends cx1 implements j81<uh, vg> {
    public final /* synthetic */ bm2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh(bm2 bm2Var) {
        super(1);
        this.w = bm2Var;
    }

    @Override // defpackage.j81
    public final vg invoke(uh uhVar) {
        zg4 zg4Var = zg4.b;
        if (zg4Var != null) {
            return zg4Var.a.h.invoke(this.w);
        }
        ur1.e("INSTANCE");
        throw null;
    }
}
