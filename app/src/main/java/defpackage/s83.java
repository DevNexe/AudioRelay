package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s83 extends cx1 implements j81<t83, l63> {
    public final /* synthetic */ bm2 w;
    public final /* synthetic */ sn4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s83(bm2 bm2Var, sn4 sn4Var) {
        super(1);
        this.w = bm2Var;
        this.x = sn4Var;
    }

    @Override // defpackage.j81
    public final l63 invoke(t83 t83Var) {
        zouF zouf = zouF.b;
        if (zouf != null) {
            return (l63) ((x81) zouf.a().e).invoke(this.w, this.x);
        }
        ur1.e("INSTANCE");
        throw null;
    }
}
