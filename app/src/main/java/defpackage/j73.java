package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j73 extends cx1 implements j81<g73, g73> {
    public final /* synthetic */ f73 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j73(f73 f73Var) {
        super(1);
        this.w = f73Var;
    }

    @Override // defpackage.j81
    public final g73 invoke(g73 g73Var) {
        f73.YKK ykk = (f73.YKK) this.w;
        return new g73(Boolean.valueOf(ykk.a), Boolean.valueOf(ykk.b), g73Var.a);
    }
}
