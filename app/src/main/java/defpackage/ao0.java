package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ao0 extends cx1 implements j81<zl0, yl0> {
    public final /* synthetic */ ri2<nn0> w;
    public final /* synthetic */ ci2 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao0(ri2<nn0> ri2Var, ci2 ci2Var) {
        super(1);
        this.w = ri2Var;
        this.x = ci2Var;
    }

    @Override // defpackage.j81
    public final yl0 invoke(zl0 zl0Var) {
        return new zn0(this.w, this.x);
    }
}
