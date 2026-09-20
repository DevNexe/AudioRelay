package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ji2 extends cx1 implements j81<zl0, yl0> {
    public final /* synthetic */ hi2 w;
    public final /* synthetic */ g82<String, Boolean> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji2(hi2 hi2Var, g82<String, Boolean> g82Var) {
        super(1);
        this.w = hi2Var;
        this.x = g82Var;
    }

    @Override // defpackage.j81
    public final yl0 invoke(zl0 zl0Var) {
        g82<String, Boolean> g82Var = this.x;
        hi2 hi2Var = this.w;
        hi2Var.e = g82Var;
        return new ii2(hi2Var);
    }
}
