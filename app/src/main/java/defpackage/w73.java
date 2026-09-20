package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w73 extends cx1 implements j81<x73, h73> {
    public final /* synthetic */ bm2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w73(bm2 bm2Var) {
        super(1);
        this.w = bm2Var;
    }

    @Override // defpackage.j81
    public final h73 invoke(x73 x73Var) {
        zouF zouf = zouF.b;
        if (zouf != null) {
            return (h73) ((j81) zouf.a().h).invoke(this.w);
        }
        ur1.e("INSTANCE");
        throw null;
    }
}
