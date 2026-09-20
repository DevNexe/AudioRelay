package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d04 extends cx1 implements j81<e04, wy3> {
    public final /* synthetic */ bm2 w;
    public final /* synthetic */ yf x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d04(bm2 bm2Var, yf yfVar) {
        super(1);
        this.w = bm2Var;
        this.x = yfVar;
    }

    @Override // defpackage.j81
    public final wy3 invoke(e04 e04Var) {
        zouF zouf = zouF.b;
        if (zouf == null) {
            ur1.e("INSTANCE");
            throw null;
        }
        return (wy3) ((x81) zouf.a().f).invoke(this.w, new c04(this.x));
    }
}
