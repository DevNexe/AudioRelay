package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x95 extends cx1 implements j81<zl0, yl0> {
    public final /* synthetic */ t95<Object> w;
    public final /* synthetic */ t95<Object> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x95(t95<Object> t95Var, t95<Object> t95Var2) {
        super(1);
        this.w = t95Var;
        this.x = t95Var2;
    }

    @Override // defpackage.j81
    public final yl0 invoke(zl0 zl0Var) {
        t95<Object> t95Var = this.w;
        wp4<t95<?>> wp4Var = t95Var.i;
        t95<?> t95Var2 = this.x;
        wp4Var.add(t95Var2);
        return new w95(t95Var, t95Var2);
    }
}
