package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f41 extends cx1 implements j81<lc5, Object> {
    public final /* synthetic */ h41 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f41(h41 h41Var) {
        super(1);
        this.w = h41Var;
    }

    @Override // defpackage.j81
    public final Object invoke(lc5 lc5Var) {
        lc5 lc5Var2 = lc5Var;
        return this.w.b(new lc5(null, lc5Var2.b, lc5Var2.c, lc5Var2.d, lc5Var2.e)).getValue();
    }
}
