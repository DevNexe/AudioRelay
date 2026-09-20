package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b45 extends cx1 implements j81<zl0, yl0> {
    public final /* synthetic */ ri2<qd3> w;
    public final /* synthetic */ ci2 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b45(ri2<qd3> ri2Var, ci2 ci2Var) {
        super(1);
        this.w = ri2Var;
        this.x = ci2Var;
    }

    @Override // defpackage.j81
    public final yl0 invoke(zl0 zl0Var) {
        return new a45(this.w, this.x);
    }
}
