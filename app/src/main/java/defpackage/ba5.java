package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ba5 extends cx1 implements j81<zl0, yl0> {
    public final /* synthetic */ t95<Object> w;
    public final /* synthetic */ t95<Object>.LPt8Fixed<Object, Object> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba5(t95<Object> t95Var, t95<Object>.LPt8Fixed<Object, Object> lPt8) {
        super(1);
        this.w = t95Var;
        this.x = lPt8;
    }

    @Override // defpackage.j81
    public final yl0 invoke(zl0 zl0Var) {
        t95<Object> t95Var = this.w;
        wp4<t95<Object>.LPt8Fixed<?, ?>> wp4Var = t95Var.h;
        t95<Object>.LPt8Fixed<?, ?> lPt8 = this.x;
        wp4Var.add(lPt8);
        return new aa5(t95Var, lPt8);
    }
}
