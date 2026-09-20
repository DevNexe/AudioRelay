package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends cx1 implements j81<o0, C1643vo> {
    public final /* synthetic */ bm2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(bm2 bm2Var) {
        super(1);
        this.w = bm2Var;
    }

    @Override // defpackage.j81
    public final C1643vo invoke(o0 o0Var) {
        zg4 zg4Var = zg4.b;
        if (zg4Var != null) {
            return zg4Var.a.l.invoke(this.w);
        }
        ur1.e("INSTANCE");
        throw null;
    }
}
