package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class td0 extends cx1 implements j81<de0, ud0> {
    public final /* synthetic */ bm2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td0(bm2 bm2Var) {
        super(1);
        this.w = bm2Var;
    }

    @Override // defpackage.j81
    public final ud0 invoke(de0 de0Var) {
        zg4 zg4Var = zg4.b;
        if (zg4Var != null) {
            return zg4Var.a.j.invoke(this.w);
        }
        ur1.e("INSTANCE");
        throw null;
    }
}
