package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wp0 extends cx1 implements j81<yp0, xp0> {
    public final /* synthetic */ j81<yp0, Boolean> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wp0(j81<? super yp0, Boolean> j81Var) {
        super(1);
        this.w = j81Var;
    }

    @Override // defpackage.j81
    public final xp0 invoke(yp0 yp0Var) {
        return new xp0(yp0Var, this.w);
    }
}
